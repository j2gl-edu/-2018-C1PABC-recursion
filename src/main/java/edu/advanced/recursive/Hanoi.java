package edu.advanced.recursive;

public class Hanoi {

    public static void doHanoi(int n, String from, String to, String aux) {
        if (n == 1) {
            displayStep(n, from, to);
        } else {
            doHanoi(n-1, from, aux, to);
            displayStep(n, from, to);
            doHanoi(n-1, aux, to, from);
        }
    }

    public static void displayStep(int n, String from, String to) {
        System.out.println("Move disk " + n + " - tower " + from + " to tower " + to);
    }

    public static void main(String[] args) {
        System.out.println("Hanoi Towers: ");
        doHanoi(3, "A", "C", "B");
    }
    
}
  