package com.google.android.m4b.maps.p117q;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p115o.C5497o;
import com.google.android.m4b.maps.p115o.C6745p;
import com.google.android.m4b.maps.p116p.C5505c;
import com.google.android.m4b.maps.p116p.C6751a;

/* renamed from: com.google.android.m4b.maps.q.i */
public final class C8090i extends C7702a {
    /* renamed from: d */
    private final C5512h f29044d;
    /* renamed from: e */
    private final C5505c f29045e;

    /* renamed from: o */
    public final boolean mo7582o() {
        return true;
    }

    public C8090i(Context context, Looper looper, C5409b c5409b, C5411d c5411d, String str, C5441f c5441f) {
        this(context, looper, c5409b, c5411d, str, c5441f, C6751a.f25298a);
    }

    private C8090i(Context context, Looper looper, C5409b c5409b, C5411d c5411d, String str, C5441f c5441f, C6751a c6751a) {
        super(context, looper, c5409b, c5411d, str, c5441f);
        this.f29044d = new C5512h(context, this.c);
        this.f29045e = C5505c.m23981a(context, c5441f.m23663a(), c5441f.m23670g(), this.c, c6751a);
    }

    /* renamed from: d */
    public final void mo5432d() {
        synchronized (this.f29044d) {
            if (mo5413e()) {
                try {
                    this.f29044d.m24014a();
                    this.f29044d.m24016b();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo5432d();
        }
    }

    /* renamed from: a */
    public final void m34413a(C6745p c6745p, C5497o c5497o, Looper looper) {
        synchronized (this.f29044d) {
            this.f29044d.m24015a(c6745p, c5497o, null);
        }
    }
}
