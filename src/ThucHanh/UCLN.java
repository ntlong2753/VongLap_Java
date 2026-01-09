package ThucHanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhập giá trị a = ");
            num1 = sc.nextInt();
            System.out.print("Nhập giá trị b = ");
            num2 = sc.nextInt();

            num1 = Math.abs(num1);
            num2 = Math.abs(num2);

            if (num1 == 0 || num2 == 0) {
                System.out.println("Không có ước chung lớn nhất");
            }

        }while(num1 == 0 || num2 == 0);

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }

        System.out.println("Ước chugn lớn nhất là: " + num1);
    }
}
