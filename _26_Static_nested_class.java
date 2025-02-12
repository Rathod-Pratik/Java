class OuterClasses {
    static int a=100;
    private static int b=200;
     int c=300;

    static class Nested{
        Nested(){
            System.out.println("Valus of a is :"+a);
            System.out.println("Valus of b is :"+b);

            //access only static member
           // System.out.println("Valus of c is :"+c);
        }
    }

    public static void main(String[] args) {
        OuterClasses.Nested r=new OuterClasses.Nested();
    }
}
