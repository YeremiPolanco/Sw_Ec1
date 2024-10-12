package sw.goku.solucionyp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sw.goku.solucionyp.repository.dao.CursoDao;
import sw.goku.solucionyp.repository.entity.Curso;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final CursoDao cursoDao;

    public Curso save(Curso curso) {
        return cursoDao.save(curso);
    }

    public List<Curso> findAll() {
        return cursoDao.findAll();
    }
}