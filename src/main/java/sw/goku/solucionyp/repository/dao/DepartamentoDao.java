package sw.goku.solucionyp.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sw.goku.solucionyp.repository.entity.Departamento;

@Repository
public interface DepartamentoDao extends JpaRepository<Departamento, Integer> {
}
