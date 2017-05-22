package ioss;

import java.util.List;

public class QuickSort {

    static void quickSort(List<String> names, int left, int right) {
        int mark;
        if (left < right) {
            mark = partition(names, left, right);
            quickSort(names, left, mark - 1);
            quickSort(names, mark + 1, right);
        }
    }
    
    static int partition(List<String> names, int left, int right) {
        int pivot = right;
        int small = -1;
        String temp;
        
        for (int i = 0; i <= right; ++i) {
            if (names.get(i).compareToIgnoreCase(names.get(pivot)) <= 0) {
                if (++small != i) {         // so you don't have to use 3 lines to "swap" with yourself
                    temp = names.get(small);
                    names.set(small, names.get(i));
                    names.set(i, temp);
                }
            }
        }
        return small;
    }

    static void shuffle(List<String> names) {
        int pick;
        String temp;
        for (int i = names.size() - 1; i > 0; --i) {
            pick = (int)(Math.random() * (i + 1));
            if (i != pick) {
                temp = names.get(i);
                names.set(i, names.get(pick));
                names.set(pick, temp);
            }
        }
    }
}
    
   


