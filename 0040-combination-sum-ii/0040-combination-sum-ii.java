class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // Sort the candidates array
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, ans, target, new ArrayList<>());
        return new ArrayList<>(ans);
    }

    static void solve(int ind, int[] arr, List<List<Integer>> ans, int target, List<Integer> db) {
        if (target == 0) {
            ans.add(new ArrayList<>(db));
            // return;
        }
        

        for (int i = ind; i < arr.length && arr[i] <= target; i++) {
            if (i > ind && arr[i] == arr[i - 1]) // Skip duplicates
                continue;

            if(arr[i]>target){
                break;
            }
            db.add(arr[i]);
            solve(i + 1, arr, ans, target - arr[i], db);
            db.remove(db.size() - 1);
        }
    }
}