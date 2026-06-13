
import java.util.HashMap;

public class orderele {

    public static void main(String[] args) {
        {
            int arr[] = {2, 3, 4, 5, 3, 4};

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, 1);
            }
            for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
                System.out.println("number" + e.getKey() + " value " + e.getValue());
            }
        }
    }
}
