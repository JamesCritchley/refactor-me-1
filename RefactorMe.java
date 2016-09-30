package refactorme;
import java.util.*;

public class RefactorMe {

    public static void main(String[] args) {
        getName();
        calculateSalary(2500, 400);
        calculateSides("circle");
        countLetters();
    }

    public static void getName(){
        System.out.println("Your age is: ");
    }

    public static void calculateSalary(int income, int tax) {
        // Salary = income - tax
    }

    public static void calculateSides(String shape) {
        // this method should detect for
        // 1 square
        // 2 circle
        // 3 hexagon
        // 4 dodecagon

        if (shape.contains("square")) {
            System.out.println("Your shape has 4 sides");
        }
    }

    public static void countLetters() {


        //String word = 
        System.out.println("You entered: " + word );

        System.out.println("You word is: " + word.length() + "letters long.");
    }

}
