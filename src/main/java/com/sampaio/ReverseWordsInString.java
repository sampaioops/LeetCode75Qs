package com.sampaio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/submissions/997179693/?envType=study-plan-v2&envId=leetcode-75">Submission</a>
 */
public class ReverseWordsInString {

    public static class Solution {
        public static String reverseString(String str) {
            final char empty = ' ';

            final char[] charArray = str.toCharArray();

            final List<String> words = new ArrayList<>();

            var word = "";
            boolean addWord = false;


            for (final char l : charArray) {
                if (addWord) {
                    if (!word.equals("")) {
                        words.add(word);
                    }

                    word = "";
                }

                if (l == empty) {
                    addWord = true;
                } else {
                    addWord = false;
                    word = word.concat(String.valueOf(l));
                }

            }

            if (!word.equals("")) {
                words.add(word);
            }

            Collections.reverse(words);
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        String a = "the sky is blue";

        System.out.println(Solution.reverseString(a));
    }
}
