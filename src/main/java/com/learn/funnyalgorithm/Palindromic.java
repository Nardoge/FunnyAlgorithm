package com.learn.funnyalgorithm;

public class Palindromic {

    public static void main(String[] args) {

        System.out.println(isBinaryPalindromic(0b11011));
        System.out.println(isBinaryPalindromic(0b1101_1111_1111_1111_1111_1111_1111_1011));
        System.out.println(isOctPalindromic(035753));
        System.out.println(isHexPalindromic(0xa7a));
        System.out.println(isHexPalindromic(0xa73637a));
    }

    public static boolean isDecPalindromic(final int num) {
        if (num < 11) {
            return false;
        }
        int reverse = 0;
        int origin = num;
        while (origin > 0) {
            reverse = reverse * 10 + origin % 10;
            origin /= 10;
        }
        return reverse == num;
    }

    public static boolean isBinaryPalindromic(int num) {
        return isBitsPalindromic(num, 1);
    }

    public static boolean isOctPalindromic(int num) {
        return isBitsPalindromic(num, 3);
    }

    public static boolean isHexPalindromic(int num) {
        return isBitsPalindromic(num, 4);
    }

    private static boolean isBitsPalindromic(int num, int bits) {
        int mask = (1 << bits) - 1;
        if ((num & mask) == 0) {
            return false;
        }
        int reverse = 0;
        int origin = num;
        while (origin != 0) {
            reverse = (reverse << bits) | (origin & mask);
            origin >>>= bits;
        }
        return reverse == num;
    }
}