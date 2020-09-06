//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1:
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
// 输入: s = "rat", t = "car"
//输出: false
//
// 说明:
//你可以假设字符串只包含小写字母。
//
// 进阶:
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 排序 哈希表
// 👍 244 👎 0


import java.util.Arrays;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Demo242{
    public boolean isAnagram(String s, String t) {
        int[] arrays = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrays[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arrays[t.charAt(i)-'a']--;
        }

        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Demo242().isAnagram("a","b");
    }

//    /**
//     * char排序，如果排序后一样则是异位词
//     * @param s
//     * @param t
//     * @return
//     */
//    public boolean isAnagram(String s, String t) {
//        char[] ss = s.toCharArray();
//        char[] ts = t.toCharArray();
//        Arrays.sort(ss);
//        Arrays.sort(ts);
//        if (String.valueOf(ss).equals(String.valueOf(ts))) {
//            return true;
//        }
//        return false;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
