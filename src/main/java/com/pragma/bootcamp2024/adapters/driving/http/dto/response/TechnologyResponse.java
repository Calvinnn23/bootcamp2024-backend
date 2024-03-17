package com.pragma.bootcamp2024.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TechnologyResponse {
    private final Long idTechnology;
    private final String nameTechnology;
    private final String descriptionTechnology;
}