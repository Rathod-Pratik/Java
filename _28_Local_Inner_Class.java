class OuterClass {
    void outerMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("Hello Rathod");
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}