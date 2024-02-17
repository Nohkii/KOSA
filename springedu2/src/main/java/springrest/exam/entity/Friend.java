package springrest.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Friend {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String fname;
    private  Integer fage;
}
