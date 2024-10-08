package ndpro.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ndpro.StaticApplication;
import ndpro.domain.StaticAdd;

@Entity
@Table(name = "Static_table")
@Data
//<<< DDD / Aggregate Root
public class Static {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staticId;

    private Long petId;

    private String name;

    private Double weight;

    private Double strength;

    private Long feedingId;

    private Date feedDate;

    private Double feedQty;

    @PostPersist
    public void onPostPersist() {
        StaticAdd staticAdd = new StaticAdd(this);
        staticAdd.publishAfterCommit();
    }

    public static StaticRepository repository() {
        StaticRepository staticRepository = StaticApplication.applicationContext.getBean(
            StaticRepository.class
        );
        return staticRepository;
    }

    //<<< Clean Arch / Port Method
    public static void addStatic(PetRegistered petRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        Static static = new Static();
        repository().save(static);

        */

        /** Example 2:  finding and process
        
        repository().findById(petRegistered.get???()).ifPresent(static->{
            
            static // do something
            repository().save(static);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void addStatic(PetModified petModified) {
        //implement business logic here:

        /** Example 1:  new item 
        Static static = new Static();
        repository().save(static);

        */

        /** Example 2:  finding and process
        
        repository().findById(petModified.get???()).ifPresent(static->{
            
            static // do something
            repository().save(static);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void addStatic(PetDeleted petDeleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Static static = new Static();
        repository().save(static);

        */

        /** Example 2:  finding and process
        
        repository().findById(petDeleted.get???()).ifPresent(static->{
            
            static // do something
            repository().save(static);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void addStatic(FeedRegistered feedRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        Static static = new Static();
        repository().save(static);

        */

        /** Example 2:  finding and process
        
        repository().findById(feedRegistered.get???()).ifPresent(static->{
            
            static // do something
            repository().save(static);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void addStatic(FeedModified feedModified) {
        //implement business logic here:

        /** Example 1:  new item 
        Static static = new Static();
        repository().save(static);

        */

        /** Example 2:  finding and process
        
        repository().findById(feedModified.get???()).ifPresent(static->{
            
            static // do something
            repository().save(static);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void addStatic(FeedDeleted feedDeleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Static static = new Static();
        repository().save(static);

        */

        /** Example 2:  finding and process
        
        repository().findById(feedDeleted.get???()).ifPresent(static->{
            
            static // do something
            repository().save(static);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
