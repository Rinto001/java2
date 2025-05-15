import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        int i, pos = 0;
        boolean state = false;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter number of elements in an array:");
        int num = s.nextInt();
        String[] word = new String[num];
        
        System.out.println("\nEnter " + num + " words:");
        s.nextLine(); // Consume the leftover newline
        for (i = 0; i < num; i++) {
            word[i] = s.nextLine(); // Input words into the array
        }
        
        System.out.println("Enter the word to search:");
        String Search = s.nextLine();
        
        for (i = 0; i < num; i++) {
            if (word[i].equals(Search)) {
                pos = i;
                state = true;
                break; // Exit loop once the word is found
            }
        }
        
        if (state) {
            System.out.println("Element found at position: " + (pos + 1));
        } else {
            System.out.println("Element not found.");
        }
    }
}
