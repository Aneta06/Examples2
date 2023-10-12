package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIoTwo {

    public static void main(String[] args) {


        String fileNew = "src/fileIO/fileio_ext.txt";

      //  readLines(fileNew);

       // System.out.println(readLines(fileNew));

        prettyPrint(fileNew);

        String text = FileIO.readFile(fileNew);

        System.out.println(splitLine(text));


    }

    public static List<String> readLines(String file) {
        Path somePath = Paths.get(file);

        try {
            List<String> fileNew = Files.readAllLines(somePath);


            return fileNew;
        } catch (IOException e) {
            System.err.println("Unable to read file.");
            return null;
        }


    }

    public static void prettyPrint(String fileName){

        String input =  FileIO.readFile(fileName);
        System.out.println(input);

    }

    public static String splitLine(String split){
        char[] symbols = new char[]{'.','!', '?'};

        String output = split.replaceAll("[.!?]", "\n");

        return output;
    }

}
