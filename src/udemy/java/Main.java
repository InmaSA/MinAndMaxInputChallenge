package udemy.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;



         while (true) {
             System.out.println("Enter number:");
             boolean isValid = scanner.hasNextInt();
            if(isValid) {
                int number = scanner.nextInt();
                scanner.nextLine();

                if(number < min || min == 0) {
                    min = number;
                }
                if(number > max) {
                    max = number;
                }
            } else {
                break;
            }
         }

        System.out.println("The min number is " + min + " and the max one is " + max + ".");
         scanner.close();
    }

}
