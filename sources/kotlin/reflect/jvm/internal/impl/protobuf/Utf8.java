package kotlin.reflect.jvm.internal.impl.protobuf;

final class Utf8 {
    private static int incompleteStateFor(int i) {
        return i > -12 ? -1 : i;
    }

    private static int incompleteStateFor(int i, int i2) {
        if (i <= -12) {
            if (i2 <= -65) {
                return i ^ (i2 << 8);
            }
        }
        return -1;
    }

    private static int incompleteStateFor(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65) {
            if (i3 <= -65) {
                return (i ^ (i2 << 8)) ^ (i3 << 16);
            }
        }
        return -1;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return partialIsValidUtf8(bArr, i, i2) == null ? 1 : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int partialIsValidUtf8(int r6, byte[] r7, int r8, int r9) {
        /*
        if (r6 == 0) goto L_0x007d;
    L_0x0002:
        if (r8 < r9) goto L_0x0005;
    L_0x0004:
        return r6;
    L_0x0005:
        r0 = (byte) r6;
        r1 = -32;
        r2 = -1;
        r3 = -65;
        if (r0 >= r1) goto L_0x0018;
    L_0x000d:
        r6 = -62;
        if (r0 < r6) goto L_0x0017;
    L_0x0011:
        r6 = r8 + 1;
        r8 = r7[r8];
        if (r8 <= r3) goto L_0x007e;
    L_0x0017:
        return r2;
    L_0x0018:
        r4 = -16;
        if (r0 >= r4) goto L_0x0045;
    L_0x001c:
        r6 = r6 >> 8;
        r6 = r6 ^ r2;
        r6 = (byte) r6;
        if (r6 != 0) goto L_0x0030;
    L_0x0022:
        r6 = r8 + 1;
        r8 = r7[r8];
        if (r6 < r9) goto L_0x002d;
    L_0x0028:
        r6 = incompleteStateFor(r0, r8);
        return r6;
    L_0x002d:
        r5 = r8;
        r8 = r6;
        r6 = r5;
    L_0x0030:
        if (r6 > r3) goto L_0x0044;
    L_0x0032:
        r4 = -96;
        if (r0 != r1) goto L_0x0038;
    L_0x0036:
        if (r6 < r4) goto L_0x0044;
    L_0x0038:
        r1 = -19;
        if (r0 != r1) goto L_0x003e;
    L_0x003c:
        if (r6 >= r4) goto L_0x0044;
    L_0x003e:
        r6 = r8 + 1;
        r8 = r7[r8];
        if (r8 <= r3) goto L_0x007e;
    L_0x0044:
        return r2;
    L_0x0045:
        r1 = r6 >> 8;
        r1 = r1 ^ r2;
        r1 = (byte) r1;
        r4 = 0;
        if (r1 != 0) goto L_0x0057;
    L_0x004c:
        r6 = r8 + 1;
        r1 = r7[r8];
        if (r6 < r9) goto L_0x005b;
    L_0x0052:
        r6 = incompleteStateFor(r0, r1);
        return r6;
    L_0x0057:
        r6 = r6 >> 16;
        r4 = (byte) r6;
        r6 = r8;
    L_0x005b:
        if (r4 != 0) goto L_0x0069;
    L_0x005d:
        r8 = r6 + 1;
        r4 = r7[r6];
        if (r8 < r9) goto L_0x0068;
    L_0x0063:
        r6 = incompleteStateFor(r0, r1, r4);
        return r6;
    L_0x0068:
        r6 = r8;
    L_0x0069:
        if (r1 > r3) goto L_0x007c;
    L_0x006b:
        r8 = r0 << 28;
        r1 = r1 + 112;
        r8 = r8 + r1;
        r8 = r8 >> 30;
        if (r8 != 0) goto L_0x007c;
    L_0x0074:
        if (r4 > r3) goto L_0x007c;
    L_0x0076:
        r8 = r6 + 1;
        r6 = r7[r6];
        if (r6 <= r3) goto L_0x007d;
    L_0x007c:
        return r2;
    L_0x007d:
        r6 = r8;
    L_0x007e:
        r6 = partialIsValidUtf8(r7, r6, r9);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.Utf8.partialIsValidUtf8(int, byte[], int, int):int");
    }

    public static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= (byte) 0) {
            i++;
        }
        if (i >= i2) {
            return null;
        }
        return partialIsValidUtf8NonAscii(bArr, i, i2);
    }

    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            i = bArr[i];
            if (i < 0) {
                if (i < -32) {
                    if (i3 >= i2) {
                        return i;
                    }
                    if (i >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (i < -16) {
                    if (i3 >= i2 - 1) {
                        return incompleteStateFor(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    r0 = bArr[i3];
                    if (r0 <= (byte) -65 && ((i != -32 || r0 >= (byte) -96) && (i != -19 || r0 < (byte) -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return incompleteStateFor(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    r0 = bArr[i3];
                    if (r0 <= (byte) -65 && (((i << 28) + (r0 + 112)) >> 30) == 0) {
                        i = i5 + 1;
                        if (bArr[i5] <= (byte) -65) {
                            i3 = i + 1;
                            if (bArr[i] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i = i3;
        }
        return null;
    }

    private static int incompleteStateFor(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return incompleteStateFor(i3);
            case 1:
                return incompleteStateFor(i3, bArr[i]);
            case 2:
                return incompleteStateFor(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }
}
