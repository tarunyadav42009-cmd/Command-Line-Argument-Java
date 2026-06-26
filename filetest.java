import java.io.File;

public class filetest {
    public static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File(args[0]);
        p(f1.getName()  + (f1.exists() ? " EXITS" : " DOES NOT EXITS"));
        p("File Size: " + f1.length() + " Bytes");
        p("Is " + (f1.isDirectory() ? " A DIRECTORY" : " NOT A DIRECTORY"));
    }
}
