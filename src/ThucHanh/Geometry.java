package ThucHanh;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Danh sách các hình");
        System.out.println("------------------");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 3; i >= 1; i-- ) {
                    for (int j = 1; j <= 7; j++ ) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                // hình 1
                for (int i = 1; i <= 5; i++ ) {
                    for (int j = 1; j <= i; j++ ) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("");
                // hình 2
                for (int i = 5; i >= 1; i-- ) {
                    for (int j = 1; j <= i; j++ ) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("");
                // hình 3
                int n = 5;
                for (int i = n; i >= 1; i--) {
                    for (int j = 0; j < n - i; j++) {
                        System.out.print("  ");
                    }

                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("");
                // hình 4
                int m = 5;
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= m - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                // hình 1
                int n1 = 4;
                for (int i = 1; i <= n1; i++) {
                    for (int j = 1; j <= n1 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                // hình 2
                int m1 = 4;
                for (int i = m1; i >= 1; i--) {
                    for (int j = 1; j <= n1 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }


        }
    }
}
