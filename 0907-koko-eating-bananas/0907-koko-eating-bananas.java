class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt(); // what's the max possible speed we'd ever need?
        int answer = right; // fallback

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (feasible(piles, h, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private boolean feasible(int[] piles, int h, int k) {
        long totalHours = 0; 
        for (int p : piles) {
            totalHours += (p + k -1) /k; // hours needed for this one pile, using the ceiling trick
        }
        return totalHours <= h; // what comparison means "she finishes in time"?
    }
}