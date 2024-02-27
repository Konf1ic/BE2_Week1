import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {

        String[] students = {"A", "B", "C", "D"};
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter chữ cái:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí chữ cái " + input_name + " trong list là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy" + input_name + " trong list.");
        }
    }
}
