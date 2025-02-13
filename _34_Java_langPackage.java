public class _34_Java_langPackage {
    public static void main(String[] args) {
        // Math class examples
        double sqrtValue = Math.sqrt(25);
        System.out.println("sqrtValue: " + sqrtValue);

        double randomValue = Math.random();
        System.out.println("randomValue: " + randomValue);

        // Integer wrapper class example
        Integer intObj = Integer.valueOf(100);
        int intValue = intObj.intValue();
        System.out.println("Integer wrapper: " + intObj + " Unboxing Value: " + intValue);

        // Double wrapper class example
        Double doubleObj = Double.valueOf(20.5);
        double doublevalue = doubleObj.doubleValue();
        System.out.println("Double wrapper: " + doubleObj + " Unboxing Value: " + doublevalue);

        // String concatenation example
        String str1 = "hello";
        String str2 = " World";
        String result = str1.concat(str2);
        System.out.println("String Concatenation: " + result);

        // StringBuffer example
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println("StringBuffer Append: " + sb);

        // Number class example
        Number num = Integer.valueOf(50);
        int numValue = num.intValue();
        System.out.println("Number class value: " + numValue);

        // Package example
        Package pkg = _34_Java_langPackage.class.getPackage();
        System.out.println("Package Name: " + pkg.getName());
    }
}