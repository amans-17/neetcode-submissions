class Solution {
    public boolean hasDuplicate(int[] nums) {
        final var map = new HashMap<Integer, Boolean>();
        for (int n: nums) {
            if (map.getOrDefault(n, false) == true) {
                return true;
            }
            map.put(n, true);
        }
        return false;
    }
}