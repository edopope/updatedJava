package Chapter6;

import java.security.SecureRandom;

public class CoinTossing {

    private enum Status  { HEAD, TAIL}
    public static void main(String[] args) {
        int headCount = 0;
        int tailCount = 0;
        for (int i = 1; i <=10 ; i++) {



            Status value = flip();
            if (value.equals(Status.HEAD)){
                headCount++;
            }
            else{
                tailCount++;
            }
            System.out.print(flip() + " ");
            }
        System.out.printf("%n headCount = %d%n tailCount = %d%n", headCount, tailCount);








    }


   private static Status flip(){
       SecureRandom random = new SecureRandom();
       int randomNum = random.nextInt(0,2);
    if (randomNum == 0){
        return  Status.TAIL;
    }
    else {
        return Status.HEAD;
    }

    }
}
