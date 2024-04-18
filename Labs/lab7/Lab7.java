package Labs;

public class Lab7 {

	public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
		int[][] dist = new int[n][n];
		for (int i = 0; i < dist.length; i++) {
			for (int j = 0; j < dist[i].length; j++) {
				dist[i][j] = Integer.MAX_VALUE / 2;
			}
		}
		for (int[] edge : edges) {
			dist[edge[0]][edge[1]] = edge[2];
			dist[edge[1]][edge[0]] = edge[2];
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (dist[i][j] > dist[i][k] + dist[k][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			dist[i][i] = 0;
		}

		int minReachable = n + 1;
		int maxCity = -1;
		for (int i = 0; i < n; i++) {
			int reachable = 0;
			for (int j = 0; j < n; j++) {
				if (dist[i][j] <= distanceThreshold) {
					reachable++;
				}
			}
			if (reachable <= minReachable) {
				minReachable = reachable;
				maxCity = Math.max(maxCity, i);
			}
		}
		return maxCity;
	}

	public static void main(String[] args) {
		int n1 = 4;
		int[][] edges1 = { { 0, 1, 3 }, { 1, 2, 1 }, { 1, 3, 4 }, { 2, 3, 1 } };
		int distanceThreshold1 = 4;
		System.out.println(findTheCity(n1, edges1, distanceThreshold1));

		int n2 = 5;
		int[][] edges2 = { { 0, 1, 2 }, { 0, 4, 8 }, { 1, 2, 3 }, { 1, 4, 2 }, { 2, 3, 1 }, { 3, 4, 1 } };
		int distanceThreshold2 = 2;
		System.out.println(findTheCity(n2, edges2, distanceThreshold2));
	}
}
