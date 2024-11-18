package org.example;

public class Car {
    private Engine engine;
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    String drive(){
        return engine.start() + " Car is driving ";
    }

}
