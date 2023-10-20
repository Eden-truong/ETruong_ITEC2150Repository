package ITEC2150.Chapter5Homework.Poem;
/*
  class: PoemReader
  author: Eden Truong
  date: 10/20/2023
  description: Reads poems.txt and parses and processes the reference variables into console
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoemReader {
    public static void main(String[] args) throws IOException {
        List<Poem> poems = new ArrayList<>();

        try (
                Scanner fileScanner = new Scanner(new File("src/ITEC2150/Chapter5Homework/Poem/poems.txt")); //alter me when destination file changes
        ) {
            // Read and create Poem objects from the file
            while (fileScanner.hasNextLine()) {
                Poem poem = new Poem();
                poem.setName(fileScanner.nextLine());
                poem.setPoet(fileScanner.nextLine());
                poems.add(poem);
            }
        }

        for (int i = 0; i < poems.size(); i++) {
            System.out.println("Poem " + (i + 1) + ":");
            System.out.println("Name: " + poems.get(i).getName());
            System.out.println("Poet: " + poems.get(i).getPoet());
        }
    }
}
