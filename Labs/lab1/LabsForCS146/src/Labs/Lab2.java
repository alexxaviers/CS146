package Labs;

import java.util.Arrays;
import java.util.HashMap;

public class Lab2 {
	private String s;
	private String t;

	public Lab2(String frist, String second) {
		s = frist;
		t = second;

	}

	public boolean isAnagramSort() {

		char[] sChars = s.toLowerCase().toCharArray();
		char[] tChars = t.toLowerCase().toCharArray();

		Arrays.sort(sChars);
		Arrays.sort(tChars);

		return Arrays.equals(sChars, tChars);

	}

	public boolean isAnagramHash() {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Integer> mapOfLetCounts = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			mapOfLetCounts.put(s.charAt(i), count++);

		}

		return false;

	}

	public static void main(String[] args) {
		String word1 = "bad";
		String word2 = "Dab";

		Lab2 x = new Lab2(word1, word2);
		System.out.println(x.isAnagramSort());
	}

}
