//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表
// 👍 9005 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Demo1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target-nums[i];
            if(map.containsKey(result) && map.get(result)!=i){
                return new int[]{map.get(result),i};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
//    /**
//     * 暴力法
//     * @param nums
//     * @param target
//     * @return
//     */
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }

    public static void main(String[] args) {
        int[] a = new int[]{3,2,4};
        new Demo1();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
