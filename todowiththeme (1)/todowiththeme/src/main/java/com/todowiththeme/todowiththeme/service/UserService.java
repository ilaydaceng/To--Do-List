package com.todowiththeme.todowiththeme.service;

import java.util.List;

import com.todowiththeme.todowiththeme.model.User;

public interface UserService {
	void addUser(User user);

	List<User> getAll();

	User getById(Long id);

	void updateUser(User user);

	void deleteUser(Long id);
}
