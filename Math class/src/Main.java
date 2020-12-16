import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        /*
        double x = 3.14;
        double y = -10;

        double z = Math.min(x, y);
        double a = Math.abs(y);
        double b = Math.sqrt(x);
        double c = Math.round(x);
        double d = Math.ceil(x);
        double e = Math.floor(x);
        System.out.println(z);
         */

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x:");
        x = scanner.nextDouble();

        System.out.println("Enter side y:");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenus is : " + z);

        scanner.close();

    }
}
