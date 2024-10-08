package ndpro.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PetRegistered extends AbstractEvent {

    private Long petId;
    private String userId;
    private String name;
    private Date birthDate;
    private Date createdAt;
    private Double weight;
    private Double strength;

    public PetRegistered(Pet aggregate) {
        super(aggregate);
    }

    public PetRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
