package ndpro.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RegisterFeedCommand {

    private Integer feedingId;
    private Date feedDate;
    private Double feedQty;
    private String foodType;
    private Double weight;
    private Double strength;
}
