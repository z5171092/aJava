import java.util.Scanner;

public class Maxarea {
    public static void main(String[] x) {
        //Scanner obj = new Scanner(System.in);
        //System.out.println("Enter the array:");
        int[] array = new int[] {2,5,1,6,3,};
        System.out.println(FindArea.DigArea(array));
    }
}

class FindArea {
    public static int DigArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxarea = (j-i) * Math.min(height[i], height[j]);
        while (i < j) {
            int updatearea = (j-i) * Math.min(height[i], height[j]);
            maxarea = Math.max(maxarea, updatearea);
            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return maxarea;
    }
}
