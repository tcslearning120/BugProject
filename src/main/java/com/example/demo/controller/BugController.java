package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.service.BugService;
import com.example.demo.entity.Bug;


public class BugController {
	@Autowired
	BugService bugService;

	@GetMapping("/bug")
	Iterable<Bug> getusers() {
		return bugService.getUsers();
	}

	@GetMapping("/bug/{id}")
	Optional<Bug> getUsers(@PathVariable("id") Integer id) {
		return bugService.getuser(id);
	}

	@PostMapping("/bug") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void creatUser(@RequestBody @Valid Bug bug) {
		
	bugService.saveUser(bug);
	}

	@DeleteMapping("/bug/{id}")
	void deleteUser(@PathVariable("id") Integer id) {
		bugService.deleteUser(id);
	}
}
