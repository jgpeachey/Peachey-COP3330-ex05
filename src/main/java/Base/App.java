/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Base;

/*
Write a program that prompts for two numbers. Print the sum, difference,
product, and quotient of those numbers as shown in the example output:

Example Output:
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints:
*Values coming from users will be strings. Ensure that you convert these
values to numbers before doing the math.
*Keep the inputs and outputs separate from the numerical conversions and
other processing.
*Generate a single output statement with line breaks in the appropriate
spots.

Challenges:
*Revise the program to ensure that inputs are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
*Don’t allow the user to enter a negative number.
*Break the program into functions that do the computations.
*Implement this program as a GUI program that automatically updates the
values when any value changes.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("What is the first number?");
        int num1 = in.nextInt();
        System.out.println("What is the second number?");
        int num2 = in.nextInt();


        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
    }
}
