package b9;

import java.util.Arrays;

public class B9 {
//    Tìm phần tử lớn thứ 2 trong Mảng

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 8, 6, 4, 2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length-2]);
            break;
        }


//        int max1 = Integer.MIN_VALUE; // Giá trị lớn nhất
//        int max2 = Integer.MIN_VALUE; // Giá trị lớn thứ hai
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max1) {
//                max2 = max1; // Cập nhật max2 thành max1
//                max1 = arr[i]; // Cập nhật max1 thành giá trị mới lớn nhất
//            } else if (arr[i] > max2 && arr[i] != max1) {
//                max2 = arr[i]; // Cập nhật max2 thành giá trị mới lớn thứ hai
//            }
//        }
//        if (max2 != Integer.MIN_VALUE) {
//            System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
//        } else {
//            System.out.println("Không có phần tử lớn thứ hai trong mảng.");
//        }
    }
}
