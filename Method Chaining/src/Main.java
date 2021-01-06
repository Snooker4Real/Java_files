import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // method chaining = a common syntax for invoking multiple method calls iin OOP
        //                      condense code into less lines

        String name = "         Jonathan";

        //name = name.concat(" Cindano      ");
        //name = name.toUpperCase();
        //name = name.trim();

        name = name.concat(" Cindano        ").toUpperCase(Locale.ROOT).trim();

        System.out.println(name);
    }
}
