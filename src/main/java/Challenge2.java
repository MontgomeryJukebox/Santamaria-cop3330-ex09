/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Challenge2 {
    public static final int G_TO_SFT = 350;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the radius of the room?");
        int r = in.nextInt();
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet\n",
                (int) Math.ceil(Math.PI * r * r / G_TO_SFT), (int) Math.PI * r * r);
    }
}