package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.SystemClock;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.o.p */
public final class C6745p implements C5468c {
    public static final C5498q CREATOR = new C5498q();
    /* renamed from: a */
    int f25270a;
    /* renamed from: b */
    long f25271b;
    /* renamed from: c */
    long f25272c;
    /* renamed from: d */
    boolean f25273d;
    /* renamed from: e */
    long f25274e;
    /* renamed from: f */
    int f25275f;
    /* renamed from: g */
    float f25276g;
    /* renamed from: h */
    long f25277h;
    /* renamed from: i */
    private final int f25278i;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static C6745p m30054a() {
        return new C6745p();
    }

    public C6745p() {
        this.f25278i = 1;
        this.f25270a = 102;
        this.f25271b = 3600000;
        this.f25272c = 600000;
        this.f25273d = false;
        this.f25274e = Format.OFFSET_SAMPLE_RELATIVE;
        this.f25275f = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f25276g = 0.0f;
        this.f25277h = 0;
    }

    /* renamed from: a */
    public final C6745p m30057a(long j) {
        C6745p.m30055c(5000);
        this.f25271b = 5000;
        if (this.f25273d == null) {
            this.f25272c = (long) (((double) this.f25271b) / 4618441417868443648L);
        }
        return this;
    }

    /* renamed from: b */
    public final C6745p m30059b(long j) {
        C6745p.m30055c(16);
        this.f25273d = true;
        this.f25272c = 16;
        return this;
    }

    /* renamed from: c */
    private static void m30055c(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("invalid interval: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    C6745p(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f, long j4) {
        this.f25278i = i;
        this.f25270a = i2;
        this.f25271b = j;
        this.f25272c = j2;
        this.f25273d = z;
        this.f25274e = j3;
        this.f25275f = i3;
        this.f25276g = f;
        this.f25277h = j4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5498q.m23974a(this, parcel);
    }

    public final String toString() {
        String str;
        long j;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Request[");
        switch (this.f25270a) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        stringBuilder2.append(str);
        if (this.f25270a != 105) {
            stringBuilder2.append(" requested=");
            j = this.f25271b;
            stringBuilder = new StringBuilder(22);
            stringBuilder.append(j);
            stringBuilder.append("ms");
            stringBuilder2.append(stringBuilder.toString());
        }
        stringBuilder2.append(" fastest=");
        j = this.f25272c;
        stringBuilder = new StringBuilder(22);
        stringBuilder.append(j);
        stringBuilder.append("ms");
        stringBuilder2.append(stringBuilder.toString());
        if (this.f25277h > this.f25271b) {
            stringBuilder2.append(" maxWait=");
            j = this.f25277h;
            stringBuilder = new StringBuilder(22);
            stringBuilder.append(j);
            stringBuilder.append("ms");
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.f25274e != Format.OFFSET_SAMPLE_RELATIVE) {
            long elapsedRealtime = this.f25274e - SystemClock.elapsedRealtime();
            stringBuilder2.append(" expireIn=");
            StringBuilder stringBuilder3 = new StringBuilder(22);
            stringBuilder3.append(elapsedRealtime);
            stringBuilder3.append("ms");
            stringBuilder2.append(stringBuilder3.toString());
        }
        if (this.f25275f != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            stringBuilder2.append(" num=");
            stringBuilder2.append(this.f25275f);
        }
        stringBuilder2.append(']');
        return stringBuilder2.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25270a), Long.valueOf(this.f25271b), Long.valueOf(this.f25272c), Boolean.valueOf(this.f25273d), Long.valueOf(this.f25274e), Integer.valueOf(this.f25275f), Float.valueOf(this.f25276g)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6745p)) {
            return false;
        }
        C6745p c6745p = (C6745p) obj;
        return this.f25270a == c6745p.f25270a && this.f25271b == c6745p.f25271b && this.f25272c == c6745p.f25272c && this.f25273d == c6745p.f25273d && this.f25274e == c6745p.f25274e && this.f25275f == c6745p.f25275f && this.f25276g == c6745p.f25276g;
    }

    /* renamed from: b */
    final int m30058b() {
        return this.f25278i;
    }

    /* renamed from: a */
    public final C6745p m30056a(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                this.f25270a = i;
                return this;
            default:
                StringBuilder stringBuilder = new StringBuilder(28);
                stringBuilder.append("invalid quality: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
