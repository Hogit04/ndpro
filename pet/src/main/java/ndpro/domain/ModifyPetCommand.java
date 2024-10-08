package ndpro.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ModifyPetCommand {

    private Integer petId;
    private String userId;
    private String name;
    private Date birthDate;
    private Date createAt;
    private Double weight;
    private Double strength;
}
