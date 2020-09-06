//给定一个二叉树，返回它的中序 遍历。
//
// 示例:
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2]
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树 哈希表
// 👍 650 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Demo94 {

    /**
     * 迭代方式
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while (current!=null || !stack.isEmpty()){
            //深度遍历，遍历到最左叶子节点
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.poll();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }

//    /**
//     * 中序遍历：左中右
//     * 递归方式
//     * 1.确认参数
//     * 2.确认返回值
//     * 3.确认单层逻辑
//     * @param root
//     * @return
//     */
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list =new ArrayList<>();
//        it(root,list);
//        return list;
//    }
//
//    public void it(TreeNode current,List<Integer> list){
//        if(current!=null){
//            if(current.left!=null){
//                it(current.left,list);
//            }
//            list.add(current.val);
//            if(current.right!=null){
//                it(current.right,list);
//            }
//        }
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
