class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int total = 0;
        int curr = 0;
        for(int i = 0; i < n; i++){
            curr = nums[i];
            if(curr >= left && curr < right){
                total += curr;
            } else if(curr >= right) break;
            System.out.println(total);
            for(int j = i + 1; j < n; j++){
                curr += nums[j];
                if(curr >= left && curr < right){
                    total += curr;
                } else if(curr >= right) break;
            }
        }
        return total;
    }
}