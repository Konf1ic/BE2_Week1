import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {

        int size;

        int[] array;

        Scanner scanner = new Scanner (System.in);
        do {
            System.out.print("Nhập độ dài mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Độ dài mảng ko đc vượt quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Mảng là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Số lớn nhất trong mảng là " + max + " ,ở vị trí " + index);
    }
}
