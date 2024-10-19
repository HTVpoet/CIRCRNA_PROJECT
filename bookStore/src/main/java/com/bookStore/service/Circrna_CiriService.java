package com.bookStore.service;

import com.bookStore.entity.Circrna_Circall;
import com.bookStore.entity.Circrna_Ciri;
import com.bookStore.repository.Circrna_CiriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Circrna_CiriService {

    @Autowired
    private Circrna_CiriRepository circrna_CiriRepo;

    public void save(Circrna_Ciri ciri) {

        circrna_CiriRepo.save(ciri);

    }

    public List<Circrna_Ciri> getAllCiri() {

        return circrna_CiriRepo.findAll();
    }

    public Circrna_Ciri getCiriById(String id) {

        return circrna_CiriRepo.findById(id).get();

    }
    public void deleteById(String id) {

        circrna_CiriRepo.deleteById(id);
    }
}
