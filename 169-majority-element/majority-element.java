class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!arr[i]) {
                int count = 1; // Reset count for the current element
                int temp = nums[i];
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] == temp) {
                        count++;
                        arr[j] = true; // Mark as visited
                    }
                }
                if (count > n / 2) {
                    return temp;
                }
            }
        }
        return -1; // This line is theoretically unreachable due to problem constraints
    }
}