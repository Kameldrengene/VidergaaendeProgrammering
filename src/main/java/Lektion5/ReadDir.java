package Lektion5;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDir {
    public static void main(String[] args) {
        File file = null;
        String[] paths;
        Scanner input = new Scanner(System.in);
        System.out.println("provide path");
        String path = input.nextLine();
        try {
            // create new file object
            file = new File("C:\\" + path);

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for (String pathnames : paths) {
                // prints filename and directory name
                System.out.println(pathnames);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

//    public static String[] readdir(String str) {
//        String[] paths ;
//        File file = null;
//        try {
//
//            // create new file object
//            file = new File("C:\\" + str);
//
//            // array of files and directory
//            paths = file.list();
//
//            // for each name in the path array
//            for (int i = 0; i < paths.length ; i++) {
//
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return paths;
//    }
}


