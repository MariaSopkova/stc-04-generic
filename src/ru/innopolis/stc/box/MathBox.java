package ru.innopolis.stc.box;

import ru.innopolis.stc.exceptions.NotNumberException;

import java.util.Collections;
import java.util.Comparator;

public class MathBox extends ObjectBox {
    /**
     * Добавить объект
     *
     * @param object объект, который необходимо добавить
     * @throws NotNumberException кидается при попытке добавить не числовое значение
     */
    @Override
    public boolean addObject(Object object) {
        if (!(object instanceof Number)) {
            return false;
        }
        if (super.addObject(object)) {
            Collections.sort(objects, new MathBoxSort());
            return true;
        } else {
            return false;
        }
    }
}

class MathBoxSort implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1.equals(o2)) {
            return 0;
        } else if (((Number) o1).doubleValue() < ((Number) o2).doubleValue()) {
            return -1;
        } else {
            return 1;
        }
    }
}