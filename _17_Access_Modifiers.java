class employees{
    private int radiours;

    public void getValue(int value){
        radiours=value;
    }
    public double returnValue(){
        return Math.PI * Math.pow(radiours,2);
    }
}
public class _17_Access_Modifiers {
    public static void main(String[] args) {
        employees emp1=new employees();

        //Access private value using functions
        emp1.getValue(5);
        double value =emp1.returnValue();
        System.out.println(value);
    }
}
