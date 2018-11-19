package org.apache.commons.lang3;

/* renamed from: org.apache.commons.lang3.d */
public class C15991d {
    /* renamed from: a */
    public static void m60740a(long j, long j2, long j3, String str) {
        if (j3 >= j) {
            if (j3 <= j2) {
                return;
            }
        }
        throw new IllegalArgumentException(String.format(str, new Object[0]));
    }
}
