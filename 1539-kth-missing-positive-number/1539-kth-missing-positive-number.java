class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> missing=new ArrayList<>();
        int num=1;
        int i=0;
        while(missing.size()<k)
        {
            if(i < arr.length && arr[i]==num)
            {
                i++;
            }
            else{
                missing.add(num);
            }
            num++;
        }
        return missing.get(k-1);
        
    }
}