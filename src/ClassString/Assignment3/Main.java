package ClassString.Assignment3;

/**
 * Три двойные кавычки в Java используются для text block.
 * Это удобно для многострочного текста, SQL-запросов, JSON, HTML и т.д.
 */
public class Main {
    public static void main(String[] args) {
        String json = """
                {
                    "language": "Java",
                    "level": 3
                }
                """;

        System.out.println(json);
    }
}