import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Write a program that reads a file with n number of strings separated by linebreaks.
//The program prints how many words are in the file
public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        File file = new File("Resources/File.txt");
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    wordList.add(words[i]);
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        System.out.println(wordList.size() + " words are in this file.");
    }
}