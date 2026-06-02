package operators.Assignment1;

public class Main {
    public static void main(String[] args) {

        // Арифметические операторы
        int a = 10;
        int b = 3;

        System.out.println(a + b);  // 13
        System.out.println(a - b);  // 7
        System.out.println(a * b);  // 30
        System.out.println(a / b);  // 3
        System.out.println(a % b);  // 1

        // Операторы присваивания
        int x = 5;

        x += 2; // x = x + 2
        x -= 1;
        x *= 3;
        x /= 2;
        x %= 4;

        System.out.println(x);

        // Инкремент и декремент
        int n = 5;

        System.out.println(++n); // префикс: сначала увеличили, потом вывели 6
        System.out.println(n++); // постфикс: сначала вывели 6, потом увеличили
        System.out.println(n);   // 7

        System.out.println(--n); // префикс: сначала уменьшили, потом вывели 6
        System.out.println(n--); // постфикс: сначала вывели 6, потом уменьшили
        System.out.println(n);   // 5

        // Операторы сравнения
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        System.out.println(a >= b); // true
        System.out.println(a < b);  // false
        System.out.println(a <= b); // false

        // Логические операторы
        boolean p = true;
        boolean q = false;

        System.out.println(p && q); // false
        System.out.println(p || q); // true
        System.out.println(!p);     // false
        System.out.println(p & q);  // false
        System.out.println(p | q);  // true
        System.out.println(p ^ q);  // true

        // Тернарный оператор
        int age = 18;
        String result = age >= 18 ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println(result);

        // Побитовые операторы
        int c = 5;  // 0101
        int d = 3;  // 0011

        System.out.println(c & d);  // 1
        System.out.println(c | d);  // 7
        System.out.println(c ^ d);  // 6
        System.out.println(~c);     // -6

        // Сдвиги
        System.out.println(c << 1);   // 10
        System.out.println(c >> 1);   // 2
        System.out.println(c >>> 1);  // 2

        // String: + и +=
        String s = "Java";
        String t = "Course";

        System.out.println(s + " " + t); // Java Course

        s += " language";
        System.out.println(s); // Java language

        // Сравнение строк
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);     // true, если ссылки совпали
        System.out.println(s1 != s2);     // false
        System.out.println(s1.equals(s2)); // true, сравнение содержимого
    }
}
