package Sortering;

import PrinterQueue.LinkedList;

/**
 * Created by alexander on 2017-04-03.
 */
public class Sort {

    public static int[] selSortInt(int[] numbers) {
        if (numbers.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int[] swap = new int[2];
        swap[0] = numbers[0]; // sätter första talet i listan till första i swap
        for (int index = 0; index < numbers.length; index++) {
            swap[0] = numbers[index];
            swap[1] = index;
            for (int i = index; i < numbers.length; i++) {
                if (swap[0] > numbers[i]) { // om första i listan är större än andra så:
                    swap[0] = numbers[i];
                    swap[1] = i;
                }
            }
            numbers[swap[1]] = numbers[index]; //  sätter numbers[index av det minsta talet] till det första talet i listan
            numbers[index] = swap[0]; // sätter numbers[index som man är på] till
            }
        return numbers;
    }

    public static double[] selSortDouble(double[] numbers) {
        if (numbers.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        double[] swap = new double[2];
        swap[0] = numbers[0]; // sätter första talet i listan till första i swap
        for (int index = 0; index < numbers.length; index++) {
            swap[0] = numbers[index];
            swap[1] = index;
            for (int i = index; i < numbers.length; i++) {
                if (swap[0] > numbers[i]) {
                    swap[0] = numbers[i];
                    swap[1] = i;
                }
            }
            numbers[(int )swap[1]] = numbers[index]; //  sätter numbers[index av det minsta talet] till det första talet i listan
            numbers[index] = swap[0]; // sätter numbers[index som man är på] till

        }
        return numbers;
    }

    public static String[] selSortStringLength(String[] words) {
            if (words.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Array is empty!");
            }
            int[] swap = new int[2];
            for (int index = 0; index< words.length; index++) { // kör igenom och sorterar hela listan
                swap[0] = words[index].length(); // sätter swap[0] till längden på index strängen
                swap[1] = index; // sätter swap[1] till det index som vi är på
                for (int i = index+1; i<words.length; i++) { // kör igenom och kollar efter det kortaste ordet
                    if (swap[0] > words[i].length()) { // kollar om nästa i listan är kortare än det nuvarande
                        swap[0] = words[i].length(); // sätter den kortaste till nästa
                        swap[1] = i; //  sätter index på den kortaste till index
                    }
                }
                String temp = words[swap[1]];
                words[swap[1]] = words[index];
                words[index] = temp;

            }
            return words;
    }

    public static String[] selSortStringAlpha(String[] words) {
        if (words.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int[] swap = new int[2];
        char c = words[0].toLowerCase().charAt(0);
        swap[0] = c; // sätter första talet i listan till första i swap
        for (int index = 0; index < words.length; index++) {
            swap[0] = words[index].charAt(0);
            swap[1] = index;
            for (int i = index; i < words.length; i++) {
                if (swap[0] > words[i].toLowerCase().charAt(0)) { // om första i listan är större än andra så:
                    if (swap[0]  == words[i].toLowerCase().charAt(0)) {
                       if (words[index].charAt(1) > words[i].toLowerCase().charAt(1)) {

                       }
                    }
                    swap[0] = words[i].toLowerCase().charAt(0);
                    swap[1] = i;
                }
            }
            String temp = words[swap[1]];
            words[swap[1]] = words[index];
            words[index] = temp;

        }
        return words;
    }

    public static int[] sortBubbleInt(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j-1] > numbers[j]) {
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static String arrayToString(int[] array) {
        String value = "";
        for(int i : array) {
            value += i + ", ";
        }
        return value;
    }

    public static int[] quickSort(int[] numbers) {
        customQuickSort(0, numbers.length-1, numbers);
        return numbers;
    }

    private static void customQuickSort(int low, int high, int[] array) {
        int index = partition(low, high, array);
        if (low < index-1) {
            customQuickSort(low, high-1, array);
        } else if (high > index) {
            customQuickSort(low, high, array);
        }

    }
    private static int partition(int low, int high, int[] array) {
        int pivot = array[high];
        while (low <=high) {
            while(array[low] < pivot) {
                low++;
            }
            while(array[high] > pivot) {
                high--;
            }
            if (low<=high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }


}
