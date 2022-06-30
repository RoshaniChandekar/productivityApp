package com.cg.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.main.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>
{

//	void deleteByTaskId(int id);

}
