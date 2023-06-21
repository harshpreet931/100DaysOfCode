// Java program to show inserting a node
// after a given node in given Linked List

// A linked list node
class Node {
    int data;
    Node next;
}

// Class to insert elements in LL
class LinkedList {
    Node head; // head of list

    // Given a node prev_node, insert a new
    // node after the given prev_node
    void insertAfter(Node prev_node, int new_data)
    {
        // 1. check if the given prev_node
        // is NULL
        if (prev_node == null) {
            System.out.println(
                "The given previous node cannot be NULL");
            return;
        }

        // 2. allocate new node
        Node new_node = new Node();

        // 3. put in the data
        new_node.data = new_data;

        // 4. Make next of new node
        // as next of prev_node
        new_node.next = prev_node.next;

        // 5. move the next of prev_node
        // as new_node
        prev_node.next = new_node;
    }

    // Function to insert element in LL
    void push(int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
    }

    // This function prints contents of
    // linked list starting from head
    void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {
        // Start with the empty list
        LinkedList llist = new LinkedList();

        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);

        System.out.print("Created Linked list is: ");
        llist.printList();

        // Insert 1 at the beginning.
        llist.insertAfter(llist.head, 1);

        System.out.print("After inserting 1 after 2: ");
        llist.printList();
    }
}
