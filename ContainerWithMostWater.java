public class ContainerWithMostWater {
    
    public static int maxArea(int[] height) {
        int l=0;
        int h=height.length-1;
        int maxArea=0;

        while(l<h)
        {
            int width = h - l;
            System.out.println("Width: " + width);
            int minHeight=0;
            if(height[l] < height[h]) {
                minHeight = height[l];
            } else {
                minHeight = height[h];
            }
            System.out.println("Min Height: " + minHeight);
            int area = width * minHeight;
            System.out.println("Area: " + area);
            if(area > maxArea) {
                maxArea = area;
            }
            System.out.println("Max Area so far: " + maxArea);
            if(height[l] < height[h]) {
                l++;
            } else {
                h--;
            }
            
        }
    
        return maxArea;
    }
  public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height)); // Output: 49
    }
}
