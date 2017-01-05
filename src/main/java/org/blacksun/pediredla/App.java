package org.blacksun.pediredla;

/**
 * Created by Pediredla on 11/25/16.
 */
public class App {
    public static void main(String[] args) {

        int arr[] = {89, 34, 76, 3, 2, 56, 8, 112};
        int arr1[] = {1};
        SortingAlgorithms.heapSort(arr);
        for (int i : arr)
            System.out.println(i);
    }
}