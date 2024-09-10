// DEQUEUE
// DISPLAY
import java.util.Scanner;

public class ImplementOueueDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index : ");
        int index = sc.nextInt();
        int ans[] = new int[n];
        for (int i = 0; i < index; i++) {
            ans[i] = arr[i];
            System.out.print(ans[i]);
        }
        for (int i = index + 1; i < ans.length; i++) {
            ans[i] = arr[i];
            System.out.print(ans[i]);
        }
    }
}