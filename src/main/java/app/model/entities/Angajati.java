package app.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "angajati")
public class Angajati {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nume;

    @Column
    private String prenume;

    @Column
    private Integer varsta;

    @Column
    private SchimbValutar schimbValutarId;
}
