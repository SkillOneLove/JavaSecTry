package typesLiterals.Assignment4;

public class Main {
    public static void main(String[] args) {
        String name = "Дмитрий";
        int age = 19;
        double height = 1.78;
        boolean isStudent = true;
        char grade = 'B';

        String result = "Имя: " + name
                + ", возраст: " + age
                + ", рост: " + height
                + ", студент: " + isStudent
                + ", оценка: " + grade;

        System.out.println(result);
    }
}
