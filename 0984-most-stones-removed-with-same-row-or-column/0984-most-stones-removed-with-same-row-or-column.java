class Solution {
    private int cnt = 0;

    public int removeStones(int[][] sp) {
        int[] arr = new int[20003];
        for (int[] sPos : sp) {
            mergeComponents(sPos[0] + 1, sPos[1] + 10002, arr);
        }
        return sp.length - cnt;
    }

    private int findRepresentative(int el, int[] arr) {
        if (arr[el] == 0) {
            arr[el] = el;
            cnt++;
        }
        return arr[el] == el ? el : 
               (arr[el] = findRepresentative(arr[el], arr));
    }

    private void mergeComponents(int elA, int elB, int[] arr) {
        int repA = findRepresentative(elA, arr);
        int repB = findRepresentative(elB, arr);
        if (repA != repB) {
            arr[repB] = repA;
            cnt--;
        }
    }
}


