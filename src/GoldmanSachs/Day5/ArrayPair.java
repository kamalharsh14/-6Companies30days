//Problem Link: https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1

package GoldmanSachs.Day5;
import java.util.*;
public class ArrayPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        ArrayPair ob = new ArrayPair();
        System.out.println(ob.canPair(arr, k));
        in.close();
    }

    public boolean canPair(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i ++){
            int rem  = arr[i] % k;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        for(int key: map.keySet()){
            if(key == 0){
                if(map.get(key) % 2 != 0){
                return false;
                }
            }
            else if(key * 2 == k){
                if(map.get(key) % 2 != 0){
                    return false;
                }
            }
            else{
                int f = map.get(key); 
                int fk = map.getOrDefault(k - key,0);
                if(f != fk){
                    return false;
                } 
            }
        }
        return true;
    }
}