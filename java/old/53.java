import java.util.*;

/**Created by jinxiaobo on 17/3/29.
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2]
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] arr = intersect(nums1, nums2);
        for (int i : arr)
            System.out.println(i);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i]) + 1);
            else
                map.put(nums1[i],1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
