package ru.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int dif = word.length - post.length;
        for (int i = post.length - 1; i >= 0; i--) {
            if (post[i] != word[i + dif]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

