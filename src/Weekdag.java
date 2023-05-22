import java.util.Scanner;

public class Weekdag {
    public static void main(String[] args) {
        System.out.println(WeekdagConversie());
    }
    public static String WeekdagConversie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer een getal in van 0 tot 6: ");
        int dagNummer;
        if (scanner.hasNextInt()) {
            dagNummer = scanner.nextInt();
        } else {
            System.out.println("Geen geldige dag.");
            return WeekdagConversie();
        }
        if (dagNummer == 0) {
            return "zondag";
        } else if (dagNummer == 1) {
            return "maandag";
        } else if (dagNummer == 2) {
            return "dinsdag";
        } else if (dagNummer == 3) {
            return "woensdag";
        } else if (dagNummer == 4) {
            return "donderdag";
        } else if (dagNummer == 5) {
            return "vrijdag";
        } else if (dagNummer == 6) {
            return "zaterdag";
        } else {
            System.out.println("Geen geldige dag.");
            return WeekdagConversie();
        }
    }
}
