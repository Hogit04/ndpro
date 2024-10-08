package ndpro.domain;

import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

@Data
@ToString
public class FeedModified extends AbstractEvent {

    private Long feedingId;
    private Date feedDate;
    private Double feedQty;
    private String foodType;
    private Double weight;
    private Double strength;
}
