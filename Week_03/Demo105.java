//根据一棵树的前序遍历与中序遍历构造二叉树。
//
// 注意:
//你可以假设树中没有重复的元素。
//
// 例如，给出
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
//
// 返回如下的二叉树：
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// Related Topics 树 深度优先搜索 数组
// 👍 660 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.HashMap;
import java.util.Map;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Demo105 {

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        indexMap = new HashMap<>();
        int n = preorder.length;
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i],i);
        }
        return build(preorder,inorder,0,n-1,0,n-1);
    }
    public TreeNode build(int[] preorder, int[] inorder, int preorder_left, int preorder_right,
                          int inorder_left, int inorder_right){
        if(preorder_left>preorder_right){
            return null;
        }
        //前序遍历中第一个节点就是根节点的位置
        int preorder_root = preorder_left;
        //获取中序遍历中根节点的位置
        int inorder_root = indexMap.get(preorder[preorder_root]);
        //构建根节点
        TreeNode root = new TreeNode(preorder[preorder_root]);
        //得到左子树中的节点数目
        int size_left_subtree = inorder_root-inorder_left;
        root.left = build(preorder,inorder,preorder_left+1,preorder_left+size_left_subtree,
                inorder_left,inorder_root-1);
        root.right = build(preorder,inorder,preorder_left+size_left_subtree+1,preorder_right,
                inorder_root+1,inorder_right);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        new Demo105().buildTree(preorder,inorder);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
