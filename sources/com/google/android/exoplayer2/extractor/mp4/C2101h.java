package com.google.android.exoplayer2.extractor.mp4;

import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.exoplayer2.extractor.TrackOutput.C2055a;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.h */
public final class C2101h {
    /* renamed from: a */
    public final boolean f5933a;
    @Nullable
    /* renamed from: b */
    public final String f5934b;
    /* renamed from: c */
    public final C2055a f5935c;
    /* renamed from: d */
    public final int f5936d;
    /* renamed from: e */
    public final byte[] f5937e;

    public C2101h(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        int i4 = 0;
        int i5 = i == 0 ? 1 : 0;
        if (bArr2 == null) {
            i4 = 1;
        }
        C2289a.m8311a(i4 ^ i5);
        this.f5933a = z;
        this.f5934b = str;
        this.f5936d = i;
        this.f5937e = bArr2;
        this.f5935c = new C2055a(C2101h.m7524a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    private static int m7524a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        Object obj = -1;
        int hashCode = str.hashCode();
        if (hashCode != 3046605) {
            if (hashCode != 3046671) {
                if (hashCode != 3049879) {
                    if (hashCode == 3049895) {
                        if (str.equals("cens")) {
                            obj = 1;
                        }
                    }
                } else if (str.equals("cenc")) {
                    obj = null;
                }
            } else if (str.equals("cbcs")) {
                obj = 3;
            }
        } else if (str.equals("cbc1")) {
            obj = 2;
        }
        switch (obj) {
            case null:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported protection scheme type '");
                stringBuilder.append(str);
                stringBuilder.append("'. Assuming AES-CTR crypto mode.");
                Log.w("TrackEncryptionBox", stringBuilder.toString());
                return 1;
        }
    }
}
