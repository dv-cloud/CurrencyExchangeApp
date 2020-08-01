package app.model.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "filiala")
public class Filiala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private SchimbValutar schimbValutarId;

    @Column
    private String nume;

    @Column
    private String adresa;
}
