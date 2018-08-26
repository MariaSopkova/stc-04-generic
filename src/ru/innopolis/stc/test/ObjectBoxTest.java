package ru.innopolis.stc.test;


import ru.innopolis.stc.box.ObjectBox;
import ru.innopolis.stc.exceptions.NotNumberException;

public class ObjectBoxTest {

    protected ObjectBox objectBox;

    public ObjectBoxTest() {
        objectBox = new ObjectBox();
    }

    private void addIntegers() {
        objectBox.addObject(13);
        objectBox.addObject(1);
        objectBox.addObject(27);
    }

    private void addDoubles() {
        objectBox.addObject(2.5);
        objectBox.addObject(11.8);
        objectBox.addObject(-2.5);
    }

    private void addStrings() {
        objectBox.addObject("Masha");
        objectBox.addObject("String");
        objectBox.addObject("Hello world");
    }

    private void deleteStrings() {
        objectBox.deleteObject("Masha");
        objectBox.deleteObject("String");
        objectBox.deleteObject("Hello world");
    }

    public void deleteObjects() {
        addDoubles();
        addIntegers();
        addStrings();
        PrintTestBeginning("Delete objects");
        objectBox.deleteObject(1);
        objectBox.deleteObject(2);
        objectBox.deleteObject(11.8);
        objectBox.deleteObject(-2.11);
        objectBox.deleteObject("111");
        deleteStrings();
        PrintTestEnd();
    }

    public void PrintTestBeginning(String testName) {
        System.out.println("//////////////////");
        System.out.println(testName);
        System.out.println("After init:");
        System.out.println(objectBox.dump());
    }

    public void PrintTestEnd() {
        System.out.println("After function:");
        System.out.println(objectBox.dump());
        System.out.println("//////////////////");
    }

    public void summator(boolean isException) {
        if (isException) {
            PrintTestBeginning("SummatorTestException");
        } else {
            PrintTestBeginning("SummatorTest");
        }
        try {
            System.out.println("Result: " + objectBox.summator());
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        } finally {
            PrintTestEnd();
        }
    }

    public void splitter(boolean isException) {
        if (isException) {
            PrintTestBeginning("SplitterTestException");
        } else {
            PrintTestBeginning("SplitterTest");
        }
        try {
            System.out.println("Result with 2: " + objectBox.splitter(2));
            System.out.println("Result with 0.5: " + objectBox.splitter(0.5));
        } catch (NotNumberException ex) {
            System.out.println(ex.getMessage());
        } finally {
            PrintTestEnd();
        }
    }

    public void allTests() {
        deleteObjects();
        summator(false);
        splitter(false);
        addStrings();
        summator(true);
        splitter(true);

    }
}
