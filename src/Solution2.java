//使用带有dummyHead的队列来解决删除队列中重复元素的问题
public class Solution2 {
    public ListNode removeElements(ListNode head , int val){
        //创建一个虚拟头结点 , 放在队列上
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        //因为有了虚拟头结点 , 所以删除的操作就不会再区别情况了
        ListNode prev = dummyHead;
        //因为判断的是下一个元素 , 所以循环只能进行到prev指向 最后一个元素的前一个结点
        //所以循环结束的条件就是 , prev.next != null
        //因为当prev指向最后一个元素的时候 , prev.next 就等于 空
        while(prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else
                prev = prev.next;
        }

        return dummyHead.next;
    }

}
