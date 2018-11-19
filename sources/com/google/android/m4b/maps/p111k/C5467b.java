package com.google.android.m4b.maps.p111k;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.k.b */
public final class C5467b {
    /* renamed from: b */
    private static void m23814b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: b */
    private static int m23813b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: c */
    private static void m23816c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static int m23795a(Parcel parcel) {
        return C5467b.m23813b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m23796a(Parcel parcel, int i) {
        C5467b.m23816c(parcel, i);
    }

    /* renamed from: a */
    public static void m23809a(Parcel parcel, int i, boolean z) {
        C5467b.m23814b(parcel, i, 4);
        parcel.writeInt(z);
    }

    /* renamed from: a */
    public static void m23797a(Parcel parcel, int i, byte b) {
        C5467b.m23814b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m23808a(Parcel parcel, int i, short s) {
        C5467b.m23814b(parcel, 3, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m23800a(Parcel parcel, int i, int i2) {
        C5467b.m23814b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m23805a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            C5467b.m23814b(parcel, 5, true);
            parcel.writeInt(num.intValue());
        }
    }

    /* renamed from: a */
    public static void m23801a(Parcel parcel, int i, long j) {
        C5467b.m23814b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m23799a(Parcel parcel, int i, float f) {
        C5467b.m23814b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m23798a(Parcel parcel, int i, double d) {
        C5467b.m23814b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m23806a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            i = C5467b.m23813b(parcel, i);
            parcel.writeString(str);
            C5467b.m23816c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m23803a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            i = C5467b.m23813b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            C5467b.m23816c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m23804a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            i = C5467b.m23813b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            C5467b.m23816c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m23802a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            i = C5467b.m23813b(parcel, i);
            parcel.writeBundle(bundle);
            C5467b.m23816c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m23810a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            i = C5467b.m23813b(parcel, i);
            parcel.writeByteArray(bArr);
            C5467b.m23816c(parcel, i);
        }
    }

    /* renamed from: a */
    public static void m23807a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            i = C5467b.m23813b(parcel, 1);
            z = list.size();
            parcel.writeInt(z);
            for (boolean z2 = false; z2 < z; z2++) {
                parcel.writeInt(((Integer) list.get(z2)).intValue());
            }
            C5467b.m23816c(parcel, i);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m23811a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            i = C5467b.m23813b(parcel, i);
            parcel.writeInt(z);
            for (Parcelable parcelable : tArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C5467b.m23812a(parcel, parcelable, i2);
                }
            }
            C5467b.m23816c(parcel, i);
        }
    }

    /* renamed from: b */
    public static <T extends Parcelable> void m23815b(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            i = C5467b.m23813b(parcel, i);
            z = list.size();
            parcel.writeInt(z);
            for (boolean z2 = false; z2 < z; z2++) {
                Parcelable parcelable = (Parcelable) list.get(z2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C5467b.m23812a(parcel, parcelable, 0);
                }
            }
            C5467b.m23816c(parcel, i);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m23812a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        t = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(t - dataPosition2);
        parcel.setDataPosition(t);
    }

    /* renamed from: c */
    public static void m23817c(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            i = C5467b.m23813b(parcel, 3);
            parcel.writeList(list);
            C5467b.m23816c(parcel, i);
        }
    }
}
