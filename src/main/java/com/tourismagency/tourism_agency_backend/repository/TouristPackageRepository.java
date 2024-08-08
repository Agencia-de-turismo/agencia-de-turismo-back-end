package com.tourismagency.tourism_agency_backend.repository;

import com.tourismagency.tourism_agency_backend.persistence.model.TouristPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristPackageRepository extends JpaRepository<TouristPackage, Long> {
}
