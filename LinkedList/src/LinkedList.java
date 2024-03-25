//
//class Node{
//    int data;
//    Node next;
//    public Node(int value){
//        data = value;
//        next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//    Node tail;
//
//    public LinkedList(){
//        head = null;
//        tail = null;
//    }
//
//    public void pushFront(int value){
//        Node newNode = new Node(value);
//        if(head == null){
//            head = newNode;
//            tail = newNode;
//        } else {
//            newNode.next = head;
//            head = newNode;
//        }
//    }
//
//    public int popFront(){
//        if (head == null){
//            System.out.println("Linked list is empty: ");
//            return -1;
//        }
//        Node temp = head;
//        head = head.next;
//        if(head == null){
//            tail = null;
//        }
//        return temp.data;
//    }
//
//    void pushBack(int value){
//        Node new_node = new Node(value);
//        new_node.next = null;
//        if (tail == null){
//            head = tail = new_node;
//        }else{
//            tail.next = new_node;
//            tail = new_node;
//        }
//    }
//
//    public int popBack(){
//        int popped;
//        if (head == null){
//            System.out.println("Linked list is empty");
//            popped = -1;
//        }
//        Node temp = head;
//        if(head == tail){
//            popped = head.data;
//            head = tail = null;
//        } else {
//            while(temp.next.next != null){
//                temp = temp.next;
//            }
//            popped = temp.next.data;
//            temp.next = null;
//            tail = temp;
//        }
//        return popped;
//    }
//    public void printList(){
//        if(head == null){
//            System.out.println("Linked list is empty: ");
//        } else {
//            Node temp = head;
//            System.out.print("Linked list's elements are: ");
//            while(temp != null){
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//        }
//    }
//    public static void main(String[] args){
//        LinkedList list = new LinkedList();
////        list.printList();
//        list.pushFront(10);
//        list.pushFront(20);
//        list.pushFront(30);
//        list.pushFront(40);
//        list.pushFront(50);
//        list.pushFront(60);
//        list.printList();
//
////        list.popFront();
//
//        list.pushBack(100);
//        System.out.println();
//        list.printList();
////        System.out.println("\nLinked list after popping: ");
////        int popped = list.popBack();
////        System.out.println("\nPopped element is: " + popped);


//
//    }
//
//
//}






















