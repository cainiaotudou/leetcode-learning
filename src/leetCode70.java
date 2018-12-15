/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
 */
public class leetCode70 {
    public int climbStairs(int n) {
        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }
        int s1 = 0;
        int s2= 1;
        int s3 = 2;
        for(int i = 3;i<=n;i++){
            s1=s2;
            s2=s3;
            s3=s1+s2;
        }
        return s3;
    }
}
