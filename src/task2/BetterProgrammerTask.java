package task2;

public class BetterProgrammerTask {

    public static int getCountOfOnes(int n) {
        /*
         Please implement this method to
         return the number of '1's in the binary representation of n
         for any integer n, where n > 0

         Example: for n=6 the binary representation is '110' and the number of '1's in that
         representation is 2

        */

        return Integer.toBinaryString(n).replace("0", "").length();
    }
}



