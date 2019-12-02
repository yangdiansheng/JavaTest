package algorithm.link;

public class Link {
    /**
     * 判断一个链表是否成环
     * @param head
     * @return
     */
    public static boolean isCricle(Node head){
        if (head == null){
            return false;
        }
        Node p = head;
        Node q = head;
        while (q != null && q.next != null){
            p = p.next;
            q = q.next.next;
            if (p == q){
                break;
            }
        }
        if (p == q && p != null) {
            return true;
        }
        return false;
    }

    /**
     * 取链表中倒数第m个数，如果没有返回null
     * @param head
     * @param m
     * @return
     */
    public static Node getReverseM(Node head,int m){
        if (head == null){
            return null;
        }
        Node p = head;
        Node q = head;
        for (int i =0; i < m;i++){
            p = p.next;
            if (p == null){
                return null;
            }
        }
        while (p.next != null){
            p = p.next;
            q = q.next;
        }
        return q;

    }
}
