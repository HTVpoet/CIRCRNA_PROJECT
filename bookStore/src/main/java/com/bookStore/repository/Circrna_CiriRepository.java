package com.bookStore.repository;

import com.bookStore.entity.Circrna_Ciri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Circrna_CiriRepository extends JpaRepository<Circrna_Ciri, String> {

}
