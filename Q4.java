package Pract2;

import java.util.Scanner;

public class Q4 {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    String[] zodiacs= {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
    
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    String zodiacSign = zodiacs[year%12];

    System.out.print(zodiacSign);
    }
    
}