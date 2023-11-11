package com.todowiththeme.todowiththeme.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todowiththeme.todowiththeme.model.Task;
import com.todowiththeme.todowiththeme.repository.TaskRepository;
import com.todowiththeme.todowiththeme.service.TaskService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
	private final TaskRepository repository;

	@Override
	public List<Task> allTaskList() {

		return repository.findAll();
	}

	@Override
	public List<Task> taskList(Long userId) {

		return repository.findByUserId(userId);
	}

	@Override
	public Task changeComplated(Long id) {
		Task task = getById(id);
		if(task!=null) {
			task.setComplate(!task.getComplate());
		}
		repository.save(task);
		return task;

	}

	@Override
	public Task getById(Long id) {

		return repository.getById(id);
	}

	@Override
	public Task saveTask(Task task) {
		Task saveTask=task;
		saveTask.setComplate(false);
		
		return repository.save(saveTask);
	}
}
