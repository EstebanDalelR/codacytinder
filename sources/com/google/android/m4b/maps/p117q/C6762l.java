package com.google.android.m4b.maps.p117q;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;
import com.google.android.m4b.maps.p115o.C5494k;
import com.google.android.m4b.maps.p115o.C5494k.C6741a;
import com.google.android.m4b.maps.p115o.C5495l;
import com.google.android.m4b.maps.p115o.C5495l.C6743a;

/* renamed from: com.google.android.m4b.maps.q.l */
public final class C6762l implements C5468c {
    public static final C5514m CREATOR = new C5514m();
    /* renamed from: a */
    int f25317a;
    /* renamed from: b */
    C6761j f25318b;
    /* renamed from: c */
    C5495l f25319c;
    /* renamed from: d */
    PendingIntent f25320d;
    /* renamed from: e */
    C5494k f25321e;
    /* renamed from: f */
    private final int f25322f;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static C6762l m30119a(C6761j c6761j, C5495l c5495l) {
        return new C6762l(1, 1, c6761j, c5495l.asBinder(), null, null);
    }

    /* renamed from: a */
    public static C6762l m30118a(C5495l c5495l) {
        return new C6762l(1, 2, null, c5495l.asBinder(), null, null);
    }

    /* renamed from: a */
    public static C6762l m30117a(C5494k c5494k) {
        return new C6762l(1, 2, null, null, null, c5494k.asBinder());
    }

    C6762l(int i, int i2, C6761j c6761j, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2) {
        this.f25322f = i;
        this.f25317a = i2;
        this.f25318b = c6761j;
        i = 0;
        if (iBinder == null) {
            i2 = 0;
        } else {
            i2 = C6743a.m30052a(iBinder);
        }
        this.f25319c = i2;
        this.f25320d = pendingIntent;
        if (iBinder2 != null) {
            i = C6741a.m30050a(iBinder2);
        }
        this.f25321e = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5514m.m24020a(this, parcel, i);
    }

    /* renamed from: a */
    final int m30120a() {
        return this.f25322f;
    }
}
