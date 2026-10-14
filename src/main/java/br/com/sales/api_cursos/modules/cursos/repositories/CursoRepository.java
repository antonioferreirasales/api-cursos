package br.com.sales.api_cursos.modules.cursos.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sales.api_cursos.modules.cursos.entities.CursoEntity;

public interface CursoRepository extends JpaRepository<CursoEntity, UUID> {
    Optional<CursoEntity> findByName(String name);

    Optional<CursoEntity> findById(UUID id);
}
