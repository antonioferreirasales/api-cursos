package br.com.sales.api_cursos.modules.cursos.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.sales.api_cursos.modules.cursos.enums.Categories;
import lombok.Builder;

@Builder
public record CreateCursoResponseDTO(UUID id, String name, Categories category, boolean active, LocalDateTime createdAt,
        LocalDateTime updatedAt) {

}
