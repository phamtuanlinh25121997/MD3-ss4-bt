package b2;

import java.util.Arrays;
import java.util.Scanner;

public class B2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử
//        System.out.print("Nhập số phần tử của mảng: ");
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//
//        System.out.println("Nhập các phần tử của mảng:");
//        for (int i = 0; i < N; i++) {
//            System.out.print("Phần tử thứ " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//        }
//
//        // Bước 2: Nhập X là phần tử cần xoá
//        System.out.print("Nhập phần tử cần xoá (X): ");
//        int X = scanner.nextInt();
//
//        // Bước 3: Tìm X trong mảng và chỉ ra vị trí của X
//        int index_del = -1;
//        for (int i = 0; i < N; i++) {
//            if (array[i] == X) {
//                index_del = i;
//                break; // Khi tìm thấy X, thoát khỏi vòng lặp
//            }
//        }
//
//        if (index_del != -1) {
//            // Bước 4: Xoá phần tử X khỏi mảng
//            for (int i = index_del; i < N - 1; i++) {
//                array[i] = array[i + 1];
//            }
//            N--; // Giảm số phần tử đi 1
//
//            // Bước 5: In ra mảng sau khi xoá
//            System.out.println("Mảng sau khi xoá phần tử " + X + " là:");
//            for (int i = 0; i < N; i++) {
//                System.out.print(array[i] + " ");
//            }
//        } else {
//            System.out.println(X + " không xuất hiện trong mảng.");
//        }
//
//        scanner.close();
//    }




    public static void main(String[] args) {
        // Khai báo mảng
        int[] arr = {2, 3, 5, 6, 5, 6, 6, 5};
        for(int i = 0; i < arr.length -1  ; i ++ )
            for(int j = i+ 1; j < arr.length; j ++)
                if(arr[i] >= arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        int max = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0  ; i -- ){
            if(arr[i] < max){
                System.out.println("max 2 :" + arr[i]);
                break;
            }
        }
        System.out.println("max 1 :" + max);
        System.out.println(Arrays.toString(arr));
    }
}
