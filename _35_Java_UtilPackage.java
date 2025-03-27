import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class _35_Java_UtilPackage {
    public static void main(String[] args) {
        // Example 1: ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Hello");
        System.out.println("ArrayList after removal: " + arrayList);

        // Example 2: HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap: " + hashMap);
        hashMap.remove(1);
        System.out.println("HashMap after removal: " + hashMap);

        // Example 3: HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("First");
        hashSet.add("Second");
        System.out.println("HashSet: " + hashSet);
        hashSet.remove("First");
        System.out.println("HashSet after removal: " + hashSet);

        // Example 4: LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        System.out.println("LinkedList: " + linkedList);
        linkedList.removeFirst();
        System.out.println("LinkedList after removing first element: " + linkedList);

        // Example 5: Stack
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Top");
        System.out.println("Stack: " + stack);
        stack.pop();
        System.out.println("Stack after pop: " + stack);

        // Example 6: TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        System.out.println("TreeMap: " + treeMap);
        treeMap.remove(10);
        System.out.println("TreeMap after removal: " + treeMap);

        // Example 7: Vector
        Vector<String> vector = new Vector<>();
        vector.add("First");
        vector.add("Second");
        System.out.println("Vector: " + vector);
        vector.remove(0);
        System.out.println("Vector after removal: " + vector);
    }
}
