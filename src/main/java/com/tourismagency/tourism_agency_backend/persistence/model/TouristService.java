package com.tourismagency.tourism_agency_backend.persistence.model;
import com.tourismagency.tourism_agency_backend.enums.CountryEnum;
import com.tourismagency.tourism_agency_backend.enums.ServiceTypeEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@ToString
@EqualsAndHashCode(exclude = {"salesList"})
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tourist_service")
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

    @Enumerated (EnumType.STRING)
    private ServiceTypeEnum serviceType;

    @ManyToMany(mappedBy = "touristServicesList", targetEntity = Sale.class, fetch = FetchType.LAZY)
    private List<Sale> salesList;
}
