package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bug;

@Repository
public interface BugRepository extends JpaRepository<Bug, Integer> {

}
