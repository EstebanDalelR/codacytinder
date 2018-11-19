package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.a */
public final class C6736a implements C5468c {
    public static final C5487b CREATOR = new C5487b();
    /* renamed from: a */
    List<C6737c> f25245a;
    /* renamed from: b */
    long f25246b;
    /* renamed from: c */
    long f25247c;
    /* renamed from: d */
    int f25248d;
    /* renamed from: e */
    private final int f25249e;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25245a);
        long j = this.f25246b;
        long j2 = this.f25247c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 124);
        stringBuilder.append("ActivityRecognitionResult [probableActivities=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", timeMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", elapsedRealtimeMillis=");
        stringBuilder.append(j2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public C6736a(int i, List<C6737c> list, long j, long j2, int i2) {
        this.f25249e = i;
        this.f25245a = list;
        this.f25246b = j;
        this.f25247c = j2;
        this.f25248d = i2;
    }

    /* renamed from: a */
    public final int m30040a() {
        return this.f25249e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5487b.m23961a(this, parcel);
    }
}
