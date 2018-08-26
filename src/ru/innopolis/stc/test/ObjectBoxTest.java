package ru.innopolis.stc.test;


import ru.innopolis.stc.box.ObjectBox;
import ru.innopolis.stc.exceptions.NotNumberException;

public class ObjectBoxTest {
    public static void AddAndDeleteObjects() {
        ObjectBox objectBox = new ObjectBox();
        objectBox.addObject("String");
        objectBox.addObject("Masha");
        objectBox.addObject(13);
        objectBox.addObject(42);
        objectBox.addObject(42);
        objectBox.addObject(33.5);
        System.out.println("After init:");
        System.out.println(objectBox.dump());
        System.out.println("////////////");
        System.out.println(objectBox.deleteObject(42));
        System.out.println(objectBox.deleteObject(43));
        System.out.println(objectBox.deleteObject(33.5));
        System.out.println("////////////");
        System.out.println("After delete:");
        System.out.println(objectBox.dump());
    }

    public static void summatorException() {
        System.out.println("Summator exception test");
        ObjectBox objectBox = new ObjectBox();
        objectBox.addObject("String");
        objectBox.addObject("Masha");
        objectBox.addObject(13);
        objectBox.addObject(42);
        objectBox.addObject(42);
        objectBox.addObject(33.5);
        System.out.println("After init:");
        System.out.println(objectBox.dump());
        System.out.println("////////////");
        try {
            System.out.println(objectBox.summator());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void summator() {
        System.out.println("Summator test");
        ObjectBox objectBox = new ObjectBox();
        objectBox.addObject(10.5);
        objectBox.addObject(1);
        objectBox.addObject(2);
        System.out.println("After init:");
        System.out.println(objectBox.dump());
        System.out.println("////////////");
        try {
            System.out.println(objectBox.summator());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void splitter() {
        System.out.println("Splitter test");
        ObjectBox objectBox = new ObjectBox();
        objectBox.addObject(10.5);
        objectBox.addObject(1);
        objectBox.addObject(2);
        System.out.println("After init:");
        System.out.println(objectBox.dump());
        System.out.println("////////////");
        try {
            System.out.println(objectBox.splitter(new Integer(2)).toString());
            System.out.println(objectBox.splitter(new Double(0.5)).toString());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void splitterExeption() {
        System.out.println("Splitter test");
        ObjectBox objectBox = new ObjectBox();
        objectBox.addObject(10.5);
        objectBox.addObject(1);
        objectBox.addObject(2);
        objectBox.addObject("Masha");
        System.out.println("After init:");
        System.out.println(objectBox.dump());
        System.out.println("////////////");
        try {
            System.out.println(objectBox.splitter(new Integer(2)).toString());
            System.out.println(objectBox.splitter(new Double(0.5)).toString());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
