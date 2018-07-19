/*
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/
public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int alen = a.length();
        int blen = b.length();
        int sum = 0;
        int i = 1;
        while (i <= alen || i <= blen) {
        	sum = carry;
            if (i <= alen) sum += a.charAt(alen - i) - '0';
        	if (i <= blen) sum += b.charAt(blen - i) - '0';
        	sb.append(sum % 2);
        	carry = sum / 2;
        	i++;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }