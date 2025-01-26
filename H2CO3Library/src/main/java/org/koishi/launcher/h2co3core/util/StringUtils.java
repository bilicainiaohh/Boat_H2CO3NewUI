/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2020  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.koishi.launcher.h2co3core.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;

public final class StringUtils {

    public static int MAX_SHORT_STRING_LENGTH = 77;

    private StringUtils() {
    }

    public static String getStackTrace(Throwable throwable) {
        StringWriter stringWriter = new StringWriter(512);
        try (PrintWriter printWriter = new PrintWriter(stringWriter)) {
            throwable.printStackTrace(printWriter);
        }
        return stringWriter.toString();
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static String substringBeforeLast(String str, char delimiter) {
        return substringBeforeLast(str, delimiter, str);
    }

    public static String substringBeforeLast(String str, char delimiter, String missingDelimiterValue) {
        int index = str.lastIndexOf(delimiter);
        return index == -1 ? missingDelimiterValue : str.substring(0, index);
    }

    public static String substringBeforeLast(String str, String delimiter) {
        return substringBeforeLast(str, delimiter, str);
    }

    public static String substringBeforeLast(String str, String delimiter, String missingDelimiterValue) {
        int index = str.lastIndexOf(delimiter);
        return index == -1 ? missingDelimiterValue : str.substring(0, index);
    }

    public static String substringBefore(String str, char delimiter) {
        return substringBefore(str, delimiter, str);
    }

    public static String substringBefore(String str, char delimiter, String missingDelimiterValue) {
        int index = str.indexOf(delimiter);
        return index == -1 ? missingDelimiterValue : str.substring(0, index);
    }

    public static String substringBefore(String str, String delimiter) {
        return substringBefore(str, delimiter, str);
    }

    public static String substringBefore(String str, String delimiter, String missingDelimiterValue) {
        int index = str.indexOf(delimiter);
        return index == -1 ? missingDelimiterValue : str.substring(0, index);
    }

    public static String substringAfterLast(String str, char delimiter) {
        return substringAfterLast(str, delimiter, "");
    }

    public static String substringAfterLast(String str, char delimiter, String missingDelimiterValue) {
        int index = str.lastIndexOf(delimiter);
        return index == -1 ? missingDelimiterValue : str.substring(index + 1);
    }

    public static String substringAfterLast(String str, String delimiter) {
        return substringAfterLast(str, delimiter, "");
    }

    public static String substringAfterLast(String str, String delimiter, String missingDelimiterValue) {
        int index = str.lastIndexOf(delimiter);
        return index == -1 ? missingDelimiterValue : str.substring(index + delimiter.length());
    }

    public static String substringAfter(String str, char delimiter) {
        return substringAfter(str, delimiter, "");
    }

    public static String substringAfter(String str, char delimiter, String missingDelimiterValue) {
        int index = str.indexOf(delimiter);
        return index == -1 ? missingDelimiterValue : str.substring(index + 1);
    }

    public static String substringAfter(String str, String delimiter) {
        return substringAfter(str, delimiter, "");
    }

    public static String substringAfter(String str, String delimiter, String missingDelimiterValue) {
        int index = str.indexOf(delimiter);
        return index == -1 ? missingDelimiterValue : str.substring(index + delimiter.length());
    }

    public static boolean isSurrounded(String str, String prefix, String suffix) {
        return str.startsWith(prefix) && str.endsWith(suffix);
    }

    public static String removeSurrounding(String str, String delimiter) {
        return removeSurrounding(str, delimiter, delimiter);
    }

    public static String removeSurrounding(String str, String prefix, String suffix) {
        if ((str.length() >= prefix.length() + suffix.length()) && str.startsWith(prefix) && str.endsWith(suffix))
            return str.substring(prefix.length(), str.length() - suffix.length());
        else
            return str;
    }

    public static String addPrefix(String str, String prefix) {
        if (str.startsWith(prefix))
            return str;
        else
            return prefix + str;
    }

    public static String addSuffix(String str, String suffix) {
        if (str.endsWith(suffix))
            return str;
        else
            return str + suffix;
    }

    public static String removePrefix(String str, String prefix) {
        return str.startsWith(prefix) ? str.substring(prefix.length()) : str;
    }

    public static String removePrefix(String str, String... prefixes) {
        for (String prefix : prefixes)
            if (str.startsWith(prefix))
                return str.substring(prefix.length());
        return str;
    }

    public static String removeSuffix(String str, String suffix) {
        return str.endsWith(suffix) ? str.substring(0, str.length() - suffix.length()) : str;
    }

    /**
     * Remove one suffix of the suffixes of the string.
     */
    public static String removeSuffix(String str, String... suffixes) {
        for (String suffix : suffixes)
            if (str.endsWith(suffix))
                return str.substring(0, str.length() - suffix.length());
        return str;
    }

    public static boolean containsOne(Collection<String> patterns, String... targets) {
        for (String pattern : patterns) {
            String lowerPattern = pattern.toLowerCase(Locale.ROOT);
            for (String target : targets)
                if (lowerPattern.contains(target.toLowerCase(Locale.ROOT)))
                    return true;
        }
        return false;
    }

    public static boolean containsOne(String pattern, String... targets) {
        String lowerPattern = pattern.toLowerCase(Locale.ROOT);
        for (String target : targets)
            if (lowerPattern.contains(target.toLowerCase(Locale.ROOT)))
                return true;
        return false;
    }

    public static boolean containsChinese(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '\u4e00' && ch <= '\u9fa5')
                return true;
        }
        return false;
    }

    public static List<String> tokenize(String str) {
        if (isBlank(str)) {
            return new ArrayList<>();
        } else {
            // Split the string with ' and space cleverly.
            ArrayList<String> parts = new ArrayList<>();

            boolean hasValue = false;
            StringBuilder current = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); ) {
                char c = str.charAt(i);
                if (c == '\'') {
                    hasValue = true;
                    int end = str.indexOf(c, i + 1);
                    if (end < 0) {
                        end = str.length();
                    }
                    current.append(str, i + 1, end);
                    i = end + 1;

                } else if (c == '"') {
                    hasValue = true;
                    i++;
                    while (i < str.length()) {
                        c = str.charAt(i++);
                        if (c == '"') {
                            break;
                        } else if (c == '\\' && i < str.length()) {
                            c = str.charAt(i++);
                            switch (c) {
                                case 'n':
                                    c = '\n';
                                    break;
                                case 'r':
                                    c = '\r';
                                    break;
                                case 't':
                                    c = '\t';
                                    break;
                                case 'v':
                                    c = '\u000b';
                                    break;
                                case 'a':
                                    c = '\u0007';
                                    break;
                            }
                            current.append(c);
                        } else {
                            current.append(c);
                        }
                    }
                } else if (c == ' ') {
                    if (hasValue) {
                        parts.add(current.toString());
                        current.setLength(0);
                        hasValue = false;
                    }
                    i++;
                } else {
                    hasValue = true;
                    current.append(c);
                    i++;
                }
            }
            if (hasValue) {
                parts.add(current.toString());
            }

            return parts;
        }
    }

    public static List<String> parseCommand(String command, Map<String, String> env) {
        StringBuilder stringBuilder = new StringBuilder(command);
        for (Map.Entry<String, String> entry : env.entrySet()) {
            String key = "$" + entry.getKey();
            int i = 0;
            while (true) {
                i = stringBuilder.indexOf(key, i);
                if (i == -1) {
                    break;
                }
                stringBuilder.replace(i, i + key.length(), entry.getValue());
            }
        }

        return tokenize(stringBuilder.toString());
    }

    public static String parseColorEscapes(String original) {
        if (original.indexOf('\u00A7') < 0)
            return original;

        return original.replaceAll("\u00A7[0-9a-gklmnor]", "");
    }

    public static String parseEscapeSequence(String str) {
        StringBuilder builder = new StringBuilder();
        boolean inEscape = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '\033') {
                inEscape = true;
            }
            if (!inEscape) {
                builder.append(ch);
            }
            if (inEscape && ch == 'm') {
                inEscape = false;
            }
        }
        return builder.toString();
    }

    public static String repeats(char ch, int repeat) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            result.append(ch);
        }
        return result.toString();
    }

    public static Optional<String> truncate(String str) {
        if (str.length() <= MAX_SHORT_STRING_LENGTH) {
            return Optional.empty();
        }

        final int halfLength = (MAX_SHORT_STRING_LENGTH - 5) / 2;
        return Optional.of(str.substring(0, halfLength) + " ... " + str.substring(str.length() - halfLength));
    }

    public static boolean isASCII(String cs) {
        for (int i = 0; i < cs.length(); i++)
            if (cs.charAt(i) >= 128)
                return false;
        return true;
    }

    public static boolean isAlphabeticOrNumber(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z'))
                return false;
        }
        return true;
    }

    public static class LevCalculator {
        private int[][] lev;

        public LevCalculator() {
        }

        public LevCalculator(int length1, int length2) {
            allocate(length1, length2);
        }

        private void allocate(int length1, int length2) {
            length1 += 1;
            length2 += 1;
            lev = new int[length1][length2];
            for (int i = 1; i < length1; i++) {
                lev[i][0] = i;
            }
            int[] cache = lev[0];
            for (int i = 0; i < length2; i++) {
                cache[i] = i;
            }
        }

        public int getLength1() {
            return lev.length;
        }

        public int getLength2() {
            return lev[0].length;
        }

        private int min(int a, int b, int c) {
            return Math.min(a, Math.min(b, c));
        }

        public int calc(CharSequence a, CharSequence b) {
            if (lev == null || a.length() >= lev.length || b.length() >= lev[0].length) {
                allocate(a.length(), b.length());
            }

            int lengthA = a.length() + 1, lengthB = b.length() + 1;

            for (int i = 1; i < lengthA; i++) {
                for (int j = 1; j < lengthB; j++) {
                    lev[i][j] = min(
                            lev[i][j - 1] + 1, // insert
                            lev[i - 1][j] + 1, // del
                            a.charAt(i - 1) == b.charAt(j - 1) ? lev[i - 1][j - 1] : lev[i - 1][j - 1] + 1 // replace
                    );
                }
            }

            return lev[a.length()][b.length()];
        }
    }

    /**
     * Class for computing the longest common subsequence between strings.
     */
    public static final class LongestCommonSubsequence {
        // We reuse dynamic programming storage array here to reduce allocations.
        private final int[][] f;
        private final int maxLengthA;
        private final int maxLengthB;

        public LongestCommonSubsequence(int maxLengthA, int maxLengthB) {
            this.maxLengthA = maxLengthA;
            this.maxLengthB = maxLengthB;
            f = new int[maxLengthA + 1][];
            for (int i = 0; i <= maxLengthA; i++) {
                f[i] = new int[maxLengthB + 1];
            }
        }

        public int calc(CharSequence a, CharSequence b) {
            if (a.length() > maxLengthA || b.length() > maxLengthB) {
                throw new IllegalArgumentException("Too large length");
            }
            for (int i = 1; i <= a.length(); i++) {
                for (int j = 1; j <= b.length(); j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        f[i][j] = 1 + f[i - 1][j - 1];
                    } else {
                        f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                    }
                }
            }
            return f[a.length()][b.length()];
        }
    }
}
