package linkedlistpractice;

public class LinkedListPractice {

    private Node<Integer> head;

    /*
     * pre:  none
     * post: val is added as the first element in the list
     *       the size of the list increased by one
     */
    public void addToFront(int val) {
        Node<Integer> temp = new Node(val);
        temp.setNext(this.head);
        this.head = temp;
    }

    /*
     * pre:  size is at least one
     * post: val is added as the second element in the list
     *       the size of the list increased by one
     */
    public void addAtSecondFromFront(int val) {
        Node<Integer> temp = new Node(10);
        temp.setNext(head.getNext());

    }

    /*
     * pre: size is at least one
     * post: the first element is the list is replaced by val
     *       the size of the list is unchanged
     */
    public void replaceFront(int val) {
        Node<Integer> temp = new Node(5);
        temp.setNext(this.head);
        head.setNext(temp);
    }

    /*
     * pre: size is at least one
     * post: the last element is the list is replaced by val
     *       the size of the list is unchanged
     */
    public void replaceLast(int val) {
        // IMPLEMENT ME!
    }

    /*
     * pre:  none
     * post: val is added as the last element in the list
     *       the size of the list increased by one
     */
    public void addToBack(int val) {
        // IMPLEMENT ME!
    }

    /*
     * pre:  size is at least one
     * post: the first element is removed. The size of the list decreased by one
     */
    public void removeFirst() {
        // IMPLEMENT ME!
    }

    /*
     * pre:  size is at least one
     * post: the last element is removed. The size of the list decreased by one
     */
    public void removeLast() {
        // IMPLEMENT ME!
    }

    /*
     * pre:  none
     * post: returns the number of elements in the list    
     */
    public int size() {
        // IMPLEMENT ME!
        return -1;  // replace this with your code
    }

    /*
     * pre:  none
     * post: the list is printed on the screen
     */
    public void printList() {
        if (this.head == null) {
            System.out.println("[EMPTY LIST]");
        } else {
            Node temp = this.head;
            while (temp != null) {
                System.out.print("[" + temp.getValue() + "]");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // add more code here to test your methods as you code them
        // don't delete your tests! I'll be marking this as well
        LinkedListPractice l = new LinkedListPractice();

        l.printList();

        System.out.println("TEST - add to front method");
        l.addToFront(5);
        l.addToFront(10);
        l.addToFront(15);
        System.out.println("Expected: [15][10][5]");
        System.out.print("Actual: ");
        l.printList();

        // new empty list for more testing
        l = new LinkedListPractice();
        System.out.println("TEST - add to front method");
        l.addToFront(5);
        l.addToFront(10);
        l.addToFront(15);
        System.out.println("Expected: [15][10][5]");
        System.out.print("Actual: ");

        l.addAtSecondFromFront(10);

        l.printList();

    }

}
