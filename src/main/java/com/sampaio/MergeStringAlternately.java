package com.sampaio;

/**
 * <a href="https://leetcode.com/problems/merge-strings-alternately/submissions/996239679/?envType=study-plan-v2&envId=leetcode-75">Submission</a>
 */
public class MergeStringAlternately {

    public static void main(String[] args) {
        final var str1 = "Dne";
        final var str2 = "ail";

        final var result = mergeAlternately(str1, str2);
        System.out.println(result);

    }

    public static String mergeAlternately(String word1, String word2) {
        final char[] charArray = word1.toCharArray();
        final char[] charArray2 = word2.toCharArray();

        final var builder = new StringBuilder();
        final int initIndex = 0;

        final int indexMaxRange = charArray.length + charArray2.length;

        int indexToArray1 = 1;
        int indexToArray2 = 0;


        builder.append(charArray[initIndex]);
        for (int i = 1; i <= indexMaxRange; i++) {

            if (checkConstraint(charArray2, indexToArray2)) {
                builder.append(charArray2[indexToArray2]);
                indexToArray2++;

            }

            if (checkConstraint(charArray, indexToArray1)) {
                builder.append(charArray[indexToArray1]);
                indexToArray1++;
            }

        }
        return builder.toString();

    }

    private static boolean checkConstraint(final char[] charArray, int index) {
        int maxAllocated = charArray.length - 1;

        return index <= maxAllocated;
    }
}