package HW;

import java.util.HashMap;

public class HW8 {

	public int longestPalindrome(String s) {
		char[] charArr = s.toCharArray();
		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
		int total = 0;
		int largestOdd = 0;

		for (int i = 0; i < charArr.length; i++) {
			if (!charCounts.containsKey(charArr[i])) {
				charCounts.put(charArr[i], 1);
			} else {
				charCounts.put(charArr[i], charCounts.get(charArr[i]) + 1);

			}

		}

		for (Character c : charCounts.keySet()) {
			if ((charCounts.get(c) % 2) == 0) {
				total += charCounts.get(c);
			}

			if ((charCounts.get(c) % 2) != 0 && charCounts.get(c) > largestOdd) {
				largestOdd = charCounts.get(c);

			}

		}
		return total + largestOdd;

	}

	public static void main(String[] args) {
		HW8 x = new HW8();
		System.out.println(x.longestPalindrome("abccccdd"));
	}

}
