package patterns.twopointers.left_right;
/**
 * LeetCode 11: Container With Most Water
 *
 * Approach:
 * Two Pointer (Left–Right)
 *
 * Idea:
 * - Start with widest container (left = 0, right = n-1)
 * - Area = width * min(height[left], height[right])
 * - Move the pointer with smaller height (bottleneck)
 * - Keep updating maximum area
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            // Width between two lines
            int width = right - left;

            // Height is limited by the smaller line
            int minHeight = Math.min(height[left], height[right]);

            // Current container area
            int area = width * minHeight;

            // Update maximum area
            if (area > maxArea) {
                maxArea = area;
            }

            // Move the pointer which limits the height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
