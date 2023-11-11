package com.todowiththeme.todowiththeme.controller.Impl;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.todowiththeme.todowiththeme.controller.TaskController;
import com.todowiththeme.todowiththeme.model.Task;
import com.todowiththeme.todowiththeme.model.User;
import com.todowiththeme.todowiththeme.service.TaskService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TaskControllerImpl implements TaskController {
	private final TaskService service;

	@Override
	public String taskList(Model model) {
		List<Task> tasks=service.allTaskList();
		model.addAttribute("tasks",tasks);
		return "task-list";
	}

	@Override
	public String taskListUserId(Long userId, Model model) {
		List<Task> tasks=service.taskList(userId);
		model.addAttribute("tasks",tasks);
		return "task-list";
	}

	@Override
	public String changeCompleted(Long taskId) {
		service.changeComplated(taskId);
		return "redirect:/tasks";
	}

	@Override
	public String saveTask(Task task) {
	service.saveTask(task);
		return "redirect:/tasks";
	}

	@Override
	public String saveForm(Model model) {
		model.addAttribute("task", new Task());
		return "add-task";
	}

	

}
