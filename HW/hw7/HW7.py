'''
Created on Feb 26, 2024

@author: alexxavier
'''
from typing import List

class HW6:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        start = [interval[0] for interval in intervals]
        end = [interval[1] for interval in intervals]

        start.sort()
        end.sort()

        server_count = 0
        server_iterator = 0

        for i in range(len(start)):
            if start[i] < end[server_iterator]:
                server_count += 1
            else:
                server_iterator += 1

        return server_count
    

intervals = [[0, 30], [5, 10], [15, 20]]
HW6 = HW6()
print(HW6.minMeetingRooms(intervals))
    

    