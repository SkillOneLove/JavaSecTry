package InformationFormatting.Assignment3;

import java.util.Formatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Практика #3. Пять спецификаторов даты и времени");

        Formatter formatter = new Formatter(System.out, Locale.US);
        long now = System.currentTimeMillis();

        formatter.format("hour 00-23: %tH%n", now); // %tH — час в формате 00-23
        formatter.format("minute: %tM%n", now);     // %tM — минуты 00-59
        formatter.format("second: %tS%n", now);     // %tS — секунды 00-59
        formatter.format("year: %tY%n", now);       // %tY — год в четырехзначном формате
        formatter.format("month name: %tB%n", now); // %tB — полное название месяца
        formatter.format("day name: %tA%n", now);   // %tA — полное название дня недели

        formatter.flush();        
        formatter.close();
    }
}
