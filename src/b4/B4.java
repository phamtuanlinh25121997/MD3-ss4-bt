package b4;

import java.util.Scanner;

public class B4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Bước 1: Tìm phần tử lớn nhất của ma trận có sẵn
//        double[][] matrix = {
//                {1.2, 3.4, 0.5},
//                {4.5, 2.1, 6.7},
//                {0.8, 5.6, 7.3}
//        };
//
//        double maxElement = matrix[0][0];
//        int rowIndex = 0;
//        int columnIndex = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] > maxElement) {
//                    maxElement = matrix[i][j];
//                    rowIndex = i;
//                    columnIndex = j;
//                }
//            }
//        }
//
//        System.out.println("Phần tử lớn nhất trong ma trận là " + maxElement +
//                " ở tọa độ [" + rowIndex + "][" + columnIndex + "]");
//
//        // Bước 2: Thu thập đầu vào thực từ nhập liệu của người dùng
//        System.out.print("Nhập số hàng của ma trận: ");
//        int numRows = scanner.nextInt();
//        System.out.print("Nhập số cột của ma trận: ");
//        int numColumns = scanner.nextInt();
//
//        double[][] userMatrix = new double[numRows][numColumns];
//
//        // Nhập các giá trị cho ma trận từ người dùng
//        System.out.println("Nhập các phần tử của ma trận:");
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < numColumns; j++) {
//                System.out.print("Nhập giá trị cho phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
//                userMatrix[i][j] = scanner.nextDouble();
//            }
//        }
//
//        // In ra ma trận được tạo từ nhập liệu của người dùng
//        System.out.println("Ma trận từ nhập liệu của người dùng:");
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < numColumns; j++) {
//                System.out.print(userMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }

    public static void main(String[] args) {
        int[] array = {5, 6, 56, 6, 2, 45, 62, 45, 6, 2, 5, 6, 2, 4, 5, 2};

        // Khởi tạo giá trị lớn nhất và nhỏ nhất
        int max = array[0];
        int min = array[0];

        // Duyệt qua mảng để tìm giá trị lớn nhất và nhỏ nhất
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Cập nhật giá trị lớn nhất
            }
            if (array[i] < min) {
                min = array[i]; // Cập nhật giá trị nhỏ nhất
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }

}
