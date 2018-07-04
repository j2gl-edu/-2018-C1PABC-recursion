package edu.advanced.recursion;

public class MainRecursion {

    public static void main(String[] args) {
        System.out.println("Hello Recursion!");
        System.out.println("");

        System.out.println("Factorial: ");
        int number = 5;
        System.out.println(number + "! = " + Factorial.doFactorial(number));
        System.out.println("");

        System.out.println("Hanoi Towers: ");
        Hanoi.doHanoi(3, "A", "C", "B");
    }
    
}
  