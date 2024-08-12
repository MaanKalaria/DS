import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter array element " + i + ": ");
            array[i] = sc.nextInt();
        }
        int j,x;
        for(int i=1; i<array.length; i++){
            x=array[i];
            j = i-1;
            while (j >= 0 && array[j] > x) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = x;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        return;
    }
}