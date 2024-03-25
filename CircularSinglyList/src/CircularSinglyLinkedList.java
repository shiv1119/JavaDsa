class Node{
    int value;
    Node next;
    public Node(int data){
        next = null;
        value = data;
    }
}

public class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int length;
//    Creation with one element
//    public CircularSinglyLinkedList(int data){
//        Node new_node = new Node(data);
//        new_node.next = new_node;
//        head = tail = new_node;
//        length = 1;
//    }

//    creation with zero element
    public CircularSinglyLinkedList(){
        head = tail = null;
        length = 0;
    }

    public void append(int data){
        Node new_node = new Node(data);
        if(head == null){
            new_node.next = new_node;
            head = tail = new_node;
        } else {
            tail.next = new_node;
            new_node.next = head;
            tail = new_node;
        }
        length += 1;
    }

    public void prepend(int data){
        Node new_node = new Node(data);
        if(head == null){
            new_node.next = new_node;
            head = tail = new_node;
        } else {
            new_node.next = head;
            head = new_node;
            tail.next = head;
        }
        length += 1;
    }

    public void insert(int index, int data) {
        Node new_node = new Node(data);
        Node temp = head;
        if(index > length || index < 0){
            System.out.println("Index out of range");
        }else if (index == 0) {
            if (head == null) {
                head = tail = new_node;
                new_node.next = new_node;
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
            }
        } else if(index == length){
            tail.next = new_node;
            new_node.next = head;
            tail = new_node;
        } else {
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            new_node.next = temp.next;
            temp.next = new_node;
        }
        length += 1;
    }


    public void traverse(){
        Node current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
            if(current == head){
                break;
            }
        }
    }

    public boolean search(int target){
        Node current = head;
        while(current != null){
            if(current.value == target){
                return true;
            }
            current = current.next;
            if(current == head){
                break;
            }
        }
        return false;
    }

    public Node get(int index){
        Node temp = head;
        if(index > length - 1 || index < -1){
            return null;
        } else if(index == -1){
            return tail;
        } else {
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }
    }

    public boolean set(int index, int data){
        Node temp = get(index);
        if(temp != null){
            temp.value = data;
            return true;
        } else {
            return false;
        }
    }

    public Node popFirst(){
        Node popped_node = head;
        if(head == null){
            return null;
        }
        if(length == 1){
            head = tail = null;
            return popped_node;
        } else {
            head = head.next;
            tail.next = head;
            popped_node.next = null;
        }
        length -= 1;
        return popped_node;
    }

    public Node pop(){
        if(length == 0){
            return null;
        }
        Node popped_node = tail;
        Node temp = head;
        if(length == 1){
            head = tail = null;
        } else {
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            popped_node.next = null;
        }

        length -= 1;
        return popped_node;
    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        } else if (index == 0) {
            return popFirst();
        } else if(index == length-1){
            return pop();
        }
        Node prev_node = get(index - 1);
        Node popped_node = prev_node.next;
        prev_node.next = popped_node.next;
        popped_node.next = null;
        length -= 1;
        return popped_node;
    }


    public void delete(){
        if(length == 0){
            return;
        }
        tail.next = null;
        head = tail = null;
        length = 0;
    }



    public void print(){
        Node temp = head;
        System.out.print("Elements are : ");
        while(temp != null){
            System.out.print(temp.value);
            temp = temp.next;
            if(temp != head){
                System.out.print(" -> ");
            } else {
                break;
            }
        }
        System.out.println();
    }


    public static void main(String[] args){
        CircularSinglyLinkedList cl = new CircularSinglyLinkedList();
        cl.append(10);
        cl.append(20);
        cl.append(30);
        cl.append(40);
        cl.append(50);
//        cl.insert(5, 60);
        cl.print();
//        cl.traverse();
//        System.out.println(cl.popFirst());
//        System.out.println(cl.pop());
//        System.out.println(cl.get(2).value);
//        System.out.println(cl.search(30));
//        System.out.println(cl.set(2,1000));
//        System.out.println(cl.length);
        cl.delete();
        cl.delete();
//        System.out.println();
        cl.print();
    }



}
