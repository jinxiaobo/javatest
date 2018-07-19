/**Created by jinxiaobo on 17/4/14.
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 The number of elements initialized in nums1 and nums2 are m and n respectively.
 **/


public class Demo {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        merge(nums1, 1, nums2, 0);
        for (int i : nums1)
            System.out.println(i);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = n + m - 1;
        int f = m - 1;
        int l = n - 1;

        while(f >= 0 && l >= 0) {
            if (nums1[f] > nums2[l]) {
                nums1[k] = nums1[f];
                f--;
                k--;
            }
            else {
                nums1[k] = nums2[l];
                l--;
                k--;
            }
        }
        while (l >= 0) {
            nums1[k] = nums2[l];
            l--;
            k--;
        }
    }
}


