package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class oj {
    /* renamed from: a */
    public static int m20087a(Parcel parcel) {
        return m20108b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m20088a(Parcel parcel, int i) {
        m20111c(parcel, i);
    }

    /* renamed from: a */
    public static void m20089a(Parcel parcel, int i, double d) {
        m20109b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m20090a(Parcel parcel, int i, float f) {
        m20109b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m20091a(Parcel parcel, int i, int i2) {
        m20109b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m20092a(Parcel parcel, int i, long j) {
        m20109b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m20093a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            i = m20108b(parcel, i);
            parcel.writeBundle(bundle);
            m20111c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m20094a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            i = m20108b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m20111c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m20095a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            i = m20108b(parcel, 2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m20111c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m20096a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m20109b(parcel, i, 0);
            }
            return;
        }
        i = m20108b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m20111c(parcel, i);
    }

    /* renamed from: a */
    public static void m20097a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m20109b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: a */
    public static void m20098a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m20109b(parcel, i, 0);
            }
            return;
        }
        i = m20108b(parcel, i);
        parcel.writeString(str);
        m20111c(parcel, i);
    }

    /* renamed from: a */
    public static void m20099a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            i = m20108b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            m20111c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m20100a(Parcel parcel, int i, short s) {
        m20109b(parcel, 3, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m20101a(Parcel parcel, int i, boolean z) {
        m20109b(parcel, i, 4);
        parcel.writeInt(z);
    }

    /* renamed from: a */
    public static void m20102a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m20109b(parcel, i, 0);
            }
            return;
        }
        i = m20108b(parcel, i);
        parcel.writeByteArray(bArr);
        m20111c(parcel, i);
    }

    /* renamed from: a */
    public static void m20103a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            i = m20108b(parcel, i);
            parcel.writeIntArray(iArr);
            m20111c(parcel, i);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m20104a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            i = m20108b(parcel, i);
            parcel.writeInt(r7);
            for (Parcelable parcelable : tArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m20107a(parcel, parcelable, i2);
                }
            }
            m20111c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m20105a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            i = m20108b(parcel, i);
            parcel.writeStringArray(strArr);
            m20111c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m20106a(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            i = m20108b(parcel, i);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m20111c(parcel, i);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m20107a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private static int m20108b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    private static void m20109b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: b */
    public static void m20110b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            i = m20108b(parcel, i);
            parcel.writeStringList(list);
            m20111c(parcel, i);
        }
    }

    /* renamed from: c */
    private static void m20111c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m20112c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m20109b(parcel, i, 0);
            }
            return;
        }
        i = m20108b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m20107a(parcel, parcelable, 0);
            }
        }
        m20111c(parcel, i);
    }
}
