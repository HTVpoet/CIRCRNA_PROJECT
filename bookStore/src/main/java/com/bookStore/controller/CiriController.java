package com.bookStore.controller;

import com.bookStore.entity.Circrna_Ciri;
import com.bookStore.service.Circrna_CiriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CiriController {

    @Autowired
    private Circrna_CiriService circrna_ciriService;


    @GetMapping("/available_ciri")
    public ModelAndView getAllCiri() {
        List<Circrna_Ciri> list = circrna_ciriService.getAllCiri();
        ModelAndView m = new ModelAndView();
        m.setViewName("ciriList");
        m.addObject("ciri", list);
        return m;
    }
}
