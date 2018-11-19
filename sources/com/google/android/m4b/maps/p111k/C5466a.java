package com.google.android.m4b.maps.p111k;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: com.google.android.m4b.maps.k.a */
public final class C5466a {

    /* renamed from: com.google.android.m4b.maps.k.a$a */
    public static class C5465a extends RuntimeException {
        public C5465a(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            parcel = parcel.dataSize();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
            stringBuilder.append(str);
            stringBuilder.append(" Parcel: pos=");
            stringBuilder.append(dataPosition);
            stringBuilder.append(" size=");
            stringBuilder.append(parcel);
            super(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static int m23777a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: b */
    public static void m23780b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + C5466a.m23777a(parcel, i));
    }

    /* renamed from: a */
    private static void m23779a(Parcel parcel, int i, int i2) {
        i = C5466a.m23777a(parcel, i);
        if (i != i2) {
            String valueOf = String.valueOf(Integer.toHexString(i));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
            stringBuilder.append("Expected size ");
            stringBuilder.append(i2);
            stringBuilder.append(" got ");
            stringBuilder.append(i);
            stringBuilder.append(" (0x");
            stringBuilder.append(valueOf);
            stringBuilder.append(")");
            throw new C5465a(stringBuilder.toString(), parcel);
        }
    }

    /* renamed from: c */
    public static boolean m23783c(Parcel parcel, int i) {
        C5466a.m23779a(parcel, i, 4);
        return parcel.readInt() != null ? true : null;
    }

    /* renamed from: d */
    public static byte m23784d(Parcel parcel, int i) {
        C5466a.m23779a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: e */
    public static short m23785e(Parcel parcel, int i) {
        C5466a.m23779a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: f */
    public static int m23786f(Parcel parcel, int i) {
        C5466a.m23779a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: g */
    public static Integer m23787g(Parcel parcel, int i) {
        i = C5466a.m23777a(parcel, i);
        if (i == 0) {
            return null;
        }
        if (i == 4) {
            return Integer.valueOf(parcel.readInt());
        }
        String valueOf = String.valueOf(Integer.toHexString(i));
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
        stringBuilder.append("Expected size 4");
        stringBuilder.append(" got ");
        stringBuilder.append(i);
        stringBuilder.append(" (0x");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: h */
    public static long m23788h(Parcel parcel, int i) {
        C5466a.m23779a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: i */
    public static float m23789i(Parcel parcel, int i) {
        C5466a.m23779a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: j */
    public static double m23790j(Parcel parcel, int i) {
        C5466a.m23779a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: k */
    public static String m23791k(Parcel parcel, int i) {
        i = C5466a.m23777a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + i);
        return readString;
    }

    /* renamed from: l */
    public static IBinder m23792l(Parcel parcel, int i) {
        i = C5466a.m23777a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + i);
        return readStrongBinder;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m23778a(Parcel parcel, int i, Creator<T> creator) {
        i = C5466a.m23777a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + i);
        return parcelable;
    }

    /* renamed from: m */
    public static Bundle m23793m(Parcel parcel, int i) {
        i = C5466a.m23777a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + i);
        return readBundle;
    }

    /* renamed from: n */
    public static byte[] m23794n(Parcel parcel, int i) {
        i = C5466a.m23777a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + i);
        return createByteArray;
    }

    /* renamed from: b */
    public static <T> T[] m23781b(Parcel parcel, int i, Creator<T> creator) {
        i = C5466a.m23777a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        creator = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + i);
        return creator;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m23782c(Parcel parcel, int i, Creator<T> creator) {
        i = C5466a.m23777a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        creator = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + i);
        return creator;
    }

    /* renamed from: a */
    public static int m23776a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = C5466a.m23777a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new C5465a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        a += dataPosition;
        if (a >= dataPosition) {
            if (a <= parcel.dataSize()) {
                return a;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Size read is invalid start=");
        stringBuilder.append(dataPosition);
        stringBuilder.append(" end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
