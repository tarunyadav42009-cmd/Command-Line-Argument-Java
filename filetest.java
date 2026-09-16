import java.io.File;

/**
 * The filetest class demonstrates basic file handling operations in Java.
 * It checks if a file exists, retrieves its size, and determines if it is a directory.
 */
public class filetest {

    /**
     * Helper method to simplify printing text to the console.
     * 
     * @param s The string message to print.
     */
    public static void p(String s) {
        System.out.println(s);
    }

    /**
     * The main entry point of the program.
     * 
     * @param args Command-line arguments. args[0] must be the path to the target file.
     */
    public static void main(String[] args) {
        
        // Validate that the user provided a file path as a command-line argument
        if (args.length == 0) {
            p("Error: Please provide a file path as a command-line argument.");
            return;
        }

        // Create a File object using the path passed from the command line
        File f1 = new File(args[0]);

        // Check if the file/directory actually exists on the system
        p(f1.getName() + (f1.exists() ? " EXISTS" : " DOES NOT EXIST"));

        // Retrieve and print the size of the file in bytes (returns 0 if it doesn't exist)
        p("File Size: " + f1.length() + " Bytes");

        // Check whether the given path points to a directory (folder) or a regular file
        p("Is " + (f1.isDirectory() ? " A DIRECTORY" : " NOT A DIRECTORY"));
    }
}
