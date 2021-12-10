package com.systex.springboot.service;

import com.systex.springboot.model.TaskTable;
import com.systex.springboot.repository.TaskTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskTableRepository taskRepository;


    @Override
    public void add(TaskTable input) {

        taskRepository.save(input);

    }

    @Override
    public void delete(int seq) {
        taskRepository.deleteById(seq);
    }

    @Override
    public List<TaskTable> findAll() {
        return taskRepository.findAll();

    }

}
