/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        Stack mystack=new Stack();
    
        // Pushing new item to the Stack use .push
    mystack.push(1);
    mystack.push(2);
    mystack.push(5);
    mystack.push(7);
    mystack.push(9);
     System.out.println("Top stack:"+mystack.top());
     System.out.println("Top stack and remove top:"+mystack.pop());
     System.out.println("Top stack:"+mystack.top());
    }
   
}

