package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;

public class BitEncoding {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean FORCE_8TO7_ENCODING = "true".equals(System.getProperty("kotlin.jvm.serialization.use8to7"));

    private BitEncoding() {
    }

    private static void addModuloByte(@NotNull byte[] bArr, int i) {
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((bArr[i2] + i) & 127);
        }
    }

    @NotNull
    public static byte[] decodeBytes(@NotNull String[] strArr) {
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == '\u0000') {
                return UtfEncodingKt.stringsToBytes(dropMarker(strArr));
            }
            if (charAt == '￿') {
                strArr = dropMarker(strArr);
            }
        }
        strArr = combineStringArrayIntoBytes(strArr);
        addModuloByte(strArr, 127);
        return decode7to8(strArr);
    }

    @NotNull
    private static String[] dropMarker(@NotNull String[] strArr) {
        strArr = (String[]) strArr.clone();
        strArr[0] = strArr[0].substring(1);
        return strArr;
    }

    @NotNull
    private static byte[] combineStringArrayIntoBytes(@NotNull String[] strArr) {
        int i = 0;
        for (String length : strArr) {
            i += length.length();
        }
        byte[] bArr = new byte[i];
        int length2 = strArr.length;
        i = 0;
        int i2 = 0;
        while (i < length2) {
            String str = strArr[i];
            int length3 = str.length();
            int i3 = i2;
            i2 = 0;
            while (i2 < length3) {
                int i4 = i3 + 1;
                bArr[i3] = (byte) str.charAt(i2);
                i2++;
                i3 = i4;
            }
            i++;
            i2 = i3;
        }
        return bArr;
    }

    @NotNull
    private static byte[] decode7to8(@NotNull byte[] bArr) {
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i++;
            int i4 = i2 + 1;
            bArr2[i3] = (byte) (((bArr[i] & 255) >>> i2) + ((bArr[i] & ((1 << i4) - 1)) << (7 - i2)));
            if (i2 == 6) {
                i++;
                i2 = 0;
            } else {
                i2 = i4;
            }
        }
        return bArr2;
    }
}
