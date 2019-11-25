package com.luosk.leetcode;

public class Q043_MultiplyStrings {
    public String multiply(String num1, String num2) {
        return multiply_01(num1, num2);
    }

    private String multiply_01(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "0";
        }
        int[] digits = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; --i) {
            for (int j = num2.length() - 1; j >= 0; --j) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = product + digits[i + j + 1];
                digits[i + j + 1] = sum % 10;
                digits[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0 && sb.length() == 0) {
                continue;
            }
            sb.append(digits[i]);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

}
