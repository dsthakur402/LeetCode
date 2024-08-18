class Solution {
    public String maximumNumber(String num, int[] change) {
        char[] res = num.toCharArray();
        boolean hasChanged = false;

        for (int i = 0; i < res.length; i++) {
            int originalVal = res[i] - '0';
            int changedVal = change[originalVal];

            if (changedVal > originalVal) {
                res[i] = (char) (changedVal + '0');
                hasChanged = true;
            } else if (changedVal < originalVal && hasChanged) {
                break;
            }
        }

        return new String(res);
    }
}
