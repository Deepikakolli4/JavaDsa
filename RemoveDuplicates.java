import java.util.HashSet;

public class RemoveDuplicates {
    Node root;

    public static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    public static void createLists(RemoveDuplicates list1, int[] ar1) {
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
        removedDuplicates(list1);
    }

    public static void removedDuplicates(RemoveDuplicates list1) {
        HashSet<Integer> originalData = new HashSet<>();
        Node currentNode = list1.root;
        while (currentNode != null) {
            if (!originalData.contains(currentNode.data)) {
                originalData.add(currentNode.data);
            }
            currentNode = currentNode.next;
        }
        for (int data : originalData) {
            System.out.print(data + "\t");
        }
    }

    public static void main(String[] args) {
        RemoveDuplicates list1 = new RemoveDuplicates();
        int[] ar1 = {1, 8, 4, 4, 5};
        createLists(list1, ar1);
    }
}
