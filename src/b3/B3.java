package b3;

import java.util.Arrays;
import java.util.Scanner;

public class B3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Bước 1: Tạo 2 mảng số với kích thước cho trước
//        System.out.print("Nhập kích thước của mảng 1: ");
//        int kichThuoc1 = scanner.nextInt();
//        int[] array1 = new int[kichThuoc1];
//
//        System.out.print("Nhập kích thước của mảng 2: ");
//        int kichThuoc2 = scanner.nextInt();
//        int[] array2 = new int[kichThuoc2];
//
//        // Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng 1
//        System.out.println("Nhập các phần tử của mảng 1:");
//        for (int i = 0; i < kichThuoc1; i++) {
//            System.out.print("Phần tử thứ " + (i + 1) + ": ");
//            array1[i] = scanner.nextInt();
//        }
//
//        // Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng 2
//        System.out.println("Nhập các phần tử của mảng 2:");
//        for (int i = 0; i < kichThuoc2; i++) {
//            System.out.print("Phần tử thứ " + (i + 1) + ": ");
//            array2[i] = scanner.nextInt();
//        }
//
//        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
//        int kichThuoc3 = kichThuoc1 + kichThuoc2;
//        int[] array3 = new int[kichThuoc3];
//
//        // Bước 4: Duyệt và sao chép các phần tử từ mảng 1 sang mảng 3
//        for (int i = 0; i < kichThuoc1; i++) {
//            array3[i] = array1[i];
//        }
//
//        // Bước 5: Duyệt và sao chép các phần tử từ mảng 2 sang mảng 3, tính từ phần tử array3[array2.length]
//        for (int i = 0; i < kichThuoc2; i++) {
//            array3[i + kichThuoc1] = array2[i];
//        }
//
//        // In ra mảng thứ 3 sau khi kết hợp
//        System.out.println("Mảng sau khi kết hợp là:");
//        for (int i = 0; i < kichThuoc3; i++) {
//            System.out.print(array3[i] + " ");
//        }
//
//        scanner.close();
//    }




    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] arr2 = {4,5,6};
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i<arr1.length){
                newArr[i] = arr1[i];
            }else {
                newArr[i] = arr2[i - arr1.length];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
