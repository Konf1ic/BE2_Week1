public class PrintPrimeUsingWhile {
    public static void main ( String[] args ) {

        int count = 0;
        int i = 2;

        // Vòng lặp while in 20 số nguyên tố đầu tiên
        while ( count < 20 ) {
            if ( isPrime ( i ) ) {
                System.out.println ( i );
                count++;
            }
            i++;
        }
    }

    // Hàm kiểm tra số nguyên tố
    static boolean isPrime ( int n ) {
        if ( n <= 1 ) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt ( n ); j++) {
            if ( n % j == 0 ) {
                return false;
            }
        }
        return true;
    }
}