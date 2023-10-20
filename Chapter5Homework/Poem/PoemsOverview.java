package ITEC2150.Chapter5Homework.Poem;

/*
    class: PoemsOverview
    author: Eden Truong
    date: 10/20/2023
    description: prompts user for 3 poems and writes them to a file named poems.txt
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PoemsOverview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Poem[] poems = new Poem[3];

//        int i = 1;
//        for(Poem x: poems) {
//            Poem[]
//            System.out.println("Please Input Poem " + i + "'s name");
//            x.setName(input.nextLine());
//            System.out.println("Please Input Poem " + i + "'s author");
//            x.setPoet(input.nextLine());
//            i++;           |
//        } better way below v
        for(int i = 0; i < poems.length; i++) {
            poems[i] = new Poem();
            System.out.println("please enter poem " + (i + 1) + "'s name");
            poems[i].setName(input.nextLine());
            System.out.println("please enter poem " + (i + 1) + "'s poet");
            poems[i].setPoet(input.nextLine());
        }
        writeToFile(poems);
    }

    public static void writeToFile(Poem[] poem) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/ITEC2150/Chapter5Homework/Poem/poems.txt"))) { //alter me when changed files
            for(int i = 0; i < poem.length; i++) {
                bw.write(poem[i].getName());
                bw.write( "\n" + poem[i].getPoet() + "\n");
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
