import java.util.ArrayList;
import java.util.Collections;
        //0
public class ArrayLists {
    public static void main(String[] args) {
        //1
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Original ArrayList: " + colors);
        //2
        System.out.println("Iterating through ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
        //3
        colors.addFirst( "White");
        System.out.println("Iterating through ArrayList after inserting 'White':" + colors);
        //4
        String retrievedColor = colors.get(3);
        System.out.println("Element at index 2: " + retrievedColor);
        //5
        colors.set(1, "Yellow");
        System.out.println("After updating index 1 to 'Yellow': " + colors);
        //6
        colors.remove(2);
        System.out.println("After removing the third element from a array list': " + colors);
    }
}

/**
 * 0. Write a Java class with main method consist of:
 * 1. create a new array list, add some colors (string) and print out the collection
 * 2. iterate through all elements in a array list
 * 3. insert an element into the array list at the first position
 * 4. retrieve an element (at a specified index) from a given array list
 * 5. update specific array element by given element
 * 6. remove the third element from a array list
 * 7. search an element in a array list
 * 8. sort a given array list
 * 9. copy one array list into another
 * 10. reverse elements in a array list
 * 11. compare two array lists
 * 12. empty an array list
 * 13. test an array list is empty or not
 * 14. increase the size of an array list
 * 15. trim the capacity of an array list the current list size
 */