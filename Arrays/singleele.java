
public class singleele {

    public static void main(String[] args) {
        int arr[] = {1, 5, 5, 1, 8};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
            System.out.println("i=" + i);
            System.out.println("ans =" + ans);
        }
        System.out.println("single ele " + ans);
    }
}
/*arr = {4,1,2,1,2}

4 ^ 1 ^ 2 ^ 1 ^ 2

= 4 ^ (1 ^ 1) ^ (2 ^ 2)

= 4 ^ 0 ^ 0

= 4 */
