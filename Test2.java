package dev.oops.Test.Test2;
import java.util.Scanner;
public class Test2 {
    public static void findSecondLargest(int[] arr) {
        int First = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > First) {
                second = First;
                First = num;
            } else if (num > second && num != First) {
                second = num;
            }
        }
        System.out.println("Second Largest Number: " + second);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findSecondLargest(arr);
    }
}
