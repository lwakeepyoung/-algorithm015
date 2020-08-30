//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//
// 示例 1:
//
// 输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
//
//
// 示例 2:
//
// 输入: [-1,-100,3,99] 和 k = 2
//输出: [3,99,-1,-100]
//解释:
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100]
//
// 说明:
//
//
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
// 要求使用空间复杂度为 O(1) 的 原地 算法。
//
// Related Topics 数组
// 👍 671 👎 0

/**
 * 1.每次移动一位，移动k次； for
 * 2.新建一个数组，将移动后度数放在新数组中
 * 3.环状替换
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Demo189 {
    /**
     * 环状替换
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums,int k){
        k = k% nums.length;
        int count=0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int pre = nums[current];
            do{
                int next = (current+k) % nums.length;
                int temp = nums[next];
                nums[next] = pre;
                pre = temp;
                current= next;
                count++;
            }while (start!=current);
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{1,2,3,4,5,6,7};
        new Demo189().rotate(arrays,3);
    }

    /**
     * 每次移动1位，移动3次
     * @param nums
     * @param k
     */
//    public void rotate(int[] nums,int k){
//        for (int i = 0; i < k; i++) {
//            int temp = nums[nums.length-1];
//            for (int j = nums.length-1; j >=1; j--) {
//                nums[j] = nums[j-1];
//            }
//            nums[0] = temp;
//        }
//    }

    /**
     * 新建一个数组，将移动后的数组放在新数组中
     * @param nums
     * @param k
     */
//    public void rotate(int[] nums, int k) {
//        k %= nums.length;
//        int[] arrays = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int temp = (i+k);
//            arrays[temp%= nums.length] = arrays[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = arrays[i];
//        }
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
