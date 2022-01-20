package com.personal.planner.service;

import com.personal.planner.domain.constant.Status;
import com.personal.planner.domain.entity.Item;

import java.util.List;

public interface PlannerService {
    List<Item> getAllItems();
    List<Item> getItemsByStatus(Status status);
}
