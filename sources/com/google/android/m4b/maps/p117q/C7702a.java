package com.google.android.m4b.maps.p117q;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p110j.C6702k;
import com.google.android.m4b.maps.p117q.C5509f.C6758a;

/* renamed from: com.google.android.m4b.maps.q.a */
public class C7702a extends C6702k<C5509f> {
    /* renamed from: c */
    protected final C5516p<C5509f> f28173c = new C67521(this);
    /* renamed from: d */
    private final String f28174d;

    /* renamed from: com.google.android.m4b.maps.q.a$1 */
    class C67521 implements C5516p<C5509f> {
        /* renamed from: a */
        private /* synthetic */ C7702a f25302a;

        C67521(C7702a c7702a) {
            this.f25302a = c7702a;
        }

        /* renamed from: a */
        public final void mo5641a() {
            this.f25302a.m29905m();
        }

        /* renamed from: b */
        public final /* synthetic */ IInterface mo5642b() {
            return (C5509f) this.f25302a.m29906n();
        }
    }

    /* renamed from: a */
    protected final String mo7228a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: b */
    protected final String mo7229b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public C7702a(Context context, Looper looper, C5409b c5409b, C5411d c5411d, String str, C5441f c5441f) {
        super(context, looper, 23, c5409b, c5411d, c5441f);
        this.f28174d = str;
    }

    /* renamed from: l */
    protected final Bundle mo7238l() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f28174d);
        return bundle;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo7227a(IBinder iBinder) {
        return C6758a.m30113a(iBinder);
    }
}
