package com.tourismagency.tourism_agency_backend.dtos;

import com.tourismagency.tourism_agency_backend.persistence.model.TouristService;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Builder

public record TouristPackageDTO( Long id, Double price, List<TouristService> touristServicesList)
        implements Serializable {

}
