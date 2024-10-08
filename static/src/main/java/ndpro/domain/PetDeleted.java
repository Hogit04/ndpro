package ndpro.domain;

import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

@Data
@ToString
public class PetDeleted extends AbstractEvent {

    private Long petId;
}
