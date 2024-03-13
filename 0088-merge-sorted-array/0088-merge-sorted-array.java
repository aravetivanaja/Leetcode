class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==1 && n==0)
        {
            System.out.println(Arrays.toString(nums1));
        }
        else if(m==0 && n==1)
        {
            System.out.println(Arrays.toString(nums2));
        }
        for(int j=0,i=m;j<n;j++)
        {
            nums1[i]=nums2[j];
            i++;
        }
         Arrays.sort(nums1);
        
    }
}