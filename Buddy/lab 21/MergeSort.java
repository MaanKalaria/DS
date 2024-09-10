
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int start = 0;
        int end = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            end++;
        }
        int mid = (start + end) / 2;
        
    }
    public static void merge(int[] a,int start,int mid,int end){
        int h = start;
        int i = start;
        int j = mid+1;
        int[] b = new int[i];
        while(h <= mid && j <= end){
            if(a[h]<=a[j]){
                b[i] =a[h];
                h++;
            }
            else{
                b[i] = a[j];
                j++;
            }
            i++;
        }
    }
}
