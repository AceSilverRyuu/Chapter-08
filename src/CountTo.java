import java.util.Scanner;

public class CountTo {

    public static void main(String args[]) {

        Scanner input = new Scanner (System.in);
        double userInput;

        System.out.println("Please enter a number to count up to and back down >>>> ");
        userInput = input.nextDouble();

        double [] doubles = {userInput};


        for (double i = 0; i < userInput; i++){
            System.out.println(i);
        }
        for (double j = userInput; j >= 0; j--){
            System.out.println(j);
        }
    }
}