//用递归的方式解决删除队列中指定的所有元素

public class Solution3 {
    //定义一个递归函数
    //递归函数的宏观语义 : 传入一个链表 , 删除这个链表中所有的指定元素
    //返回删除后链表的头指针
    public ListNode removeElements(ListNode head , int val){
        //递归的结束条件(最基本的规模)
        if(head == null)
            return null;


//        //进行递归的规模 , 即 , 头结点分离出来 , 通过递归函数得到满足条件的链表
//        ListNode res = removeElements(head.next , val);
//        //判断是否需要接上头结点
//        if(head.val == val)
//            return res;
//        else{
//            head.next = res;
//            return head;
//        }


        //简化上面的写法
//        head.next = removeElements(head.next , val);
//        if (head.val == val)
//            return head.next;
//        else
//            return head;

        //再次简化上面的逻辑 , 一个if else , 可以简化为三目运算符形式
        head.next = removeElements(head.next , val);
        return head.val == val ? head.next : head;

    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution3()).removeElements(head, 6);
        System.out.println(res);
    }
}
