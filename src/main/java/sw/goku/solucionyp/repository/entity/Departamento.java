package sw.goku.solucionyp.repository.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDep;

    @Column(length = 30, nullable = false)
    private String desDep;

    @Column(length = 40)
    private String ubiDep;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idResp", referencedColumnName = "idResp")
    private Responsable responsable;

}