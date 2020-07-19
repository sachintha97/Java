// Java program to reverse each word
// in a linked list
class GFG
{

    // Linked list Node ure
    static class Node
    {
        String c;
        Node next;
    };

    // Function to create newNode
// in a linked list
    static Node newNode(String c)
    {
        Node temp = new Node();
        temp.c = c;
        temp.next = null;
        return temp;
    };

    // reverse each node data
    static String reverse_word(String str)
    {
        String s = "";
        for(int i = 0; i < str.length(); i++)
            s = str.charAt(i) + s;
        return s;
    }

    static Node reverse( Node head)
    {
        Node ptr = head;

        // iterate each node and call reverse_word
        // for each node data
        while (ptr != null)
        {
            ptr.c = reverse_word(ptr.c);
            ptr = ptr.next;
        }
        return head;
    }

    // printing linked list
    static void printList( Node head)
    {
        while (head != null)
        {
            System.out.print( head.c + " ");
            head = head.next;
        }
    }

    // Driver program
    public static void main(String args[])
    {
        Node head = newNode("Geeksforgeeks");
        head.next = newNode("a");
        head.next.next = newNode("computer");
        head.next.next.next = newNode("science");
        head.next.next.next.next = newNode("portal");
        head.next.next.next.next.next = newNode("for");
        head.next.next.next.next.next.next = newNode("geeks");

        System.out.print( "List before reverse: \n");
        printList(head);

        head = reverse(head);

        System.out.print( "\n\nList after reverse: \n");
        printList(head);

    }
}

