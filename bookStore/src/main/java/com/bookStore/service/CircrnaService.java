package com.bookStore.service;

import com.bookStore.entity.Circrna;
import com.bookStore.repository.CircrnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircrnaService {
    @Autowired
    private CircrnaRepository circrnaRepo;

    public void save(Circrna circrna) {

        circrnaRepo.save(circrna);
    }

    public List<Circrna> getAllCircrna() {

        return circrnaRepo.findAll();
    }

    public Circrna getCircrnaById(int id) {

        return circrnaRepo.findById(id).get();
    }
    public void deleteById(int id) {

        circrnaRepo.deleteById(id);
    }
}
