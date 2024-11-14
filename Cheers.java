public class Cheers {
        public static void main(String[] args) {
            String inputString = args[0].toUpperCase();  // Convert input to upper case
            int repeatCount = Integer.parseInt(args[1]);
            String vowels = "AEFHILMNORSX";
    
            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                String article = (vowels.indexOf(ch) != -1) ? "an" : "a";
                System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
            }
    
            System.out.println("What does that spell?");
            for (int i = 0; i < repeatCount; i++) {
                System.out.println(inputString + "!!!");
            }
        }
    }
    