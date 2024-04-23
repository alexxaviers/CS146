package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW12 {
	class OptimizeWaterDistribution {
		public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
			List<EdgeCost> costs = new ArrayList<>();

			for (int i = 1; i <= n; i++) {
				costs.add(new EdgeCost(0, i, wells[i - 1]));
			}
			for (int[] p : pipes) {
				costs.add(new EdgeCost(p[0], p[1], p[2]));
			}

			Collections.sort(costs);
			int min = 0;

			UnionFind disjointSet = new UnionFind(n);
			for (EdgeCost edge : costs) {
				int rootX = disjointSet.find(edge.node1);
				int rootY = disjointSet.find(edge.node2);
				if (rootX == rootY)
					continue;
				min += edge.cost;
				disjointSet.union(edge.node1, edge.node2);
				n--;
				if (n == 0) {
					return min;
				}
			}
			return min;
		}

		class EdgeCost implements Comparable<EdgeCost> {
			int node1;
			int node2;
			int cost;

			public EdgeCost(int node1, int node2, int cost) {
				this.node1 = node1;
				this.node2 = node2;
				this.cost = cost;
			}

			@Override
			public int compareTo(EdgeCost o) {
				return this.cost - o.cost;
			}
		}

		class UnionFind {
			int[] parent;
			int[] rank;

			public UnionFind(int n) {
				parent = new int[n + 1];
				for (int i = 0; i <= n; i++) {
					parent[i] = i;
				}
				rank = new int[n + 1];
			}

			public int find(int x) {
				return x == parent[x] ? x : find(parent[x]);
			}

			public void union(int x, int y) {
				int parentx = find(x);
				int parenty = find(y);
				if (parentx == parenty)
					return;
				if (rank[parentx] >= rank[parenty]) {
					parent[parenty] = parentx;
					rank[parentx] += rank[parenty];
				} else {
					parent[parentx] = parenty;
					rank[parenty] += rank[parentx];
				}
			}
		}
	}

	public static void main(String[] args) {
		HW12 hw12 = new HW12();
		HW12.OptimizeWaterDistribution optimizer = hw12.new OptimizeWaterDistribution();

		int n1 = 2;
		int[] wells1 = { 1, 1 };
		int[][] pipes1 = { { 1, 2, 1 }, { 1, 2, 2 } };
		System.out.println("Minimum Cost for Test Case 1: " + optimizer.minCostToSupplyWater(n1, wells1, pipes1));

		int n2 = 4;
		int[] wells2 = { 2, 3, 5, 7 };
		int[][] pipes2 = { { 1, 2, 1 }, { 1, 3, 2 }, { 2, 4, 4 }, { 3, 4, 3 } };
		System.out.println("Minimum Cost for Test Case 2: " + optimizer.minCostToSupplyWater(n2, wells2, pipes2));

		int n3 = 6;
		int[] wells3 = { 1, 3, 2, 4, 5, 6 };
		int[][] pipes3 = { { 1, 2, 3 }, { 2, 3, 5 }, { 1, 3, 2 }, { 4, 5, 1 }, { 5, 6, 4 }, { 4, 6, 2 } };
		System.out.println("Minimum Cost for Test Case 3: " + optimizer.minCostToSupplyWater(n3, wells3, pipes3));
	}
}
