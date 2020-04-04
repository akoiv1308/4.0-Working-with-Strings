import java.util.Scanner; //import scanner

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    // -- User Input : Palindrome -- //
    System.out.println("Test: Palindrome");
    System.out.println("Enter a word: ");
    String wordP = userInput.next();
    // Just making sure that code can properly parse the word entered //
    wordP = wordP.toLowerCase();
    // Final outcome //
    System.out.println("Palindrome: First Version : " + isPalindrome(wordP) + ", Second Version : " + isPalindrome2(wordP));
    // -- User Input : Abecedarian -- //
    System.out.println("Test: Abecedarian");
    System.out.println("Enter a word: ");
    String wordA = userInput.next();
    wordA = wordA.toLowerCase();
    // Final outcome //
    System.out.println("Abecedarian : " + isAbecedarian(wordA));
    // Final command for scanner //
    userInput.close();
  }
  // isPalendrome takes users input as an argument to determine whether or not it is a palindrome //
  public static boolean isPalindrome(String word) {
    // String reverse = "pot" //
    String reverse = "";
    // Loops backwards and adds all letters in the word to the string reverse //
    for(int i = word.length() - 1; i >= 0; i--) {
      // Adding values everu time loop works //
      reverse = reverse + word.charAt(i);
    }
    // If two strings are identical, return true, meaning that the word is a palindrome //
    if (reverse.equals(word)) {
      return true;
    }
    // Otherwise, it is not a palindrome //
    else {
      return false;
    }
  }
  // When I was creating the first version of a palindrome identifier, I realized that there is also another way of solving it, so I decided to include both and check if two versions will determine palindrome correctly //
  public static boolean isPalindrome2(String word) {
    int forward = 0; // --> // Reading forward
    int backwards = word.length() - 1; // <-- // Reading backwards
    for(int i = 0; i < word.length() - 1; i++) {
      // Checks to see if a letter at the current position of int forward == letter at the current position of int backwards //
      if(word.charAt(forward) == word.charAt(backwards)) {
        forward++; //Increase//
        backwards--; //Decrease//
      }
      else { // Not a palindrome //
        return false;
      }
    }
    return true;
  }
  // isAbecedarian checks for abecedarian word //
  public static boolean isAbecedarian(String word) {
    int i = 0;
    while (i < word.length() - 1) { // Made in order to check every single letter in a word //
      // If current letter is less than (meaning it goes after certain letter) the next consecutive letter, increase int i by one and repeat the same process //
      if (word.charAt(i) <= word.charAt(i+1)) {
        i++;
      }
      // If the letters are not in alphabetical order, report it by returning false //
      else {
        return false;
      }
    }
    return true;
  }
}

