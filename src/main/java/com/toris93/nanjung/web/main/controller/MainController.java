package com.toris93.nanjung.web.main.controller;

import java.util.HashMap;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {

	
 	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Locale locale, Model model) {
        
        //System.out.println("###id=" + usrVO.getUsr_id());
//        model.addAttribute("usr",  );

        return "index";
    }

}