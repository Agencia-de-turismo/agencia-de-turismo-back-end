package com.tourismagency.tourism_agency_backend.repository;

import com.tourismagency.tourism_agency_backend.persistence.model.TouristService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristServiceRepository extends JpaRepository<TouristService, Long> {
}
