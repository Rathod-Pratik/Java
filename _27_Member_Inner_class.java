class outerClass{
    public String message="Hello from Local inner class";

    class InnerClass{
        void display(){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        outerClass outer=new outerClass();
        InnerClass inner=outer.new InnerClass();

        inner.display();
    }

}