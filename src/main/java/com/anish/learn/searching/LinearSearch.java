package com.anish.learn.searching;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class LinearSearch {

    public int linearSearch(int arr[], int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        log.info("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        log.info("Enter {} values for array :", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        log.info("Enter value/element to search :");
        int element = sc.nextInt();
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.linearSearch(arr, element);
        log.info("Using Linear search ,Element : {} is found :{} at index : {}", element, index != -1, index);

    }

}
