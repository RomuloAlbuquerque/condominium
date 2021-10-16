package com.romulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romulo.entities.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long> {

}
