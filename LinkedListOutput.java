package com.mycompany.slinkedlist;
import java.util.Scanner;


public class LinkedListOutput {   
    public static void main(String[] args){
        
        System.out.println("Welcome to the Single Linked List Application");
        
        System.out.println("Please enter characters or digits , one at a time:");
        
        SLinkedList list = new SLinkedList();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string or ! to terminate program: ");
        
        String user_input = scanner.nextLine();
        if
                (!user_input.equals("!")) {
            
            list.addNode(user_input);
        }
        while (!user_input.equals("!")) {
            
            System.out.println("Enter a string or ! to terminate program: ");
            
            user_input = scanner.nextLine();
            
            if (!user_input.equals("!")) {
               
                list.addNode(user_input);
            }
        }
        
        list.print();
        System.out.print("Singly Linked list is done!!"); 
        
     
    }
    
    
    
}
