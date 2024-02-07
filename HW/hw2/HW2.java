package HW;

public class HW2 {

	public static boolean isBadVersion(int x) {
		if (x == 8 || x == 9 || x == 10) {
			return true;

		} else {
			return false;
		}

	}

	public int indexOffirstBadVersion(int[] arr) {
		int startIndex = 0;
		int endIndex = arr.length - 1;

		while (startIndex < endIndex) {
			int mid = startIndex + (endIndex - startIndex) / 2;

			if (isBadVersion(arr[mid])) {
				return mid;
			}

			if (mid + 1 < arr.length && !isBadVersion(arr[mid + 1])) {
				startIndex = mid + 1;
			}

			else {
				endIndex = mid - 1;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		HW2 x = new HW2();
		System.out.println(x.indexOffirstBadVersion(arr));
	}

}
