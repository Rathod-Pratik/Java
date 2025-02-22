package  CreatePackage;
public class CreatePackage {
    public void showMessage(){
        System.out.println("this message coming from Package");
    }
    public void MyFunction(String messages){
        System.out.println(messages);
    }
    public static void main(String[] args) {
        CreatePackage obj=new CreatePackage();
        obj.showMessage();
    }
}
