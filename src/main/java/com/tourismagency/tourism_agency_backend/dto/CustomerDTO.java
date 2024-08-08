package com.tourismagency.tourism_agency_backend.dto;

import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
public record CustomerDTO(Long id,
                          String name,
                          String lastName,
                          String dni,
                          String phoneNumber,
                          String direction,
                          LocalDate birthDate) implements Serializable {
}
