package b8;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
//        Đếm số lần xuất hiện của ký tự trong chuỗi



        Scanner scanner = new Scanner(System.in);
        // Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        // Bước 2: Khai báo một biến ký tự và gán giá trị hoặc nhập từ bàn phím
        System.out.print("Nhập ký tự cần đếm: ");
        char kyTuCanDem = scanner.next().charAt(0);

        // Bước 3: Khai báo biến count và gán giá trị 0, để lưu số ký tự đếm được trong chuỗi
        int count = 0;

        // Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi và đếm số lần xuất hiện
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTuCanDem) {
                count++;
            }
        }

        // Bước 5: In ra giá trị biến đếm
        System.out.println("Số lần xuất hiện của ký tự '" + kyTuCanDem + "' trong chuỗi là: " + count);

        scanner.close();
    }
}
