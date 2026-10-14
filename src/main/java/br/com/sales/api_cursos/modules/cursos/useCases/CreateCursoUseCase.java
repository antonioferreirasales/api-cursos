package br.com.sales.api_cursos.modules.cursos.useCases;

import org.springframework.stereotype.Service;

import br.com.sales.api_cursos.exceptions.CursoFoundException;
import br.com.sales.api_cursos.modules.cursos.entities.CursoEntity;
import br.com.sales.api_cursos.modules.cursos.repositories.CursoRepository;

@Service
public class CreateCursoUseCase {

    private final CursoRepository cursoRepository;

    public CreateCursoUseCase(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public CursoEntity execute(CursoEntity createCursoEntity) {
        this.cursoRepository
                .findByName(createCursoEntity.getName())
                .ifPresent((user) -> {
                    throw new CursoFoundException();
                });
        var entity = this.cursoRepository.save(createCursoEntity);
        return entity;
    }
}
