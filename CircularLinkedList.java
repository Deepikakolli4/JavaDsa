//import java.util.Scanner;
//
//import static java.lang.System.exit;
//
//public class CircularLinkedList {
//    Node root;
//
//    public static class Node {
//        int data;
//        Node next;
//
//        Node(int val) {
//            data = val;
//            next = null;
//        }
//    }
//
//    public static void print(CircularLinkedList list) {
//        if (list.root == null) {
//            System.out.println("No Nodes Are Present");
//        } else {
//            Node current = list.root;
//            while (current.next != list.root ) {
//                System.out.print(current.data + "->");
//                current = current.next;
//            }
//            System.out.print(current.data);
//            System.out.println("");
//        }
//    }
//
//    public static CircularLinkedList inserAtBeg(CircularLinkedList list, int val) {
//         Node newnode = new Node(val);
//        if (list.root == null) {
//            list.root = newnode;
//            newnode.next = newnode;
//        } else {
//            Node curr = list.root;
//            while(curr.next != list.root){
//                curr = curr.next;
//            }
//            curr.next=newnode;
//            newnode.next=list.root;
//        }
//        return list;
//    }
//
//    public static CircularLinkedList insertAtEnd(CircularLinkedList list, int val) {
//       Node newnode = new Node(val);
//        if (list.root == null) {
//            list.root = newnode;
//        } else {
//            Node current = list.root;
//            while (current.next != list.root) {
//                current = current.next;
//            }
//            current.next = newnode;
//            newnode.next = list.root;
//        }
//        return list;
//    }
//
//    public static CircularLinkedList insertAtSpe(CircularLinkedList list, int val, int position) {
//        if (list.root == null) {
//            System.out.println("Cannot be inserted");
//        } else {
//            boolean positionFound = false;
//            Node newnode = new Node(val);
//            Node current = list.root;
//            while (current != null) {
//                if (current.data == position) {
//                    newnode.next = current.next;
//                    current.next = newnode;
//                    positionFound = true;
//                    System.out.println("Node inserted after position: " + position);
//                    break;
//                }
//                current = current.next;
//            }
//            if (!positionFound) {
//                System.out.println("Position " + position + " not found in the list.");
//            }
//        }
//        return list;
//    }
//
//    public static CircularLinkedList deleteatBeg(CircularLinkedList list) {
//        if (list.root == null) {
//            System.out.println("Nothing to delete");
//        } else {
//            list.root = list.root.next;
//            Node current = list.root;
//            while (current.next != list.root) {
//                current = current.next;
//            }
//            current.next = list.root;
//        }
//        return list;
//    }
//
//    public static CircularLinkedList deleteatEnd(CircularLinkedList list) {
//        if (list.root == null) {
//            System.out.println("Nothing to delete");
//        } else {
//            Node curr = list.root;
//            Node prev = null;
//            while (curr.next != list.root) {
//                prev = curr;
//                curr = curr.next;
//            }
//            prev.next = list.root;
//        }
//        return list;
//    }
//
//    public static LinkedList deleteAtSpec(LinkedList list, int val) {
//        if (list.root == null) {
//            System.out.println("Nothing to delete");
//        } else {
//            LinkedList.Node curr = list.root;
//            LinkedList.Node prev = null;
//            while (curr.next != list.root) {
//                if (curr.data == val) {
//                    prev.next = curr.next;
//                    return list;
//                }
//                prev = curr;
//                curr = curr.next;
//            }
//        }
//        System.out.println("Value not found in the list");
//        return list;
//    }
//
//    public static void main(String[] args) {
//        CircularLinkedList  list = new CircularLinkedList();
//        int val, pos;
//        Scanner input = new Scanner(System.in);
//        System.out.println("1.iab" + "\n" + "2.iae" + "\n" + "3.ias" + "\n"
//                + "4.print" + "\n" + "5.dab" + "\n" + "6.dae" + "\n" + "7.das" + "\n" + "8.exit");
//        while (true) {
//            System.out.println("Enter your Choice: ");
//            int choice = input.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter the choice: ");
//                    val = input.nextInt();
//                    inserAtBeg(list, val);
//                    break;
//                case 2:
//                    System.out.println("Enter the choice: ");
//                    val = input.nextInt();
//                    insertAtEnd(list, val);
//                    break;
//                case 3:
//                    System.out.println("Enter the choice: ");
//                    val = input.nextInt();
//                    System.out.println("Enter the position: ");
//                    pos = input.nextInt();
//                    insertAtSpe(list, val, pos);
//                    break;
//                case 4:
//                    print(list);
//                    break;
//                case 5:
//                    deleteatBeg(list);
//                    break;
//                case 6:
//                    deleteatEnd(list);
//                    break;
//                case 7:
//                    System.out.println("Enter the position: ");
//                    pos = input.nextInt();
//                    deleteAtSpec(list, pos);
//                    break;
//                case 8:
//                    System.out.println("Exiting program.");
//                    exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//}
