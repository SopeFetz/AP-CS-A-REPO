// This import gets input from user.
import java.util.Scanner; 

public class MathTutor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        char[] operators = {'+', '-', '*', '/'};

        // Randomly selects an operator from the operator array.
        int randIndex = (int) (Math.random() * operators.length);
        char randOperator = operators[randIndex];

        // Randomly generates two numbers between 1 and 10.
        int num1 = (int) (Math.random() * 10.0) + 1;
        int num2 = (int) (Math.random() * 10.0) + 1;

        int larger , smaller;
        int answer , result , extraAnswer , extraResult;

        // Initializes variables to 0 to avoid errors.
        extraAnswer = 0;
        extraResult = 0;

        // Determines which of the two numbers is larger to have answers > 0.
        if (num1 > num2){
            larger = num1;
            smaller = num2;
        } else if (num1 < num2){
            larger = num2;
            smaller = num1;
        } else {
            larger = num1;
            smaller = num2;
        }
        
        // Performs the operation based on the randomly selected operator.
        if ( randOperator == '+' ) {
            result = larger + smaller; 
        } else if ( randOperator == '-' ) {
            result = larger - smaller;
        } else if ( randOperator == '*' ) {
            result = larger * smaller;
        } else {
            result = larger / smaller;
        }

        // Informs the user of the program's purpose.
        System.out.println("Hey I'm your maths tutor for the day and I'll be asking you some questions");
        System.out.println("Questions should be answered with integers only");

        // This enables us to carry out the follow up question for division and prompt the user for an answer.
        if ( randOperator != '/'){
            System.out.println("What is the solution to this problem:\n" + larger + " " + randOperator + " " + smaller );
            System.out.print("Enter your answer: ");
            answer = userInput.nextInt();
        } else {
            extraResult = larger % smaller; 
            System.out.println("What is the solution to this problem:\n" + larger + " " + randOperator + " " + smaller );
            System.out.print("Enter your answer: ");
            answer = userInput.nextInt();
            System.out.println("Try this too:\n" + "What is the remainder when " + larger + " is divided by " + smaller + " ?");
            System.out.print("Enter your answer: ");
            extraAnswer = userInput.nextInt();
        }

        // This checks if the user's answer is correct and prints the appropriate response.
        if ( randOperator != '/') {
            if ( answer == result) {
                System.out.println("That's Correct");
            } else {
                System.out.println("That's incorrect, the right answer is " + result + ".\n" + "Better luck next time!");
            }
        } else{
            if ( answer == result && extraAnswer != extraResult) {
                System.out.println("You got the division correct but the modulus wrong, the right answer is " + extraResult + ".\n" + "Better luck next time!");
            } else if ( answer != result && extraAnswer == extraResult) {
                System.out.println("You got the modulus correct but the division wrong, the right answer is " + result + ".\n" + "Better luck next time!");
            } else if ( answer == result && extraAnswer == extraResult) {
                System.out.println("That's Correct");
            } else {
                System.out.println("That's incorrect, the right answers are " + result + " and " + extraResult + ".\n" + "Better luck next time!");
            }
        }

        // Closes the scanner to avoid memory leaks.
        userInput.close();
    }
}