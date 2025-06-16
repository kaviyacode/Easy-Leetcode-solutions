/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1;int right=n;
        while(left<right)//if equals means the while loop ends it means first bad identified
        {
        int mid=left+(right-left)/2;
        if(isBadVersion(mid))
        {
            right=mid;//towards first bad version
        }
        else
        {
            left=mid+1;//moves past good versions
        }
        }
    return left;//whether right or left both equals
        
    }
}