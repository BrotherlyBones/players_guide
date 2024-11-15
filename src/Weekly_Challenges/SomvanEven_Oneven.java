package Weekly_Challenges;

import java.util.Scanner;

public class SomvanEven_Oneven {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // import scanner
            int inputted;
            int even = 0;
            int oneven = 0;

            while(true) {
                try {
                    System.out.print("Geef een geheel positief getal: ");
                    inputted = input.nextInt();
                    if(inputted < 0){ //minder dan nul
                        System.out.println(">:(");
                        input.nextLine();
                        continue;
                    }
                    break;
                } catch (Exception e) { //niet een getal Of te groot voor een Int
                    System.out.println(">:(");
                    input.nextLine();
                }
            }
            for(int forloop = 1; forloop <= inputted; ++forloop){
                if(forloop % 2 == 0){
                    even += forloop;
                } else {
                    oneven += forloop;
                }
            }
            System.out.println("som van oneven getallen tot en met " + inputted + " is " + oneven);
            System.out.println("som van even getallen tot en met " + inputted + " is " + even);
            System.out.println("verschil tussen twee sommen is "+ (oneven - even));
        }
    }