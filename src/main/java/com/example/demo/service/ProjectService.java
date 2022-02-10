package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Project;
import com.example.demo.repository.ProjectRepository;

public class ProjectService {
	@Autowired 
	ProjectRepository projectRepository;
	
	public void saveUser(Project project) {
		projectRepository.save(project);
	}
	
	public Iterable<Project> getUsers() {
		return projectRepository.findAll();
	}
	
    public Optional<Project> getuser(Integer id) {
    	return projectRepository.findById(id);
    }
    
    public void deleteUser(Integer id) {
    	projectRepository.deleteById(id);
    }
}
