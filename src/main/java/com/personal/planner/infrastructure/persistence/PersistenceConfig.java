package com.personal.planner.infrastructure.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(PersistenceConfig.PLANNER_PROJECT_ROOT_PACKAGE)
@EntityScan(PersistenceConfig.PLANNER_PROJECT_ROOT_PACKAGE)
public class PersistenceConfig {
    static final String PLANNER_PROJECT_ROOT_PACKAGE = "com.personal.planner";
}
