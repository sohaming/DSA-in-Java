
public class zerostoend {

    public static void main(String[] args) {

        int[] arr = {1, 0, 9, 8, 0, 7, 45, 0};

        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        for (int n : arr) {
            System.out.println(n);
        }
    }
}
