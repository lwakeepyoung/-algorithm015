//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
//
// 示例:
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]
//
// 说明：
//
//
// 所有输入均为小写字母。
// 不考虑答案输出的顺序。
//
// Related Topics 哈希表 字符串
// 👍 449 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Demo49 {
    /**
     * 确定key时，用构建字符串代替sort，时间复杂度变为O(M*N)
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map = new HashMap<>();
            for (String s: strs){
                char[] chars = new char[26];
                for (int i = 0; i < s.length(); i++) {
                    chars[s.charAt(i)-'a']++;
                }
                String target = String.valueOf(chars);
                if(!map.containsKey(target)){
                    map.put(target,new ArrayList<>());;
                }
                map.get(target).add(s);
            }
            return new ArrayList<>(map.values());
        }

//    /**
//     * 排序，用排序后的字符串作为key
//     * @param strs
//     * @return
//     */
//    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String,List<String>> map = new HashMap<>();
//        for (String s: strs) {
//            char[] chars = s.toCharArray();
//            Arrays.sort(chars);
//            String target = String.valueOf(chars);
//            if(!map.containsKey(target)){
//                map.put(target,new ArrayList<>());;
//            }
//            map.get(target).add(s);
//        }
//        return new ArrayList<>(map.values());
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
