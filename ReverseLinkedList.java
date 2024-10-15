public class ReverseLinkedList {
    Node root;

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public static void print(ReverseLinkedList list) {
        if (list.root == null) {
            System.out.println("No Nodes Are Present");
        } else {
            Node current = list.root;
            while (current.next != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print(current.data);
            System.out.println("");
        }
    }

    public static void createLists(ReverseLinkedList list1, int[] ar1) {
        Node currNode1 = list1.root;
        for (int i = 0; i < ar1.length; i++) {
            Node newNode = new Node(ar1[i]);
            if (list1.root == null) {
                list1.root = newNode;
                currNode1 = newNode;
            } else {
                currNode1.next = newNode;
                currNode1 = newNode;
            }
        }
    }
    public static void reverseList(ReverseLinkedList list1){
        Node prev = null;
        Node current = list1.root;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list1.root = prev;

    }

    public static void main(String[] args) {
        ReverseLinkedList list1 = new ReverseLinkedList();
        int[] ar1 = {1, 8, 4, 4, 5};
        createLists(list1, ar1);
        System.out.println("Created List:");
        reverseList(list1);
        print(list1);
    }
}
