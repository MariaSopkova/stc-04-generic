package ru.innopolis.stc;

import ru.innopolis.stc.test.MathBoxTest;
import ru.innopolis.stc.test.ObjectBoxTest;

public class Main {
    public static void main(String[] args) {
        ObjectBoxTest objectBoxTest = new ObjectBoxTest();
        objectBoxTest.allTests();

        MathBoxTest mathBoxTest = new MathBoxTest();
        mathBoxTest.allTests();
    }
}
