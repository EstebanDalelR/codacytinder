package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Comparator;

/* renamed from: com.google.android.m4b.maps.o.c */
public final class C6737c implements C5468c {
    public static final C5489d CREATOR = new C5489d();
    /* renamed from: c */
    private static Comparator<C6737c> f25250c = new C54881();
    /* renamed from: a */
    int f25251a;
    /* renamed from: b */
    int f25252b;
    /* renamed from: d */
    private final int f25253d;

    /* renamed from: com.google.android.m4b.maps.o.c$1 */
    class C54881 implements Comparator<C6737c> {
        C54881() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C6737c c6737c = (C6737c) obj;
            C6737c c6737c2 = (C6737c) obj2;
            int compareTo = Integer.valueOf(c6737c2.f25252b).compareTo(Integer.valueOf(c6737c.f25252b));
            return compareTo == 0 ? Integer.valueOf(c6737c.m30041a()).compareTo(Integer.valueOf(c6737c2.m30041a())) : compareTo;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final int m30041a() {
        int i = this.f25251a;
        return i > 15 ? 4 : i;
    }

    public C6737c(int i, int i2, int i3) {
        this.f25253d = i;
        this.f25251a = i2;
        this.f25252b = i3;
    }

    /* renamed from: b */
    public final int m30042b() {
        return this.f25253d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5489d.m23962a(this, parcel);
    }

    public final String toString() {
        String str;
        int a = m30041a();
        switch (a) {
            case 0:
                str = "IN_VEHICLE";
                break;
            case 1:
                str = "ON_BICYCLE";
                break;
            case 2:
                str = "ON_FOOT";
                break;
            case 3:
                str = "STILL";
                break;
            case 4:
                str = "UNKNOWN";
                break;
            case 5:
                str = "TILTING";
                break;
            case 7:
                str = "WALKING";
                break;
            case 8:
                str = "RUNNING";
                break;
            default:
                str = Integer.toString(a);
                break;
        }
        int i = this.f25252b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 48);
        stringBuilder.append("DetectedActivity [type=");
        stringBuilder.append(str);
        stringBuilder.append(", confidence=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
