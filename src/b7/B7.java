package b7;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {


//        // Khởi tạo mảng 2 chiều
//        int[][] arrD = {{1, 2, 3}, {121, 54, 465}, {651, 41653, 165}};
//        // tính tổng số trong mảng 2 chiều
//        int sum = 0;
//        for (int i = 0; i < arrD.length; i++) {
//            for (int j = 0; j < arrD.length; j++) {
//                sum += arrD[i][j];
//            }
//        }
//        System.out.println("Tổng số của mảng 2 chiều là :" + sum);








        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của ma trận vuông có sẵn
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = tinhTongMaTran(matrix);

        System.out.println("Tổng các phần tử của ma trận là: " + sum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng
        System.out.print("Nhập kích thước của ma trận (số hàng và cột): ");
        int size = scanner.nextInt();

        int[][] userMatrix = new int[size][size];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị cho phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        // In ra ma trận được tạo từ nhập liệu của người dùng
        System.out.println("Ma trận từ nhập liệu của người dùng:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Phương thức tính tổng các phần tử của ma trận vuông
    public static int tinhTongMaTran(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
