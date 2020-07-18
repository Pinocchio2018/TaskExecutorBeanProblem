package com.example.bussiness.service;

import com.example.executor.TaskExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private TaskExecutor executor;
}
