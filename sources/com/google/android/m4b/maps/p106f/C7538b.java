package com.google.android.m4b.maps.p106f;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.m4b.maps.p106f.C5368d.C6675a;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p110j.C6702k;

/* renamed from: com.google.android.m4b.maps.f.b */
public final class C7538b extends C6702k<C5368d> {
    /* renamed from: c */
    private final String f28147c;

    /* renamed from: a */
    protected final String mo7228a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* renamed from: b */
    protected final String mo7229b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    public C7538b(Context context, Looper looper, C5409b c5409b, C5411d c5411d, String str) {
        super(context, looper, 40, c5409b, c5411d);
        this.f28147c = str;
    }

    protected final String j_() {
        return this.f28147c;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo7227a(IBinder iBinder) {
        return C6675a.m29743a(iBinder);
    }
}
