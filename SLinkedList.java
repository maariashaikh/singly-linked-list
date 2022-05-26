
package com.mycompany.slinkedlist;

public class SLinkedList{
    
  
    Nodes head;   
    
    void addNode(String e){
        Nodes newNode = new Nodes(e);
        newNode.next = null;
        
        if (head == null) { 
            head = newNode; 
        }else{
             getLast().next = newNode; 
        }
    }// addNode
    
    private Nodes getLast(){
        Nodes last = head;
        while (last.next != null) { 
           last = last.next; 
        } 
        return last;
    }
    
    void print() 
{ 
    Nodes node = head; 
    while (node != null) {
        if (Character.isDigit(node.data.charAt(0))) 
        {
            System.out.print(node.data + ", "); 
        }
        node = node.next; 
    } 
    node = head;
    while (node != null) {
        if (!Character.isDigit(node.data.charAt(0))) {
            System.out.print(node.data + ", "); 
        }
        node = node.next; 
    } 
    System.out.println();
}


} // print