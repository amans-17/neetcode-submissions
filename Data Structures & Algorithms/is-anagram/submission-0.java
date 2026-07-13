class Solution {
    public boolean isAnagram(String s, String t) {
        final var sC = new int[26];
        final var sT = new int[26];
        for (int i = 0;i<s.length();i++) {
            sC[s.charAt(i)-'a']++;
        }
        for (int i = 0;i<t.length();i++) {
            sT[t.charAt(i)-'a']++;
        }
        for(int i =0 ;i < 26; i++) {
            if (sC[i] != sT[i]) {
                return false;
            }
        }
        return true;
    }
}
