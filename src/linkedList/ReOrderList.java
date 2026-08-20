package linkedList;

/**
 * Definition for singly-linked list.
 * 
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) 
      { 
    	  	this.val = val; 
    	  }
      ListNode(int val, ListNode next) 
      { 
    	  	this.val = val;
    	  	this.next = next; 
      }
 }


public class ReOrderList {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //middle element finding
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(second != null)
        { 
            ListNode nextEle = second.next;
            
            second.next = prev;
            prev = second;
            second = nextEle;
        }

        second = prev;
        while(second != null)
        {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
