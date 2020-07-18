package com.example.TaskExecutorBeanProblem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.example"})
@Slf4j
public class TaskExecutorBeanProblemApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TaskExecutorBeanProblemApplication.class, args);
        log.info("{}", ctx.getBean("taskExecutor"));
    }

}
