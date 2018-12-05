package com.glitterlabs.designpatterns.factorypattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
