package com.learn.funnyalgorithm;

/**
 *如果把某个数的各个数字按相反的顺序排列，得到的数和原来的数相同，则这个数就是“回文数”。譬如 123454321 就是一个回文数。

 求用十进制、二进制、八进制表示都是回文数的所有数字中，大于十进制数 10 的最小值。 增加限制:二进制不补0
 */
public class Questtion1 {

    public static void main(String[] args) {

        //--------------------------------------很大气版本begin----------------------------------------------------
        int num = 11;
        while (true) {
            String numTenStr = String.valueOf(num);
            StringBuilder numTenStrSB = new StringBuilder(numTenStr);

            String numTwoStr = Integer.toBinaryString(num);
            StringBuilder numTwoStrSB = new StringBuilder(numTwoStr);

            String numEghStr = Integer.toOctalString(num);
            StringBuilder numEghStrSB = new StringBuilder(numEghStr);

            if(numTenStr.equals(numTenStrSB.reverse().toString()) && numEghStr.equals(numEghStrSB.reverse().toString())
             && numTwoStr.equals(numTwoStrSB.reverse().toString())){
                System.out.println(num);
                break;
            }

            num += 2;
        }

        //--------------------------------------很大气版本end----------------------------------------------------
        System.out.println(isPalindromic(505));
    }

    //--------------------------------------小气提示begin----------------------------------------------------
    public static boolean isPalindromic(final int num){
        if (num < 11){
            return false;
        }
        int reverse = 0;
        int origin = num;
        while (origin > 0){
            reverse = reverse * 10 + origin % 10;
            origin /= 10;
        }

        return reverse == num;
    }
    //--------------------------------------小气提示end----------------------------------------------------
}
