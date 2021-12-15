package com.company;
import java.util.Scanner;
class student{
    private String str="Unknown";

    student(String s){
        str=s;
    }
    public String print(){
        return str;
    }
}
public class class_work_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        if (str.equals("")){
            str="Unknown";
        }
        student st=new student(str);
        System.out.print(st.print());
    }
}