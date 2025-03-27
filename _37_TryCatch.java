public class _37_TryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("This is Try Block");
            int a=10/0;
            System.out.println("Value of a is " +a);
        }catch (ArithmeticException a){
            System.out.println("Some Arithmatic error occured");
        }
        finally {
            System.out.println("This is Finally keyword");
        }
    }
}
