
import java.util.Arrays;

public class twosum {

    public static void main(String[] args) {
        int arr[] = {2, 3, 9, 6, 7};
        int target = 5;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
