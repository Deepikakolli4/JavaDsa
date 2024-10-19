public class PalindromeLinkedList {
    Node root;

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
        } else {
            Node curr = root;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void printList() {
        Node curr = root;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static boolean IsPalindrome(PalindromeLinkedList list) {
        StringBuilder s = new StringBuilder();
        Node curr = list.root;
        while (curr != null) {
            s.append(curr.data);
            curr = curr.next;
        }

        return s.toString().equals(s.reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println("The elements in the linked list are:");
        list.printList();

        if (IsPalindrome(list)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
