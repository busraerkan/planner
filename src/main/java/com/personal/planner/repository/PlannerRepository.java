package com.personal.planner.repository;

import com.personal.planner.domain.constant.Status;
import com.personal.planner.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlannerRepository extends JpaRepository<Item, Long> {
    Optional<List<Item>> findAllByStatus(Status status);
}
