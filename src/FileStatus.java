import java.io.File;
import java.util.Scanner;

import static java.lang.System.exit;

public class FileStatus {

    void openNewFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full path of the file you wish to check: ");
        File obj1 = new File(sc.next());
        if (obj1.exists()) {
            System.out.println("File Name: " + obj1.getName());
            System.out.println("Writeable: " + obj1.canWrite());
            System.out.println("Readable: " + obj1.canRead());
            System.out.println("Size (KB): " + obj1.length() / 1000);
            restartApp();
        } else {
            System.out.println("File does not exist.");
        }
    }

    void restartApp() {
            Scanner restart = new Scanner(System.in);
            System.out.println("Would you like to open another file? (Y/N)");
            String str = restart.next();
            if (str.equalsIgnoreCase("Y")) {
                openNewFile();
            } else {
                exit(0);
            }
        }
    }
