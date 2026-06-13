
import java.util.HashMap;

public class findele {

    public static void main(String[] args) {
        {
            int arr[] = {10, 20, 30, 40};
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : arr) {
                map.put(num, 1);
            }
            int target = 22;
            if (map.containsKey(target)) {
                System.out.println("element found");
            } else {
                System.out.println("Element not found");
            }
        }
    }
}
