class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> output = new ArrayList<>(); 
        HashMap<String, Integer> map = new HashMap<>();
        String s1Str[] = s1.split(" ");
        // for(int i = 0; i < s1.length(); ++i) {
        //         map.put(s1Str[i], map.getOrDefault(s1Str[i], 0 ) + 1);
        // }
        for(String word: s1Str) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String s2Str[] = s2.split(" ");
         // Count occurrences of words from the second sentence
        for (String word : s2Str) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Add words that appear only once to the output list
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                output.add(word);
            }
        }

        // covert list to a string array
        return output.toArray(new String[0]);
        //     for(int i = 0; i < s2.length(); ++i) {
        //         if(map.containsKey(s2Str[i]) && map.get(s2Str[i]) == 1) {
        //             output.add(s2Str[i]);
        //         }
        //     }
        //     String[] stringArr = output.toArray(new String[0]);
        //     return stringArr;
        // }
    }
}