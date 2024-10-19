package com.bookStore.controller;

import com.bookStore.entity.*;
import com.bookStore.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class CircrnaController {

        @Autowired
        private CircrnaService service;

        @Autowired

        private MyCircrnaService myService;

        @GetMapping("/")
        public String login() {
            return "loginPage";
        }

        @GetMapping("/home")
        public String home() {
            return "home";
        }

        @GetMapping("/circrna_register")
        public String bookRegister() {
            return "bookRegister";
        }

        @GetMapping("/available_circrna")
        public ModelAndView getAllCircrna() {
            List<Circrna> list=service.getAllCircrna();
        ModelAndView m=new ModelAndView();
    	m.setViewName("bookList");
		m.addObject("circrna",list);
            return m;
        }


        @PostMapping("/save")
        public String addCircrna(@ModelAttribute Circrna circrna) {
            service.save(circrna);
            return "redirect:/available_circrna";
        }

        @GetMapping("/my_circrna")
        public String getMyCircrna(Model model)
        {
            List<MyCircrna>list=myService.getAllMyCircrna();
            model.addAttribute("circrna" , list);
            return "myBooks";
        }

        @RequestMapping("/mylist/{id}")
        public String getMyListCircrna(@PathVariable("id") int id) {
            Circrna circrna = service.getCircrnaById(id);
            MyCircrna myCircrna = new MyCircrna(circrna.getId(), circrna.getChr(),circrna.getStartCirc(),circrna.getEndCirc(), circrna.getGeneId(), circrna.getCircId(), circrna.getJunctionFragmentCount(), circrna.getJunctionFPM(), circrna.getMedianCirclen(), circrna.getFdr());
            myService.saveMyCircrna(myCircrna);
            return "redirect:/my_circrna";
        }

        @RequestMapping("/editBook/{id}")
        public String editCircrna(@PathVariable("id") int id,Model model) {
            Circrna circrna = service.getCircrnaById(id);
            model.addAttribute("circrna", circrna);
            return "bookEdit";
        }

        @RequestMapping("/deleteCircrna/{id}")
        public String deleteCircrna(@PathVariable("id")int id) {
            service.deleteById(id);
            return "redirect:/available_circrna";
        }

    }


