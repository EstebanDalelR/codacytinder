package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ba.C4743b;
import java.io.DataInput;
import java.util.Arrays;

public final class ar {
    /* renamed from: e */
    private static ar f17669e = new ar(0, 1.0f, new int[0], 0);
    /* renamed from: a */
    private final int f17670a;
    /* renamed from: b */
    private final float f17671b;
    /* renamed from: c */
    private final int[] f17672c;
    /* renamed from: d */
    private final int f17673d;

    public ar(int i, float f, int[] iArr, int i2) {
        this.f17670a = i;
        this.f17671b = f;
        this.f17672c = iArr;
        this.f17673d = i2;
    }

    /* renamed from: a */
    public static ar m21545a(DataInput dataInput) {
        int readInt = dataInput.readInt();
        float readUnsignedByte = ((float) dataInput.readUnsignedByte()) / 8.0f;
        int a = bl.m21698a(dataInput);
        int[] iArr = new int[a];
        for (int i = 0; i < a; i++) {
            iArr[i] = dataInput.readShort();
        }
        if (C4743b.f17388b) {
            iArr = new int[0];
        }
        for (int i2 : r3) {
            if (i2 == 0) {
                iArr = new int[0];
                break;
            }
        }
        return new ar(readInt, readUnsignedByte, iArr, dataInput.readUnsignedByte());
    }

    /* renamed from: a */
    public static ar m21544a() {
        return f17669e;
    }

    /* renamed from: b */
    public final int m21546b() {
        return this.f17670a;
    }

    /* renamed from: c */
    public final float m21547c() {
        return this.f17671b;
    }

    /* renamed from: d */
    public final int[] m21548d() {
        return this.f17672c;
    }

    /* renamed from: e */
    public final boolean m21549e() {
        return this.f17672c != null && this.f17672c.length > 0;
    }

    /* renamed from: f */
    public final boolean m21550f() {
        return (this.f17673d & 1) != 0;
    }

    /* renamed from: g */
    public final boolean m21551g() {
        return (this.f17673d & 2) != 0;
    }

    public final int hashCode() {
        return ((((((this.f17670a + 31) * 31) + Arrays.hashCode(this.f17672c)) * 31) + this.f17673d) * 31) + Float.floatToIntBits(this.f17671b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ar arVar = (ar) obj;
        return this.f17670a == arVar.f17670a && Arrays.equals(this.f17672c, arVar.f17672c) && this.f17673d == arVar.f17673d && Float.floatToIntBits(this.f17671b) == Float.floatToIntBits(arVar.f17671b);
    }

    /* renamed from: h */
    public final int m21552h() {
        return (this.f17672c.length * 4) + 24;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stroke{color=");
        stringBuilder.append(Integer.toHexString(this.f17670a));
        stringBuilder.append(", width=");
        stringBuilder.append(this.f17671b);
        stringBuilder.append(", dashes=");
        stringBuilder.append(Arrays.toString(this.f17672c));
        stringBuilder.append(", endCaps=");
        if ((this.f17673d & 1) != 0) {
            stringBuilder.append("S");
        }
        if ((this.f17673d & 2) != 0) {
            stringBuilder.append("E");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
