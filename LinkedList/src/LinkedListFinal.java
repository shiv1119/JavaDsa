//class Node{
//    int value;
//    Node next;
//    public Node(int data){
//        value = data;
//        next = null;
//    }
//}
//
//class LinkedListFinal {
//    int length;
//    Node head;
//    Node tail;
//
//    public LinkedListFinal(){
//        head = null;
//        tail = null;
//        length = 0;
//    }
//
//    public void prepend(int data){
//        Node new_node = new  Node(data);
//        if(head == null){
//            head = new_node;
//            tail = new_node;
//        } else {
//            new_node.next = head;
//            head = new_node;
//        }
//        length += 1;
//    }
//
//    public void append(int data){
//        Node new_node = new Node(data);
//        if (head == null){
//            head = tail = new_node;
//        } else {
//            tail.next = new_node;
//            tail = new_node;
//        }
//        length += 1;
//    }
//
//    public boolean insert(int index, int data){
//        Node new_node = new Node(data);
//        if(index < 0 || index > length){
//            return false;
//        } else if(length == 0){
//            head = tail = new_node;
//        } else if(index == 0){
//            new_node.next = head;
//            head = new_node;
//        } else {
//            Node temp = head;
//            for(int i = 0; i<index-1; i++){
//                temp = temp.next;
//            }
//            new_node.next = temp.next;
//            temp.next = new_node;
//        }
//        length += 1;
//        return true;
//    }
//
//    public int prePop(){
//        int popped;
//        if(head == null){
//            System.out.println("No element in the list");
//            popped = -1;
//        }
//        popped = head.value;
//        if(head == tail){
//            head = tail = null;
//        } else {
//            head = head.next;
//        }
//        length -= 1;
//        return popped;
//    }
//
//    public int pop(){
//        int popped;
//        if(head == null){
//            return -1;
//        }
//        popped = tail.value;
//        if(head == tail){
//            head = tail = null;
//        } else {
//            Node temp = head;
//            while(temp.next != tail){
//                temp = temp.next;
//            }
//            tail = temp;
//            temp.next = null;
//        }
//        length -= 1;
//        return popped;
//    }
//
//    public Node get(int index){
//        if(index == -1){
//            return tail;
//        }
//        if(index < -1 || index >= length){
//            return null;
//        }
//        Node current = head;
//        for(int i = 0; i< index; i++){
//            current = current.next;
//        }
//        return current;
//    }
//
//
//    public int remove(int index){
//        if (index >= length || index < -1){
//            return -1;
//        }
//        if (index == 0){
//            return prePop();
//        }
//        if(index == length-1 || index == -1){
//            return pop();
//        }
//        Node prev = get(index-1);
//        Node popped_node = prev.next;
//        prev.next = popped_node.next;
//        popped_node.next = null;
//        length -= 1;
//        return popped_node.value;
//
//    }
//
//    public void deleteAll(){
//        head = null;
//        tail = null;
//        length = 0;
//    }
//
//    public void traverse(){
//        Node current = head;
//        while (current != null){
//            System.out.println(current.value);
//            current = current.next;
//        }
//    }
//
//    public Node getMiddle(){
//        Node slow = head;
//        Node fast = head;
//        while (fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//
//        }
//        return slow;
//    }
//
//    public void reverse(){
//        Node prev = null;
//        Node mext_node = null;
//        Node current_node = head;
//        while (current_node != null){
//            mext_node  = current_node.next;
//            current_node.next = prev;
//            prev = current_node;
//            current_node = mext_node;
//        }
//        Node temp = head;
//        head = tail;
//        tail = temp;
//    }
//
//    public void removeDuplicate(){
//        if(head == null){
//            return;
//        }
//        int[] node_values = new int[10];
//        Node current_node = head;
//        node_values[0] = current_node.value;
//        while (current_node.next != null){
//            for(int i = 0; i<node_values.length; i++){
//                if(current_node.next.value == node_values[i]){
//                    current_node.next = current_node.next.next;
//                    length -= 1;
//                } else {
//                    node_values[i] = current_node.next.value;
//                    current_node = current_node.next;
//                }
//            }
//        }
//        tail = current_node;
//
//    }
//    public void printList(){
//        if(head == null){
//            System.out.println("Linked list is empty: ");
//        } else {
//            Node temp = head;
//            System.out.print("Linked list's elements are: ");
//            while(temp != null){
//                System.out.print(temp.value + " ");
//                temp = temp.next;
//            }
//        }
//    }
//
//
//    public static void main(String[] args){
//        LinkedListFinal list = new LinkedListFinal();
//        list.prepend(10);
//        list.prepend(20);
//        list.prepend(30);
//        list.append(100);
//        list.append(400);
//        list.append(200);
//        list.insert(0, 400);
//        list.printList();
//        System.out.println();
//        System.out.println(list.getMiddle().value);
////        list.traverse();
////        System.out.println("Linked List length = " + list.length);
////        int x = list.remove(-1);
////        list.printList();
////        System.out.println();
////        System.out.println("Removed element = " + x);
////        System.out.println("Linked List length = " + list.length);
//        list.removeDuplicate();
//        list.printList();
//    }
//
//
//}
