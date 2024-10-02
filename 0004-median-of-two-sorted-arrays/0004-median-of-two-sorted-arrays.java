class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num = nums1.length + nums2.length;
        int mid = num / 2;
        int rem = num % 2;
        int[] ans = new int[mid + 1];
        int i = 0, j = 0, k = 0;
        while(k <= mid) {
            if(i < nums1.length &&(j >= nums2.length || nums1[i] < nums2[j])){
                ans[k++] = nums1[i++];
            }else {
                ans[k++] = nums2[j++];
            }
            
        }
        double a = 0;
        if(rem != 0){
            a = (double) ans[mid];
        } else{
            a = (double)(ans[mid] + ans[mid - 1])/2;
        }
        
        return a;
    }
}