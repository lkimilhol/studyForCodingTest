package com.company.etc.ya20240411;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * It is examination time at a university with n students. The examination of the h student is conducted from time startli]to end i], where 0 si < n. All the students take the examination in the same room, so an invigilator is assigned to the room to prevent cheating. According to the university, the students will not be able to cheat if there are fewer than k students in the class, even without an invigilator. The invigilator is in the room only if required, i.e. the number of students in the room is greater than or equal to k.
 *
 * Given q queries in the form q_start[il, q_end[il, (0 < i < q) where q_start[i] and q_end[i] are starting and ending times, for each query, find the amount of time the invigilator should be present in the room to prevent the students from cheating.
 *
 * User
 * At time = 1, student 1 starts the exam, only student 1 is present.
 * At time = 2, student 3 starts the exam, student 1 is still in the room. There
 * are 2 students in the room.
 * There are 2 instants in between times 1 and 4 when the number of students is 2 or more, times 2 and 3. The invigilator has to be in the room for 2 units of time.
 * There are 2 instants in between times 3 and 6 when the number of students is 2 or more, times 3 and 5. The invigilator has to be in the room for 2 units of time.
 *
 * Function Description
 * Complete the function minTime in the editor below. The function must return an array of integers, representing the answer to each query, and the time for which the invigilator has to be in the examination room.
 * minTime has the following parameter(s):
 * int start[n]: the examination start times for each student int end[n]: the examination end times for each student int q_start[q]: the start times for each query int q_end[q]: the end times for each query
 * int k. the minimum number of students that require an invigilator's presence
 */
public class Test2 {
    public static List<Integer> minTime(List<Integer> start, List<Integer> end, List<Integer> q_start, List<Integer> q_end, int k) {
        List<Integer> result = new ArrayList<>();

        List<Map<Integer, Integer>> students = new ArrayList<>();

        for (int i = 0; i < start.size(); i++) {
            Map<Integer, Integer> temp = new HashMap<>();
            temp.put(start.get(i), end.get(i));

            students.add(temp);
        }


        for (int i = 0; i < q_start.size(); i++) {
            for (int j = q_start.get(i); j < q_end.get(i); j++) {
            }
        }


        return result;
    }
}
