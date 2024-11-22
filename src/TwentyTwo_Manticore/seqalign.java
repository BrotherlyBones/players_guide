package TwentyTwo_Manticore;

public class seqalign {
    public static byte check(byte turnNumber, byte baseDmg, byte fireDmg, byte electricDmg, byte fireElectricDmg) {
        if (turnNumber % 3 == 0 && turnNumber % 5 == 0) {
            return fireElectricDmg;
        }
        if (turnNumber % 3 == 0) {
            return fireDmg;
        }
        if (turnNumber % 5 == 0) {
            return electricDmg;
        }
        return baseDmg;
    }
}