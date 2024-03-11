class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int i=0;
        int count=1;
        
        for(int j=i+1;j<nums.size();j++)
        {
            if(count<2 && nums[i]==nums[j])
            {
                i++;
                count++;
                nums[i]=nums[j];
            }
            else if(nums[i]!=nums[j])
            {
                i++;
                count=1;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
        
    }
};