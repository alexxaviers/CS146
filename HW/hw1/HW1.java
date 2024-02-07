package HW;

public class HW1 {
	private String word;

	public HW1(String s) {
		word = s;

	}

	public boolean isPalindrome() {
		String lower = word.toLowerCase();
		String rev = "";
		for (int i = lower.length() - 1; i >= 0; i--) {
			rev += lower.charAt(i);
		}

		if (rev.equals(lower)) {
			return true;
		}

		else {
			return false;

		}

	}

	public static void main(String[] args) {
		String word = "racecaRasd";
		HW1 x = new HW1(word);
		System.out.println(x.isPalindrome());

	}

}
