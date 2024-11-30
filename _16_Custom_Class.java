import java.util.Scanner;
class employee{

    int id;
    String Name;
    double salary;

    //create instance of scanner Class to get user input
    Scanner sc=new Scanner(System.in);

    //Input from user
    public void getData() {
        System.out.println("Please enter following Details");

        System.out.println("Enter your Id");
        id = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter your Name");
        Name = sc.nextLine(); // Reads the entire name including spaces

        System.out.println("Enter your salary");
        salary = sc.nextDouble();
    }

    //Print Value
    public void PrintData(){
        System.out.println("your Id is :" + id);
        System.out.println("your Name is :" + Name);
        System.out.println("your salary is :" + salary);
    }
}


public class _16_Custom_Class {
    public static void main(String[] args) {
        //Create object of class
        employee emp1=new employee();

        //Access function using object
        emp1.getData();
        emp1.PrintData();

    }
}
