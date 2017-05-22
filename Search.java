package Sortering;

/**
 * Created by alexander on 2017-04-24.
 */
public class Search {

    public static int binarySearch(int[] data, int item) {
        int[] sorted = Sort.sortBubbleInt(data);
        int low = 0; // håller koll på den lägsta indexsen
        int max = sorted.length-1; // //håller koll på den största indexen
        int middle; // hålller koll på mitten

        while(max>=low) { // kör så länge som den största är större eller lika med den minsta
            middle = (low+max)/2; // sätter mitten till den största
            if (sorted[middle] == item) { // kollar om mitten indexet på sorterade listan är det vi söker efter
                return middle; // returnar indexet på det talet i sorterade listan
            } else if (sorted[middle] < item) { // kollar om talet i den sorterade listan är mindre än det vi söker efter
                low = middle+1; // sätter den lägsta till mitten+1
            } else if (sorted[middle] > item) { // kollar om talet i listan är större än det vi söker efter
                max = middle-1; // sätter max till mitten-1
            }
        }
        return -1; // returnerar -1 eftersom att det vi söker efter finns inte.
    }

    public static int binarySearchRec(int[] data, int item) {
        int[] sorted = Sort.sortBubbleInt(data);
        return search(sorted, item, 0, sorted.length-1);
    }

    private static int search(int[] array, int search, int low, int max) {
        int middle = (low+max)/2;
        if (array[middle] == search) {
            return middle;
        } else if (array[middle] < search) {
            return search(array, search, middle+1, max);
        } else if (array[middle] > search) {
            return search(array, search, low, middle-1);
        }
        return -1;
    }

}
