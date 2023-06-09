package Chapter6;

public class FloorAndCeil {
    public static double myFloor(double number, double number2){
        double x = 0;
        double largest = 0;
        if (number > x || number2 > x)
          largest = number2;
        number = largest;
        return largest;
        }


    public static void main(String[] args) {
        double n = 2.000;
        double m = 3.000;
        System.out.println(myFloor(n,m));

    }
    }

