package ru.innopolis.stc.exceptions;

/**
 * Исключение.
 */
public class NotNumberException extends Exception {
    String message = new String();

    public NotNumberException(Object object) {
        message = object.getClass().getName() + " isn't a number.";
    }

    /**
     * Добавить информацию к сообщению, сгенерированному автоматически
     *
     * @param info текст, который нужно добавить
     */
    public void addInfoToMessage(String info) {
        message += "\n" + info;
    }

    /**
     * Получить сообщение об ошибке
     *
     * @return сообщение
     */
    public String getMessage() {
        return message;
    }
}
