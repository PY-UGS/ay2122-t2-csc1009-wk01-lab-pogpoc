package Pract2;


import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        final double Pi =  3.14159;
        Scanner circ = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        float radius = circ.nextFloat();
        double area = radius * radius * Pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
