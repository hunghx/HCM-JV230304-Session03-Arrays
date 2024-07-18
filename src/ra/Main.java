package ra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Arrays trong java
        // Thanh phần : chỉ số (index) và phần tử (element)

        // Các đặc điểm của mảng :
        // - Là 1 biến
        // - lưu trữ các phần tử cùng kiểu
        // - có kích thước cố định lúc khai báo và khởi tạo;
        // - các phần tử trong mảng được lưu trữ trong ô nhớ liền kề


        // cách khai báo và khởi tạo giá trị
        // cách 1
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // các phần tử ban đâ bằng 0
        System.out.println(Arrays.toString(arrayInt));

        // có 2 loại mảng : 1 chiều và nhiều chiều
        // mẩng 1 chiều là mảng chứa các phần tử theo 1 chỉ mục
        // truy xuất pần tử đầu tiên của mảng
        System.out.println("ptu dau tien " + arr[0]);

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        int[] pt2 = arr2D[1]; // lâ ra mảng tứ 2 trong mảng arr2D
        int so5 = arr2D[1][1]; // laays số 5 trong man mảng ra
        int so3 = arr2D[0][2];

        int[][][][] array4D = {
                {
                        {
                                {1, 2, 3},
                                {4, 5, 6}
                        }
                },
                {
                        {
                                {7, 8, 9},
                                {10, 11, 12}
                        }

                }
        };
        int so9 = array4D[1][0][0][2];
        System.out.println(so9);

        // thực hiện các logic thêm , sửa, xóa với mảng
        System.out.println(" thực hiện chương trình ");
        while (true) {
            System.out.println("--------------Menu-------------");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm mới");
            System.out.println("3. Xóa");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn");
            byte choice = new Scanner(System.in).nextByte();
            switch (choice) {
                case 1:
                    System.out.println(Arrays.toString(NumberManager.arrayInt));
                    break;
                case 2:
                    int random = new Random().nextInt(1000);
                    NumberManager.addInt(random);
                    break;
                case 3:
                    System.out.println("Nhập index cần xóa");
                    int index = new Scanner(System.in).nextInt();
                    NumberManager.removeInt(index);
                    break;
                case 4:
                   System.exit(0);
                default:
            }
        }
    }
}