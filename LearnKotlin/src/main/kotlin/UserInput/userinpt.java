package UserInput;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

// Program to measure elapsed time in Java
class userinpt
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");

        String userName = myObj.nextLine();
        System.out.println("User's input string': " + userName);

        long endTime = System.nanoTime();


        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
