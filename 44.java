import java.util.*;

/**Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.
 Subscribe to see which companies asked this question.
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] nums1={1};
        int[] nums2={1};
        for (int i = 0; i < intersection(nums1, nums2).length; i++)
            System.out.println(intersection(nums1, nums2)[i]);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Set newset = new HashSet<>();
        Set result = new HashSet<>();
        for (int i : nums2) {
            newset.add(i);
        }
        for (int i : nums1) {
            if (newset.contains(i)) {
                result.add(i);
            }
        }
        Iterator<Integer> it = result.iterator();
        int[] intersection = new int[result.size()];
        int j = 0;
        while (it.hasNext()) {
            intersection[j] = it.next();
            j++;
        }
        return intersection;
    }
}
