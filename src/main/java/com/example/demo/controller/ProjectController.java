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

import com.example.demo.entity.Project;
import com.example.demo.service.ProjectService;

public class ProjectController {
	@Autowired
	ProjectService projectService;

	@GetMapping("/project")
	Iterable<Project> getusers() {
		return projectService.getUsers();
	}

	@GetMapping("/project/{id}")
	Optional<Project> getUsers(@PathVariable("id") Integer id) {
		return projectService.getuser(id);
	}

	@PostMapping("/project") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void creatUser(@RequestBody @Valid Project project) {

		projectService.saveUser(project);
	}

	@DeleteMapping("/project/{id}")
	void deleteUser(@PathVariable("id") Integer id) {
		projectService.deleteUser(id);
	}
}
