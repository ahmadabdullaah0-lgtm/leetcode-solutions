class Solution {
    public int search(int[] nums, int target) {
     
        int rt=nums.length-1;
        int lt=0;
        while (lt<=rt)
        {
          int mid = lt + (rt - lt) / 2;
            if (nums[mid]==target){
                 return mid;
            }
           
            else if(target < nums[mid]) {
             rt=mid-1;
            }
            
            else {
                lt=mid+1;
            }

            

        }
        return -1;
    }
}