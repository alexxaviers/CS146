```
The algorithm I used finds out when there are collisions within the schedule. 
It sorts the start and end times from least to greatest from the intervals.
If the start time is less than the end time, then there is a server being active, so another one needs to be used,
but if the start time is longer than the end time, then the previous server is done, and a new one is unnecessary.
We increment the server count when necessary and return it in the end.

```
