// The Collatz class simulates the Collatz conjecture for a given range of starting numbers.
public class Collatz {
    public static void main(String args[]) {
        // Parse the total number of sequences to generate from the command line arguments.
        int totalSequences = Integer.parseInt(args[0]);
        // Determine the output mode from command line arguments ('c' for concise, 'v' for verbose).
        String outputMode = args[1];
        // String to hold the current sequence of numbers for verbose mode.
        String currentSequence = "";
        // Variable to count the number of steps taken to reach 1 in the current sequence.
        int stepsCount = 0;
        // Boolean flag to handle the initial case where the current number starts as 1.
        boolean isFirstIteration = true;

        // Loop over each number starting from 1 up to the total number of sequences.
        for (int seed = 1; seed <= totalSequences; seed++) {
            // Start the sequence with the current seed.
            int currentNumber = seed;
            // Initialize the sequence display with the current seed.
            currentSequence = currentSequence + currentNumber + " ";

            // Process the sequence until the current number reaches 1.
            // The loop also checks if it's the first iteration to handle the case when starting with 1.
            while (currentNumber != 1 || isFirstIteration) {
                // After the first iteration, set the flag to false.
                isFirstIteration = false;
                // Increment the step count.
                stepsCount++;

                // Check if the current number is odd.
                if (currentNumber % 2 != 0) {
                    // For odd numbers, multiply by 3 and add 1.
                    currentNumber = currentNumber * 3 + 1;
                    // If verbose mode is enabled, append the new number to the sequence.
                    if (outputMode.equals("v")) {
                        currentSequence += currentNumber + " ";
                    }
                } else {
                    // For even numbers, divide by 2.
                    currentNumber /= 2;
                    
                    // Special handling for when the next number becomes 1.
                    if (currentNumber == 1) {
                        // Increment the step count for reaching 1.
                        stepsCount++;
                    }
                    // If verbose mode is enabled, append the new number to the sequence.
                    if (outputMode.equals("v")) {
                        currentSequence += currentNumber + " ";
                    }
                }
            }

            // If verbose mode is selected, print the sequence and the total number of steps.
            if (outputMode.equals("v")) {
                System.out.println(currentSequence + "(" + stepsCount + ")");
            }
            // Reset the step count and sequence for the next seed.
            stepsCount = 0;
            currentSequence = "";
        }

        // After all sequences have been processed, print a summary confirming all sequences reach 1.
        System.out.println("Every one of the first " + totalSequences + " hailstone sequences reached 1.");
    }
}
