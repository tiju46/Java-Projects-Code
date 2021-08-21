import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileProgram {

    public static void main(String[] args) throws IOException {
        File fp = new File("/users/addauser/Documents/File/file1.text");
        fp.createNewFile();
        File rename = new File("/users/addauser/Documents/File/file2.text");
        fp.renameTo(rename);

        FileWriter fw = new FileWriter("/users/addauser/Documents/File/file2.text");
        fw.write("hei mahn");
        //fw.close();
        File file = new File("/users/addauser/Documents/File/file2 copy.text");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
}
