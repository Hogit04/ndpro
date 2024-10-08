package ndpro.domain;

import java.util.*;
import lombok.*;
import ndpro.domain.*;
import ndpro.infra.AbstractEvent;

@Data
@ToString
public class FeedDeleted extends AbstractEvent {

    private Long feedingId;
}
