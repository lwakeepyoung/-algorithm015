import java.util.ArrayList;
import java.util.List;

public class Demo144 {
    /**
     * 前序遍历：中左右
     * 递归方式
     * 1.确认参数
     * 2.确认返回值
     * 3.确认单层逻辑
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        it(root,list);
        return list;
    }

    public void it(TreeNode current,List<Integer> list){
        if(current==null){ return; }
        list.add(current.val);
        it(current.left,list);
        it(current.right,list);
    }
}
