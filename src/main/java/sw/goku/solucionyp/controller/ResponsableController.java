package sw.goku.solucionyp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sw.goku.solucionyp.repository.entity.Responsable;
import sw.goku.solucionyp.service.ResponsableService;

import java.util.List;

@RestController
@RequestMapping("/api/responsables")
@RequiredArgsConstructor
public class ResponsableController {

    private final ResponsableService responsableService;

    @PostMapping
    public ResponseEntity<Responsable> registrarResponsable(@RequestBody Responsable responsable) {
        Responsable nuevoResponsable = responsableService.save(responsable);
        return ResponseEntity.ok(nuevoResponsable);
    }

    @GetMapping
    public ResponseEntity<List<Responsable>> obtenerTodosLosResponsables() {
        List<Responsable> responsables = responsableService.findAll();
        return ResponseEntity.ok(responsables);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Responsable> buscarResponsablePorId(@PathVariable int id) {
        Responsable responsable = responsableService.findById(id);
        return responsable != null ? ResponseEntity.ok(responsable) : ResponseEntity.notFound().build();
    }
}