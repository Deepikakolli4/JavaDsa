import java.util.HashSet;

public class RemoveLinkedList {
    Node root;

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = root;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void removeDuplicates(RemoveLinkedList list){
        HashSet<Integer> elements = new HashSet<>();
        Node curr = list.root;
        Node prev = null;
       while(curr!=null){
           if(elements.contains(curr.data)){
               prev.next=curr.next;
           }else{
               elements.add(curr.data);
               prev=curr;
           }
           curr=curr.next;
       }
    }

    public static void main(String[] args) {
        RemoveLinkedList linkedList = new RemoveLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.printList();
        removeDuplicates(linkedList);
        linkedList.printList();
    }
}

