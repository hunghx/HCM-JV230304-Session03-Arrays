package ra;

public class NumberManager {
    public static int[] arrayInt = new int[10];
    public static int size = 0;

    public static void addInt(int number){
        // logic đe them vao mảng
        // nếu như mảng đầy thì tăng kích thước mảng them 10
        if (size == arrayInt.length){
            // đã đày , nới rộng mảng thêm 10
            int[] newArray = new int[size+10];
            // copy các ptu mảng cũ sang mới
            for (int i = 0; i < arrayInt.length; i++) {
                newArray[i] = arrayInt[i];
            }
            //   System.arraycopy(arrayInt, 0, newArray, 0, arrayInt.length);
            arrayInt = newArray; // cập nhật mảng mới
        }
        // 1,2,4,
        arrayInt[size++] = number;
//        size++; // tăng kích thuớc len 1
    }

    public static void removeInt(int index){ // xoa theo vị trí
        // 1,2,5,6,6
        if (index<0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("chỉ số ko hợp lệ");
        }
        for (int i = index; i < size - 1; i++) {
            arrayInt[i] = arrayInt[i+1];
        }
        arrayInt[size - 1] = 0;
        size--;
    }
    // sửa và hiển thị
}
