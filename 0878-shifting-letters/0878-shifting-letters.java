class Solution {
    public String shiftingLetters(String s, int[] shifts) { 
        for (int i = shifts.length - 2; i >= 0; i--) {
            shifts[i] =(shifts[i] + shifts[i + 1]) % 26;
        }
        
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < s.length(); i++) {
            char shiftedChar = (char) ((s.charAt(i) - 'a' + shifts[i]) % 26 + 'a');
            sb.setCharAt(i, shiftedChar);
        }
        
        return sb.toString();
    }
}
