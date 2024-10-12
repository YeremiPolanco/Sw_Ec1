package sw.goku.solucionyp.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sw.goku.solucionyp.repository.entity.Curso;
import sw.goku.solucionyp.service.CursoService;
import sw.goku.solucionyp.service.ProgramaService;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService cursoService;
    private final ProgramaService programaService;

    @PostMapping
    public ResponseEntity<Curso> registrarCurso(@RequestBody Curso curso) {
        System.out.println("curso: " + curso);
        Curso nuevoCurso = cursoService.save(curso);
        return ResponseEntity.ok(nuevoCurso);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> obtenerTodosLosCursos() {
        List<Curso> cursos = cursoService.findAll();
        return ResponseEntity.ok(cursos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Curso>> obtenerCursosPorPrograma(@PathVariable int id) {
        List<Curso> cursos = programaService.findCursosByProgramaId(id);
        return ResponseEntity.ok(cursos);
    }
}