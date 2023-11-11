package com.todowiththeme.todowiththeme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todowiththeme.todowiththeme.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
	List<Task> findByUserId(Long userId);
}
