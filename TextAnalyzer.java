import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        // for (int number=1; number <10; number++) {
        //     for (int multiplier = 1; multiplier < 10; multiplier++) {
        //         System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
        //     }
        // }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter or paste text: ");
        String text = scanner.nextLine();
        while (true) {
            System.out.println("");
            System.out.println("What are you looking to do?");
            System.out.println("a. Search paragraph for term \nb. Replace term in paragraph \nc. Word Counter \nd. Quit");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("a")) {
                System.out.print("Enter your search term: ");
                String query = scanner.nextLine().toLowerCase();
                int lastIndex = 0;
                int count = 0;

                while(lastIndex != -1){

                    lastIndex = text.indexOf(query,lastIndex);

                    if(lastIndex != -1){
                        count ++;
                        lastIndex += query.length();
                    }
                }
                System.out.printf("There were %s occurences of \"%s\" in your text.", count, query);
                continue;
            }
            else if (option.equalsIgnoreCase("b")) {
                System.out.print("Enter your search term: ");
                String query = scanner.nextLine();
                System.out.print("Enter your replacement term: ");
                String replacement = scanner.nextLine();
                String newText = text.replace(query, replacement);
                System.out.printf("Your updated text is: %s", newText);
                continue;
            }

            else if (option.equalsIgnoreCase("c")) {
                String trimText = text.trim();
                String spaces = " ";
                int lastIndex = 0;
                int count = 0;
                while(lastIndex != -1){

                    lastIndex = trimText.indexOf(spaces,lastIndex);

                    if(lastIndex != -1){
                        count ++;
                        lastIndex += spaces.length();
                    }
                }
                count++;
                System.out.printf("Your paragraph has %d words.", count);
                continue;
            }

            else if (option.equalsIgnoreCase("d")) {
                scanner.close();
                break;
            }

            else {
                System.out.println("Your input was invalid. Please choose option a, b, c, or d.");
                continue;
            }
        }
    }
}