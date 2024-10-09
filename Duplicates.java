import java.util.HashSet;

public class Duplicates {
    Node root;

    public static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    public static void createLists(Duplicates list1, Duplicates list2, int[] ar1, int[] ar2) {
        Node currNode1 = list1.root;
        Node currNode2 = list1.root;
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
        for (int i = 0; i < ar2.length; i++) {
            Node newNode = new Node(ar2[i]);
            if (list2.root == null) {
                list2.root = newNode;
                currNode2 = newNode;
            } else {
                currNode2.next = newNode;
                currNode2 = newNode;
            }
        }
        printList(list1);
        printList(list2);
        removingDuplicates(list1, list2);
    }

    public static void printList(Duplicates list) {
        Node currNode = list.root;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void removingDuplicates(Duplicates list1, Duplicates list2) {
        HashSet<Integer> originalData = new HashSet<>();
        Node currentNode = list1.root;
        while (currentNode != null) {
            if (!originalData.contains(currentNode.data)) {
                originalData.add(currentNode.data);
            }
            currentNode = currentNode.next;
        }
        Node currentNode1 = list2.root;
        while (currentNode1 != null) {
            if (!originalData.contains(currentNode1.data)) {
                originalData.add(currentNode1.data);
            }
            currentNode1 = currentNode1.next;
        }
        for (int data : originalData) {
            System.out.print(data + "\t");
        }
    }

    public static void main(String[] args) {
        Duplicates list1 = new Duplicates();
        Duplicates list2 = new Duplicates();
        int[] ar1 = {1, 2, 3};
        int[] ar2 = {1, 8, 4, 5};
        createLists(list1, list2, ar1, ar2);
    }
}
