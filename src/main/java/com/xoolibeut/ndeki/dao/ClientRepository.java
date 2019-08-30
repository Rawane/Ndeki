package com.xoolibeut.ndeki.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoolibeut.ndeki.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
