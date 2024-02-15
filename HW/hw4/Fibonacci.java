package EC;

import java.util.ArrayList;

public class Fibonacci {

	public int findnthNum(int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		int point = 0;

		while (point < n) {
			arr.add(arr.get(point) + arr.get(point + 1));
			point++;

		}

		return arr.get(point);

	}

	public static void main(String[] args) {
		Fibonacci x = new Fibonacci();
		System.out.println(x.findnthNum(13));
	}

}
