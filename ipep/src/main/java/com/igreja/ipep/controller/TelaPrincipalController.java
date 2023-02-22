package com.igreja.ipep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class TelaPrincipalController {


    @RequestMapping
    public ModelAndView listarConteuddos(){

        ModelAndView mv = new ModelAndView("home/TelaPrincipal");


        return mv;
    }

}
