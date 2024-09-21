class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int j = 1;
        for(int i = 1; i <= n; i++){
            ans.add(j);
            if(j *  10 <= n){
                j *= 10;
            } else {
                while(j % 10 == 9 || j >= n){
                    j /= 10;
                }
                j += 1;
            }
        }
        return ans;

    }
}