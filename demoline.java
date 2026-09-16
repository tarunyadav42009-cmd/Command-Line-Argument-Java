/**
 * The demoline class demonstrates how to accept and use 
 * command-line arguments in a Java application.
 */
public class demoline {

    /**
     * The main entry point of the program.
     * 
     * @param args Command-line arguments passed by the user. 
     *             args must contain at least one element (e.g., a username).
     */
    public static void main(String args[]) {

        // Check if the user forgot to pass a command-line argument
        if (args.length == 0) {
            System.out.println("Error: Please provide a name as a command-line argument.");
            System.out.println("Usage: java demoline <your_name>");
            return; // Exit the program early to prevent an ArrayIndexOutOfBoundsException
        }

        // Greet the user using the first argument passed into the program
        System.out.println("Welcome: " + args[0]);

    }
}
