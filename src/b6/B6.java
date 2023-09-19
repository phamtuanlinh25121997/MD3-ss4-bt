package b6;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {

//        int[][] arrD = {{1, 2, 3}, {2, 3, 5}, {7, 9, 25}};
//        int Colum = 1;
//        int sum = 0;
//        for (int i = 0 ; i < arrD.length;i++){
//            sum+= arrD[i][Colum];
//        }
//        System.out.println("Tổng số của cột" + Colum + "là: " + sum );

        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một cột trong mảng có sẵn
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Nhập số cột bạn muốn tính tổng: ");
        int columnIndex = scanner.nextInt();
        int sum = tinhTongCot(matrix, columnIndex);

        System.out.println("Tổng các phần tử của cột " + columnIndex + " là: " + sum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng
        System.out.print("Nhập số hàng của mảng: ");
        int numRows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int numColumns = scanner.nextInt();

        int[][] userMatrix = new int[numRows][numColumns];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print("Nhập giá trị cho phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        // In ra mảng được tạo từ nhập liệu của người dùng
        System.out.println("Mảng từ nhập liệu của người dùng:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Phương thức tính tổng các phần tử của một cột trong mảng
    public static int tinhTongCot(int[][] matrix, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (columnIndex >= 0 && columnIndex < matrix[i].length) {
                sum += matrix[i][columnIndex];
            }
        }
        return sum;
    }
}
