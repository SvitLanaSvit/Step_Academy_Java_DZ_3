package org.example.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array implements IShow, IMath, ISort{
    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void Print() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    public void Print(String info) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nInfo: " + info);
    }

    @Override
    public int Max() {
        int max = arr[0];
        for (int num : arr) {
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = arr[0];
        for (int num : arr) {
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        return (float)Arrays.stream(arr).average().orElse(0.0);
    }

    @Override
    public void SortAsc() {
        Arrays.sort(arr);
    }

    @Override
    public void SortDesc() {
        Arrays.sort(arr);
        reverseArray(arr);
    }

    private void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}

