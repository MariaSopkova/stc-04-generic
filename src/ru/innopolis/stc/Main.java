package ru.innopolis.stc;

import ru.innopolis.stc.test.MathBoxTest;
import ru.innopolis.stc.test.ObjectBoxTest;

public class Main {
    public static void main(String[] args) {
        ObjectBoxTest.AddAndDeleteObjects();
        System.out.println("*******************");
        ObjectBoxTest.summator();
        System.out.println("*******************");
        ObjectBoxTest.summatorException();
        System.out.println("*******************");
        ObjectBoxTest.splitter();
        System.out.println("*******************");
        ObjectBoxTest.splitterExeption();

        MathBoxTest.AddAndDeleteObjects();
        System.out.println("*******************");
        MathBoxTest.summator();
        System.out.println("*******************");
        MathBoxTest.summatorException();
        System.out.println("*******************");
        MathBoxTest.splitter();
        System.out.println("*******************");
        MathBoxTest.splitterExeption();
    }
}
