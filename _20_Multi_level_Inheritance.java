class GrandParent{
    void DisplayGrandParent(){
        System.out.println("This is GrandParent Class");
    }
}
class Parent extends GrandParent{
    void DisplayParent(){
        System.out.println("This is Parent Class");
    }
}
class Child extends Parent{
    void DisplayChlid(){
        System.out.println("This is child Class");
    }
}
public class _20_Multi_level_Inheritance {
    public static void main(String[] args) {
    Child Multi_Level=new Child();
    Multi_Level.DisplayGrandParent();
    Multi_Level.DisplayParent();
    Multi_Level.DisplayChlid();
    }
}
