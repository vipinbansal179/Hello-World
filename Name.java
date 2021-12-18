import java.util.Scanner;
    public class Name{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter ur Name: ");
            String a = input.nextLine();
            System.out.print("Name = " + a);
            input.close();

        }
    }
