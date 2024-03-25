class Node{
    int value;
    Node next;
    Node prev;
    public Node(int data){
        next = prev = null;
        value = data;
    }
}

public class CircularDoublyLinkedList {
    Node head;
    Node tail;
    int length;
    public CircularDoublyLinkedList(){
        head = tail = null;
        length = 0;
    }

    public void createCircularDoubleLinkedList(int data){
        Node new_node = new Node(data);
        head = tail = new_node;
        new_node.prev = new_node;
        new_node.next = new_node;
        length = 1;
    }

    public void print(){
        Node temp = head;
        System.out.print("Elements are: ");
        while(temp != null){
            System.out.print(temp.value);
            temp = temp.next;
            if(temp == head){
                break;
            }
            if(temp != null){
                System.out.print(" <-> ");
            }

        }
        System.out.println();
    }

    public boolean insert(int index, int data){
        if(head == null){
            return false;
        } else {
            Node new_node = new Node(data);
            if (index == 0) {
                new_node.next = head;
                new_node.prev = tail;
                tail.next = new_node;
                head.prev = new_node;
                head = new_node;
            } else if (index == -1) {
                new_node.next = head;
                new_node.prev = tail;
                tail.next = new_node;
                head.prev = new_node;
                tail = new_node;
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }

                new_node.next = current.next;
                current.next.prev = new_node;
                current.next = new_node;
                new_node.prev = current;
            }

            length += 1;
            return true;
        }
    }

    public void traverse(){
        if(head == null){
            return;
        } else {
            Node curr = head;
            while(curr != null){
                System.out.println(curr.value);
                if (curr == tail) {
                    break;
                } else {
                    curr = curr.next;
                }
            }
        }
    }

    public void reverseTraverse(){
        if(head == null){
            return;
        } else {
            Node curr = tail;
            while(curr != null){
                System.out.println(curr.value);
                if(curr == head){
                    break;
                } else {
                    curr = curr.prev;
                }
            }
        }
    }

    public boolean search(int target){
        if(head == null){
            return false;
        } else {
            Node curr = head;
            while(curr != null){
                if(curr.value == target){
                    return true;
                }
                if(curr == tail){
                    return false;
                }
                curr = curr.next;
            }
        }
        return false;
    }

    public void delete(int location){
        if(head == null){
            return;
        } else {
            if(location == 0){
                if(head == tail){
                    head.prev = null;
                    head.next = null;
                    tail = null;
                    head = null;
                } else {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                }
            } else if (location == -1){
                if(head == tail){
                    head.prev = null;
                    head.next = null;
                    tail = null;
                    head = null;
                } else {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                }
            } else {
                Node curr = head;
                for(int i = 0; i < location-1; i++){
                    curr = curr.next;
                }
                curr.next = curr.next.next;
                curr.next.prev = curr;
            }
            length -= 1;
        }
    }

    public void deleteAll(){
        if(head == null){
            return;
        } else {
            tail = null;
            Node temp = head;
            while(temp != null){
                temp.prev = null;
                temp = temp.next;
            }
            head = null;
            tail = null;
            length = 0;
        }
    }
























    public static void main(String[] args){
        CircularDoublyLinkedList cl = new CircularDoublyLinkedList();
        cl.createCircularDoubleLinkedList(100);
        cl.insert(0, 50);
        cl.insert(-1,1000);
        cl.insert(2, 200);
        cl.insert(1,60);
        cl.print();
//        System.out.println(cl.search(1000));
//        cl.reverseTraverse();
        System.out.println(cl.length);
//        cl.delete(-1);
        System.out.println(cl.length);
        cl.deleteAll();
        cl.print();
    }

}
