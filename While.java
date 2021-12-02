import java.util.Locale;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     String input = "";
     while (!input.equals("quit")){
            System.out.println("Imput: ");
            input = scanner.next().toLowerCase(Locale.ROOT);
         System.out.println("You have entered " + input);
        }
}
    }
