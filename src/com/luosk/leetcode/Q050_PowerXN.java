package com.luosk.leetcode;

public class Q050_PowerXN {
    public double myPow(double x, int n) {
        return myPow_01(x, n);
    }

    private double myPow_01(double x, int n) {
        return (n >= 0 ? pow(x, n) : 1.0 / pow(x, -n));
    }

    private double pow(double x, int n) {
        if (n == 0) { return 1; }
        double y = pow(x, n / 2);
        return (n % 2 == 0 ? y * y : y * y * x);
    }
}
