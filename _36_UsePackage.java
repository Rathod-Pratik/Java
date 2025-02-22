import CreatePackage.CreatePackage;

public class UsePackage {
    public static void main(String[] args) {
        // Creating an instance of CreatePackage
        CreatePackage objects = new CreatePackage();

        // Calling the showMessage() method
        objects.showMessage();

        // Uncomment the following line to call MyFunction with a parameter
        objects.MyFunction("Mohit Free fire no botiyo cha tu");
    }
}
