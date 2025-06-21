package dsa;

import java.util.LinkedList;


public class LinkedListPractice {

    public  static class Node{
           int data;
           Node next  ;

           public Node(int data) {
               this.data = data;
           }
    }

    public static class linkedlist {
        Node head=null;
        Node tail=null;


        public void displayll() {
            Node temp =head;
            while (temp!=null) {
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }

//        public void displayReversedll(Node head) {
//            if (head == null) return;
//            displayll(head.next);
//            System.out.println(head.data);
//        }

        public int length() {
            int count = 0;
            Node temp =head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
        public void insertAtEnd(int data) {
                Node temp =new Node(data);
            if (head == null){
                head=tail=temp;
            }
            else {
                tail.next=temp;
            }
                tail=temp;
        }
        public void insertAtBeginning(int data){
            Node temp =new Node(data);
            if (head == null)  {
                head=tail=temp;    //or we can also call insertAtEnd
                return;
            }
            temp.next=head;
            head=temp;

        }
        public void insertAtIndex(int index, int data){
            Node newNode = new Node(data);
            Node temp=head;

            if (index==length()){
                insertAtEnd(data);
                return;
            } else if (index==0) {
                insertAtBeginning(data);
                return;
            } else if (index<0 || index>length()) {
                System.out.println("invalid index");
                return;
            }
            for (int i = 0; i <index-1; i++) {
                temp=temp.next;
            }
                newNode.next=temp.next;
                temp.next=newNode;
        }
        public int getElementAtIndex(int index){
          Node temp = head;
            if (index > length() || index<0){
                System.out.println(" invalid index ");
            }
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            return temp.data;
        }
        public void deleteElementAtIndex(int index){

           if (index==0){
               head= head.next;
               return;
           }
            Node temp = head;
            if (index > length() || index<0){
                System.out.println(" invalid index ");
            }
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }

            temp.next=temp.next.next;
            tail=temp;
        }


    public static void main(String[] args) {
//        LinkedList linkedList1= new LinkedList<Integer>();
//        linkedList1.insertAtEnd(2);
//        linkedList1.insertAtEnd(322);
//        System.out.println(linkedList1.size());
//        System.out.println(linkedList1.getLast());

        LinkedListPractice linkedListPractice = new LinkedListPractice();



        linkedlist linkedlist1=new linkedlist();
        linkedlist1.insertAtEnd(2);
        linkedlist1.insertAtEnd(43);
        linkedlist1.insertAtEnd(4553);
//        linkedlist1.displayll();
        //linkedlist1.length();
       linkedlist1.insertAtBeginning(29);
       linkedlist1.displayll();
        linkedlist1.insertAtIndex(4,1029);
        linkedlist1.displayll();
        System.out.println(linkedlist1.tail.data);
        linkedlist1.insertAtIndex(0,500);
        linkedlist1.displayll();
        System.out.println(linkedlist1.head.data);
        System.out.println(linkedlist1.tail.data);

        System.out.println("element at index " +linkedlist1.getElementAtIndex(0));

        linkedlist1.deleteElementAtIndex(3);
        linkedlist1.displayll();
    }
}}