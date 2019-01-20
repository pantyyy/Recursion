
//删除队列中所有相同的元素
public class Solution {
    //head是链表的头指针 , val是要删除的元素
    public ListNode removeElements(ListNode head , int val){
        //要从链表中删除元素 , 所以链表不能为空, 必须存在元素
        //所以head != null
        //因为没有dummyHead , 所以 , 当被删除的元素为头结点时和其他结点不一样

        //第一种情况 : 被删除的元素为头结点
        //因为第一次删除成功后 , 第二个结点也是需要删除的元素
        //所以使用while循环
        while(head != null & head.val == val){
                ListNode delNode = head;
                head = head.next;
                delNode.next = null;
        }

        //经过以上操作 , 有可能队列为空
        if(head == null)
            return null;

        //第二种情况 : 被删除的结点不为头结点
        //所以需要找到被删除结点的前一个元素
        ListNode prev = head;
        //因为要比较的元素为prev的下一个元素
        //所以下一个元素不能为null
        //所以结束的条件就是prev.next != null
        while (prev.next != null){
            //判断是否是需要删除的元素
            if(prev.next.val == val){
                ListNode delNode = prev.next;
                prev.next = prev.next.next;
                delNode.next = null;
            }else{
                prev = prev.next;
            }
        }


        return head;

    }
}
