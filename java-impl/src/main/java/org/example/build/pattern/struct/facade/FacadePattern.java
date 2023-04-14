package org.example.build.pattern.struct.facade;

public class FacadePattern {

    private SubSystemA subSystemA;

    private SubSystemB subSystemB;

    private SubSystemC subSystemC;


    public FacadePattern(SubSystemA subSystemA, SubSystemB subSystemB, SubSystemC subSystemC) {
        this.subSystemA = subSystemA;
        this.subSystemB = subSystemB;
        this.subSystemC = subSystemC;
    }

    public void doSomething() {
        subSystemA.doSth();
        subSystemB.doSth();
        subSystemC.doSth();
    }
}
