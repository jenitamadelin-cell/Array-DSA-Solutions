import java.util.*;
public class Main
{
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = 0;
        int r = a.length - 1;
        int max = 0;
        while (l < r) {
            int c = Math.min(a[l], a[r]) * (r - l);
            max = Math.max(c, max);
            if (a[l] < a[r]) {
                l++;
            } else {
                r--;
            }
        }
        System.out.print(max);
    }
}