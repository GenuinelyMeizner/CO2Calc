package com.example.demo.services;

import com.example.demo.models.MyModels;

public class MyServices {

    MyModels myModels = new MyModels();

    public void calc() {

        double output = 0;

        output += myModels.getInput() * 2.5;

        myModels.setOutput(output);
    }
}
