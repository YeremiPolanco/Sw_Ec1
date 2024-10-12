package sw.goku.solucionyp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sw.goku.solucionyp.repository.dao.DepartamentoDao;
import sw.goku.solucionyp.repository.dao.ResponsableDao;
import sw.goku.solucionyp.repository.entity.Departamento;
import sw.goku.solucionyp.repository.entity.Responsable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResponsableService {

    private final ResponsableDao responsableDao;

    @Transactional
    public Responsable save(Responsable responsable) {
        return responsableDao.save(responsable);
    }

    @Transactional(readOnly = true)
    public List<Responsable> findAll() {
        return responsableDao.findAll();
    }

    @Transactional(readOnly = true)
    public Responsable findById(int id) {
        return responsableDao.findById(id).orElse(null);
    }
}
