package com.personal.planner.domain.entity;

import com.personal.planner.domain.constant.Status;
import com.personal.planner.infrastructure.persistence.converter.StatusConverter;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "PLANNER_ITEM")
public class Item {
    @Id
    @Column(name = "ID", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    @Convert(converter = StatusConverter.class)
    private Status status;

}
