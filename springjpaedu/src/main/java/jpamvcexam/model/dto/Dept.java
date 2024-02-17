package jpamvcexam.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Dept {
    @Id
    private  int deptno;
    private String dname;
    private char loc_code;
}
