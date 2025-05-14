package com.dsa;
import com.dsa.MyLinkedList.Node;

public class FloydCycleDetection {

	public Node detectCycle(Node head) {
		Node slow=head,fast=head,prev=null;
        while(fast!=null &&fast.address != null){
            slow = slow.address;
            fast = fast.address.address;
            
            if(fast==slow){
                slow = head;
                while(slow!=fast){
                	prev = fast;
                    slow = slow.address;
                    fast = fast.address;
                }
                prev.address = null;
                return slow;
            }                
        }
        return null;
    }

}
