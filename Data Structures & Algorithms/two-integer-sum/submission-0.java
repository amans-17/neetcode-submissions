class Solution {
    public int[] twoSum(int[] nums, int target) {
        final var map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++) {
            int n = nums[i];
            int pair = target - n;
            if(map.getOrDefault(pair, -1) < 0) {
                map.put(n, i);
                continue;
                }
            
                return new int[] { map.get(pair), i };
            
        }
        return new int[]{};
    }
}
