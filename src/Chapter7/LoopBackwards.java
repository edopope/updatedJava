package Chapter7;

//import static sun.net.www.http.KeepAliveCache.result;

import java.util.Arrays;

public class LoopBackwards {
    public static int [] loopBack(int [] array){
        int [] result = new int[array.length];
        int length = array.length -1;
        for (int i = 0; i <= array.length -1; i++) {
                result[i] = array[length];
                length --;

        }
           return result;
    }

    public static void main(String[] args) {
        int [] age = {7,2,8,4,5};
        System.out.println(Arrays.toString(loopBack(age)));
    }

}

