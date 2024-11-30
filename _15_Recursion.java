public class _15_Recursion {
    static double factorial(int n){
        if(n==0 || n==1){
            return  1;
        }
        else {
            return n* factorial(n-1);
        }
    }
    static double factorial_itrative(int n){
        double iterate_value=1;
        if(n==0 || n==1){
            return  1;
        }
        else {
            for(int i=1; i<=n; i++){
                iterate_value*=i;
            }
            return  iterate_value;
        }
    }
    public static void main(String[] args) {
        double a=factorial(5);
        double b=factorial_itrative(5);
        System.out.println("The Value of factorial is"+ a);

        System.out.println("The Value of factorial is"+ b);
    }
}
