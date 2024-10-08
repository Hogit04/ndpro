package ndpro.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FeedRegistered extends AbstractEvent {

    private Long feedingId;
    private Date feedDate;
    private Double feedQty;
    private String foodType;
    private Double weight;
    private Double strength;

    public FeedRegistered(Feeding aggregate) {
        super(aggregate);
    }

    public FeedRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
