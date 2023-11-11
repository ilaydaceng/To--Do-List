package com.todowiththeme.todowiththeme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todowiththeme.todowiththeme.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
