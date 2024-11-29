public class _13_Method_overloading {

    static void ChangeArray(int[] a){
        a[2]=500;
    }

    static void Message(String a){
        System.out.println("Good Morning "+ a + " Bro");
    }

    static  void Message(){
        System.out.println("Good Morning Bro");
    }
    /*Can't overload using return type like this Message function return error */
   //static  int Message(){
     //   System.out.println("Good Morning Bro");
   // }

    public static void main(String[] args) {
        /*Overload the Message function*/
        Message("Rathod Pratik");
        Message();

        int [] arr={100,85,74,99,48,55};
        ChangeArray(arr);

        System.out.println("The Value of arr[2] is : "+ arr[2] );
    }
}
