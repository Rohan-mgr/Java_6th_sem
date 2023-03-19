import java.util.Arrays;
public class Assignment04Q5 {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        System.out.print("Input Array: ");
        System.out.println(Arrays.toString(nums));
        int ans[] = new int[6];
        System.out.print("Output Array: ");
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
