import java.util.ArrayList;
import java.util.Collections;

public class AddTwoNumbers {
    Node root;

    public static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    public static void gatheringData(AddTwoNumbers list1, AddTwoNumbers list2, int[] l1, int[] l2) {
        for (int i = 0; i < l1.length; i++) {
            Node newNode = new Node(l1[i]);
            if (list1.root == null) {
                list1.root = newNode;
            } else {
                Node currNode = list1.root;
                while (currNode.next != null) {
                    currNode = currNode.next;
                }
                currNode.next = newNode;
            }
        }
        for (int i = 0; i < l2.length; i++) {
            Node newNode = new Node(l2[i]);
            if (list2.root == null) {
                list2.root = newNode;
            } else {
                Node currNode = list2.root;
                while (currNode.next != null) {
                    currNode = currNode.next;
                }
                currNode.next = newNode;
            }
        }
        list1.printList();
        list2.printList();
        gettingIntoArrayList(list1,list2);
    }

    public void printList() {
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public static void gettingIntoArrayList(AddTwoNumbers list1,AddTwoNumbers list2){
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        Node currNode1 = list1.root;
        while(currNode1.next!=null){
            ar1.add(currNode1.data);
            currNode1=currNode1.next;
        }
        ar1.add(currNode1.data);
        Node currNode2 = list2.root;
        while(currNode2.next!=null){
            ar2.add(currNode2.data);
            currNode2=currNode2.next;
        }
        ar2.add(currNode2.data);
        System.out.println(ar1);
        System.out.println(ar2);
        System.out.println( ar1.reversed());
        System.out.println(ar2.reversed());
        Collections.reverse(ar1);
        Collections.reverse(ar2);
        ArrayList<Integer> result = addTheArrayLists(ar1, ar2);
        System.out.println(result);
    }

    public static ArrayList<Integer> addTheArrayLists(ArrayList<Integer> ar1, ArrayList<Integer> ar2) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = 0;

        while (i < ar1.size() || i < ar2.size() || carry != 0) {
            int value1 = (i < ar1.size()) ? ar1.get(i) : 0;
            int value2 = (i < ar2.size()) ? ar2.get(i) : 0;

            int sum = value1 + value2 + carry;
            result.add(sum % 10);
            carry = sum / 10;

            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] l1 ={0};
        int[] l2 = {0};
        AddTwoNumbers list1 = new AddTwoNumbers();
        AddTwoNumbers list2 = new AddTwoNumbers();
        gatheringData(list1, list2, l1, l2);
    }
}
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(0); // Dummy node to simplify list construction
//        ListNode current = dummy;
//        int carry = 0;
//
//        // Traverse both lists
//        while (l1 != null || l2 != null || carry != 0) {
//            int value1 = (l1 != null) ? l1.val : 0;
//            int value2 = (l2 != null) ? l2.val : 0;
//
//            int sum = value1 + value2 + carry;
//            carry = sum / 10;
//
//            current.next = new ListNode(sum % 10);
//            current = current.next;
//
//            // Move to the next nodes if they exist
//            if (l1 != null) l1 = l1.next;
//            if (l2 != null) l2 = l2.next;
//        }
//
//        return dummy.next; // Return the actual head of the result list
//    }
//}

