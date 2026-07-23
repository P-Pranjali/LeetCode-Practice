import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Edge: prerequisite -> course
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }

        // 0 = unvisited
        // 1 = visiting
        // 2 = visited
        int[] state = new int[numCourses];

        // Check every course (handles disconnected graph)
        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) {
                if (hasCycle(i, graph, state)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasCycle(int course, List<List<Integer>> graph, int[] state) {

        // Currently visiting -> cycle found
        if (state[course] == 1) {
            return true;
        }

        // Already processed
        if (state[course] == 2) {
            return false;
        }

        // Mark as visiting
        state[course] = 1;

        // Visit all neighbors
        for (int next : graph.get(course)) {
            if (hasCycle(next, graph, state)) {
                return true;
            }
        }

        // Mark as processed
        state[course] = 2;

        return false;
    }
}
