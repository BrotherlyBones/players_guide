package twentyone_recursion;

public class Recursion {
    public static void recurse(int recursions){
        System.out.println(recursions);
        if(--recursions != 0) {
            recurse(recursions);
        }
    }
}
