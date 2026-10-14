package br.com.sales.api_cursos.modules.cursos.controllers;

import br.com.sales.api_cursos.modules.cursos.useCases.CreateCursoUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sales.api_cursos.modules.cursos.dto.CreateCursoRequestDTO;
import br.com.sales.api_cursos.modules.cursos.entities.CursoEntity;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private final CreateCursoUseCase createCursoUseCase;

    CursoController(CreateCursoUseCase createCursoUseCase) {
        this.createCursoUseCase = createCursoUseCase;
    }

    @PostMapping("")
    public ResponseEntity<Object> create(@RequestBody CreateCursoRequestDTO cursoEntity) {
        try {
            var requestEntity = CursoEntity.builder().name(cursoEntity.name())
                    .category(cursoEntity.category()).active(true).build();
            var savedCurso = this.createCursoUseCase.execute(requestEntity);
            return ResponseEntity.ok(savedCurso);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
