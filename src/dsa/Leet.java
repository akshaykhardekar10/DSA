package dsa;

public class Leet {
    public static void main(String[] args) {
    }

        int i, j, x;
        int[] xyz;
        public int[] twoSum ( int[] nums, int target){
            for (i = 0; i < nums.length; i++) {
                for (j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }

            return new int[]{i, j};
        }

}