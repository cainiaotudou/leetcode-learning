public class leetCode02 {
    /*
    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
    您可以假设除了数字 0 之外，这两个数都不会以 0 开头

    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807
     */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(6);
        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(6);
        ListNode res = addTwoNumbers(l1,l2);
//        res.next.next.next.val + res.next.next.val +
        System.out.println("" +  res.next.val + res.val);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    //方法一
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        int over = 0;
        int sum=0;
        ListNode res1 = res;
        ListNode p = l1;
        ListNode q = l2;
        while(p !=null || q !=null){
            int x= (p!=null)?p.val:0;
            int y= (q!=null)?q.val:0;
            sum=x +y + over;
            over = sum/10;
            res1.next = new ListNode(sum%10);
            res1 =res1.next;
            if(p!=null){p=p.next;}
            if(q!=null){q=q.next;}
        }
        if(over>0){
            res1.next = new ListNode(over);
        }
        return res.next;
    }
}
