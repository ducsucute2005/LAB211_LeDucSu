/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author selu3
 */
public class Stack {

    public class Node {

        int data;
        Node next;

        public Node(int x, Node next) {
            this.data = x;
            this.next = next;

        }

        public Node(int x) {
            this(x, null);
        }
    }
    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node pop() {
        if (isEmpty()) {
            System.out.println("empty");
            return null;
        } else {
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
    
    public Node top(){
        if(isEmpty()){
            System.out.println("empty");
            return null;
        }else{
            return head;
        }
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current=current.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Stack linkStack = new Stack();
        linkStack.push(1);
        linkStack.push(2);
        linkStack.push(3);
        linkStack.push(4);
        linkStack.traverse();
        
        linkStack.pop();
        linkStack.traverse();
        
        System.out.println("read the last element" + linkStack.top());
        linkStack.traverse();
    }
}
