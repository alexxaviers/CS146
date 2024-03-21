package HW;

public class HW11 {

	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if (image[sr][sc] == color) {
			return image;
		}

		else {
			fill(image, sr, sc, image[sr][sc], color);
			return image;

		}

	}

	public void fill(int[][] image, int sr, int sc, int org, int color) {
		if (sr >= 0 && sc >= 0 && sr < image.length) {
			if (sc < image[0].length && image[sr][sc] == org) {
				image[sr][sc] = color;

				fill(image, sr - 1, sc, org, color);
				fill(image, sr + 1, sc, org, color);
				fill(image, sr, sc - 1, org, color);
				fill(image, sr, sc + 1, org, color);

			}

		}
	}

	public static void printImage(int[][] image) {
		for (int[] row : image) {
			for (int pixel : row) {
				System.out.print(pixel + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		HW11 x = new HW11();
		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int sr = 1;
		int sc = 1;
		int newColor = 2;

		System.out.println("Original Image:");
		printImage(image);
		System.out.println();

		int[][] filledImage = x.floodFill(image, sr, sc, newColor);

		System.out.println("Image after flood fill:");
		printImage(filledImage);

	}

}
