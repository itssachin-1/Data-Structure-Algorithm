package dsa.sorting;

public class SelectionSort {

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex= i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[minIndex])
                    minIndex=i;
            }
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex]= tmp;
            }
        }
    }
    static void print(int[] arr){
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        selectionSort(arr);
        print(arr);
    }
}
