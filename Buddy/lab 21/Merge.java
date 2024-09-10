import java.util.Scanner;
public class Merge {
    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = start + (end - start) / 2; 
        divide(arr, start, middle);
        divide(arr, middle + 1, end);
        conquer(arr, start, middle, end);
    }
    public static void conquer(int arr[], int start, int middle, int end) {
        int[] merge = new int[end - start + 1];  
        int index1 = start;
        int index2 = middle + 1;
        int x = 0;
        while (index1 <= middle && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                merge[x++] = arr[index1++];
            } else {
                merge[x++] = arr[index2++];
            }
        }
        while (index1 <= middle) {
            merge[x++] = arr[index1++];
        }
        while (index2 <= end) {
            merge[x++] = arr[index2++];
        }   
        for (int i = 0; i < merge.length; i++) {
            arr[start + i] = merge[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element at index " + i);
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, size - 1);
        System.out.println("Sorting Complete");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}