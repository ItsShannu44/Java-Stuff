package com.mycompany.secmaxmin;
import java.util.Scanner;
public class SecMaxMin {
 public static void main(String[] args) {
 int n, i, j, small, large, temp;
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the size of Array");
 n = sc.nextInt();

 if (n < 2) {
 System.out.println("Array must contain at least two elements");
 } else {
 int a[] = new int[n];
 System.out.println("Enter the array elements");
 for (i = 0; i < n; i++) {
 a[i] = sc.nextInt();
 }
 for (i = 0; i < n - 1; i++) {
 for (j = 0; j < n - i - 1; j++) {
 if (a[j] > a[j + 1]) {
 temp = a[j];
 a[j] = a[j + 1];
 a[j + 1] = temp;
 }
 }
 }
 small = a[1];
 large = a[n - 2];
 System.out.println("The second smallest number is: " + small);
 System.out.println("The second largest number is: " + large);
 }
 }
}
