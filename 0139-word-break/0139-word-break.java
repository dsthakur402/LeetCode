class Solution {
    class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            Arrays.fill(children, null);
        }
    }

    public Node root = new Node();
    public void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public boolean search(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) return false;
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    // public boolean check(String word){
    //     if(word.isEmpty()){
    //         return true;
    //     }
    //     for(int i = 1; i <= word.length(); i++){
    //         if(search(word.substring(0, i))){
    //             if(check(word.substring(i))){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(String w : wordDict){
            insert(w);
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // Empty string can always be segmented

        // Fill DP array
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && search(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}