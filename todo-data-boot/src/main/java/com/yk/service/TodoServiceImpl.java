package com.yk.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.yk.entity.Todo;
import com.yk.entity.User;
import com.yk.repo.TodoRepo;
import com.yk.util.ListNotFoundException;
@Service
public class TodoServiceImpl implements TodoService {

	
	@Autowired
	private TodoRepo repo;
	@Autowired
	private UserService service;
	@Override
	public List<Todo> getAllTodo() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Todo getTodobyId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void saveTodo(Todo t,int id ) {
		// TODO Auto-generated method stub
		User u = service.getUserbyId(id);
		
		t.setAssDate(LocalDate.now());
		t.setStatus("Pending");
		t.setUser(u);
		repo.save(t);
	}

	@Override
	public List<Todo> listByUser(int id) throws ListNotFoundException  {
		// TODO Auto-generated method stub
		return repo.listByUser(id);
	}

	@Override
	public List<Todo> listByStatus(String status) throws ListNotFoundException{
		// TODO Auto-generated method stub
	
		return repo.listByStatus(status);
		
	}

	

}
