package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.C15819j;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class UtfEncodingKt {
    @NotNull
    public static final byte[] stringsToBytes(@NotNull String[] strArr) {
        C2668g.b(strArr, "strings");
        Object obj = null;
        int i = 0;
        for (String length : strArr) {
            i += length.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str : strArr) {
            int length2 = str.length() - 1;
            if (length2 >= 0) {
                int i3;
                int i4 = 0;
                while (true) {
                    i3 = i2 + 1;
                    bArr[i2] = (byte) str.charAt(i4);
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    i2 = i3;
                }
                i2 = i3;
            }
        }
        if (i2 == bArr.length) {
            obj = 1;
        }
        if (C15819j.f49018a == null || r1 != null) {
            return bArr;
        }
        throw new AssertionError("Should have reached the end");
    }
}
