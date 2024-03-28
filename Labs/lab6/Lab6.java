package Labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Lab6 {

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		for (int i = 0; i < numCourses; i++) {
			graph.add(i, new ArrayList<Integer>());
		}

		for (int i = 0; i < prerequisites.length; i++) {

			if (prerequisites[i][0] == prerequisites[i][1]) {
				return false;
			}

			graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
		}

		Queue<Integer> queueOfCourses = new ConcurrentLinkedQueue<Integer>();
		int processed = 0;

		while (processed != numCourses) {
			for (int i = 0; i < graph.size(); i++) {
				if (graph.get(i).size() == 0) {
					queueOfCourses.add(i);
				}
			}

			if (queueOfCourses.isEmpty()) {
				return false;
			}

			while (!queueOfCourses.isEmpty()) {
				Integer curr = queueOfCourses.poll();
				graph.get(curr).add(numCourses + 1);
				processed++;

				for (int i = 0; i < graph.size(); i++) {
					for (int j = 0; j < graph.get(i).size(); j++) {
						if (graph.get(i).get(j) == curr) {
							graph.get(i).remove(j);
						}
					}

				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] array1 = { { 1, 0 }, { 0, 1 } };
		int[][] array2 = { { 1, 0 } };

		System.out.println(canFinish(3, array1));
		System.out.println(canFinish(3, array2));

	}
}
