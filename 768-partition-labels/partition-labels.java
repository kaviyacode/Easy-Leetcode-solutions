import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partitions = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int startIndex = i;
            int endIndex = s.lastIndexOf(s.charAt(startIndex));

            int st = startIndex;
            while (st < endIndex) {
                int lastIndexOfNextChar = s.lastIndexOf(s.charAt(st));
                if (lastIndexOfNextChar > endIndex) {
                    endIndex = lastIndexOfNextChar;
                }
                st++;
            }

            partitions.add(endIndex - startIndex + 1);
            i = endIndex + 1;
        }

        return partitions;
    }
}
