import java.util.Scanner;

public class ArithmetischeOperationen {
    public static void main(String[] args) {

        // initialize a and b as placeholders for later
        int a = 0;
        int b = 0;

        // ask for the definitions of a and b
        System.out.print("Define a: ");
        Scanner defineA = new Scanner(System.in);
        a = defineA.nextInt();

        System.out.print("Define b: ");
        Scanner defineB = new Scanner(System.in);
        b = defineB.nextInt();

        // print a and b for verification
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // execute arithmetic operations for a and b
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
