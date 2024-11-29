public class _12_function{
    static void Name(String name){
        System.out.println("Your name is:" + name);
    }

    static void sum(int a,int b){
        System.out.println("Sum of a and b is :" + (a+b));
    }

    static int Returnsum(int x,int y){
        return (x+y);
    }
    public static void main(String[] args) {
        Name("Rathod Pratik");
        Name("Mohit Dash");
        Name("Anish Dusara");

        sum(18,15);
       int a= Returnsum(20,20);
        System.out.println(a);
    }
}
