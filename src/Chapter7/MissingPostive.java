package Chapter7;

public class MissingPostive {

    public  static int returnMissingPositive(int [] elements){
        int temp = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length ; j++) {
                if (elements[j] != elements[i] && elements[i] > 0){
                    temp = elements[j] + 1;
                }
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        int [] age = {7,8,9,11,23};
        System.out.println(returnMissingPositive(age));
    }
//}

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Ignore negative numbers and zeros
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark numbers as negative
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // Step 3: Find the first positive index
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        // Step 4: If no positive number found, return n + 1
        return n + 1;
    }
}

