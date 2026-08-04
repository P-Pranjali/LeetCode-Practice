class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert '0'/'1' to 0/1
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert '0'/'1' to 0/1
                j--;
            }

            sb.append(sum % 2); // Current binary digit
            carry = sum / 2;    // Carry for next iteration
        }

        return sb.reverse().toString();
    }
}