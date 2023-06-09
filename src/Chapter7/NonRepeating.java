package Chapter7;

public class NonRepeating {
    public static void main(String[] args) {
        int x = 0;
        int[] arrays = {1, 2, 3, 1, 3,1,2,45,6,1};
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length ; j++) {
                if( i != j && arrays[i] == arrays[j]){
                    break;
                } else if (j == x) {
                    System.out.println(arrays[i]);
                }
            }
        }


        }
    }