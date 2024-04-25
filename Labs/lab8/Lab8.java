package Labs;

public class Lab8 {

	public int coinChange(int[] coins, int amount) {
		int[] dynap = new int[amount + 1];
		for (int i = 1; i <= amount; i++) {
			dynap[i] = Integer.MAX_VALUE;
		}

		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (i - coins[j] >= 0 && dynap[i - coins[j]] != Integer.MAX_VALUE)
					dynap[i] = Math.min(dynap[i], 1 + dynap[i - coins[j]]);
			}
		}
		if (dynap[amount] == Integer.MAX_VALUE) {
			return -1;
		}
		return dynap[amount];
	}

	public static void main(String[] args) {
		Lab8 solution = new Lab8();

		int[] coins1 = { 1, 2, 5 };
		int amount1 = 11;
		System.out.println(solution.coinChange(coins1, amount1));

		int[] coins2 = { 2 };
		int amount2 = 3;
		System.out.println(solution.coinChange(coins2, amount2));

		int[] coins3 = { 1 };
		int amount3 = 0;
		System.out.println(solution.coinChange(coins3, amount3));

		int[] coins4 = { 1 };
		int amount4 = 1;
		System.out.println(solution.coinChange(coins4, amount4));

		int[] coins5 = { 1 };
		int amount5 = 2;
		System.out.println(solution.coinChange(coins5, amount5));
	}

}
