package ru.innopolis.stc.test;

import ru.innopolis.stc.box.MathBox;
import ru.innopolis.stc.exceptions.NotNumberException;

public class MathBoxTest {
    public static void AddAndDeleteObjects() {
        MathBox mathBox = new MathBox();
        mathBox.addObject("String");
        mathBox.addObject("Masha");
        mathBox.addObject(13);
        mathBox.addObject(42);
        mathBox.addObject(42);
        mathBox.addObject(33.5);
        System.out.println("After init:");
        System.out.println(mathBox.dump());
        System.out.println("////////////");
        System.out.println(mathBox.deleteObject(42));
        System.out.println(mathBox.deleteObject(43));
        System.out.println(mathBox.deleteObject(33.5));
        System.out.println("////////////");
        System.out.println("After delete:");
        System.out.println(mathBox.dump());
    }

    public static void summatorException() {
        System.out.println("Summator exception test");
        MathBox mathBox = new MathBox();
        mathBox.addObject("String");
        mathBox.addObject("Masha");
        mathBox.addObject(13);
        mathBox.addObject(42);
        mathBox.addObject(42);
        mathBox.addObject(33.5);
        System.out.println("After init:");
        System.out.println(mathBox.dump());
        System.out.println("////////////");
        try {
            System.out.println(mathBox.summator());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void summator() {
        System.out.println("Summator test");
        MathBox mathBox = new MathBox();
        mathBox.addObject(10.5);
        mathBox.addObject(1);
        mathBox.addObject(2);
        System.out.println("After init:");
        System.out.println(mathBox.dump());
        System.out.println("////////////");
        try {
            System.out.println(mathBox.summator());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void splitter() {
        System.out.println("Splitter test");
        MathBox mathBox = new MathBox();
        mathBox.addObject(10.5);
        mathBox.addObject(1);
        mathBox.addObject(2);
        System.out.println("After init:");
        System.out.println(mathBox.dump());
        System.out.println("////////////");
        try {
            System.out.println(mathBox.splitter(new Integer(2)).toString());
            System.out.println(mathBox.splitter(new Double(0.5)).toString());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void splitterExeption() {
        System.out.println("Splitter test");
        MathBox mathBox = new MathBox();
        mathBox.addObject(10.5);
        mathBox.addObject(1);
        mathBox.addObject(2);
        mathBox.addObject("Masha");
        System.out.println("After init:");
        System.out.println(mathBox.dump());
        System.out.println("////////////");
        try {
            System.out.println(mathBox.splitter(new Integer(2)).toString());
            System.out.println(mathBox.splitter(new Double(0.5)).toString());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
