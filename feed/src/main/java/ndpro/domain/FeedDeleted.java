package ndpro.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FeedDeleted extends AbstractEvent {

    private Long feedingId;

    public FeedDeleted(Feeding aggregate) {
        super(aggregate);
    }

    public FeedDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
