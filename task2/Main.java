package task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    private static ArrayList<String> fileNames = new ArrayList<>();

    public static void main(String[] args) {

        File folder = new File("src\\task2\\BTU_DOCUMENT");
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            fileNames.add(files[i].getName());
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Enter word: ");
            String query = sc.nextLine();
            search(query);
        }
    }

    private static void search(String query) {
        if (query.trim().length() == 0) return;
        System.out.println(fileNames.size());
        for (String name : fileNames) {
            if (name.contains(query)) System.out.println(name);
        }
    }


}
