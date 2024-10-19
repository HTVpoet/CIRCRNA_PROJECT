package com.bookStore.service;

import com.bookStore.DTO.ChrCountDTO;
import com.bookStore.entity.Circrna_Circall;
import com.bookStore.repository.Circrna_CircallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class Circrna_CircallService {
    @Autowired
    private Circrna_CircallRepository Circrna_CircallRepo;

    public void save(Circrna_Circall circall) {

        Circrna_CircallRepo.save(circall);
    }

    public List<Circrna_Circall> getAllCircall() {

        return Circrna_CircallRepo.findAll();
    }

    public Circrna_Circall getCircallById(String id) {

        return Circrna_CircallRepo.findById(id).get();

    }
    public void deleteById(String id) {

            Circrna_CircallRepo.deleteById(id);
    }

    public List<Circrna_Circall> SearchCircallById(String circId){
        return Circrna_CircallRepo.findByCircIdLike(circId);
    }

    public int CountCircall(){
        return Math.toIntExact(Circrna_CircallRepo.count());
    }

    public int CountPatientSample(String str){
        return Circrna_CircallRepo.CountPatientSample(str);
    }

    public int CountJF(){ return Circrna_CircallRepo.CountJF();}

    public List<Object[]> Count_chr(){return Circrna_CircallRepo.Count_Chr();}

}
