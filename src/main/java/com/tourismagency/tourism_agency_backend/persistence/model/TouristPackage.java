package com.tourismagency.tourism_agency_backend.persistence.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@ToString
@EqualsAndHashCode
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tourist_package")

public class TouristPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;

    //Un TouristPackage tiene 1 o muchos TouristServices
    @OneToMany
    @JoinColumn(name = "tourist_package_id")
    private List<TouristService> touristServicesList;


}
