package sw.goku.solucionyp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sw.goku.solucionyp.repository.entity.Departamento;
import sw.goku.solucionyp.service.DepartamentoService;

import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
@RequiredArgsConstructor
public class DepartamentoController {

    private final DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<Departamento> registrarDepartamento(@RequestBody Departamento departamento) {
        Departamento nuevoDepartamento = departamentoService.save(departamento);
        return ResponseEntity.ok(nuevoDepartamento);
    }

    @GetMapping
    public ResponseEntity<List<Departamento>> obtenerTodosLosDepartamentos() {
        List<Departamento> departamentos = departamentoService.findAll();
        return ResponseEntity.ok(departamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departamento> buscarDepartamentoPorId(@PathVariable int id) {
        Departamento departamento = departamentoService.findById(id);
        if (departamento != null) {
            return ResponseEntity.ok(departamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}