package br.com.sales.api_cursos.modules.cursos.dto;

import br.com.sales.api_cursos.modules.cursos.enums.Categories;

public record CreateCursoRequestDTO(String name, Categories category) {
}