package ie.atu;
import java.util.Scanner;

public class Student {
    String name, email, course;
    public Student(){
        this.name="";
        this.email="";
        this.course="";
    }
    public void getUserInput(int s){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter student "+s+" name: ");
        this.name=scanner.nextLine();
        System.out.print("Enter student "+s+" email: ");
        this.email=scanner.nextLine();
        System.out.print("Enter student "+s+" course: ");
        this.course=scanner.nextLine();
    }
    public void displayInfo(int s){
        System.out.println("Student "+s+":");
        System.out.println("Name: "+name+", Email: "+email+", Course: "+course);
    }
}