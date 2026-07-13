class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final var ans = new ArrayList<List<String>>();
        final var map = new HashMap<String, List<Integer>>();
        for (int i=0;i<strs.length;i++) {

        

map.computeIfAbsent(getAnagram(strs[i]), k -> new ArrayList<>()).add(i);
        }

        for (String key : map.keySet()) {
    Collection<Integer> values = map.get(key);
final var l = new ArrayList();
    for (Integer value : values) {
        l.add(strs[value]);
    }
    ans.add(l);
}
return ans;
    }

    String getAnagram(String s) {
        final var ca = new int[26];
        for(char c: s.toCharArray()) {
            ca[c-'a']++;
        }
        final var sb = new StringBuilder();
        for (int c: ca) {
            sb.append("_");
            sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}
