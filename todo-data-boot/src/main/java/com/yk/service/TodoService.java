package com.yk.service;
import java.util.List;

import com.yk.entity.Todo;
import com.yk.util.ListNotFoundException;

public interface TodoService {
	
	  List<Todo> getAllTodo();
	    
	    Todo getTodobyId(int id);
	    
	    void saveTodo(Todo t,int id);
	    
	    public List<Todo> listByUser(int id) throws ListNotFoundException;
		
		public List<Todo> listByStatus(String status) throws ListNotFoundException;
		
		

}
