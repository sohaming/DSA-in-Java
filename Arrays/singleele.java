
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
/*ans = 0 ^ 1 = 1
ans = 1 ^ 5 = 6
ans = 6 ^ 5 = 11
ans = 11 ^ 1 = 12
ans = 12 ^8 = 4*/
