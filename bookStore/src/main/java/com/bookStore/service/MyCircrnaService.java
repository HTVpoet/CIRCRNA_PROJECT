package com.bookStore.service;

import com.bookStore.entity.MyCircrna;
import com.bookStore.repository.MyCircrnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyCircrnaService {
    @Autowired
    private MyCircrnaRepository mycircrnaRepo;

    public void saveMyCircrna(MyCircrna circrna) {

        mycircrnaRepo.save(circrna);
    }

    public List<MyCircrna> getAllMyCircrna(){

         return mycircrnaRepo.findAll();
    }

    public void deleteById(int id) {
        mycircrnaRepo.deleteById(id);
    }
}
