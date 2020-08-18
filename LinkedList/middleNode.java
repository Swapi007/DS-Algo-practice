class LinkedList{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        list.head.next.next.next.next=new Node(5);
        
        list.midnode(head);
    }
    
    void midnode(Node node){
        Node slow_node=node,fast_node=node;
        
        while((fast_node!=null)&&(fast_node.next!=null)){
            fast_node=fast_node.next.next;
            slow_node=slow_node.next;
        }
        
        System.out.println(slow_node.data);
    }    
}
