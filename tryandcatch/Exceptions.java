package tryandcatch;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        System.out.print("Enter A : ");
        a = sc.nextInt();
        System.out.print("Enter B : ");
        b = sc.nextInt();
        try {
            result = a / b;
            System.out.println("Division : " + result);
        } catch (Exception ex) {
            System.out.println("Can't divide by 0" + ex);
        }

        try {
            int[] arr = new int[5];
            arr[5] = 30 / 3;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            int[] arr = new int[5];
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}