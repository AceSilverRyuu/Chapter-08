public class TwelveInts {
    public static void main(String []args) {

        int[] ints = {0,1,2,3,4,5,6,7,8,9,10,11};

        System.out.println("The ints are: ");
        displayFor(ints);
    }
    public static void displayFor(int[] ints){

        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
        for (int j = ints.length-1; j >= 0; j--){
            System.out.println(ints[j]);
        }
    }

}
