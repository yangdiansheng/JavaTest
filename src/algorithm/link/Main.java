package algorithm.link;

public class Main {
    public static void main(String[] args){
        Node node1 = new Node("111");
        Node node2 = new Node("222");
        Node node3 = new Node("333");
        Node node4 = new Node("444");
        Node node5 = new Node("555");
        node1.setNext(node2);
        node2.setNext(node5);
        node3.setNext(node4);

//        showlink(node1);
//        Node nodeRe2 = Link.getReverseM(node1,2);
//        System.out.println(nodeRe2.value);
        System.out.println(Link.isCrossLink(node1,node3));

    }

    private static void showlink(Node head){
        while (head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
