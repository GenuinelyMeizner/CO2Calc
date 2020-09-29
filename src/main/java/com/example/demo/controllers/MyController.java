package com.example.demo.controllers;

import com.example.demo.models.MyModels;
import com.example.demo.services.MyServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class MyController {

     MyModels myModels = new MyModels();

     MyServices myServices = new MyServices();

     @GetMapping ("/")
     public String index(Model calcModel) {

          calcModel.addAttribute("myModels", myModels);

          return "index";
     }

     @PostMapping("/postCalc")
     public String postCalc(WebRequest dataFromForm) {

          double value = Double.valueOf(dataFromForm.getParameter("input"));
          MyModels calcFromForm = new MyModels(value);

          myModels = calcFromForm;

          return "redirect:/";
     }

}
