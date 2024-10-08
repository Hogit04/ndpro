package ndpro.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ndpro.StaticApplication;
import ndpro.domain.StaticAdd;

@Entity
@Table(name = "Static_table")
@Data
//<<< DDD / Aggregate Root
public class Static {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staticId;

    private Long petId;

    private String name;

    private Double weight;

    private Double strength;

    private Long feedingId;

    private Date feedDate;

    private Double feedQty;

    @PostPersist
    public void onPostPersist() {
        StaticAdd staticAdd = new StaticAdd(this);
        staticAdd.publishAfterCommit();
    }

    public static StaticRepository repository() {
        StaticRepository staticRepository = StaticApplication.applicationContext.getBean(
            StaticRepository.class
        );
        return staticRepository;
    }
}
//>>> DDD / Aggregate Root
