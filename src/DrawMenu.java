import java.util.Scanner;

public class DrawMenu {
    public static void main ( String[] args ) {
        int choice = -1;
        Scanner input = new Scanner ( System.in );
        while ( choice != 0 ) {
            System.out.println ( "Menu" );
            System.out.println ( "1. Draw hình tam giác" );
            System.out.println ( "2. Draw hình vuông" );
            System.out.println ( "3. Draw hình chữ nhật" );
            System.out.println ( "0. Exit" );
            System.out.println ( "Nhập lựa chọn: " );
            choice = input.nextInt ( );
            switch (choice) {
                case 1:
                    System.out.println ( "Draw hình tam giác" );
                    System.out.println ( "******" );
                    System.out.println ( "*****" );
                    System.out.println ( "****" );
                    System.out.println ( "***" );
                    System.out.println ( "**" );
                    System.out.println ( "*" );
                    break;
                case 2:
                    System.out.println ( "Draw hình vuông" );
                    System.out.println ( "* * * * * *" );
                    System.out.println ( "* * * * * *" );
                    System.out.println ( "* * * * * *" );
                    System.out.println ( "* * * * * *" );
                    System.out.println ( "* * * * * *" );
                    System.out.println ( "* * * * * *" );
                    break;
                case 3:
                    System.out.println ( "Draw hình chữ nhật" );
                    System.out.println ( "* * * * * *" );
                    System.out.println ( "* * * * * *" );
                    System.out.println ( "* * * * * *" );
                    break;
                case 0:
                    System.exit ( 0 );
                default:
                    System.out.println ( "No lựa chọn!" );
            }
        }
    }
}