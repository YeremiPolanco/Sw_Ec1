package sw.goku.solucionyp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sw.goku.solucionyp.repository.dao.DepartamentoDao;
import sw.goku.solucionyp.repository.entity.Departamento;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartamentoService {

    private final DepartamentoDao departamentoDao;

    @Transactional
    public Departamento save(Departamento departamento) {
        return departamentoDao.save(departamento);
    }

    @Transactional(readOnly = true)
    public List<Departamento> findAll() {
        return departamentoDao.findAll();
    }

    @Transactional(readOnly = true)
    public Departamento findById(int id) {
        return departamentoDao.findById(id).orElse(null);
    }
}