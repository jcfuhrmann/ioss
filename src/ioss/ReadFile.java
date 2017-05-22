package ioss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        List<String> programData = new ArrayList<>();
        String newData = null;
        
        // read a file from disk
        try (BufferedReader input = new BufferedReader(new FileReader("./sbb.txt"))) {
            while ((newData = input.readLine()) != null) {
                programData.add(newData);;
            }
        }
        
        // sort it
        QuickSort.quickSort(programData, 0, programData.size() - 1);
        // display sorted file
        System.out.println("\n\n");
        System.out.println("Sorted file");
        for (int i = 0; i < programData.size(); ++i) {
            System.out.println(programData.get(i));
        }
        
        // shuffle it
        QuickSort.shuffle(programData);
        // display shuffled file
        System.out.println("\n\n");
        System.out.println("Shuffled file");
        for (int i = 0; i < programData.size(); ++i) {
            System.out.println(programData.get(i));
        }
        
    }
}
