// Problem Link: https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1/

package Amazon.Day10;
import java.util.*;

import Amazon.Day10.LinkedList.Node;

public class DeleteNodesAfterMNodes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();
        DeleteNodesAfterMNodes ob = new DeleteNodesAfterMNodes();
        int n = in.nextInt();
        for(int i = 0 ; i < n ; i ++){
            int data = in.nextInt();
            list.insertAtTail(data);
        }
        Node head = list.getHead();
        int M = in.nextInt();
        int N = in.nextInt();
        ob.linkdelete(head, M, N);
        list.display(head);
        in.close();
    }

    public void linkdelete(Node head, int M, int N){
        if(head == null){
            return;
        }
        int n = 1, m = N;
        Node tem = head;
        while(tem != null){
            if(n == M){
                Node p = tem;
                while(p != null && m-- > 0){
                    p = p.next;
                }
                if(p != null){
                    tem.next = p.next;
                }
                else{
                    tem.next = p;
                }
                n=0;
                m=N;
            }
            n++;
            tem=tem.next;
        }
    }
}
