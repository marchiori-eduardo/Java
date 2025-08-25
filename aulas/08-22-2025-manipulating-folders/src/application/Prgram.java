package application;

import java.io.File;
import java.util.Scanner;

public class Prgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //função de filtragem do tipo de arquivo a ser listado
//                                           ||
//                                           \/
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder.getName());
        }

        System.out.println();
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file.getName());
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir(); //vai criar uma subpasta a partir da pasta strPath
        System.out.println("Folder created: " + sucess);

        sc.close();
    }
}
