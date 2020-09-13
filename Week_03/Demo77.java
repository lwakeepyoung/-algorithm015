//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
//
// 示例:
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//]
// Related Topics 回溯算法
// 👍 391 👎 0


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Demo77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(n<0 || k<0){
            return res;
        }
        Deque list = new ArrayDeque();
        c(n,k,1,res,list);
        return res;
    }

    public void c(int n,int k,int begin,List<List<Integer>> res,Deque<Integer> list){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = begin; i <= n; i++) {
            list.addLast(i);
            c(n,k,i+1,res,list);
            list.removeLast();
        }
    }


    public static void main(String[] args) {
        new Demo77().combine(4,2);
    }

}
//leetcode submit region end(Prohibit modification and deletion)
