class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  // For 0 and 1, sqrt(x) = x

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use long to avoid overflow from mid * mid
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // perfect square
            } else if (square < x) {
                ans = mid;      // mid might be the answer
                left = mid + 1; // try a bigger mid
            } else {
                right = mid - 1; // try a smaller mid
            }
        }

        return ans;
    }
}
