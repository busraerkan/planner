package com.personal.planner.infrastructure.common;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(CommonConfig.PLANNER_PROJECT_ROOT_PACKAGE)
@AllArgsConstructor
public class CommonConfig {
    static final String PLANNER_PROJECT_ROOT_PACKAGE = "com.personal.planner";
}
