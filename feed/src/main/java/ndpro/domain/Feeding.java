package ndpro.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ndpro.FeedApplication;
import ndpro.domain.FeedDeleted;
import ndpro.domain.FeedModified;
import ndpro.domain.FeedRegistered;

@Entity
@Table(name = "Feeding_table")
@Data
//<<< DDD / Aggregate Root
public class Feeding {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long feedingId;

    private Date feedDate;

    private Double feedQty;

    private String foodType;

    private Double weight;

    private Double strength;

    @PostPersist
    public void onPostPersist() {
        FeedRegistered feedRegistered = new FeedRegistered(this);
        feedRegistered.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        FeedModified feedModified = new FeedModified(this);
        feedModified.publishAfterCommit();
    }

    @PostRemove
    public void onPostRemove() {
        FeedDeleted feedDeleted = new FeedDeleted(this);
        feedDeleted.publishAfterCommit();
    }

    public static FeedingRepository repository() {
        FeedingRepository feedingRepository = FeedApplication.applicationContext.getBean(
            FeedingRepository.class
        );
        return feedingRepository;
    }

    //<<< Clean Arch / Port Method
    public void registerFeed(RegisterFeedCommand registerFeedCommand) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void addFeed(AddFeedCommand addFeedCommand) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void deleteFeed(DeleteFeedCommand deleteFeedCommand) {
        //implement business logic here:

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
