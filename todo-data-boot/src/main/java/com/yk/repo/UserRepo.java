package com.yk.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yk.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	


}
