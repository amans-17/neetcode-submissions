class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        final var set = new HashSet<Integer>();
        for (int n: nums) set.add(n);
        int ans = 1;
        for (int n: set) {
            if (!set.contains(n-1)) {
                int curr = 1;
                int ele = n;
                while(set.contains(ele + 1)) {
                    ele++;
                    curr++;
                }
                ans = ans > curr ? ans : curr;
            }
        }
        return ans;
    }
}
