package Chapter2;

public class SquaresAndCubes {
    public static void main(String[] args) {
            System.out.println("index\t square\t cube\t");
        for (int i = 0; i <= 10; i++) {
            int square = i * i;
            int cube = (int) Math.pow(i,3);
            System.out.printf("%5d%6d%6d%n",i,square,cube);
        }
    }
}
