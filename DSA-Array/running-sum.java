import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array:");
        int n = sc.nextInt();
        System.out.print("array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            a[i] = a[i-1] + a[i];
        }
        System.out.print("running sum array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}