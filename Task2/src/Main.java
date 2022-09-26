import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter at least three words separated by commas:");
        String x = scanner.next();
        String[] splitResult = x.split(",");
        System.out.println("Please, choose a filter:\n 1 - maximum length\n 2 - start with"
                + "\n 3 - end with\n 4 - contains\n 0 - exit");

        int choice = scanner.nextInt();
        do  {
            switch (choice) {
                case 1:
                    System.out.println("Enter the maximum word length:");
                    break;
                case 2:
                    System.out.println("Enter the beginning of a word (2 first letters):");
                    break;
                case 3:
                    System.out.println("Enter the end of the word (2 last letters):");
                    break;
                case 4:
                    System.out.println("Enter a part of word:");
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
            String parameter = scanner.next();
            for (int i = 0; i < splitResult.length; i++) {
                if (choice == 1) {
                    if (splitResult[i].length() <= Integer.parseInt(parameter)) {
                        System.out.println(splitResult[i]);
                    }
                }
                if (choice == 2) {
                    if (splitResult[i].startsWith(parameter)) {
                        System.out.println(splitResult[i]);
                    }
                }

                if (choice == 3) {
                    if (splitResult[i].endsWith(parameter)) {
                        System.out.println(splitResult[i]);
                    }
                }
                if (choice == 4) {
                    if (splitResult[i].contains(parameter)) {
                        System.out.println(splitResult[i]);
                    }
                }
            }
            System.out.println("Please, choose a filter:\n 1 - maximum length\n 2 - start with"
                    + "\n 3 - end with\n 4 - contains\n 0 - exit");

            choice = scanner.nextInt();
        } while (choice != 0);

        System.exit(0);
    }

}