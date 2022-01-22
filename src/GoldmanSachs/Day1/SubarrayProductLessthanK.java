//Problem Link: https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/

package Day1;
import java.util.Scanner;

public class SubarrayProductLessthanK{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the values into the Array");
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextInt();
            }
            System.out.println("Enter the value of K");
            int k = in.nextInt();

            int counter = 0;
            int start = 0;
            int end = 0;
            int product = 1;

            for(end = 0 ; end < n ; end++){
                product = product * arr[end];

                while(start < end && product >= k){
                    product  /=  arr[start++];
                }
                if(product < k){
                    int len = end - start + 1;
                    counter = counter + len;
                }
            }
            System.out.println(counter);
        }
    }
}