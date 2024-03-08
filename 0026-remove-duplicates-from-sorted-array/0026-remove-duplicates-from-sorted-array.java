class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count=0;
        boolean b[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(b[i]==false)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                        b[j]=true;
                    }
                }
            }
        }
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(b[i]==false)
            {
                nums[index++]=nums[i];
            }
        }
        return index;
        
    }
}