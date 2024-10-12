package sw.goku.solucionyp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sw.goku.solucionyp.repository.entity.Curso;
import sw.goku.solucionyp.repository.entity.Programa;
import sw.goku.solucionyp.service.ProgramaService;

import java.util.List;

@RestController
@RequestMapping("/api/programas")
@RequiredArgsConstructor
public class ProgramaController {

    private final ProgramaService programaService;

    @PostMapping
    public ResponseEntity<Programa> registrarPrograma(@RequestBody Programa programa) {
        Programa nuevoPrograma = programaService.save(programa);
        return ResponseEntity.ok(nuevoPrograma);
    }

    @GetMapping
    public ResponseEntity<List<Programa>> obtenerTodosLosProgramas() {
        List<Programa> programas = programaService.findAll();
        return ResponseEntity.ok(programas);
    }
}
