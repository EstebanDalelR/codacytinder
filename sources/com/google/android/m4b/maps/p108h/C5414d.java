package com.google.android.m4b.maps.p108h;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5406b.C5402b;
import com.google.android.m4b.maps.p108h.C5407c.C7690a;
import com.google.android.m4b.maps.p108h.C7694t.C6693a;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p110j.C5441f.C5440a;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p121u.C5521a;
import com.google.android.m4b.maps.p121u.C5524d;
import com.google.android.m4b.maps.p121u.C5524d.C5523a;
import com.google.android.m4b.maps.p121u.C6773c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.h.d */
public interface C5414d {

    /* renamed from: com.google.android.m4b.maps.h.d$a */
    public static final class C5408a {
        /* renamed from: a */
        private final Set<C6690o> f20351a = new HashSet();
        /* renamed from: b */
        private String f20352b;
        /* renamed from: c */
        private String f20353c;
        /* renamed from: d */
        private final Map<C5406b<?>, C5440a> f20354d = new HashMap();
        /* renamed from: e */
        private final Context f20355e;
        /* renamed from: f */
        private final Map<C5406b<?>, Object> f20356f = new HashMap();
        /* renamed from: g */
        private int f20357g = -1;
        /* renamed from: h */
        private int f20358h = -1;
        /* renamed from: i */
        private Looper f20359i;
        /* renamed from: j */
        private C5402b<? extends C6773c, C5524d> f20360j;
        /* renamed from: k */
        private final Set<C5409b> f20361k = new HashSet();
        /* renamed from: l */
        private final Set<C5411d> f20362l = new HashSet();
        /* renamed from: m */
        private C5523a f20363m = new C5523a();

        public C5408a(Context context) {
            this.f20355e = context;
            this.f20359i = context.getMainLooper();
            this.f20352b = context.getPackageName();
            this.f20353c = context.getClass().getName();
            this.f20360j = C5521a.f20527a;
        }

        /* renamed from: a */
        public final C5408a m23607a(C5409b c5409b) {
            this.f20361k.add(c5409b);
            return this;
        }

        /* renamed from: a */
        public final C5408a m23608a(C5411d c5411d) {
            this.f20362l.add(c5411d);
            return this;
        }

        /* renamed from: a */
        public final C5408a m23606a(C5406b<? extends Object> c5406b) {
            this.f20356f.put(c5406b, null);
            this.f20351a.addAll(c5406b.m23603b());
            return this;
        }

        /* renamed from: a */
        public final C5441f m23609a() {
            return new C5441f(null, this.f20351a, this.f20354d, 0, null, this.f20352b, this.f20353c, this.f20363m.m24029a());
        }

        /* renamed from: b */
        public final C5414d m23610b() {
            C5462v.m23773b(this.f20356f.isEmpty() ^ 1, "must call addApi() to add at least one API");
            C5414d c6689h;
            if (this.f20357g >= 0) {
                C7693s a = C7693s.m33380a(null);
                c6689h = new C6689h(this.f20355e.getApplicationContext(), this.f20359i, m23609a(), this.f20360j, this.f20356f, this.f20361k, this.f20362l, this.f20357g, -1);
                a.m33389a(this.f20357g, c6689h, null);
                return c6689h;
            } else if (this.f20358h < 0) {
                return new C6689h(this.f20355e, this.f20359i, m23609a(), this.f20360j, this.f20356f, this.f20361k, this.f20362l, -1, -1);
            } else {
                C5414d c6689h2;
                C7694t a2 = C7694t.m33390a(null);
                int i = this.f20358h;
                if (a2.getActivity() != null) {
                    C6693a a3 = a2.m33395a(i);
                    if (a3 != null) {
                        c6689h = a3.f25055a;
                        if (c6689h == null) {
                            c6689h2 = new C6689h(this.f20355e.getApplicationContext(), this.f20359i, m23609a(), this.f20360j, this.f20356f, this.f20361k, this.f20362l, -1, this.f20358h);
                        }
                        a2.m33396a(this.f20358h, c6689h, null);
                        return c6689h;
                    }
                }
                c6689h = null;
                if (c6689h == null) {
                    c6689h2 = new C6689h(this.f20355e.getApplicationContext(), this.f20359i, m23609a(), this.f20360j, this.f20356f, this.f20361k, this.f20362l, -1, this.f20358h);
                }
                a2.m33396a(this.f20358h, c6689h, null);
                return c6689h;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.d$b */
    public interface C5409b {
        /* renamed from: a */
        void mo5305a(int i);

        /* renamed from: a */
        void mo5306a(Bundle bundle);
    }

    /* renamed from: com.google.android.m4b.maps.h.d$c */
    public interface C5410c {
        /* renamed from: a */
        void mo5411a(C6676a c6676a);

        /* renamed from: b */
        void mo5412b(C6676a c6676a);
    }

    /* renamed from: com.google.android.m4b.maps.h.d$d */
    public interface C5411d {
        /* renamed from: a */
        void mo5307a(C6676a c6676a);
    }

    /* renamed from: com.google.android.m4b.maps.h.d$e */
    public interface C5413e {

        /* renamed from: com.google.android.m4b.maps.h.d$e$a */
        public static class C5412a {
        }

        /* renamed from: a */
        C5412a m23616a();

        /* renamed from: b */
        boolean m23617b();
    }

    /* renamed from: a */
    Looper mo5414a();

    /* renamed from: a */
    <A extends C5401a, R extends C5427m, T extends C7690a<R, A>> T mo5415a(T t);

    /* renamed from: a */
    void mo5416a(C5409b c5409b);

    /* renamed from: a */
    void mo5417a(C5411d c5411d);

    /* renamed from: a */
    void mo5418a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    <A extends C5401a, T extends C7690a<? extends C5427m, A>> T mo5419b(T t);

    /* renamed from: b */
    void mo5420b();

    /* renamed from: b */
    void mo5421b(C5409b c5409b);

    /* renamed from: b */
    void mo5422b(C5411d c5411d);

    /* renamed from: c */
    void mo5423c();

    /* renamed from: d */
    boolean mo5424d();

    /* renamed from: e */
    boolean mo5425e();
}
