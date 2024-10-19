package com.bookStore.controller;

import com.bookStore.DTO.ChrCountDTO;
import com.bookStore.entity.Circrna_Circall;
import com.bookStore.service.Circrna_CircallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CircallController {

    @Autowired
    private Circrna_CircallService circrna_CircallService;


    @GetMapping("/available_circall")
    public ModelAndView getAllCircall(@Param("circId") String circId) {
        //Count circall
        int count_circall = circrna_CircallService.CountCircall();
        //Count each patient_sample
        int srr191 = circrna_CircallService.CountPatientSample("191");
        int srr200 = circrna_CircallService.CountPatientSample("200");
        int srr203 = circrna_CircallService.CountPatientSample("203");
        //Percentage of patient
        double srr191_ = (double)srr191 / (srr191 + srr200 + srr203) * 100;
        double srr200_ = (double)srr200 / (srr191 + srr200 + srr203) * 100;
        double srr203_ = 100 - srr191_ - srr200_;
        //fetch all data from Circall_db
        List<Circrna_Circall> list= circrna_CircallService.getAllCircall();
        if(circId != null) {
            list = circrna_CircallService.SearchCircallById(circId);
        }
        //countJF >= 5
        int countJF = circrna_CircallService.CountJF();

        //count_chr
        List<Object[]> A = circrna_CircallService.Count_chr();
        List<ChrCountDTO> B = new ArrayList<>();
        for (Object[] a : A) {
            String chr = (String) a[0];
            Long count = (Long) a[1];
            ChrCountDTO dto = new ChrCountDTO(chr, count);
            B.add(dto);
        }

        //Estimate percentage of chrom in Sample:
        double sum = 0;
        for(int i = 0; i < B.size(); i++){
            sum = (double) (sum + B.get(i).getCount_chr());
        }

        List<Double> C = new ArrayList<>();
        for(int i = 0; i < B.size(); i++){
            C.add(B.get(i).getCount_chr()/sum * 100);
        }

        List<String> D = new ArrayList<>();
        for(int i = 0; i < B.size(); i++){
            D.add(B.get(i).getChr());
        }



        ModelAndView m=new ModelAndView();
        m.setViewName("circallList");
        m.addObject("circall",list);
        m.addObject("countcircall",count_circall);
        m.addObject("srr191",srr191);
        m.addObject("srr200",srr200);
        m.addObject("srr203",srr203);
        //object percentage
        m.addObject("srr191_",srr191_);
        m.addObject("srr200_",srr200_);
        m.addObject("srr203_",srr203_);
        //count JF >= 5
        m.addObject("countJF", countJF);
        //count_chr
        m.addObject("count_chr", B);
        m.addObject("chr_percentage", C);
        m.addObject("chr_labels", D);

        return m;
    }

    @GetMapping("/search")
    public String  search() {
        return "circrnaSearch";
    }





}
