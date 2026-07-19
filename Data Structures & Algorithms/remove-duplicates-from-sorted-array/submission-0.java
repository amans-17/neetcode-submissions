class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int curr = 0;
        while(curr < nums.length) {
            if (nums[k] == nums[curr]) {
                curr++;
            } else {
                k++;
                nums[k] = nums[curr++];
            }
        }
        return k+1;
    }
}