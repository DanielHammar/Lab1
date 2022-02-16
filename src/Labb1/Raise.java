package Labb1;

public class Raise {

    static int numberOfLoopsOne = 0;
    static int numberOfLoopsHalf = 0;

    public static double recRaiseOne(double x, int k) {

        if (k==0) {
            return 1.0;
        }
        else {
            numberOfLoopsOne = numberOfLoopsOne + 1;
            return x * recRaiseOne(x,k-1);
        }
    }

    public static double recRaiseHalf(double x, int k){

        if (k==0) { // If k = 0
            return 1;
        }
        else if (k % 2 == 0){
            numberOfLoopsHalf = numberOfLoopsHalf + 1;
            double xEven = recRaiseHalf(x, (k/2) );
            return xEven * xEven;
        }
        else {
            numberOfLoopsHalf = numberOfLoopsHalf + 1;
            double xDown = recRaiseHalf(x,(k/2));
            return x * xDown * xDown;
        }
    }


    public static void main(String[] args) {


        double startX = 1.5;
        for(int i = 1; i <= 15 ; i++){

            System.out.println("(RecRaiseHalf): " + recRaiseHalf(startX, i) + " number of recursive calls: " + numberOfLoopsHalf +
                    "             (RecRaiseOne): " + recRaiseOne(startX,i) + " number of recursive calls: " + numberOfLoopsOne);
            numberOfLoopsHalf = 0; // reset count for next number
            numberOfLoopsOne = 0; // reset count for next number
    }
}   }
