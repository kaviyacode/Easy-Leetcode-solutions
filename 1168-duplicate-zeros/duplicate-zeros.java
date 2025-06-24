class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0;

        // First pass: calculate the final position j after duplicating zeros
        while (j < n) {
            if (arr[i] == 0) {
                if (j == n - 1) {
                    // Edge case: last zero can't be duplicated
                    arr[n - 1] = 0;
                    n--; // reduce effective size
                    break;
                }
                j += 2;
            } else {
                j++;
            }
            i++;
        }

        // Second pass: go backwards and fill in-place using i and j
        i--; j--;  // Set to last valid positions
        while (i >= 0) {
            if (j < arr.length) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                j--;
                if (j < arr.length) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }
}
