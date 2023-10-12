package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static void main(String[] args) {

        //napiste funkci, ktera nacte soubor precte prima String cesta k souboru




        String fileNew = readFile ("src/fileIO/fileio.txt");

        System.out.println(fileNew);
        System.out.println(withoutVowels(fileNew));




    }

    public static String readFile(String filename) {
        Path somePath = Paths.get(filename);

        try {
            List<String> fileLines = Files.readAllLines(somePath);

            String output = "";
            for (int i = 0; i < fileLines.size(); i++){

                output += fileLines.get(i);

            }

                return output;
        } catch (IOException e) {
            System.err.println("Unable to read file.");
            //throw new IllegalArgumentException("wrong argument, cant read file");
            return null;
        }

    }

    public static String withoutVowels(String loadedText){
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

        String output = loadedText.replaceAll("[aeiou]", "");

        return output;
    }


}
