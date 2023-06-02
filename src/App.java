import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.println("You are " + name);
        }
    }
}
