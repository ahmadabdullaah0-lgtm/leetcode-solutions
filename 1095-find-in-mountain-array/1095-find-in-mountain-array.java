/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

      
        int start = 0;
        int end = n - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } 
            else {
                end = mid;
            }
        }

        int peak = start;


        int ans = binarySearch(0, peak, target, true, mountainArr);

        if (ans != -1) {
            return ans;
        }

    
        return binarySearch(peak + 1, n - 1, target, false, mountainArr);
    }


    public int binarySearch(int start, int end, int target,
                            boolean ascending, MountainArray mountainArr) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            }

            if (ascending) {

                if (mountainArr.get(mid) < target) {
                    start = mid + 1;
                } 
                else {
                    end = mid - 1;
                }

            } 
            else {

                if (mountainArr.get(mid) < target) {
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}









































