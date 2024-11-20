public class Cheers {
        public static void main(String[] args) {
            String inputString = args[0].toUpperCase();  // Convert input to upper case
            int repeatCount = Integer.parseInt(args[1]);
            String vowels = "AEFHILMNORSX";
    
            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                boolean isVowelOrSpecial = vowels.indexOf(ch) >= 0;
    
                // Adjust the space after "Give me" based on whether "a" or "an" is used
                String article = isVowelOrSpecial ? "an " : "a  ";  // Notice the two spaces for "a  "
                System.out.println("Give me " + article + ch + ": " + ch + "!"); 
            }
    
            System.out.println("What does that spell?");
            for (int i = 0; i < repeatCount; i++) {
                System.out.println(inputString + "!!!");
            }
        }
    }
    