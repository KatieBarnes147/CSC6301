
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

/**
 * This class reads a list of integers from input, stores them in a LinkedList,
 * and sorts them in ascending order.
 */
public class SortedLinkedList {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        
        System.out.println("Enter integers (type 'exit' to stop):");
        
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            list.add(number);
            Collections.sort(list);  // Sort the list after every insertion
            System.out.println("Sorted List: " + list);
        }

        System.out.println("Final Sorted List: " + list);
        scanner.close();
    }
}
