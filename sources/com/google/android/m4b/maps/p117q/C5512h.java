package com.google.android.m4b.maps.p117q;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p115o.C5494k;
import com.google.android.m4b.maps.p115o.C5494k.C6741a;
import com.google.android.m4b.maps.p115o.C5495l;
import com.google.android.m4b.maps.p115o.C5495l.C6743a;
import com.google.android.m4b.maps.p115o.C5497o;
import com.google.android.m4b.maps.p115o.C6744m;
import com.google.android.m4b.maps.p115o.C6745p;
import com.google.android.m4b.maps.p115o.C6746r;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.q.h */
public final class C5512h {
    /* renamed from: a */
    private final C5516p<C5509f> f20521a;
    /* renamed from: b */
    private final Context f20522b;
    /* renamed from: c */
    private ContentProviderClient f20523c = null;
    /* renamed from: d */
    private boolean f20524d = false;
    /* renamed from: e */
    private Map<C5497o, C7704c> f20525e = new HashMap();
    /* renamed from: f */
    private Map<Object, C7703a> f20526f = new HashMap();

    /* renamed from: com.google.android.m4b.maps.q.h$b */
    static class C5511b extends Handler {
        /* renamed from: a */
        private final C5497o f20520a;

        public C5511b(C5497o c5497o) {
            this.f20520a = c5497o;
        }

        public C5511b(C5497o c5497o, Looper looper) {
            super(looper);
            this.f20520a = c5497o;
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                return;
            }
            this.f20520a.mo7150a(new Location((Location) message.obj));
        }
    }

    /* renamed from: com.google.android.m4b.maps.q.h$a */
    static class C7703a extends C6741a {
        /* renamed from: a */
        public final void mo5639a(C6746r c6746r) {
            m33414a(0, c6746r);
        }

        /* renamed from: a */
        public final void mo5638a(C6744m c6744m) {
            m33414a(1, c6744m);
        }

        /* renamed from: a */
        private void m33414a(int i, Object obj) {
            Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
        }
    }

    /* renamed from: com.google.android.m4b.maps.q.h$c */
    static class C7704c extends C6743a {
        /* renamed from: a */
        private Handler f28175a;

        C7704c(C5497o c5497o, Looper looper) {
            if (looper == null) {
                C5462v.m23771a(Looper.myLooper() != null, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
            }
            this.f28175a = looper == null ? new C5511b(c5497o) : new C5511b(c5497o, looper);
        }

        /* renamed from: a */
        public final void mo5640a(Location location) {
            if (this.f28175a == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = location;
            this.f28175a.sendMessage(obtain);
        }
    }

    public C5512h(Context context, C5516p<C5509f> c5516p) {
        this.f20522b = context;
        this.f20521a = c5516p;
    }

    /* renamed from: a */
    public final void m24015a(C6745p c6745p, C5497o c5497o, Looper looper) {
        this.f20521a.mo5641a();
        ((C5509f) this.f20521a.mo5642b()).mo5664a(C6762l.m30119a(C6761j.m30115a(c6745p), m24013a(c5497o, looper)));
    }

    /* renamed from: a */
    private C7704c m24013a(C5497o c5497o, Looper looper) {
        C7704c c7704c;
        synchronized (this.f20525e) {
            c7704c = (C7704c) this.f20525e.get(c5497o);
            if (c7704c == null) {
                c7704c = new C7704c(c5497o, looper);
            }
            this.f20525e.put(c5497o, c7704c);
        }
        return c7704c;
    }

    /* renamed from: a */
    public final void m24014a() {
        try {
            synchronized (this.f20525e) {
                for (C5495l c5495l : this.f20525e.values()) {
                    if (c5495l != null) {
                        ((C5509f) this.f20521a.mo5642b()).mo5664a(C6762l.m30118a(c5495l));
                    }
                }
                this.f20525e.clear();
                for (C5494k c5494k : this.f20526f.values()) {
                    if (c5494k != null) {
                        ((C5509f) this.f20521a.mo5642b()).mo5664a(C6762l.m30117a(c5494k));
                    }
                }
                this.f20526f.clear();
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public final void m24016b() {
        if (this.f20524d) {
            try {
                this.f20521a.mo5641a();
                ((C5509f) this.f20521a.mo5642b()).mo5666a(false);
                this.f20524d = false;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
