class College{
    String Course;
    String Name;
    int student_id;

    public void setName(String name) {
        Name = name;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}

class Student extends  College{
    public void PrintData(){
        System.out.println("Name is :"+ Name);
        System.out.println("Course is :"+ Course);
        System.out.println("Student Id is :"+ student_id);
    }
}
public class _19_Single_Inheritance {
    public static void main(String[] args) {
    Student Mohit=new Student();
    Mohit.setCourse("BCA");
    Mohit.setStudent_id(10);
    Mohit.setName("Mohit Chauhan");
    Mohit.PrintData();

    Student Anish=new Student();
    Anish.setCourse("Science");
    Anish.setStudent_id(11);
    Anish.setName("Anish Dusara");
    Anish.PrintData();

    }
}
