package com.company;
class created{
    int count=0;
    created(){
        count+=1;
    }
    public void print(){
        System.out.println("the constructor is called "+count+" times");
    }
}
public class created_class {
    public static void main(String[] args) {
        created c=new created();
        c.print();
    }
}