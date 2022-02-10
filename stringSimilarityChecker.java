import java.util.Arrays;

public class stringSimilarityChecker {

    static int calculate(String userWord , String OCRWord) {

        OCRWord = OCRWord.toUpperCase();
        userWord = userWord.toUpperCase();


         if (userWord.isEmpty()) {
             try {
                return OCRWord.length();
             } catch (Exception e) {

                 //TODO: handle exception
                 System.err.println("NO USERSTRING FOUND, MAKE SURE TO PRESS ENTER");
                 System.exit(1);
                 
             }
             
         }
 
         if (OCRWord.isEmpty()) {
             return userWord.length();
         } 
 
         int substitution = calculate(userWord.substring(1), OCRWord.substring(1)) 
          + costOfSubstitution(userWord.charAt(0), OCRWord.charAt(0));
         int insertion = calculate(userWord, OCRWord.substring(1)) + 1;
         int deletion = calculate(userWord.substring(1), OCRWord) + 1;
 
         return min(substitution, insertion, deletion);
     }
 
     public static int costOfSubstitution(char a, char b) {
         return a == b ? 0 : 1;
     }
 
     public static int min(int... numbers) {
         return Arrays.stream(numbers)
           .min().orElse(Integer.MAX_VALUE);
     }
 }
