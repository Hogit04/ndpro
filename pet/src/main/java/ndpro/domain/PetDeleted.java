package ndpro.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PetDeleted extends AbstractEvent {

    private Long petId;

    public PetDeleted(Pet aggregate) {
        super(aggregate);
    }

    public PetDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
