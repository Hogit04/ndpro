package ndpro.domain;

import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

@Data
@ToString
public class PetDeleted extends AbstractEvent {

    private Long petId;
    private String userId;
    private String name;
    private String birthDate;
    private String createdAt;
    private Double weight;
    private Double strength;
}
