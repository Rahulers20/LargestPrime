public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number > 0) {
            for(int i = 2; i <= number; i++) {
                while((number % i == 0) && (number != i)) {
                    number /= i;
                }
            }return number;
        } return -1;
    }
}
