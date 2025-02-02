package sw.goku.solucionyp.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sw.goku.solucionyp.repository.entity.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Integer> {
}
