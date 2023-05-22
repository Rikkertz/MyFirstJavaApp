import java.util.Arrays;
import java.util.Scanner;

public class BooleanLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is A true or false?");
        boolean a = scanner.nextBoolean();
        System.out.println("Is B true or false?");
        boolean b = scanner.nextBoolean();
        System.out.println("Is C true or false?");
        boolean c = scanner.nextBoolean();
        System.out.println("Is D true or false?");
        boolean d = scanner.nextBoolean();
        String[] expressions = {"b || c", "a && b || c", "a && b || c && d"};
        int i = 0;
        for (boolean bool:BooleanTabel(a, b, c, d)) {
            System.out.print(expressions[i] + " is ");
            System.out.println(bool);
            i++;
        }
    }
    public static boolean[] BooleanTabel(boolean a, boolean b, boolean c, boolean d){
        return new boolean[]{b || c, a && b || c, a && b || c && d};
    }
}
