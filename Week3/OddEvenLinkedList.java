package mayLeetCode;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode even=head.next;
        ListNode odd=head;
        ListNode evenhead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
        
    }

}
