class Node{
    int value;
    Node next;
    Node prev;

    public Node(int data){
        value = data;
        next = null;
        prev = null;
    }
}

public class doubleLinkedList {
    Node head;
    Node tail;

    int length;
    public doubleLinkedList(){
        head = null;
        tail = null;
        length = 0;
    }


    public void append(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = tail = new_node;
        }
        tail.next = new_node;
        new_node.prev = tail;
        tail = new_node;
        length += 1;
    }

    public void prepend(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = tail = new_node;
        } else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
        length += 1;
    }

    public void traverse(){
        Node current_node = head;
        while(current_node != null){
            System.out.println(current_node.value);
            current_node = current_node.next;
        }
    }

    public void reverseTraverse(){
        Node current_node = tail;
        while (current_node != null){
            System.out.println(current_node.value);
            current_node = current_node.prev;
        }
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node current_Node;
        if(index < (length / 2)){
          current_Node = head;
            for(int i = 0; i < index; i++){
                current_Node = current_Node.next;
            }
        } else {
            current_Node = tail;
            for(int i = length - 1; i > index; i--){
                current_Node = current_Node.prev;
            }
        }
        return  current_Node;
    }

    //search to return true or false
    public boolean search(int target){
        Node current_node = head;
        while(current_node != null){
            if(current_node.value == target){
                return true;
            }
            current_node = current_node.next;
        }
        return false;
    }

    //search and return index
    public int searchIndex(int target){
        Node current_node = head;
        int index = 0;
        while(current_node != null){
            if(current_node.value == target){
                return index;
            }
            current_node = current_node.next;
            index += 1;
        }
        return -1;
    }

    public boolean set(int index, int data){
        Node node = get(index);
        if(node != null){
            node.value = data;
            return true;
        }
        return false;
    }

    public void insert(int index, int value){
        if(index < 0 || index > length){
            System.out.println("Index out of bounds");
            return;
        }
        if(index == 0){
            prepend(value);
            return;
        } else if(index == length){
            append(value);
            return;
        } else {
            Node temp = get(index - 1);
            Node newNode = new Node(value);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            length += 1;
        }
    }

    public Node popfirst(){
        if(head == null){
            return null;
        }
        Node popped_Node = head;
        if(length == 1){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
            popped_Node.next = null;
        }
        length -= 1;
        return popped_Node;
    }
    public Node pop(){
        if(head == null){
            return null;
        }
        Node popped_node = tail;
        if(length == 1){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            popped_node.prev = null;
        }
        length -= 1;
        return popped_node;
    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0){
            return popfirst();
        }
        if(index == length - 1){
            return pop();
        }
        Node popped = get(index);
        popped.prev.next = popped.next;
        popped.next.prev = popped.prev;
        popped.next = popped.prev = null;
        length -= 1;
        return popped;
    }

    public void reverse(){
        Node prev_node = null;
        Node current_node = head;
        Node next_node = null;
        while (current_node != null){
            next_node = current_node.next;
            current_node.next = prev_node;
            prev_node = current_node;
//            System.out.println("current_node: " + current_node.value + "     next_node: " + next_node.value + "     prev_node: " + prev_node.value);
            current_node = next_node;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }

    public Node getMiddle(){
        Node temp_node = head;
        int half = length / 2;
        for(int i = 0; i< half; i++){
            temp_node = temp_node.next;
        }
        return temp_node;
    }

    public void printList(){
        if(head == null){
            System.out.println("No element in the list");
        } else {
            Node temp = head;
            System.out.print("\nElements are: ");
            while(temp != null){
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }





//    Main declaration
    public static void main(String[] args){
        doubleLinkedList dlist = new doubleLinkedList();
        dlist.append(100);
        dlist.append(200);
        dlist.append(300);
        dlist.append(400);
        dlist.append(500);
        dlist.append(1000);
        dlist.prepend(50);
        dlist.printList();
        dlist.set(3, 2000);
        dlist.reverseTraverse();
//        dlist.prepend(10);
//        dlist.prepend(5);
//        dlist.prepend(100);
//        dlist.prepend(100);
//        dlist.prepend(100);
//        dlist.prepend(1000);
        dlist.printList();
//        dlist.traverse();
//        System.out.println("Length of the List = " + dlist.length);
//        dlist.reverseTraverse();
//        System.out.println(dlist.searchIndex(500));
//        System.out.println(dlist.get(5).value);
//        System.out.println(dlist.set(8, 1000));
//        dlist.insert(7, 1000);
//        System.out.println(dlist.popfirst().value);
//        System.out.println(dlist.remove(7).value);
//        dlist.printList();
//        System.out.println("Length of the List = " + dlist.length);
//        dlist.reverse();
//        dlist.printList();
//        System.out.println(dlist.getMiddle().value);
    }
}

















