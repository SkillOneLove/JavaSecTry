package CustomExceptions;

/**
 * Собственный класс исключения.
 */
public class Main {
    public static void main(String[] args) {
        try {
            registerUser("Max", -1);
        } catch (InvalidUserDataException e) {
            System.out.println("Ошибка регистрации: " + e.getMessage());
        }
    }

    private static void registerUser(String name, int age) throws InvalidUserDataException {
        if (name == null || name.isBlank()) {
            throw new InvalidUserDataException("имя не может быть пустым");
        }

        if (age < 0) {
            throw new InvalidUserDataException("возраст не может быть отрицательным");
        }

        System.out.println("Пользователь зарегистрирован");
    }
}

class InvalidUserDataException extends Exception {
    public InvalidUserDataException() {
        super();
    }

    public InvalidUserDataException(String message) {
        super(message);
    }

    public InvalidUserDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
