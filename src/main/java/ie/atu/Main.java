package ie.atu;

public class Main {
    public static void main(String[] args){
        Student s1=new Student();
        s1.getUserInput(1);
        Student s2 = new Student();
        s2.getUserInput(2);
        Student s3 = new Student();
        s3.getUserInput(3);
        s1.displayInfo(1);
        s2.displayInfo(2);
        s3.displayInfo(3);
    }
}