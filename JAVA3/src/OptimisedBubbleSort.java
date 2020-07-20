import java.util.*;

public class OptimisedBubbleSort {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),a[]=new int[n];
        for (int i = 0; i < n; i++)  a[i]=scan.nextInt();
        
        Arrays.sort(a);
        System.out.println("Sorting gives:");
        for(int i = 0; i < a.length; i++) System.out.print(a[i]);
        
    }
}