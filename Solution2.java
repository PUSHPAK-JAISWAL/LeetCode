// this is a program for question 4 of leetcode
import java.util.Arrays;

class Solution2
 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c = nums1.length + nums2.length;
        int sort[] = new int[c];
        
        for (int i = 0; i < nums1.length; i++) {
            sort[i] = nums1[i];
        }
        
        for (int j = 0; j < nums2.length; j++) {
            sort[nums1.length + j] = nums2[j];
        }
        
        Arrays.sort(sort);
        
        int d = sort.length / 2;

        if (c % 2 == 0) {
            // If the combined array length is even, return the average of the middle elements
            return (sort[d - 1] + sort[d]) / 2.0;
        } else {
            // If the combined array length is odd, return the middle element
            return sort[d];
        }
    }
}
