package com.joel.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joel.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
