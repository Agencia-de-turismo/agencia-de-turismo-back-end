package com.tourismagency.tourism_agency_backend.dtos;

import com.tourismagency.tourism_agency_backend.enums.CountryEnum;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Builder

public record TouristServiceDTO(Long id, String name, String description, CountryEnum destiny, LocalDate date, Double price)
        implements Serializable {


}
