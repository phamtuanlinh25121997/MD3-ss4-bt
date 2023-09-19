package trenLop;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 8, 6, 4, 2};
        // Sắp xếp mảng tăng dần
        Arrays.sort(arr);
        // In ra mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }








//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        while (true) {
//            System.out.println("Menu:");
//            System.out.println("1. Tính tích của 2 số.");
//            System.out.println("2. Tính giai thừa của 1 số.");
//            System.out.println("3. Khai căn và làm tròn tới 3 chữ số sau dấu phẩu.");
//            System.out.println("4. Đếm số ước của 1 số nguyên dương nhập vào");
//            System.out.println("5. Thoát.");
//            System.out.print("Chọn một lựa chọn (1/2/3/4): ");
//
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    B1();
//                    break;
//                case 2:
//                    B2();
//                    break;
//                case 3:
//                    B3();
//                    break;
//                case 4:
//                    B4();
//                    break;
//                case 5:
//                    System.out.println("Ứng dụng kết thúc.");
//                    System.exit(0);
//                default:
//                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
//            }
//        }
//    }
//
//
//    public static void B1() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số T1: ");
//        double s1 = scanner.nextDouble();
//        System.out.print("Nhập số T2: ");
//        double s2 = scanner.nextDouble();
//        double tich = s1 * s2;
//        System.out.println("Tích của 2 số là: " + tich);
//    }
//
//    public static void B2() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số: ");
//        int a = scanner.nextInt();
//        if (a <= 0) {
//            System.out.println("Số âm k có giai thừa");
//        } else {
//            int multi = 1;
//            for (int i = 2; i <= a; i++) {
//                multi *= i;
//            }
//            System.out.println("Giai thừa của số là: " + a);
//        }
//    }
//
//    public static void B3() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập bán kính của hình tròn: ");
//        double soCanTinh = scanner.nextDouble();
//        double ketQua = Math.sqrt(soCanTinh);
//        // Tạo đối tượng DecimalFormat để làm tròn kết quả
//        DecimalFormat decimalFormat = new DecimalFormat("#.###");
//        String ketQuaLamTron = decimalFormat.format(ketQua);
//        System.out.println("Căn bậc hai của " + soCanTinh + " là: " + ketQuaLamTron);
//    }
//
//    private static void B4() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số nguyên dương: ");
//        int soNguyenDuong = scanner.nextInt();
//        scanner.close();
//        int demUoc = 0;
//        for (int i = 1; i <= soNguyenDuong; i++) {
//            if (soNguyenDuong % i == 0) {
//                demUoc++;
//            }
//        }
//        System.out.println("Số ước của " + soNguyenDuong + " là: " + demUoc);
//    }
}
