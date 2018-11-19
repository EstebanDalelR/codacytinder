package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public final class oi {
    /* renamed from: A */
    public static void m20054A(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Overread allowed size end=");
            stringBuilder.append(i);
            throw new zzbfo(stringBuilder.toString(), parcel);
        }
    }

    /* renamed from: a */
    public static int m20055a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = m20056a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new zzbfo(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
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
        throw new zzbfo(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public static int m20056a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m20057a(Parcel parcel, int i, Creator<T> creator) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + i);
        return parcelable;
    }

    /* renamed from: a */
    private static void m20058a(Parcel parcel, int i, int i2) {
        i = m20056a(parcel, i);
        if (i != i2) {
            String toHexString = Integer.toHexString(i);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(toHexString).length() + 46);
            stringBuilder.append("Expected size ");
            stringBuilder.append(i2);
            stringBuilder.append(" got ");
            stringBuilder.append(i);
            stringBuilder.append(" (0x");
            stringBuilder.append(toHexString);
            stringBuilder.append(")");
            throw new zzbfo(stringBuilder.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m20059a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String toHexString = Integer.toHexString(i2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(toHexString).length() + 46);
            stringBuilder.append("Expected size ");
            stringBuilder.append(i3);
            stringBuilder.append(" got ");
            stringBuilder.append(i2);
            stringBuilder.append(" (0x");
            stringBuilder.append(toHexString);
            stringBuilder.append(")");
            throw new zzbfo(stringBuilder.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static void m20060b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m20056a(parcel, i));
    }

    /* renamed from: b */
    public static <T> T[] m20061b(Parcel parcel, int i, Creator<T> creator) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + i);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m20062c(Parcel parcel, int i, Creator<T> creator) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + i);
        return createTypedArrayList;
    }

    /* renamed from: c */
    public static boolean m20063c(Parcel parcel, int i) {
        m20058a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static short m20064d(Parcel parcel, int i) {
        m20058a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: e */
    public static int m20065e(Parcel parcel, int i) {
        m20058a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: f */
    public static long m20066f(Parcel parcel, int i) {
        m20058a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: g */
    public static Long m20067g(Parcel parcel, int i) {
        int a = m20056a(parcel, i);
        if (a == 0) {
            return null;
        }
        m20059a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: h */
    public static BigInteger m20068h(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + i);
        return new BigInteger(createByteArray);
    }

    /* renamed from: i */
    public static float m20069i(Parcel parcel, int i) {
        m20058a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: j */
    public static double m20070j(Parcel parcel, int i) {
        m20058a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: k */
    public static BigDecimal m20071k(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + i);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: l */
    public static String m20072l(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + i);
        return readString;
    }

    /* renamed from: m */
    public static IBinder m20073m(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + i);
        return readStrongBinder;
    }

    /* renamed from: n */
    public static Bundle m20074n(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + i);
        return readBundle;
    }

    /* renamed from: o */
    public static byte[] m20075o(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + i);
        return createByteArray;
    }

    /* renamed from: p */
    public static byte[][] m20076p(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + i);
        return bArr;
    }

    /* renamed from: q */
    public static boolean[] m20077q(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + i);
        return createBooleanArray;
    }

    /* renamed from: r */
    public static int[] m20078r(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + i);
        return createIntArray;
    }

    /* renamed from: s */
    public static long[] m20079s(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + i);
        return createLongArray;
    }

    /* renamed from: t */
    public static float[] m20080t(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + i);
        return createFloatArray;
    }

    /* renamed from: u */
    public static BigDecimal[] m20081u(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + i);
        return bigDecimalArr;
    }

    /* renamed from: v */
    public static String[] m20082v(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + i);
        return createStringArray;
    }

    /* renamed from: w */
    public static ArrayList<Integer> m20083w(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + i);
        return arrayList;
    }

    /* renamed from: x */
    public static ArrayList<String> m20084x(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + i);
        return createStringArrayList;
    }

    /* renamed from: y */
    public static Parcel m20085y(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, i);
        parcel.setDataPosition(dataPosition + i);
        return obtain;
    }

    /* renamed from: z */
    public static Parcel[] m20086z(Parcel parcel, int i) {
        i = m20056a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + i);
        return parcelArr;
    }
}
