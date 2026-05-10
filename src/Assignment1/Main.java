package Assignment1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("Как Вас зовут?\n- ");
        Scanner scan = new Scanner(System.in, "cp866");
        String name = scan.next();
        System.out.println("Привет, " + name + "!");
        scan.close();
    }
}