package opgave04;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        calculateTax(0);
    }

    public static int calculateTax(int monthlyIncome) {
//scanner der modtager indput i form af en integer
        System.out.println("enter your monthly");
        Scanner scanner = new Scanner(System.in);
        //månedesløn
        int monthly = scanner.nextInt();
        //din månedesløn omregnet til årlig med fradrag
        int monthlyToYearly = monthly * 12 - 48000;
        //månedesløn lavede om til årlig uden fradrag
        int yearly = monthly * 12;
        //årsskat
        int yearlyTax = monthlyToYearly * 37 / 100;
        //hvis din årlige løn er mindre end 48000kr
        if (yearly <= 48000) {
            System.out.println("du skal ikke betale skat");
            //hvis du skal betale topskat
        } else if (yearly > 568900) {
            int topTax = yearly - 568900 - 48000;
            int ToptaxFinal = yearlyTax + topTax * 15 / 100;
            System.out.println("Du skal betale topskat :( " + ToptaxFinal + "kr");
            //hvis du betaler normal skat
        } else System.out.println("Du skal betale normal skat :) " + yearlyTax + "kr");


        return yearlyTax;
    }
}
