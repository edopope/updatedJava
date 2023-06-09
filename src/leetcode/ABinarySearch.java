package leetcode;

public class ABinarySearch {
        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1; // target not found
        }

        public static void main(String[] args) {
            int[] nums = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
            int target = 23;

            int index = search(nums, target);
            System.out.println("Target found at index: " + index);
        }
    }


