
class Node{
    int value;
    Node next;
    public Node(int data){
        value = data;
    }
}


public class LList {
    int length = 0;
    Node head;
    Node tail;
    public LList(){
        head = tail = null;
        length = 0;
    }

    public void prepend(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = tail = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    public Node prepop(){
        Node temp;
        temp = head;
        if(head == null){
            return null;
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
        temp.next = null;
        return  temp;
    }

    public void print(){
        if(head == null){
            System.out.println("No elements in Linked list");
        } else {
            Node cur_node = head;
            System.out.print("Elements are: ");
            while(cur_node != null){
                System.out.print( " -> " + cur_node.value);
                cur_node = cur_node.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        LList list = new LList();
        list.prepend(10);
        list.prepend(20);
        list.prepend(30);
        list.prepend(40);
        list.print();
        System.out.println(list.prepop().value);
        list.print();
    }
}
