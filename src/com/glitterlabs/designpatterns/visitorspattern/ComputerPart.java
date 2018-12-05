package com.glitterlabs.designpatterns.visitorspattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
