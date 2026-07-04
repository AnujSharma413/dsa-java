package bytexl.moderndsa1.arrays.twopointer;

public class ContainerWithMostWater {
    static int maxWaterContainer(int[] heights){
        int left = 0;
        int right = heights.length-1;
        int maxWater = 0;
        while(left < right){

            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int water = width * height;
            maxWater = Math.max(maxWater,water);

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxWaterContainer(heights));
    }
}
