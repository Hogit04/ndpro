package ndpro.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StaticAdd extends AbstractEvent {

    private Long staticId;
    private Long petId;
    private String name;
    private Double weight;
    private Double strength;
    private Long feedingId;
    private Date feedDate;
    private Double feedQty;

    public StaticAdd(Static aggregate) {
        super(aggregate);
    }

    public StaticAdd() {
        super();
    }
}
//>>> DDD / Domain Event
