package com.todowiththeme.todowiththeme.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todowiththeme.todowiththeme.model.User;
import com.todowiththeme.todowiththeme.repository.UserRepository;
import com.todowiththeme.todowiththeme.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	private final UserRepository repository;

	@Override
	public void addUser(User user) {
		repository.save(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return repository.findAll();
	}

	@Override
	public User getById(Long id) {
		
		return repository.findById(id).orElse(null);
	}

	@Override
	public void updateUser(User user) {
		repository.save(user);
		
	}

	@Override
	public void deleteUser(Long id) {
		repository.deleteById(id);
		
	}
	

}
