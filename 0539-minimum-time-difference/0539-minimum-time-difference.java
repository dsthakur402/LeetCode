class Solution {
    public int findMinDifference(List<String> timePoints) {
        int arr[] = new int[timePoints.size()];
        for(int i = 0; i < timePoints.size(); i++){
            String s = timePoints.get(i);
            int min = (s.charAt(4) - '0') + ((s.charAt(3) - '0') * 10);  
            int hour = (s.charAt(1) - '0') + ((s.charAt(0) - '0') * 10);
            arr[i] = hour * 60 + min;
           
        }
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            
            ans = Math.min(ans, arr[i] - arr[i - 1]);
        }
        return Math.min(ans, 24 * 60 - arr[arr.length - 1] + arr[0]);
    }
}