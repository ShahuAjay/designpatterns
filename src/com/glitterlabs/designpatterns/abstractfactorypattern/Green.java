package com.glitterlabs.designpatterns.abstractfactorypattern;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
