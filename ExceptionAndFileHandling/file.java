package ExceptionAndFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("MCA-SEM.txt", true);
            try {
                fw.write("I Am The One Who Deserves The Throne. \n If You Have The Guts Stop Me. ");

            } finally {
                fw.close();
            }

            System.out.println("File Data Wrote Successfully....");

        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            FileReader fr = new FileReader("MCA-SEM.txt");
            try {
                int i;
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                fr.close();
                System.out.println("\nFile Closed....");
            }

        } catch (IOException e) {
            System.out.println("Exception Handled...");
        }

        try {
            FileInputStream fi = new FileInputStream("MCA-SEM.txt");
            FileOutputStream fo = new FileOutputStream("BCA-SEM.txt");
            try {
                int i;
                while ((i = fi.read()) != -1) {
                    fo.write(i);
                }
                System.out.println("File Copied Successfully");
            } finally {
                ;
                fi.close();
                fo.close();
                System.out.println("File Closed...");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}