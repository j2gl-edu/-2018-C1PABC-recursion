package edu.advanced.recursion;

public class MultiplyRecursion {

    public static int multiply(int m, int n) {
        if (n == 0) {
            return 0;
        } else {
            return m + multiply(m, n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Multiply example: ");
        System.out.println(multiply(7, 4));
    }
    
}
  




