package twelve_cuckoo;

public class cuckoo {
    public static void main(String[] args){
        long madness = 0;
        while (madness < Long.MAX_VALUE) {
            madness++;

            if (madness % 2 == 0) {
                System.out.println("Tick " + madness);
            }else{
                System.out.println("Tock " + madness);
            }

        }
    }
}
