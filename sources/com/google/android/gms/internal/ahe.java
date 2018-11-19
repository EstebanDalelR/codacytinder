package com.google.android.gms.internal;

import java.util.PriorityQueue;

@zzzv
public final class ahe {
    /* renamed from: a */
    private static long m19167a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? m19167a((j * j) % 1073807359, i / 2) : j * (m19167a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    /* renamed from: a */
    private static String m19168a(String[] strArr, int i, int i2) {
        i2 += i;
        if (strArr.length < i2) {
            hx.m19913c("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i3 = i2 - 1;
            if (i < i3) {
                stringBuffer.append(strArr[i]);
                stringBuffer.append(' ');
                i++;
            } else {
                stringBuffer.append(strArr[i3]);
                return stringBuffer.toString();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m19169a(int r2, long r3, java.lang.String r5, int r6, java.util.PriorityQueue<com.google.android.gms.internal.ahf> r7) {
        /*
        r0 = new com.google.android.gms.internal.ahf;
        r0.<init>(r3, r5, r6);
        r3 = r7.size();
        if (r3 != r2) goto L_0x0026;
    L_0x000b:
        r3 = r7.peek();
        r3 = (com.google.android.gms.internal.ahf) r3;
        r3 = r3.f15264c;
        r4 = r0.f15264c;
        if (r3 > r4) goto L_0x0025;
    L_0x0017:
        r3 = r7.peek();
        r3 = (com.google.android.gms.internal.ahf) r3;
        r3 = r3.f15262a;
        r5 = r0.f15262a;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 <= 0) goto L_0x0026;
    L_0x0025:
        return;
    L_0x0026:
        r3 = r7.contains(r0);
        if (r3 == 0) goto L_0x002d;
    L_0x002c:
        return;
    L_0x002d:
        r7.add(r0);
        r3 = r7.size();
        if (r3 <= r2) goto L_0x0039;
    L_0x0036:
        r7.poll();
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ahe.a(int, long, java.lang.String, int, java.util.PriorityQueue):void");
    }

    /* renamed from: a */
    public static void m19170a(String[] strArr, int i, int i2, PriorityQueue<ahf> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m19169a(i, m19171b(strArr2, 0, strArr2.length), m19168a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m19171b(strArr2, 0, i3);
        m19169a(i, b, m19168a(strArr2, 0, i3), i3, priorityQueue);
        long a = m19167a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = b + 1073807359;
            b = (((((j - ((((((long) ahc.m19165a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) ahc.m19165a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m19169a(i, b, m19168a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* renamed from: b */
    private static long m19171b(String[] strArr, int i, int i2) {
        long a = (((long) ahc.m19165a(strArr[0])) + 2147483647L) % 1073807359;
        for (i = 1; i < i2; i++) {
            a = (((a * 16785407) % 1073807359) + ((((long) ahc.m19165a(strArr[i])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
