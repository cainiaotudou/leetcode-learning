/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class leetCode53 {
    public static void main(String[] args){
        int[] nums={-2,-1};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {

        int sum =0;int res=nums[0];
        for(int num : nums){
            if(sum>0){
                sum+=num;
            }else{
                sum =num;
            }
            res=Math.max(res,sum);
        }
        return res;
    }
}
