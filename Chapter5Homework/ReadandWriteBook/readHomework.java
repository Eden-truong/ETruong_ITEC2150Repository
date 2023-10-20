package ITEC2150.Chapter5Homework.ReadandWriteBook;

/*
    class: readHomework
    author: Eden Truong
    date: 10/20/2023
    description: reads a string of numbers, calculates statistics, while re-writing them on console and processes stats onto stats.txt
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readHomework {
    public static void main(String[] args) throws IOException {
        List<Integer> a = readFile("src/ITEC2150/Chapter5Homework/ReadandWriteBook/Book1.CSV"); //alter when change destinations
        writeAverage(a);
        System.out.println(a);
    }

    public static List<Integer> readFile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try(BufferedReader bR = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = bR.readLine()) != null) {
                String[] parts = line.split(",");
                for(String x: parts) {
                    numbers.add(Integer.parseInt(x.trim()));
                }
            }
        }
        return numbers;
    }

    public static void writeAverage(List<Integer> file) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/ITEC2150/Chapter5Homework/ReadandWriteBook/stats.txt"))) { //please alter when change destination
            int smallest = file.get(0);
            int largest = file.get(0);
            int sum = 0;
            int average = 0;
            for(int i = 0; i < file.size(); i++) {
                if (file.get(i) <= smallest) {
                    smallest = file.get(i);
                }
                else if (file.get(i) >= largest) {
                    largest = file.get(i);
                }
                sum += file.get(i);
            }
            average = sum / file.size();

            bw.write("The Sum of the numbers are: " + sum);
            bw.write("\nThe Smallest number is: " + smallest);
            bw.write("\nThe Largest number is: " + largest);
            bw.write("\nThe Average of all numbers are: " + average);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
