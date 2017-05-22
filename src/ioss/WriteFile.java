package ioss;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteFile {
    public static final int MAXSIZE = 20;
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String userName = null;
        List<String> programData = new ArrayList<>();
        String newData = null;
        
        // prompt and get username
        System.out.print("What's your name? ");
        userName = input.nextLine();
        
        // prompt and get up to 20 names from user
        System.out.print("Hello " + userName);
        System.out.println(", please enter up to 20 names. When you're through, press <Enter> twice");
        for (int i = 0; i < MAXSIZE; ++i) {
            System.out.print("#" + (i + 1) + ":  ");
            if ((newData = input.nextLine()).isEmpty())
                break;
            programData.add(newData);
        }
        
        // display names and save to file
        try (PrintWriter output = new PrintWriter("./data.txt")) {
            for (int i = 0; i < programData.size(); ++i) {
                System.out.println(programData.get(i));
                output.println(programData.get(i));
            }
            System.out.println("List saved to " + "./data.txt");
        }

    }
}
