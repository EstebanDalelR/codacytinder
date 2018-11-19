package com.google.android.m4b.maps.p108h;

import android.os.Bundle;
import android.util.Log;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5407c.C7690a;
import com.google.android.m4b.maps.p108h.C6689h.C5421e;
import com.google.android.m4b.maps.p110j.C5462v;

/* renamed from: com.google.android.m4b.maps.h.e */
public final class C6680e implements C5422i {
    /* renamed from: a */
    private final C6689h f24982a;

    /* renamed from: a */
    public final void mo5405a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo5406a(C6676a c6676a, C5406b<?> c5406b, int i) {
    }

    /* renamed from: b */
    public final void mo5408b() {
    }

    /* renamed from: c */
    public final String mo5410c() {
        return "CONNECTED";
    }

    public C6680e(C6689h c6689h) {
        this.f24982a = c6689h;
    }

    /* renamed from: a */
    public final void mo5403a() {
        while (!this.f24982a.f25015b.isEmpty()) {
            try {
                m29760a((C5421e) this.f24982a.f25015b.remove());
            } catch (Throwable e) {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", e);
            }
        }
    }

    /* renamed from: a */
    public final <A extends C5401a, R extends C5427m, T extends C7690a<R, A>> T mo5402a(T t) {
        return mo5407b((C7690a) t);
    }

    /* renamed from: b */
    public final <A extends com.google.android.m4b.maps.p108h.C5406b.C5401a, T extends com.google.android.m4b.maps.p108h.C5407c.C7690a<? extends com.google.android.m4b.maps.p108h.C5427m, A>> T mo5407b(T r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r1.m29760a(r2);	 Catch:{ DeadObjectException -> 0x0004 }
        goto L_0x0008;
    L_0x0004:
        r0 = 1;
        r1.mo5404a(r0);
    L_0x0008:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.h.e.b(com.google.android.m4b.maps.h.c$a):T");
    }

    /* renamed from: a */
    public final void mo5404a(int i) {
        Object obj = i == -1 ? 1 : null;
        if (obj != null) {
            this.f24982a.m29842f();
            this.f24982a.f25018e.clear();
        } else {
            for (C5421e b : this.f24982a.f25020g) {
                b.m23634b(new C6691q(8, "The connection to Google Play services was lost"));
            }
        }
        this.f24982a.m29830a(null);
        if (obj == null) {
            this.f24982a.f25014a.m23685a(i);
        }
        this.f24982a.f25014a.m23684a();
    }

    /* renamed from: b */
    public final void mo5409b(int i) {
        switch (i) {
            case 1:
                this.f24982a.m29846j();
                mo5404a(i);
                break;
            case 2:
                mo5404a(i);
                this.f24982a.mo5420b();
                return;
            default:
                break;
        }
    }

    /* renamed from: a */
    private <A extends C5401a> void m29760a(C5421e<A> c5421e) {
        this.f24982a.m29833a((C5421e) c5421e);
        C6689h c6689h = this.f24982a;
        C5401a c5401a = (C5401a) c6689h.f25017d.get(c5421e.mo7233b());
        C5462v.m23768a((Object) c5401a, (Object) "Appropriate Api was not requested.");
        if (c5401a.mo5413e() || !this.f24982a.f25018e.containsKey(c5421e.mo7233b())) {
            c5421e.mo7234b(c5401a);
        } else {
            c5421e.mo7235c(new C6691q(17));
        }
    }
}
