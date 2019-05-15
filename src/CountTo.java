import java.util.Scanner;

public class CountTo {

    public static void main(String args[]) {

        Scanner input = new Scanner (System.in);
        double userInput;
        double average;
        double [] num = new double[20];
        double total = 0;
        int x = 0;
        do {
            System.out.println("Please enter a number to count up to and back down >>>> ");
            userInput = input.nextDouble();
            num[x] = userInput;
            total = total + num[x];
            ++x;
        }while(userInput != 999);
        average = (total-999) / x;
        System.out.println("The average is " + average);
        for (int i = 0; i < x; i++){
            if(num[i]>900){
                System.out.println();
            }
            else
                System.out.println("Distance from " + (num[i]-average));
        }

    }
}