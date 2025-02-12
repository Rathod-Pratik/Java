class _29_Anonymous_class{
    interface Greeting {
        void greet(String name);
    }
        public static void main(String[] args) {
            // Anonymous class implementation of the Greeting interface
            Greeting greeting = new Greeting() {
                @Override
                public void greet(String name) {
                    System.out.println("Hello, " + name);
                }
            };

            greeting.greet("Mohito");  // Output: Hello, John
        }
    }