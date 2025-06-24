class Solution {
    public int[] sortArrayByParityII(int[] A) {
        
        int n = A.length;
        int o = 1, e = 0;
        while (o < n && e < n){
            if ((A[o] & 1) == 0){
                swap(A, o, e);
                e += 2;
            } else {
                o += 2;
            }
        }
        return A;
    }
    
    private void swap(int[] a, int l, int r){
        int t = a[l];
        a[l]  = a[r];
        a[r]  = t;
    }
}