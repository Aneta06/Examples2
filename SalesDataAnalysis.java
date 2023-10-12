package fileio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesDataAnalysis {

    public static void main(String[] args) throws IOException {
        String file1Central = "src\\fileio\\central.csv";
        String file2East = "src\\fileio\\east.csv";
        String file3West = "src\\fileIO\\west.csv";

        System.out.println(readFile(file1Central));
        System.out.println(readFile(file2East));
        System.out.println(readFile(file3West));

        System.out.println(mostProfitableYear(file1Central));
    }
    public static int mostProfitableYear(String regionName) throws IOException {
        Path somePath = Paths.get(regionName);

        List<String> fileLines = Files.readAllLines(somePath);

        Map<Integer, Integer> revenueYear = new HashMap<>();

        for (int i = 1; i < fileLines.size(); i++) {
            String currentLine = fileLines.get(i);
            String[] linesSplit = currentLine.split(",");
            int year = Integer.parseInt(linesSplit[1]);
            int revenue = Integer.parseInt(linesSplit[4]);
            if (revenueYear.containsKey(year)) {
                int totalRevenue = revenueYear.get(year);
                totalRevenue += revenue;
                revenueYear.put(year, totalRevenue);
            } else {
                revenueYear.put(year, revenue);
            }
            System.out.println();
            // get year and revenue of currentLine
        }
        Map.Entry<Integer, Integer> highest = null;
        for (Map.Entry<Integer, Integer> entry:revenueYear.entrySet()){
            if(highest == null || entry.getValue() > highest.getValue()) {
                highest = entry;
            }
        }
        return highest.getKey();
    }
//    public static List<String> topProducts(String regionName, int n) throws FileNotFoundException{
//
//    }

//    public static Map<String, Integer> monthlyRevenue(String regionName, int year) throws FileNotFoundException{
//
//    }
    public static List<String> readFile(String filepath) {
        List<String> output;
        try {
            output = Files.readAllLines(Paths.get(filepath));
        } catch (IOException exception) {
            throw new RuntimeException("file doesn't exist");
        }
        return output;
    }
}


