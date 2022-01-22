//Problem Link: https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/1/

package GoldmanSachs.Day1;
import java.util.Scanner;

public class OverlappingRectangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L1[] = new int[2];
        int R1[] = new int[2];
        int L2[] = new int[2];
        int R2[] = new int[2];

        System.out.println("Enter values of X1, Y1 seperated by a space.");
        L1[0] = in.nextInt();
        L1[1] = in.nextInt();
        System.out.println("Enter values of P1, Q1 seperated by a space.");
        R1[0] = in.nextInt();
        R1[1] = in.nextInt();
        System.out.println("Enter values of X2, Y2 seperated by a space.");
        L2[0] = in.nextInt();
        L2[1] = in.nextInt();
        System.out.println("Enter values of P2, Q2 seperated by a space.");
        R2[0] = in.nextInt();
        R2[1] = in.nextInt();

        int res = 1;
        if(R2[1] > L1[1]){             //Top
            res = 0;
        }
        else if(L2[0] > R1[0]){        //Right
            res = 0;
        }
        else if(R2[0] < L1[0]){        //Left
            res = 0;
        }
        else if(R1[1] > L2[1]){        //Bottom
            res = 0;
        }
        if(res == 1){
            System.out.println("Overlapped");
        }
        else{
            System.out.println("Not Overlapped");
        }
        in.close();
    }
}
