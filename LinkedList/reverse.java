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
    
    void printlist(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        
        
        head=list.reverselist(head);
        
        list.printlist(head);
    }
    
    Node reverselist(Node node){
        Node prev_node=null;
        Node curr_node=node;
        Node next_node=null;
        
        while(curr_node!=null){
            next_node=curr_node.next;
            curr_node.next=prev_node;
            prev_node=curr_node;
            curr_node=next_node;
        }
        node=prev_node;
        return node;
    }    
}
