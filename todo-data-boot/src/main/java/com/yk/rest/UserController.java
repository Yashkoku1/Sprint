package com.yk.rest;

import java.awt.desktop.UserSessionEvent;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yk.entity.Todo;
import com.yk.entity.User;
import com.yk.service.TodoService;
import com.yk.service.UserService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	
	@PostMapping(value="/saves" ,consumes = "application/json")
	public void saveTodo(@Valid @RequestBody User u) {
		service.saveUser(u);
	}
	
	 @GetMapping("/users")
	    public List<User> getAllTodos() {
	        return service.getAllUser();
	    }
	 
	 @GetMapping("/find/{uid}")
      public User findByUID(@PathVariable int uid) {
		 return service.findByUserId(uid);
	 }
	 
	
}
