package com.bookStore.service;


import com.bookStore.entity.Circrna_Circall;
import com.bookStore.entity.Circrna_Findcirc;
import com.bookStore.repository.Circrna_CircallRepository;
import com.bookStore.repository.Circrna_FindcircRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Circrna_FindcircService {

    @Autowired
    private Circrna_FindcircRepository circrnaFindcircRepository;

    public void save(Circrna_Findcirc circrnaFindcirc) {

        circrnaFindcircRepository.save(circrnaFindcirc);
    }

    public List<Circrna_Findcirc> getAllFindCiri() {

        return circrnaFindcircRepository.findAll();
    }

    public Circrna_Findcirc getFindCiriById(String id) {

        return circrnaFindcircRepository.findById(id).get();

    }
    public void deleteById(String id) {

        circrnaFindcircRepository.deleteById(id);
    }
}
