import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        int age;
        System.out.print("Enter Age: ");
        age = scanner.nextInt();

        float weight;
        System.out.print("Enter Weight: ");
        weight = scanner.nextFloat();

        boolean bool;
        System.out.print("Enter true Or false If You Smoke: ");
        bool = scanner.nextBoolean();

        System.out.println(name + " is age " + age + " with weight " + weight + " and " + bool + " to smoking");
    }
}
