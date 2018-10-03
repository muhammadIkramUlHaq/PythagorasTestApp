package com.github.pythagoras.floor.repository;

import com.github.pythagoras.floor.domain.Floor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FloorRepository extends JpaRepository<Floor, Long> {
}
