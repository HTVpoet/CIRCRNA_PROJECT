package com.bookStore.repository;


import com.bookStore.entity.Circrna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircrnaRepository extends JpaRepository<Circrna,Integer> {

}
