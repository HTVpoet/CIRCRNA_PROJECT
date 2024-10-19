package com.bookStore.repository;


import com.bookStore.DTO.ChrCountDTO;
import com.bookStore.entity.Circrna_Circall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface Circrna_CircallRepository extends JpaRepository<Circrna_Circall, String> {

    @Query("SELECT c from Circrna_Circall c WHERE c.circId LIKE  :circId% ")
    List<Circrna_Circall> findByCircIdLike(@Param("circId") String circId);

    @Query("SELECT COUNT(c) FROM Circrna_Circall c WHERE c.patient_sample LIKE %:str% ")
    int CountPatientSample (@Param("str") String str);

    @Query("SELECT COUNT(c) FROM Circrna_Circall c WHERE c.junctionFragmentCount >= 5")
    int CountJF();

    @Query("SELECT c.chr,COUNT(c) FROM Circrna_Circall c GROUP BY c.chr")
    List<Object[]> Count_Chr();


}
