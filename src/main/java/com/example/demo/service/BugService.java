package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bug;
import com.example.demo.repository.BugRepository;
@Service
public class BugService {
	@Autowired // DI
	BugRepository bugRepository;
	
	public void saveUser(Bug bug) {
		bugRepository.save(bug);
	}
	
	public Iterable<Bug> getUsers() {
		return bugRepository.findAll();
	}
	
    public Optional<Bug> getuser(Integer id) {
    	return bugRepository.findById(id);
    }
    
    public void deleteUser(Integer id) {
    	bugRepository.deleteById(id);
    }
}
