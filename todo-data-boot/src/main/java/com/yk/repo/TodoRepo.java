package com.yk.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yk.entity.Todo;
import com.yk.util.ListNotFoundException;

public interface TodoRepo extends JpaRepository<Todo, Integer>{

	
	@Query("FROM Todo WHERE user.uid = :uid")
	List<Todo> listByUser(@Param("uid") int uid) throws ListNotFoundException;
	
	
	
	@Query("FROM Todo WHERE status = :status")
	List<Todo> listByStatus(@Param("status") String status) throws ListNotFoundException;
	
//	@Query("UPDATE todo SET status = 'Completed' WHERE todo.id=:id")
//	void updateStatusBytodoId(@Param("status") String status);
}
