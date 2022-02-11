package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Bug;
public interface BugRepository extends JpaRepository<Bug, Integer> {

}
