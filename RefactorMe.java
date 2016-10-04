package refactorme;
import java.util.*;
import java.util.Scanner;

public class RefactorMe {

    public static void main(String[] args) {
        getName();
        calculateSalary(2500, 400);
        calculateSides("circle");
        countLetters();
    }

    public static void getName(){
        String name = "James";
        System.out.println("Your name is: " + name);
    }

    public static void calculateSalary(int income, int tax){
    int Salary = income - tax;
        System.out.println("Your salary is: " + Salary);
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
        if (shape.contains("circle")){
            System.out.println("Your shape has 1 side");
        }
        if (shape.contains("hexagon")){
            System.out.println("Your shape has 6 sides");
        }
        if (shape.contains("dodecagon")){
            System.out.println("Your shape has 12 sides");
        }
        
    }

    public static void countLetters() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();
        
        


        //String word = 
        System.out.println("You entered: " + word );

        System.out.println("You word is: " + word.length() + " letters long.");
    }

}
