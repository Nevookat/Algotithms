package Alg;

import org.w3c.dom.ls.LSOutput;

public class LinearSearch{
    public static void main(String[] args) {



    //Напишите линейный поиск, который ищет последнее число в массиве.
    //Массив заполните 20-ю числами самостоятельно без цикла.
    int [] arr = new int []{5,6,8,12,79,25,64,36,42,98,125,58,65,98,236,85,465,785,965,231};
    System.out.println(binSearch(arr, 12));
}


public static int binSearch(int arr[], int key) {
    int mid = arr.length / 2;
    if (key == arr[mid]) {
        return mid;
    }
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        mid = (end - start) / 2 + start;
        if (key < arr[mid]) {
            end = mid - 1;
        } else if (key > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
}
}

