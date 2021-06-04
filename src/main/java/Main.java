/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Main {
    public static final int FACTOR = 350;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int feet = in.nextInt();
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet\n", (int) Math.ceil(feet * 1.0 / FACTOR), feet);
    }
}