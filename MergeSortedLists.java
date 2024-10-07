public class MergeSortedLists {
    Node head;

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
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public static MergeSortedLists mergeSortedLists(MergeSortedLists list1, MergeSortedLists list2) {
        MergeSortedLists mergedList = new MergeSortedLists();
        Node p1 = list1.head;
        Node p2 = list2.head;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                mergedList.add(p1.data);
                p1 = p1.next;
            } else {
                mergedList.add(p2.data);
                p2 = p2.next;
            }
        }
        while (p1 != null) {
            mergedList.add(p1.data);
            p1 = p1.next;
        }
        while (p2 != null) {
            mergedList.add(p2.data);
            p2 = p2.next;
        }

        return mergedList;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortedLists list1 = new MergeSortedLists();
        MergeSortedLists list2 = new MergeSortedLists();

        // Adding elements to the first sorted list
        list1.add(1);
        list1.add(3);
        list1.add(5);

        // Adding elements to the second sorted list
        list2.add(2);
        list2.add(4);
        list2.add(6);

        // Merging the two sorted lists
        MergeSortedLists mergedList = mergeSortedLists(list1, list2);

        // Printing the merged list
        System.out.print("Merged Sorted List: ");
        mergedList.printList(); // Output: 1 2 3 4 5 6
    }
}
