package com.anish.learn.searching;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class BinarySearch {

    public int binarySearch(int arr[], int element) {

        int index = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (element == arr[mid]) {
                index = mid;
                break;
            } else if (element < arr[mid]) {
                end = mid - 1;
            } else if (element > arr[mid]) {
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        log.info("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        log.info("Enter {} values for array in sorted order :", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        log.info("Enter value/element to search :");
        int element = sc.nextInt();
        BinarySearch linearSearch = new BinarySearch();
        int index = linearSearch.binarySearch(arr, element);
        log.info("Using Binary search Element : {} is found :{} at index : {}", element, index != -1, index);

    }

}
