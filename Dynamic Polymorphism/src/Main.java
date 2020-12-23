import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // poly-morphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        // ex. A corvette is : corvette, and a car, and a Vehicle, and an object

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want ?");
        System.out.print("(1=dog) or (2=cat):");
        int choice = scanner.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2){
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
