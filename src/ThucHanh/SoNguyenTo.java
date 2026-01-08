package ThucHanh;

import java.util.Scanner;


public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập 1 số để kiểm tra xem có phải số nguyên tố hay không: ");
        int number = input.nextInt();

        while (true) {
            boolean check = true;

            if (number < 2) {

                check = false;
            }
            else {
                int i = 2;

                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
            }
            if (check) {
                System.out.println(number + " là số nguyên tố");
                break;
            }
            else {
                System.out.print(number + " không phải số nguyến tố, vui lòng nhập lại: ");
                number = input.nextInt();
            }
        }
    }
}
