package presentation;
import domain.ValidateAsHaiku;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int ID = sc.nextInt();
        ValidateAsHaiku validateHaiku = new ValidateAsHaiku(name, ID);
        System.out.println("Write your own Haiko poem..");
        validateHaiku.validate(writePoem());
    }

    public static ArrayList<String> writePoem() {
        int line = 1;
        String s;
        ArrayList<String> lines = new ArrayList();
        do {
            System.out.print("Write the " + line + (line == 1 ? "st" : line == 2 ? "nd" : line == 3 ? "rd" : "th") + " line (end with \"0\"): ");
            s = sc.nextLine();
            lines.add(s);
            line++;
        } while (!s.equals("0"));
        return lines;
    }
}
