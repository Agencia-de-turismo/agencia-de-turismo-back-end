package com.tourismagency.tourism_agency_backend.persistence.model;
import com.tourismagency.tourism_agency_backend.enums.CountryEnum;
import jakarta.persistence.*;

import java.time.LocalDate;

public class TouristService {


@Entity
public class TouristService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Enumerated (EnumType.STRING)
    private CountryEnum destiny;
    private LocalDate date;
    private Double price;


}
