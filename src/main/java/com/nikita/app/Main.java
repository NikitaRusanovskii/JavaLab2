package com.nikita.app;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Interpretator interpretator = new Interpretator(processor);
        
        interpretator.run();

    }
}