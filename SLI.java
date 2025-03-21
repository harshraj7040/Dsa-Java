public class SLI {
    static class Node {  // Make the inner class static
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;

        // Traverse the linked list and print data
        Node current = head;  // Use a new variable so head is not lost
        while (current != null) {
            System.out.println(current.data);  // Corrected this line
            current = current.next;
        }
    }
}
