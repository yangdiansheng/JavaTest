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
     * 找到还的起始位置
     * @param head
     * @return
     */
    public static Node circleStart(Node head){
        if (head == null){
            return null;
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
        if (p == q && p !=null){
            q = head;
            while (p != q){
                p = p.next;
                q = q.next;
            }
            return p;
        }
        return null;
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

    /**
     * 判断两个链表是否相交
     * @param head1
     * @param head2
     * @return
     */
    public static boolean isCrossLink(Node head1,Node head2){
        if (head1 == null || head2 == null){
            return false;
        }
        Node p = head1;
        Node q = head2;
        while (p.next != null ){
            p = p.next;
        }
        while (q.next != null){
            q = q.next;
        }
        return q == p;
    }
}
