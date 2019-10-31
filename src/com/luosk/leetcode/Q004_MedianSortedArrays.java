package com.luosk.leetcode;


// todo: review
public class Q004_MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return findMedianSortedArrays_01(nums1, nums2);
    }

    private double findMedianSortedArrays_01(int[] nums1, int[] nums2) {
        double result = 0.0;
        int length = nums1.length + nums2.length;

        if (length % 2 == 0) {
            return (findKthNumbers(nums1, 0, nums2, 0, length / 2)
                    + findKthNumbers(nums1, 0, nums2, 0, length / 2 + 1)) / 2.0;
        } else {
            return findKthNumbers(nums1, 0, nums2, 0, length / 2 + 1);
        }
    }

    private double findKthNumbers(int[] nums1, int start1, int[] nums2, int start2, int k) {
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }

        if (start2 >= nums2.length) {
            return nums2[start1 + k - 1];
        }

        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int key1 = start1 + k / 2 - 1 < nums1.length ? nums1[start1 + k / 2- 1] : Integer.MAX_VALUE;
        int key2 = start2 + k / 2 - 1 < nums2.length ? nums2[start2 + k / 2 - 1] : Integer.MAX_VALUE;

        if (key1 < key2) {
            return findKthNumbers(nums1, start1 + k / 2, nums2, start2, k - k / 2);
        } else {
            return findKthNumbers(nums1, start1, nums2, start2 + k / 2, k - k / 2);
        }
    }

    private double findMedianSortedArrays_02(int[] nums1, int[] nums2) {
        return 0;
    }
}
