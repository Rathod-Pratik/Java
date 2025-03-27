package  _36_CreatePackage;
public class _36_CreatePackage {
    public void showMessage(){
        System.out.println("this message coming from Package");
    }
    public void MyFunction(String messages){
        System.out.println(messages);
    }
    public static void main(String[] args) {
        _36_CreatePackage obj=new _36_CreatePackage();
        obj.showMessage();
    }
}
