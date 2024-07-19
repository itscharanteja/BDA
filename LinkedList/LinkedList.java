package LinkedList;

class LinkedList {
    Node head; 
     static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.print("Append: ");
        printList();
    }
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.print("Prepend: ");
        printList();
    }
    public void deleteWithValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            System.out.print("Delete with value " + data + ": ");
            printList();
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                System.out.print("Delete with value " + data + ": ");
                printList();
                return;
            }
            current = current.next;
        }
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
     public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.prepend(0);
        list.deleteWithValue(2);
    }
}
//Output:
// Append: 1 
// Append: 1 2 
// Append: 1 2 3 
// Prepend: 0 1 2 3 
// Delete with value 2: 0 1 3 