package org.apache.commons.lang3;

/* renamed from: org.apache.commons.lang3.b */
public class C15987b {
    /* renamed from: a */
    public static boolean m60655a(CharSequence charSequence) {
        if (charSequence != null) {
            if (charSequence.length() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m60656a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null) {
            if (charSequence2 != null) {
                if (charSequence.length() != charSequence2.length()) {
                    return false;
                }
                if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
                    return charSequence.equals(charSequence2);
                }
                return C15986a.m60650a(charSequence, false, 0, charSequence2, 0, charSequence.length());
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m60652a(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i <= 0) {
            return "";
        }
        int length = str.length();
        if (i != 1) {
            if (length != 0) {
                int i2 = 0;
                if (length == 1 && i <= 8192) {
                    return C15987b.m60651a(str.charAt(0), i);
                }
                int i3 = length * i;
                switch (length) {
                    case 1:
                        return C15987b.m60651a(str.charAt(0), i);
                    case 2:
                        char charAt = str.charAt(0);
                        str = str.charAt(1);
                        char[] cArr = new char[i3];
                        for (i = (i * 2) - 2; i >= 0; i = (i - 1) - 1) {
                            cArr[i] = charAt;
                            cArr[i + 1] = str;
                        }
                        return new String(cArr);
                    default:
                        StringBuilder stringBuilder = new StringBuilder(i3);
                        while (i2 < i) {
                            stringBuilder.append(str);
                            i2++;
                        }
                        return stringBuilder.toString();
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m60651a(char c, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (i--; i >= 0; i--) {
            cArr[i] = c;
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static String m60653a(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return C15987b.m60654a(str, i, String.valueOf(c));
        }
        return C15987b.m60651a(c, length).concat(str);
    }

    /* renamed from: a */
    public static String m60654a(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (C15987b.m60655a(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        int i2 = 0;
        if (length == 1 && length2 <= 8192) {
            return C15987b.m60653a(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        i = new char[length2];
        str2 = str2.toCharArray();
        while (i2 < length2) {
            i[i2] = str2[i2 % length];
            i2++;
        }
        return new String(i).concat(str);
    }
}
