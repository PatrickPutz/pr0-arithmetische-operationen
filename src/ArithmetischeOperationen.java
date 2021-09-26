import java.util.Scanner;

public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        System.out.print("Define a: ");
        Scanner defineA = new Scanner(System.in);
        a = defineA.nextInt();

        System.out.print("Define b: ");
        Scanner defineB = new Scanner(System.in);
        b = defineB.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
