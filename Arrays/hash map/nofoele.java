
import java.util.HashMap;

public class nofoele {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, 1);
        }
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.values());

    }

}
