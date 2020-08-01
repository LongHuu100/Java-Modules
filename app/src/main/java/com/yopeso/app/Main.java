package com.yopeso.app;

import app.ai2png.beta.HelloWorldBeta;
import app.price.calculator.HelloWorld;
import app.report.alpha.HelloWorldAlpha;

public class Main {

    public static void main(String[] args) {
        HelloWorld helloWorldAlpha = new HelloWorldAlpha();
        HelloWorld helloWorldBeta = new HelloWorldBeta();

        helloWorldAlpha.printServiceName();
        helloWorldBeta.printServiceName();
    }
}