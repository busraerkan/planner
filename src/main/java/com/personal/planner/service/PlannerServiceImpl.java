package com.personal.planner.service;

import com.personal.planner.domain.constant.Status;
import com.personal.planner.domain.entity.Item;
import com.personal.planner.repository.PlannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlannerServiceImpl implements PlannerService {
    private final PlannerRepository plannerRepository;

    @Override
    public List<Item> getAllItems() {
        return plannerRepository.findAll();
    }

    @Override
    public List<Item> getItemsByStatus(Status status) {
        return plannerRepository.findAllByStatus(status).orElse(null);
    }
}
