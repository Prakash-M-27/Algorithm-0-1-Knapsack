import java.util.*;

public class KnapsackDP {

    // Function to solve 0/1 Knapsack using DP
    public static int knapsack(int[] weights, int[] values, int capacity, int n) {

        // DP table
        int[][] dp = new int[n + 1][capacity + 1];

        // Build table dp[][] in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {

                if (i == 0 || w == 0) {
                    dp[i][w] = 0; // Base case
                }
                else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        values[i - 1] + dp[i - 1][w - weights[i - 1]], // include item
                        dp[i - 1][w] // exclude item
                    );
                }
                else {
                    dp[i][w] = dp[i - 1][w]; // cannot include item
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        System.out.print("Enter capacity of knapsack: ");
        int capacity = sc.nextInt();

        int result = knapsack(weights, values, capacity, n);

        System.out.println("Maximum value = " + result);

        sc.close();
    }
}
