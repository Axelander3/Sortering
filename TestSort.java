package Sortering;

/**
 * Created by alexander on 2017-04-03.
 */
public class TestSort {

    public static void main(String[] args) {
        /*int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        for (int i : Sort.selSortInt(numbers)) {
            System.out.println(i);
        }

       /* double[] dNumbers = {45.5, 32.5, 128.3, 42.8, 9, 83, 52, 96, 1, 75};
        for (double i : Sort.selSortDouble(dNumbers)) {
            System.out.println(i);
        }

        String[] strings = {"hej", "hjejdejdjejdejdejdje", "he", "hejsan", "d", "de"};
        for (String s : Sort.selSortStringLength(strings)) {
            System.out.println(s);
        }*/


       /* String[] strings = {"bbc", "aab", "aaa", "jaa", "zbc", "fdd", "eaazz"};

        for (String s : Sort.selSortStringAlpha(strings)) {
            System.out.println(s);
        }*/


        /*int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        int[] sorted = Sort.sortBubbleInt(numbers);
        System.out.println(Sort.arrayToString(sorted));

        //System.out.println(Search.binarySearchRec(numbers, 52));


        System.out.println(Sort.arrayToString(Sort.quickSort(numbers)));*/

        // 1024
        String[] strings = {"FilipOlofsson", "AlexanderMattsson", "AlbinOlsson", "NiklasBergholm"};
        String[] sorted = Sort.selSortStringAlpha(strings);
        for (String s : sorted) {
            System.out.println(s);
        }

    }
}
