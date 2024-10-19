package com.bookStore.controller;

import com.bookStore.entity.Circrna_Ciri;
import com.bookStore.entity.Circrna_Findcirc;
import com.bookStore.service.Circrna_FindcircService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FindcircController {


    @Autowired
    private Circrna_FindcircService findcircService;

    @GetMapping("/available_findciri")
    public ModelAndView getAllCiri() {
        List<Circrna_Findcirc> list = findcircService.getAllFindCiri();
        ModelAndView m = new ModelAndView();
        m.setViewName("findciriList");
        m.addObject("findciri", list);
        return m;
    }
}
