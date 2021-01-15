import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // generics =   enable types (classes & interfaces) to be parameters when defining
        //              classes, interfaces & methods
        //              a benefits is to eliminate the need to create multiple versions
        //              of methods or classes for various data types
        //              Use 1 version for all reference data types

        /*
        Ex.1

        Player player = new Player();
        Enemy enemy = new Enemy();
        Item item = new Item();
        Tree tree = new Tree();

        draw(player);
        draw(enemy);
        draw(item);
        draw(tree);

        public static <Thing> void draw(Thing x) {
            x.draw();
        }

         */

        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01);

        //MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
        //MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '!');


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());

        //bounded types = you can create the object of a generic class to have data
        //                  of a specific derived types ex.Number

    }
}
