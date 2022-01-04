//Problem Link: https://www.geeksforgeeks.org/distributing-m-items-circle-size-n-starting-k-th-position/
package Day3;

import java.util.Scanner;

public class KidWithDamagedToy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        KidWithDamagedToy ob = new KidWithDamagedToy();

        System.out.println("The Kid With Damaged Toy: "+ob.toysDistribution(n,m,k));
        in.close();
    }

    int toysDistribution(int n, int m, int k){
        if(m <= (n - k + 1)){
            return (m - k -1);
        }
        else{
            m = m - (n - k + 1);
            if(m % n == 0){
                return n;
            }
            else{
                return (m % n);
            }
        }
    }
}