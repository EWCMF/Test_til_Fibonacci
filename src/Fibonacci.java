public class Fibonacci {
    // metodenavn bestemt af test.
    static int beregn(int x) {
        // Testen har specificeret at den hverken må være 0 eller med negative tal.
        if (x > 0) {
            int result = 0;
            for (int i = 0; i <= x; i++) {
                // Stil spørgsmål til András da denne ikke giver de sædvanlige fibonacci tal som man kender dem
                result = result + i;
            }
            return result;
        }
        return -1;
    }
}
