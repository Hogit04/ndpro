package ndpro.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FeedAdd extends AbstractEvent {

    private Long feedingId;
    private Date feedDate;
    private Double feedQty;
    private String foodType;
    private Double weight;
    private Double strength;

    public FeedAdd(Feeding aggregate) {
        super(aggregate);
    }

    public FeedAdd() {
        super();
    }
}
//>>> DDD / Domain Event
