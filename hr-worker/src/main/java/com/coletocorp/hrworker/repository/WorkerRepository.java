package com.coletocorp.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coletocorp.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
