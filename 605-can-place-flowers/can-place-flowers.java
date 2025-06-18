class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int len=flowerbed.length;
        for(int i=0;i<len;i++)
        {
            if(flowerbed[i]==0)//if non-planted
            {
                //check prev and next
                int prev=(i==0)?0:flowerbed[i-1];
                int next=(i==len-1)?0:flowerbed[i+1];
                if(prev==0 && next ==0)
                {
                    flowerbed[i]=1;//planted successfully
                    count++;
                    if(count>=n)return true; 
                }
            }
        }
        return count>=n;
        }  
    }