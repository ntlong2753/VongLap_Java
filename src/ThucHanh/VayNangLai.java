package ThucHanh;

import java.util.Scanner;

public class VayNangLai {
    public static void main(String[] args) {
        System.out.println("Công thức tính tiền cho vay nặng lãi: ");
        System.out.println("Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi");
        System.out.println("-----------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        double money;
        int month;
        double interestRate = 0.016;
        double totalInterest;

        do {
            System.out.print("Nhập số tền gửi: ");
            money = sc.nextDouble();
            System.out.print("Nhập số tháng gửi: ");
            month = sc.nextInt();

            if (money < 1000 || month <= 0) {
                System.out.println("Số tiền hoặc tháng không hợp lệ, vui lòng nhập lại");
            }
        } while (money < 1000 || month <= 0);

       /* switch (month) {
            case 1:
            case 2:
                interestRate = 0.016 / 12;
                break;
            case 3:
            case 4:
            case 5:
                interestRate = 0.019 / 12;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                interestRate = 0.029 / 12;
                break;
            case 11:
            case 12:
                interestRate = 0.046 / 12;
        }*/

        totalInterest = money * interestRate / 12 * month;

        System.out.println("Số tiền lãi trong " + month + " tháng = " + totalInterest + " VNĐ");

        double totalAmount = money;
        for (int i = 1; i <= month; i++) {
            totalInterest = totalAmount * interestRate / 12;
            totalAmount += totalInterest;
        }
        System.out.println("Tổng tiền lãi sau " + month + " tháng là: " + totalAmount + " VNĐ");

    }
}
