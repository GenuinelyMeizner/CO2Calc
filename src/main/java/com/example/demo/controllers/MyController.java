package com.example.demo.controllers;

import com.example.demo.models.BeregnerModel;
import com.example.demo.services.BeregnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class MyController {

     BeregnerModel beregnerModel = new BeregnerModel();

     BeregnerService beregnerService = new BeregnerService();

     @GetMapping ("/calc")
     public String calc(Model calcModel) {

          calcModel.addAttribute("beregnerModel", beregnerModel);

          return "beregner";
     }

     @PostMapping("/postCalc")
     public String postCalc(WebRequest dataFromForm) {

          double value = Double.valueOf(dataFromForm.getParameter("output"));

          BeregnerModel calcFromForm = new BeregnerModel(beregnerService.calc(value));

          beregnerModel = calcFromForm;

          return "redirect:/calc";
     }

}
