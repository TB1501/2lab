package hr.vsite.java;

public class LinkedList
{
    Node head;

    class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
            data=d;
        }
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null)
        {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    public void pop(int key)
    {
        Node current = head;
        while (current != null && current.data != key)
        {
            current = current.next;
        }

        if (current == null)
        {
            return;
        }

        if (current.prev != null)
        {
            current.prev.next = current.next;
        } else
        {

            head = current.next;
        }

        if (current.next != null)
        {
            current.next.prev = current.prev;
        }
    }

    public int peek()
    {
        if(head !=null)
        {
            return head.data;
        }
        return 0;
    }

    public void offer(int data)
    {
        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }
        Node newNode = new Node(data);
        current.next = newNode;
        newNode.prev = current;
    }

    public void poll()
    {
        if (head != null)
        {
            head = head.next;

            if (head != null)
            {

                head.prev = null;

            }
        }
    }

    public int element()
    {
        return head.data;
    }

    public int size()
    {
        int count = 0;
        Node current = head;

        while (current != null)
        {
            count++;
            current = current.next;
        }

        return count;
    }

    public boolean isEmpty()
    {
        return head == null;
    }


    public boolean contains(int v) {
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.data == v) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }


    public String toStr() {
        String s = "";
        Node currentNode = head;

        while (currentNode != null) {
            s += currentNode.data;

            if (currentNode.next != null) {
                s += ", ";
            }

            currentNode = currentNode.next;
        }

        return s;
    }






}
    /**
     * @param data to be stored in the list
     */


