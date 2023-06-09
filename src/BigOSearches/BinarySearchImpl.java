package BigOSearches;

public class BinarySearchImpl {

    public static int binarySearch(int[] data, int key) {
        int low = 0;
        int high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;
        do {
            System.out.print(remainingElements(data, low, high));
            for (int i = 0; i < middle; i++) {
                System.out.print(" ");
            }
            System.out.println(" * ");
            int Key =0;
            if (Key == data[middle]) {     
                location = middle;
            } else if (Key < data[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
            middle = (low + high + 1) / 2;
        } while ((low <= high) && (location == -1));
        return location;
    }
        private static String remainingElements(int [] data, int low,int high) {
        StringBuilder temporary = new StringBuilder();
            for (int i = 0; i < low; i++) {
                temporary.append(" ");
            }
            for (int i = low; i <= high; i++) {
                temporary.append(data[i] + " ");
            }
             return String.format("%s%n", temporary);

        }

    }

