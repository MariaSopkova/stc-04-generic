package ru.innopolis.stc.box;

import ru.innopolis.stc.exceptions.NotNumberException;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для хранения объектов различных типов.
 * Объекты храняться в единственном экземпляре. Не сортируются.
 */
public class ObjectBox {

    protected List<Object> objects = new ArrayList<>();

    public List<Object> getObjects() {
        return objects;
    }

    /**
     * Добавить объект
     *
     * @param object объект, который необходимо добавить
     */
    public void addObject(Object object) {
        if (object == null || objects.contains(object))
            return;
        objects.add(object);
    }

    /**
     * Посчитать сумму элементов.
     *
     * @return сумма элементов
     * @throws NotNumberException выбрасывается в случае, если есть хотя бы один не числовой элемент
     */
    public double summator() throws NotNumberException {
        double result = 0;
        for (Object object : objects) {
            if (object instanceof Number) {
                result += ((Number) object).doubleValue();
            } else {
                NotNumberException exception = new NotNumberException(object);
                exception.addInfoToMessage("Cann't do summator function.");
                throw exception;
            }
        }
        return result;
    }

    /**
     * Разделить все элементы коллекции на число
     *
     * @param dilimeter делитель
     * @param <T>       Объект обязательно должен быть числом
     * @return результаты деления
     * @throws NotNumberException выбрасывается в случае, если есть хотя бы один не числовой элемент или делитель не число
     */
    public <T> List<Double> splitter(T dilimeter) throws NotNumberException {
        if (!(dilimeter instanceof Number)) {
            NotNumberException exception = new NotNumberException(dilimeter);
            exception.addInfoToMessage("Cann't do splitter function. Dilimeter isn't a number");
            throw exception;
        }
        List<Double> splitterResult = new ArrayList<>();
        for (Object object : objects) {
            if (object instanceof Number) {
                splitterResult.add(((Number) object).doubleValue() / (((Number) dilimeter).doubleValue()));
            } else {
                NotNumberException exception = new NotNumberException(object);
                exception.addInfoToMessage("Cann't do splitter function.");
                throw exception;
            }
        }
        return splitterResult;
    }

    /**
     * Удалить объект из коллекции
     *
     * @param object объект, который необходимо удалить
     * @return результат удаления
     */
    public boolean deleteObject(Object object) {
        if (object == null)
            return false;
        return objects.remove(object);
    }

    /**
     * Строковое представление класса
     *
     * @return строковое представление класса
     */
    public String dump() {
        return toString();
    }

    @Override
    public String toString() {
        String result = "Size: " + objects.size() + "\n";
        if (!objects.isEmpty()) {
            result += "Elements: " + objects.toString();
        }
        return result;
    }

    @Override
    public int hashCode() {
        return objects.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return objects.equals(((ObjectBox) obj).getObjects());
    }
}
