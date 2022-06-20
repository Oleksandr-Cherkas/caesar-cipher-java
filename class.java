import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Integer number = 0;
        String str;
        Integer convert;
        Boolean n = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Entering:\n");
            str = scanner.nextLine();
            if (str.contains(" ")) {
                n = false;
            } else {
                convert = Integer.parseInt(str, 16);
                System.out.println("Result: "+ convert + "\n");
            }
        } while (n == true);
        System.out.print("Process was stopped");
    }
}