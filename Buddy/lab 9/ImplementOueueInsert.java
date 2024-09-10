// ENQUEUE
// DISPLAY
import java.util.Scanner;

public class ImplementOueueInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Queue elements: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.print("Enter element to be inserted in queue: ");
        int n = sc.nextInt();
        int[] queue = new int[num + 1];
        for (int i = 0; i < num; i++) {
            queue[i] = arr[i];
        }
        queue[num] = n;
        System.out.print("Queue after insertion: ");
        for (int i = 0; i < num + 1; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}