class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int n = len * 2;
        int[] ans = new int[n];
        for (int i=0;i<len;i++) {
            ans[i] = nums[i];
            ans[i+len] = nums[i]; 
        }

        return ans;

    }
}