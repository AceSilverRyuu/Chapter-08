import java.util.Scanner;

public class DistanceFromAverage {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        double [] values = new double[20];
        double entry = 0;
        int count = 0;
        int total = 0;
        int average = 0;
        boolean quit = true;

        while (quit){
            System.out.println("Please enter 20 double integers or type 999 to quit >>> ");
            entry = input.nextDouble();
            values[count] = entry;
            count++;

            if (entry == 999){

                quit = false;
            }
            else{
                values[count] = entry;
                count++;
            }
        }
        for (int i = 0; i < values.length; i++){

            System.out.println(average-values[i]);
            if (values[i] == 0){
                System.out.println();
            }
           total = (int) (total + values[i]);
           System.out.println(total);
        }
        average = total / count;

        System.out.println("The average is " + average);

    }
}
