package com.yk.rest;

import java.util.List;

import javax.management.ListenerNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yk.entity.Todo;
import com.yk.service.TodoService;
import com.yk.util.ListNotFoundException;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	
	@PostMapping(value="/save/{uid}" ,consumes = "application/json")
	public void saveTodo(@Valid @RequestBody Todo t , @PathVariable int uid) {
		service.saveTodo(t,uid);
	}
	
	 @GetMapping("/todos")
	    public List<Todo> getAllTodos() {
	        return service.getAllTodo();
	    }
	 
	 
	 @GetMapping("/finduser/{uid}")
	 public List<Todo> getAllUser(@PathVariable int uid) throws ListNotFoundException{
//		 List<Todo> ans = service.listByUser(uid);
//		 if(ans.isEmpty()) {
//			 throw new ListNotFoundException("Todo does not exist");
//		 }else
//		return ans;
		 return service.listByUser(uid);
		 
	 }
	 
	 @GetMapping("/findstatus/{status}")
	 public List<Todo> getAllUser(@PathVariable String status) throws ListNotFoundException{
		List<Todo > ans = service.listByStatus(status);
		
		 if(ans.isEmpty()) {
			 throw new ListNotFoundException("Todo Does not exist");
		 }else
		return ans;
		 
		 
	 }
	
	
	
	

}
