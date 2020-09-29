package com.example.demo.models;

public class MyModels {
    private double input;
    private double output;

    public MyModels(double input, double output) {
        this.input = input;
        this.output = output;
    }

    public MyModels(double input) {
        this.input = input;
    }

    public MyModels() {

    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    @Override
    public String toString() {

        return "" + output;
    }
}
