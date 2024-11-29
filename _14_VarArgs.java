public class _14_VarArgs {

    /*Store the all value in arr in array fromat and access using string*/
    static void sum(int a,int ...arr){
        long sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("The sum of value is :"+ sum);
    }
    public static void main(String[] args) {
        //Call function using multiple parameters
        sum(1);
        sum(1,2,3,4,5);
        sum(1,55,30,54,95);
        sum(1,2,3,4,5);
    }
}
