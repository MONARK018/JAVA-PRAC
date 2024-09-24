import java.util.Scanner;

public class java2{

   // Arrays to hold the letters and their Morse code equivalents
   private static final char[] letters = {
           'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
   };
   private static final String[] morseCode = {
           ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
   };

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Choose an option:");
       System.out.println("1: Convert string to Morse code");
       System.out.println("2: Convert Morse code to string");
       int choice = scanner.nextInt();
       scanner.nextLine();  // Consume newline left-over

       switch (choice) {
           case 1:
               System.out.print("Enter a string to convert to Morse code: ");
               String inputString = scanner.nextLine().toUpperCase();
               System.out.println("Morse code: " + convertStringToMorse(inputString));
               break;
           case 2:
               System.out.print("Enter a Morse code string to convert to text (separate letters with spaces and words with ' / '): ");
               String inputMorse = scanner.nextLine();
               System.out.println("Text: " + convertMorseToString(inputMorse));
               break;
           default:
               System.out.println("Invalid option.");
       }

       scanner.close();


       System.out.println("23DIT016 MONARK HIRPARA");

   }

   // Method to convert string to Morse code
   private static String convertStringToMorse(String input) {
       StringBuilder morseStringBuilder = new StringBuilder();

       for (char c : input.toCharArray()) {
           if (c == ' ') {
               morseStringBuilder.append(" / ");
           } else {
               for (int i = 0; i < letters.length; i++) {
                   if (c == letters[i]) {
                       morseStringBuilder.append(morseCode[i]).append(" ");
                       break;
                   }
               }
           }
       }

       return morseStringBuilder.toString().trim();
   }

 // Method to convert Morse code to string
   private static String convertMorseToString(String input) {
       StringBuilder textStringBuilder = new StringBuilder();
       String[] words = input.split(" / ");

       for (String word : words) {
           String[] morseLetters = word.split(" ");
           for (String morseLetter : morseLetters) {
               for (int i = 0; i < morseCode.length; i++) {
                   if (morseLetter.equals(morseCode[i])) {
                       textStringBuilder.append(letters[i]);
                       break;
                   }
               }
           }
           textStringBuilder.append(" ");
       }

       return textStringBuilder.toString().trim();
    }
}