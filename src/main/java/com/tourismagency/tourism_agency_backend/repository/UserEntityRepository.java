package com.tourismagency.tourism_agency_backend.repository;

import com.tourismagency.tourism_agency_backend.persistence.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
}
