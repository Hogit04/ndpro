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
    public void onPostPersist() {}

    @PrePersist
    public void onPrePersist() {
        FeedRegistered feedRegistered = new FeedRegistered(this);
        feedRegistered.publishAfterCommit();

        FeedModified feedModified = new FeedModified(this);
        feedModified.publishAfterCommit();

        FeedDeleted feedDeleted = new FeedDeleted(this);
        feedDeleted.publishAfterCommit();
    }

    public static FeedingRepository repository() {
        FeedingRepository feedingRepository = FeedApplication.applicationContext.getBean(
            FeedingRepository.class
        );
        return feedingRepository;
    }
}
//>>> DDD / Aggregate Root
