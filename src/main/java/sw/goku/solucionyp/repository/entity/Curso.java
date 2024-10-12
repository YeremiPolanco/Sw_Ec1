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
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCur;

    @Column(length = 60, nullable = false)
    private String desCur;

    @Column(length = 2, nullable = false)
    private String semCur;

    @Column(name = "ncre_cur", nullable = false)
    private Integer nCreCur;

    @ManyToOne
    @JoinColumn(name = "idPro")
    private Programa programa;

}
