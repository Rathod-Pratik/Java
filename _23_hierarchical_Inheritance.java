 // Base class (Parent)
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    // Derived class (Child 1 of Animal)
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks.");
        }
    }

    // Derived class (Child 2 of Animal)
    class Cat extends Animal {
        void meow() {
            System.out.println("Cat meows.");
        }
    }

    // Main class to test Hierarchical Inheritance
    public class _23_hierarchical_Inheritance {
        public static void main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat();

            // Dog class can access methods from Animal
            dog.eat();  // Inherited from Animal
            dog.bark(); // Defined in Dog

            // Cat class can access methods from Animal
            cat.eat();  // Inherited from Animal
            cat.meow(); // Defined in Cat
        }
    }
