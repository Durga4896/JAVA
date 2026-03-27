package CollectionsFramework.CollectionInterface;

import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        Stack<String> elements = new Stack<>();
        elements.push("Hello");
        elements.push("dear!");
        elements.push("How is yoour Day?");

        System.out.println(elements);
        System.out.println(elements.empty());
        System.out.println(elements.search("Hello"));
    }
}
