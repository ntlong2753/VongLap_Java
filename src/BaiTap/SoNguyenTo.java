package BaiTap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int limit = input.nextInt();

        while (limit < 0 || limit > 999999) {
            System.out.print("Số lượng vượt quá giới hạn, vui lòng nhập lại: ");
            limit = input.nextInt();
        }

        System.out.print("Nhập số cần kiểm tra: ");
        int checkNum = input.nextInt();

        boolean isPrime = true;
        if (checkNum < 2) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(checkNum); i++) {
                if (checkNum % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println(checkNum + " là số nguyên tố!");
        }
        else {
            System.out.println(checkNum + " không phải là số nguyên tố!");
        }

        int count = 0;
        int number = 2;

        while (count < limit) {
            boolean prime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}

