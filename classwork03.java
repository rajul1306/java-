import java.util.Scanner;
class test01{
    private String Name;
    private double percentage;
    test01(String name, double Percentage){
        Name=name;
        percentage=Percentage;
    }
    public void print(){
        System.out.println("Name of student is "+Name+" and the percentage is "+percentage);
    }
}
public class class_work_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student ");
        String nam=sc.nextLine();
        System.out.println("Enter the percentage of student ");
        double per=sc.nextDouble();
        test01 ts=new test01(nam, per);
        ts.print();

    }
}
