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
    int total=0;
    for(int b:a){
         int count=0;
         while(b>0){
            count++;
            b=b/10;
        }
    if(count%2==0){
        total++;
    }
    }
    System.out.print("Even nuber of digits:"+ total);
    }
}