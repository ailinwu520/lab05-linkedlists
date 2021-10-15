public class LinkedList{
    //Definition of singly linked list
    class Node{
        public Node data;
        int val;
        Node next;
        Node() {}
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    //you can either make it static or non-static
    //here the node is static so it can be called directly in the main to test code
    static Node head; //initialize head of linked list
    private int size; //initialize size of linked list
    public Node tail; //initialize tail of linked list

    /**
     * Default constructor that instantiate the head of your linked list
     */
    public LinkedList(){
        //instantiate data
        head = null;
        size = 0;
        tail = null;
    }

    /**
     * Add node of type int at the end of the list (5%)
     * @param val int to be added
     */
    public void add(int val) {
        //new Node
        Node newNode = new Node(val);

        //if head is null
        if(head == null) {
            //then head and tail will be the newNode
            head = newNode;
            tail = newNode;
        }
        else {
            // else tail's next will be the newNode
            // and the tail will be the newNode of the linked list
            tail.next = newNode;
            tail = newNode;
        }

    }

    /**
     * Add node of type int at the given index (5%)
     * @param val int to be added
     * @param position where index to be added
     */
    public void add(int val, int position) {
        // if position is at 0
        if (position == 0) {
            // new Node
            Node node = new Node(val);
            // insert head
            node.next = head;
            head = node;
            // increment size
            ++size;
        } else {
            //else the previous node is head
            Node prev = head;
            // loop position -1 time to set previous
            for (int i = 0; i < position - 1; i++)
                prev = prev.next;
            // new Node
            Node node = new Node(val);
            // connect new node with previous
            node.next = prev.next;
            prev.next = node;
            // increment size
            ++size;
        }

    }

    /**
     * Remove and return the node of type int (10%)
     * @param position index to be deleted
     * @return removed linked list
     */
    public Node remove(int position) {
        // if position is at 0
        if (position == 0) {
            // move head
            Node node = head;
            head = head.next;
            // decrement size
            --size;
            return node.data;
        } else {
            //else the previous node is head
            Node prev = head;
            // loop position -1 time to set previous
            for (int i=0; i < position-1; i++)
                prev = prev.next;
            //change prev.next
            Node node = prev.next;
            prev.next = node.next;
            // decrement size
            --size;
            // return head
            return head;
        }
    }

    /**
     * Reverse and return the new head (15%)
     * @param head list to be reversed
     * @return new linked list
     */
    public Node reverse(Node head) {
        // set previous to null
        Node prev = null;
        // set current position to head
        Node current = head;
        // set next to head
        Node next = null;
        // loop when current is not null
        while (current != null) {
            // connect next with current's next
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // return previous
        return prev;
    }

    /**
     * Function you need to implement (20% of the grade)
     * @param head from singly linked list
     * @return true if the linked list is palindrome
     */
    public boolean isPalindrome(Node head){
        // make new nodes slow and fast to head
        Node slow = head;
        Node fast = head;
        // loop when fast's next is not null and the next after that is not null
        while (fast.next != null && fast.next.next != null){
            // then connect slow with the next
            slow = slow.next;
            // connect fast to fast's next's next
            fast = fast.next.next;
        }
        // call recursive function
        Node half = reverse (slow.next);
        slow = head;
        // loop through again when recursive half and slow does not equal to null
        while (half != null && slow != null){
            // if half does not equal to slow's value
            if (half.val != slow.val){
                // return false
                return false;
            }
            // change slow to slow's next
            slow = slow.next;
            // chang hald to hals's slow
            half = half.next;
        }
        // return true
        return true;
    }

    /**
     * convert the binary numbers of a linked list from base 2 to base 10 decimals
     * @param head head node of the list
     * @return decimals in base 10
     */
    public int getDecimalValue(Node head) {
        // initialize the head value
        int num = head.val;
        // loop when head's next is not null
        while (head.next != null) {
            // multiply num by 2 and add the head's next value
            num = num * 2 + head.next.val;
            // change head to head's next
            head = head.next;
        }
        //return num
        return num;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node node = head;
        while (node != null) {
            result.append(node.val).append("->");
            node = node.next;
        }
        result.append("NULL");
        return result.toString();
    }

    public static void main(String[] args) {
        //Modify the main as needed
        LinkedList myList = new LinkedList();

        // add function
        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        System.out.print("Add list:  ");
        System.out.println(myList);

        // add function with position and value
        System.out.print("Add 2 at index 1:  ");
        myList.add(2,1);
        System.out.println(myList);

        // remove function
        System.out.print("Remove element at index 4:  ");
        head = myList.remove(4);
        System.out.println(myList);

        // reverse function
        System.out.print("Reverse list:  ");
        head = myList.reverse(head);
        System.out.println(myList);

        // Palindrome function
        System.out.print("Palindrome linked list:  ");
        System.out.println(myList.isPalindrome(head));

        // Decimal Value function
        System.out.print("Convert Binary to Integer from linked list:  ");
        System.out.println(myList.getDecimalValue(head));

    }
}
