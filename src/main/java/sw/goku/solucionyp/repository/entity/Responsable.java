package sw.goku.solucionyp.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Responsable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResp;

    @Column(length = 25, nullable = false)
    private String apeResp;

    @Column(length = 25, nullable = false)
    private String nomResp;

    @JsonIgnore
    @OneToOne(mappedBy = "responsable")
    private Departamento departamento;
}