package com.google.android.m4b.maps.p108h;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5406b.C5402b;
import com.google.android.m4b.maps.p108h.C5406b.C5403c;
import com.google.android.m4b.maps.p108h.C5407c.C7690a;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5410c;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p108h.C6689h.C5421e;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p110j.C5441f.C5440a;
import com.google.android.m4b.maps.p110j.C5455p;
import com.google.android.m4b.maps.p110j.C5459t.C6711a;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p110j.C6713y;
import com.google.android.m4b.maps.p121u.C5524d;
import com.google.android.m4b.maps.p121u.C6773c;
import com.google.android.m4b.maps.p122v.C6774a;
import com.google.android.m4b.maps.p122v.C7705c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.m4b.maps.h.f */
public final class C6683f implements C5422i {
    /* renamed from: a */
    private final C6689h f24987a;
    /* renamed from: b */
    private final Lock f24988b;
    /* renamed from: c */
    private final Context f24989c;
    /* renamed from: d */
    private C6676a f24990d;
    /* renamed from: e */
    private int f24991e;
    /* renamed from: f */
    private int f24992f = 0;
    /* renamed from: g */
    private boolean f24993g = false;
    /* renamed from: h */
    private int f24994h;
    /* renamed from: i */
    private final Bundle f24995i = new Bundle();
    /* renamed from: j */
    private final Set<C5403c> f24996j = new HashSet();
    /* renamed from: k */
    private C6773c f24997k;
    /* renamed from: l */
    private int f24998l;
    /* renamed from: m */
    private boolean f24999m;
    /* renamed from: n */
    private boolean f25000n;
    /* renamed from: o */
    private C5455p f25001o;
    /* renamed from: p */
    private boolean f25002p;
    /* renamed from: q */
    private boolean f25003q;
    /* renamed from: r */
    private final C5441f f25004r;
    /* renamed from: s */
    private final Map<C5406b<?>, Integer> f25005s;
    /* renamed from: t */
    private final C5402b<? extends C6773c, C5524d> f25006t;

    /* renamed from: com.google.android.m4b.maps.h.f$c */
    static class C6681c implements C5410c {
        /* renamed from: a */
        private final WeakReference<C6683f> f24983a;
        /* renamed from: b */
        private final C5406b<?> f24984b;
        /* renamed from: c */
        private final int f24985c;

        public C6681c(C6683f c6683f, C5406b<?> c5406b, int i) {
            this.f24983a = new WeakReference(c6683f);
            this.f24984b = c5406b;
            this.f24985c = i;
        }

        /* renamed from: a */
        public final void mo5411a(C6676a c6676a) {
            C6683f c6683f = (C6683f) this.f24983a.get();
            if (c6683f != null) {
                C5462v.m23771a(Looper.myLooper() == c6683f.f24987a.mo5414a(), (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
                c6683f.f24988b.lock();
                try {
                    if (c6683f.m29788c(0)) {
                        if (!c6676a.m29746b()) {
                            c6683f.m29784b(c6676a, this.f24984b, this.f24985c);
                        }
                        if (c6683f.m29791d() != null) {
                            C6683f.m29797g(c6683f);
                        }
                        c6683f.f24988b.unlock();
                    }
                } finally {
                    c6683f.f24988b.unlock();
                }
            }
        }

        /* renamed from: b */
        public final void mo5412b(C6676a c6676a) {
            C6683f c6683f = (C6683f) this.f24983a.get();
            if (c6683f != null) {
                C5462v.m23771a(Looper.myLooper() == c6683f.f24987a.mo5414a(), (Object) "onReportAccountValidation must be called on the GoogleApiClient handler thread");
                c6683f.f24988b.lock();
                try {
                    if (c6683f.m29788c(1)) {
                        if (!c6676a.m29746b()) {
                            c6683f.m29784b(c6676a, this.f24984b, this.f24985c);
                        }
                        if (c6683f.m29791d() != null) {
                            c6683f.m29794f();
                        }
                        c6683f.f24988b.unlock();
                    }
                } finally {
                    c6683f.f24988b.unlock();
                }
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.f$d */
    class C6682d implements C5409b, C5411d {
        /* renamed from: a */
        private /* synthetic */ C6683f f24986a;

        /* renamed from: a */
        public final void mo5305a(int i) {
        }

        private C6682d(C6683f c6683f) {
            this.f24986a = c6683f;
        }

        /* renamed from: a */
        public final void mo5306a(Bundle bundle) {
            this.f24986a.f24997k.mo7243a(new C7691b(this.f24986a));
        }

        /* renamed from: a */
        public final void mo5307a(C6676a c6676a) {
            this.f24986a.f24988b.lock();
            try {
                if (this.f24986a.m29780a(c6676a)) {
                    this.f24986a.m29800i();
                    this.f24986a.m29796g();
                } else {
                    this.f24986a.m29783b(c6676a);
                }
                this.f24986a.f24988b.unlock();
            } catch (Throwable th) {
                this.f24986a.f24988b.unlock();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.f$b */
    static class C7691b extends C6711a {
        /* renamed from: a */
        private final WeakReference<C6683f> f28150a;

        C7691b(C6683f c6683f) {
            this.f28150a = new WeakReference(c6683f);
        }

        /* renamed from: a */
        public final void mo5484a(final C6713y c6713y) {
            final C6683f c6683f = (C6683f) this.f28150a.get();
            if (c6683f != null) {
                c6683f.f24987a.f25016c.post(new Runnable(this) {
                    /* renamed from: c */
                    private /* synthetic */ C7691b f20371c;

                    public final void run() {
                        C6683f.m29778a(c6683f, c6713y);
                    }
                });
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.f$a */
    static class C8088a extends C7705c {
        /* renamed from: a */
        private final WeakReference<C6683f> f29043a;

        C8088a(C6683f c6683f) {
            this.f29043a = new WeakReference(c6683f);
        }

        /* renamed from: a */
        public final void mo5678a(final C6676a c6676a, C6774a c6774a) {
            final C6683f c6683f = (C6683f) this.f29043a.get();
            if (c6683f != null) {
                c6683f.f24987a.f25016c.post(new Runnable(this) {
                    /* renamed from: c */
                    private /* synthetic */ C8088a f20368c;

                    public final void run() {
                        C6683f.m29787c(c6683f, c6676a);
                    }
                });
            }
        }
    }

    /* renamed from: d */
    private static String m29789d(int i) {
        switch (i) {
            case 0:
                return "STEP_GETTING_SERVICE_BINDINGS";
            case 1:
                return "STEP_VALIDATING_ACCOUNT";
            case 2:
                return "STEP_AUTHENTICATING";
            case 3:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public final String mo5410c() {
        return "CONNECTING";
    }

    public C6683f(C6689h c6689h, C5441f c5441f, Map<C5406b<?>, Integer> map, C5402b<? extends C6773c, C5524d> c5402b, Lock lock, Context context) {
        this.f24987a = c6689h;
        this.f25004r = c5441f;
        this.f25005s = map;
        this.f25006t = c5402b;
        this.f24988b = lock;
        this.f24989c = context;
    }

    /* renamed from: a */
    public final void mo5403a() {
        this.f24987a.f25014a.m23690b();
        this.f24987a.f25018e.clear();
        this.f24993g = false;
        this.f24999m = false;
        this.f24990d = null;
        this.f24992f = 0;
        this.f24998l = 2;
        this.f25000n = false;
        this.f25002p = false;
        int a = C5398g.m23576a(this.f24989c);
        if (a != 0) {
            final C6676a c6676a = new C6676a(a, null);
            this.f24987a.f25016c.post(new Runnable(this) {
                /* renamed from: b */
                private /* synthetic */ C6683f f20365b;

                public final void run() {
                    this.f20365b.f24988b.lock();
                    try {
                        this.f20365b.m29783b(c6676a);
                    } finally {
                        this.f20365b.f24988b.unlock();
                    }
                }
            });
            return;
        }
        Map hashMap = new HashMap();
        for (C5406b c5406b : this.f25005s.keySet()) {
            C5401a c5401a = (C5401a) this.f24987a.f25017d.get(c5406b.m23604c());
            int intValue = ((Integer) this.f25005s.get(c5406b)).intValue();
            c5406b.m23602a();
            if (c5401a.mo5433f()) {
                this.f24999m = true;
                if (intValue < this.f24998l) {
                    this.f24998l = intValue;
                }
                if (intValue != 0) {
                    this.f24996j.add(c5406b.m23604c());
                }
            }
            hashMap.put(c5401a, new C6681c(this, c5406b, intValue));
        }
        if (this.f24999m) {
            this.f25004r.m23664a(Integer.valueOf(System.identityHashCode(this.f24987a)));
            C5411d c6682d = new C6682d();
            this.f24997k = (C6773c) this.f25006t.mo5396a(this.f24989c, this.f24987a.mo5414a(), this.f25004r, this.f25004r.m23672i(), c6682d, c6682d);
            this.f24997k.mo7245g();
        }
        this.f24994h = this.f24987a.f25017d.size();
        for (C5401a c5401a2 : this.f24987a.f25017d.values()) {
            c5401a2.mo5428a((C5410c) hashMap.get(c5401a2));
        }
    }

    /* renamed from: d */
    private boolean m29791d() {
        this.f24994h--;
        if (this.f24994h > 0) {
            return false;
        }
        if (this.f24994h < 0) {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            m29783b(new C6676a(8, null));
            return false;
        } else if (this.f24990d == null) {
            return true;
        } else {
            m29783b(this.f24990d);
            return false;
        }
    }

    /* renamed from: e */
    private void m29792e() {
        if (this.f25000n && this.f24994h == 0) {
            this.f24992f = 1;
            this.f24994h = this.f24987a.f25017d.size();
            for (C5403c c5403c : this.f24987a.f25017d.keySet()) {
                if (!this.f24987a.f25018e.containsKey(c5403c)) {
                    ((C5401a) this.f24987a.f25017d.get(c5403c)).mo5429a(this.f25001o);
                } else if (m29791d()) {
                    m29794f();
                }
            }
        }
    }

    /* renamed from: f */
    private void m29794f() {
        this.f24992f = 2;
        this.f24987a.f25019f = m29801j();
        this.f24997k.mo7241a(this.f25001o, this.f24987a.f25019f, new C8088a(this));
    }

    /* renamed from: g */
    private void m29796g() {
        Set set = this.f24987a.f25019f;
        if (set.isEmpty()) {
            set = m29801j();
        }
        this.f24992f = 3;
        this.f24994h = this.f24987a.f25017d.size();
        for (C5403c c5403c : this.f24987a.f25017d.keySet()) {
            if (!this.f24987a.f25018e.containsKey(c5403c)) {
                ((C5401a) this.f24987a.f25017d.get(c5403c)).mo5430a(this.f25001o, set);
            } else if (m29791d()) {
                m29798h();
            }
        }
    }

    /* renamed from: a */
    public final void mo5405a(Bundle bundle) {
        if (m29788c(3)) {
            if (bundle != null) {
                this.f24995i.putAll(bundle);
            }
            if (m29791d() != null) {
                m29798h();
            }
        }
    }

    /* renamed from: a */
    public final void mo5406a(C6676a c6676a, C5406b<?> c5406b, int i) {
        if (m29788c(3)) {
            m29784b(c6676a, c5406b, i);
            if (m29791d() != null) {
                m29798h();
            }
        }
    }

    /* renamed from: h */
    private void m29798h() {
        this.f24987a.m29844h();
        if (this.f24997k != null) {
            if (this.f25002p) {
                this.f24997k.mo7242a(this.f25001o, this.f25003q);
            }
            m29779a(false);
        }
        for (C5403c c5403c : this.f24987a.f25018e.keySet()) {
            ((C5401a) this.f24987a.f25017d.get(c5403c)).mo5432d();
        }
        if (this.f24993g) {
            this.f24993g = false;
            mo5404a(-1);
            return;
        }
        this.f24987a.f25014a.m23686a(this.f24995i.isEmpty() ? null : this.f24995i);
    }

    /* renamed from: a */
    public final <A extends C5401a, R extends C5427m, T extends C7690a<R, A>> T mo5402a(T t) {
        this.f24987a.f25015b.add(t);
        return t;
    }

    /* renamed from: b */
    public final <A extends C5401a, T extends C7690a<? extends C5427m, A>> T mo5407b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final void mo5408b() {
        this.f24993g = false;
    }

    /* renamed from: a */
    public final void mo5404a(int i) {
        if (i == -1) {
            i = this.f24987a.f25015b.iterator();
            while (i.hasNext()) {
                ((C5421e) i.next()).m23630a();
                i.remove();
            }
            this.f24987a.m29842f();
            if (this.f24990d == 0 && this.f24987a.f25015b.isEmpty() == 0) {
                this.f24993g = true;
                return;
            }
            this.f24987a.f25018e.clear();
            this.f24990d = 0;
            m29779a(true);
        }
        this.f24987a.m29830a(this.f24990d);
    }

    /* renamed from: b */
    public final void mo5409b(int i) {
        m29783b(new C6676a(8, null));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m29784b(com.google.android.m4b.maps.p107g.C6676a r4, com.google.android.m4b.maps.p108h.C5406b<?> r5, int r6) {
        /*
        r3 = this;
        r0 = 2;
        if (r6 == r0) goto L_0x0032;
    L_0x0003:
        r5.m23602a();
        r0 = 0;
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = 1;
        if (r6 != r2) goto L_0x0023;
    L_0x000d:
        r6 = r4.m29745a();
        if (r6 == 0) goto L_0x0015;
    L_0x0013:
        r6 = 1;
        goto L_0x0021;
    L_0x0015:
        r6 = r4.m29747c();
        r6 = com.google.android.m4b.maps.p107g.C5398g.m23577a(r6);
        if (r6 == 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0013;
    L_0x0020:
        r6 = 0;
    L_0x0021:
        if (r6 == 0) goto L_0x002c;
    L_0x0023:
        r6 = r3.f24990d;
        if (r6 == 0) goto L_0x002b;
    L_0x0027:
        r6 = r3.f24991e;
        if (r1 >= r6) goto L_0x002c;
    L_0x002b:
        r0 = 1;
    L_0x002c:
        if (r0 == 0) goto L_0x0032;
    L_0x002e:
        r3.f24990d = r4;
        r3.f24991e = r1;
    L_0x0032:
        r6 = r3.f24987a;
        r6 = r6.f25018e;
        r5 = r5.m23604c();
        r6.put(r5, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.h.f.b(com.google.android.m4b.maps.g.a, com.google.android.m4b.maps.h.b, int):void");
    }

    /* renamed from: i */
    private void m29800i() {
        this.f24999m = false;
        this.f24987a.f25019f.clear();
        for (C5403c c5403c : this.f24996j) {
            if (!this.f24987a.f25018e.containsKey(c5403c)) {
                this.f24987a.f25018e.put(c5403c, new C6676a(17, null));
            }
        }
    }

    /* renamed from: a */
    private boolean m29780a(C6676a c6676a) {
        if (this.f24998l != 2) {
            if (this.f24998l != 1 || c6676a.m29745a() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m29783b(C6676a c6676a) {
        this.f24993g = false;
        this.f24987a.f25019f.clear();
        this.f24990d = c6676a;
        m29779a(c6676a.m29745a() ^ 1);
        mo5404a(3);
        if (!(this.f24987a.m29845i() && C5398g.m23585b(this.f24989c, c6676a.m29747c()))) {
            this.f24987a.m29847k();
            this.f24987a.f25014a.m23687a(c6676a);
        }
        this.f24987a.f25014a.m23684a();
    }

    /* renamed from: a */
    private void m29779a(boolean z) {
        if (this.f24997k != null) {
            if (this.f24997k.mo5413e()) {
                if (z) {
                    this.f24997k.mo7244c();
                }
                this.f24997k.mo5432d();
            }
            this.f25001o = false;
        }
    }

    /* renamed from: j */
    private Set<C6690o> m29801j() {
        Set<C6690o> hashSet = new HashSet(this.f25004r.m23667d());
        Map f = this.f25004r.m23669f();
        for (C5406b c5406b : f.keySet()) {
            if (!this.f24987a.f25018e.containsKey(c5406b.m23604c())) {
                hashSet.addAll(((C5440a) f.get(c5406b)).f20401a);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private boolean m29788c(int i) {
        if (this.f24992f == i) {
            return true;
        }
        String d = C6683f.m29789d(this.f24992f);
        i = C6683f.m29789d(i);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(d).length() + 70) + String.valueOf(i).length());
        stringBuilder.append("GoogleApiClient connecting is in step ");
        stringBuilder.append(d);
        stringBuilder.append(" but received callback for step ");
        stringBuilder.append(i);
        Log.wtf("GoogleApiClientConnecting", stringBuilder.toString());
        m29783b(new C6676a(8, null));
        return false;
    }

    /* renamed from: a */
    static /* synthetic */ void m29778a(C6683f c6683f, C6713y c6713y) {
        C6676a b = c6713y.m29970b();
        c6683f.f24988b.lock();
        try {
            if (c6683f.m29788c(0)) {
                if (b.m29746b()) {
                    c6683f.f25001o = c6713y.m29969a();
                    c6683f.f25000n = true;
                    c6683f.f25002p = c6713y.m29971c();
                    c6683f.f25003q = c6713y.m29972d();
                    c6683f.m29792e();
                } else if (c6683f.m29780a(b) != null) {
                    c6683f.m29800i();
                    if (c6683f.f24994h == null) {
                        c6683f.m29796g();
                    }
                } else {
                    c6683f.m29783b(b);
                }
                c6683f.f24988b.unlock();
            }
        } finally {
            c6683f.f24988b.unlock();
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m29797g(C6683f c6683f) {
        if (c6683f.f24999m) {
            c6683f.m29792e();
        } else {
            c6683f.m29796g();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m29787c(C6683f c6683f, C6676a c6676a) {
        c6683f.f24988b.lock();
        try {
            if (c6683f.m29788c(2)) {
                if (c6676a.m29746b()) {
                    c6683f.m29796g();
                } else if (c6683f.m29780a(c6676a)) {
                    c6683f.m29800i();
                    c6683f.m29796g();
                } else {
                    c6683f.m29783b(c6676a);
                }
                c6683f.f24988b.unlock();
            }
        } finally {
            c6683f.f24988b.unlock();
        }
    }
}
