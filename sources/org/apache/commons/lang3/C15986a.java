package org.apache.commons.lang3;

/* renamed from: org.apache.commons.lang3.a */
public class C15986a {
    /* renamed from: a */
    static boolean m60650a(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2, int i3) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z, i, (String) charSequence2, i2, i3);
        }
        int length = charSequence.length() - i;
        int length2 = charSequence2.length() - i2;
        if (i >= 0 && i2 >= 0) {
            if (i3 >= 0) {
                if (length >= i3) {
                    if (length2 >= i3) {
                        while (true) {
                            length = i3 - 1;
                            if (i3 <= 0) {
                                return true;
                            }
                            i3 = i + 1;
                            i = charSequence.charAt(i);
                            length2 = i2 + 1;
                            i2 = charSequence2.charAt(i2);
                            if (i != i2) {
                                if (!z) {
                                    return false;
                                }
                                if (!(Character.toUpperCase(i) == Character.toUpperCase(i2) || Character.toLowerCase(i) == Character.toLowerCase(i2))) {
                                    return false;
                                }
                            }
                            i = i3;
                            i3 = length;
                            i2 = length2;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
}
