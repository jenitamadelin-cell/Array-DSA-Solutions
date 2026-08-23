import java.util.*;
public class Main
{
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("size of array:");
        int n = sc.nextInt();
        System.out.print("array elements:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("target element:");
        int t = sc.nextInt();
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == t) {
                System.out.print("index of target element:");
                System.out.println(m);
                return;
            } 
            else if (a[m] < t) {
                l = m + 1;
            } 
            else {
                r = m - 1;
            }
        }
        return -1;
}
}