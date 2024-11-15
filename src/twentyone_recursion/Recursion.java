package twentyone_recursion;

public class Recursion {
    static int x = 0;
    public static void recurse(int recursions){
        System.out.println(x);
        if(++x == recursions) {
            recurse(recursions);
        }
    }
}
