package HW;

import java.util.Arrays;

public class HW7 {

	public int minMeetingRooms(int[][] intervals) {
		int[] start = new int[intervals.length];
		int[] end = new int[intervals.length];

		for (int i = 0; i < intervals.length; i++) {
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
		}

		Arrays.sort(start);
		Arrays.sort(end);

		int serverCount = 0;
		int serverIterator = 0;

		for (int i = 0; i < start.length; i++) {
			if (start[i] < end[serverIterator])
				serverCount++;
			else
				serverIterator++;
		}
		return serverCount;
	}

	public static void main(String[] args) {
		int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		HW7 x = new HW7();
		System.out.println(x.minMeetingRooms(intervals));
	}

}
