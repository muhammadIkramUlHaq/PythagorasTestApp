package com.github.pythagoras.building.repository;

import com.github.pythagoras.building.domain.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}
