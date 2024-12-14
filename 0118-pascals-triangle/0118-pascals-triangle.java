class Solution {
    // private int findElement(int r, int c){
    //     if(c == 0 || r == c) return 1;
    //     return findElement(r - 1, c - 1) + findElement(r - 1, c);
    // }

    private int nCr(int r, int c){
        if(c == 0 || r == c) return 1;
        int res = 1;
        for(int i = 0; i < c; i++){
            res *= (r - i);
            res /= (i + 1);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                arr.add(nCr(i, j));
            }
            ans.add(arr);
        }
        return ans;
    }
}