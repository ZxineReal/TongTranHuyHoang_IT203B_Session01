package baitap;

import java.util.Scanner;

public class Bai1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập năm sinh của bạn: ");
            String yearStr = sc.nextLine();

            int year = Integer.parseInt(yearStr);
            int age = 2026 - year;
            System.out.println("Tuổi của bạn là: " + age);
        }
        catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập năm sinh bằng số");
        } finally {
            sc.close();
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }
    }
}
