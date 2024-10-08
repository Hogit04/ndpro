package ndpro.domain;

import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

@Data
@ToString
public class PetModified extends AbstractEvent {

    private Long petId;
    private String userId;
    private String name;
    private Date birthDate;
    private Date createdAt;
    private Double weight;
    private Double strength;
}
