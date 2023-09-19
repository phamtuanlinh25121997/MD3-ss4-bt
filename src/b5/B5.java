package b5;

import java.util.Scanner;

public class B5 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
//        System.out.print("Nhập kích thước của mảng: ");
//        int SIZE = scanner.nextInt();
//        int[] array = new int[SIZE];
//
//        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
//        System.out.println("Nhập các phần tử của mảng:");
//        for (int i = 0; i < SIZE; i++) {
//            System.out.print("Phần tử thứ " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//        }
//
//        // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
//        int min = array[0];
//
//        // Bước 4: Duyệt mảng để tìm giá trị nhỏ nhất
//        for (int i = 1; i < SIZE; i++) {
//            if (array[i] < min) {
//                min = array[i]; // Cập nhật giá trị nhỏ nhất
//            }
//        }
//
//        // Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất
//        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
//
//        scanner.close();
//    }

    public static void main(String[] args) {
        int[] arr ={3,546,161,316,3156,151,15,131};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        System.out.println("Giá trị lớn nhất trong mảng là:" + max);
    }
}
