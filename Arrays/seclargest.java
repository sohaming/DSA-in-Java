
public class seclargest {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int max1 = arr[0];
        int max2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        if (max2 == 0) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element is: " + max2);
        }
    }
}
