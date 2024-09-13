public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] r=new int[2];
        int index=0;
        for(int i=0;i<nums.Length;i++)
        {
            for(int j=i+1;j<nums.Length;j++){
               if((nums[i]+nums[j])==target)
                {
                    r[index]=i;
                    r[index+1]=j;
                    break;
                }
            }
        }
        return r;
    }
        
}