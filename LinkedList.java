public class LinkedList{
    //Definition of singly linked list
    class Node{
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
    static Node head;
    private int size;

    /**
     * Default constructor that instantiate the head of your linked list
     */
    public LinkedList(){
        //TODO Instantiate your data
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Add node of type int at the end of the list (5%)
     * @param val int to be added
     */
    public void add(int val) {
        //TODO Complete this function
        throw new UnsupportedOperationException("Not yet implemented");

    }

    /**
     * Add node of type int at the given index (5%)
     * @param val int to be added
     * @param position where index to be added
     */
    public void add(int val, int position) {
        //TODO Complete this function
        throw new UnsupportedOperationException("Not yet implemented");

    }

    /**
     * Remove and return the node of type int (10%)
     * @param position index to be deleted
     * @return removed linked list
     */
    public Node remove(int position) {
        //TODO Complete this function
        throw new UnsupportedOperationException("Not yet implemented");

    }

    /**
     * Reverse and return the new head (15%)
     * @param head list to be reversed
     * @return new linked list
     */
    public Node reverse(Node head) {
        //TODO Complete this function
        throw new UnsupportedOperationException("Not yet implemented");

    }

    /**
     * Function you need to implement (20% of the grade)
     * @param head from singly linked list
     * @return true if the linked list is palindrome
     */
    public boolean isPalindrome(Node head){
        //TODO Complete this function
        throw new UnsupportedOperationException("Not yet implemented");

    }

    /**
     * convert the binary numbers of a linked list from base 2 to base 10 decimals
     * @param head head node of the list
     * @return decimals in base 10
     */
    public int getDecimalValue(Node head) {
        //TODO Complete this function
        throw new UnsupportedOperationException("Not yet implemented");
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
        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(1);
        System.out.print("Add list:  ");
        System.out.println(myList);

        System.out.print("Add 2 at index 1:  ");
        myList.add(2,1);
        System.out.println(myList);

        System.out.print("Remove element at index 4:  ");
        head = myList.remove(4);
        System.out.println(myList);

        System.out.print("Reverse list:  ");
        head = myList.reverse(head);
        System.out.println(myList);

    }
}
