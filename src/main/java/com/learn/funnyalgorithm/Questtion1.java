package com.learn.funnyalgorithm;

public class Questtion1 {

    public static void main(String[] args) {

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

    }
}
