package task4;


public class BetterProgrammerTask {

    public static int countWaysToJump(int N) {
        /*
          A set of stairs has N steps.
          You can jump either 1 or 2 steps at a time.
          For example, if the stairs is N=4 steps, you can reach the end in 5 possible ways:
          1-1-1-1, or 1-2-1 or 1-1-2 or 2-1-1 or 2-2
          Please implement this method to
          return the count of the different ways to reach the end of the stairs with N steps.
         */

        int[] vars = {2, 1};

        return getSteps(N, vars, vars.length - 1);
    }

    private static int getSteps(int steps, int[] vars, int n) {
        if (steps == 0 || n == 0) return 1;
        if (steps < 0 || n < 0) return 0;
        return getSteps(steps, vars, n - 1) + getSteps(steps - vars[n], vars, n);
    }
}