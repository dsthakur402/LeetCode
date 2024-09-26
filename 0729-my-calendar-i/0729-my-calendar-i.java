class MyCalendar {
    
    ArrayList<int[]> arr = new ArrayList<>();

    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        for (int[] a : arr) {
            int s = a[0];
            int e = a[1];           

            if (start < e && end > s) {
                return false;
            }
        }
        arr.add(new int[] {start, end});
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */