/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge1 {
    public static final int G_TO_SFT = 350;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            try {
                int n = in.nextInt();
                System.out.printf("You will need to purchase %d gallons of paint to cover %d square" +
                        " feet.", (int) Math.ceil(n * 1.0 / G_TO_SFT), n);
                break;
            } catch (InputMismatchException e) {
                System.out.println("You must enter a numeric value!");
                in.nextLine();
            }
        } while (true);
    }
}