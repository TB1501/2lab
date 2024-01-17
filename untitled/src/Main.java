import hr.vsite.java.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList list = new LinkedList();

        // Test the offer method
        list.push(1);
        list.push(2);
        list.push(3);

        // Print the initial state of the linked list
        System.out.println("Initial Linked List: " + list.toStr());

        // Test the peek method
        System.out.println("Peek: " + list.peek());

        // Test the size method
        System.out.println("Size: " + list.size());

        // Test the contains method
        System.out.println("Contains 2? " + list.contains(2));

        // Test the poll method
        list.poll();

        // Print the state of the linked list after polling
        System.out.println("Linked List after poll: " + list.toStr());

        // Test the pop method
        list.pop(1);

        // Print the state of the linked list after popping
        System.out.println("Linked List after pop: " + list.toStr());

        // Test the isEmpty method
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
