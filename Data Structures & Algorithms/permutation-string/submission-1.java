class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int i;
        if (s2.length() < s1.length())
            return false;
        for (i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a'] += 1;
            freq2[s2.charAt(i) - 'a'] += 1;
        }
        if (isEqual(freq1, freq2)) {
                return true;
            }

        while (i < s2.length()) {
            freq2[s2.charAt(i-s1.length()) - 'a'] -=1;
            freq2[s2.charAt(i) - 'a'] +=1;
            if (isEqual(freq1, freq2)) {
                return true;
            }
            i++;
        }

return false;
    }

    private boolean isEqual(final int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] == freq2[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
