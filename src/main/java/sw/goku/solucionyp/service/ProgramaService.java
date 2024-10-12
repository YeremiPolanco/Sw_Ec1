package sw.goku.solucionyp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sw.goku.solucionyp.repository.dao.ProgramaDao;
import sw.goku.solucionyp.repository.entity.Curso;
import sw.goku.solucionyp.repository.entity.Programa;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgramaService {

    private final ProgramaDao programaDao;

    public Programa save(Programa programa) {
        return programaDao.save(programa);
    }

    public List<Programa> findAll() {
        return programaDao.findAll();
    }

    public List<Curso> findCursosByProgramaId(int id) {
        return programaDao.findById(id)
                .map(Programa::getCursos)
                .orElseThrow(() -> new RuntimeException("Programa no encontrado con ID: " + id));
    }
}
