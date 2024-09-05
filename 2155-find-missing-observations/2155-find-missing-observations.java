class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int sum = 0; 
        for(int r : rolls){
            sum += r;
        }
        // int a = 0; int b = 0;
        int diff = (mean * (n + rolls.length)) - sum;
        System.out.print(rolls.length + " " + sum + " " + diff);
        if(diff < 0 || diff < n){
            return new int[0];
        }
        if(diff > n * 6){
            return new int[0];
        }
        int a = diff / n;
        int b = diff % n;
        Arrays.fill(ans, a);
        if(b < n){
            for(int i = 0; i < b; i++){
                ans[i] = a + 1;
            }
        }

        // ans[n - 1] = b;
        return ans;
    }
}