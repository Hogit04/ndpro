package ndpro.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ndpro.PetApplication;
import ndpro.domain.PetDeleted;
import ndpro.domain.PetModified;
import ndpro.domain.PetRegistered;

@Entity
@Table(name = "Pet_table")
@Data
//<<< DDD / Aggregate Root
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long petId;

    private String userId;

    private String name;

    private Date birthDate;

    private Date createAt;

    private Double weight;

    private Double strength;

    @PostPersist
    public void onPostPersist() {
        PetRegistered petRegistered = new PetRegistered(this);
        petRegistered.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        PetModified petModified = new PetModified(this);
        petModified.publishAfterCommit();
    }

    @PostRemove
    public void onPostRemove() {
        PetDeleted petDeleted = new PetDeleted(this);
        petDeleted.publishAfterCommit();
    }

    public static PetRepository repository() {
        PetRepository petRepository = PetApplication.applicationContext.getBean(
            PetRepository.class
        );
        return petRepository;
    }

    //<<< Clean Arch / Port Method
    public void registerPet(RegisterPetCommand registerPetCommand) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void modifyPet(ModifyPetCommand modifyPetCommand) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void deletePet(DeletePetCommand deletePetCommand) {
        //implement business logic here:

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
