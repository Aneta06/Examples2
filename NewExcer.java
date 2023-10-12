import java.util.ArrayList;
import java.util.List;

public class NewExcer {

    public static void main(String[] args) {


        String s = "(Lukas)";

        String[] arrayNames = new String[]{s, "ales", "david", "karel"};


        System.out.println(returnGFA(arrayNames));

    }


    public static void print(String[] names) {

        System.out.println("GFA:");

        for (int i = 0; i < names.length; i++) {


            System.out.println(i + 1 + "." + "-".repeat(i + 1) + names[i]);
        }

    }

    public static String returnGFA(String[] names) {

        String output = "GFA:\n";
        for (int i = 0; i < names.length; i++) {

            output += i + 1 + "." + "-".repeat(i + 1) + names[i] + "\n";


        }


        return output;
    }

}


