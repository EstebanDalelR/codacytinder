package com.squareup.moshi;

/* renamed from: com.squareup.moshi.f */
final class C5982f {
    /* renamed from: a */
    static String m25634a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            switch (iArr[i2]) {
                case 1:
                case 2:
                    stringBuilder.append('[');
                    stringBuilder.append(iArr2[i2]);
                    stringBuilder.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    stringBuilder.append('.');
                    if (strArr[i2] == null) {
                        break;
                    }
                    stringBuilder.append(strArr[i2]);
                    break;
                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }
}
