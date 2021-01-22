/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;
/**
 *
 * @author ASUS
 */
public class Stack {
    public int current_size=-1;
    public final int MAX_SIZE=100;
    public int []stack=new int[MAX_SIZE];
    
    //check isEmpty
    public boolean isEmpty(){
        return (current_size==-1);
    }
    
    //check full
    public boolean isFull(){
        return (current_size==MAX_SIZE);
    }
    
    //them mot phan tu vao stack
    
    public void push(int data){
        if(isFull()){
            System.out.print("Full");
        }
        else
        {
            current_size++;
            stack[current_size]=data;
        }
    }
           //hien thi top nhung khong xoa
    public int top(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
            
        }
        else
        {
            return stack[current_size];
        }
    }
          //hien thi va xoa
    public int pop(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        else
        {
            int data=stack[current_size];
            current_size--;
            return data;
        }
    }

}
