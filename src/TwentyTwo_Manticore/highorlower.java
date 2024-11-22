package TwentyTwo_Manticore;

public class highorlower {
    public static Boolean check(byte guess, byte target){
        System.out.print("That round ");
        if (guess > target){
            System.out.println("OVERSHOT the target.");
            return false;
        } else if (guess < target){
            System.out.println("FELL SHORT of the target.");
            return false;
        }
        System.out.println("was a DIRECT HIT!");
        return true;
    }
}