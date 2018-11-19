package com.google.android.m4b.maps.dd;

import com.google.android.m4b.maps.cu.C5301a;
import com.google.android.m4b.maps.cu.C5305f;
import com.google.android.m4b.maps.cu.C5306g;
import com.google.android.m4b.maps.cu.C5309j;
import com.google.android.m4b.maps.cu.C6667b;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.dd.a */
public interface C5326a {

    /* renamed from: com.google.android.m4b.maps.dd.a$a */
    public static final class C7532a extends C6667b<C7532a> {
        /* renamed from: a */
        public final void mo5392a(C5301a c5301a) {
            super.mo5392a(c5301a);
        }

        /* renamed from: b */
        protected final int mo5393b() {
            return super.mo5393b();
        }
    }

    /* renamed from: com.google.android.m4b.maps.dd.a$b */
    public static final class C7533b extends C6667b<C7533b> {
        /* renamed from: a */
        public final void mo5392a(C5301a c5301a) {
            String str = null;
            if (!str.equals("")) {
                c5301a.m23509a(2, str);
            }
            if (!str.equals("")) {
                c5301a.m23509a(3, str);
            }
            super.mo5392a(c5301a);
        }

        /* renamed from: b */
        protected final int mo5393b() {
            int b = super.mo5393b();
            String str = null;
            if (!str.equals("")) {
                b += C5301a.m23494b(2, str);
            }
            return !str.equals("") ? b + C5301a.m23494b(3, str) : b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.dd.a$c */
    public static final class C7534c extends C6667b<C7534c> {
        /* renamed from: a */
        public final void mo5392a(C5301a c5301a) {
            if (!Arrays.equals(null, C5309j.f19699a)) {
                c5301a.m23511a(1, null);
            }
            super.mo5392a(c5301a);
        }

        /* renamed from: b */
        protected final int mo5393b() {
            int b = super.mo5393b();
            return !Arrays.equals(null, C5309j.f19699a) ? b + C5301a.m23496b(1, null) : b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.dd.a$d */
    public static final class C7535d extends C6667b<C7535d> {
        /* renamed from: a */
        public long f28127a;
        /* renamed from: b */
        public byte[] f28128b;
        /* renamed from: c */
        public long f28129c;
        /* renamed from: d */
        private long f28130d;
        /* renamed from: e */
        private String f28131e;
        /* renamed from: f */
        private int f28132f;
        /* renamed from: g */
        private int f28133g;
        /* renamed from: h */
        private boolean f28134h;
        /* renamed from: i */
        private C7536e[] f28135i;
        /* renamed from: j */
        private C7533b f28136j;
        /* renamed from: k */
        private byte[] f28137k;
        /* renamed from: l */
        private byte[] f28138l;
        /* renamed from: o */
        private C7532a f28139o;
        /* renamed from: p */
        private String f28140p;
        /* renamed from: q */
        private C7534c f28141q;
        /* renamed from: r */
        private byte[] f28142r;

        public C7535d() {
            this.f28127a = 0;
            this.f28130d = 0;
            this.f28131e = "";
            this.f28132f = 0;
            this.f28133g = 0;
            this.f28134h = false;
            this.f28135i = C7536e.m33212a();
            this.f28136j = null;
            this.f28128b = C5309j.f19699a;
            this.f28137k = C5309j.f19699a;
            this.f28138l = C5309j.f19699a;
            this.f28139o = null;
            this.f28140p = "";
            this.f28129c = DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS;
            this.f28141q = null;
            this.f28142r = C5309j.f19699a;
            this.m = null;
            this.n = -1;
        }

        /* renamed from: a */
        public final void mo5392a(C5301a c5301a) {
            if (this.f28127a != 0) {
                c5301a.m23507a(1, this.f28127a);
            }
            if (!this.f28131e.equals("")) {
                c5301a.m23509a(2, this.f28131e);
            }
            if (this.f28135i != null && this.f28135i.length > 0) {
                for (C5306g c5306g : this.f28135i) {
                    if (c5306g != null) {
                        c5301a.m23508a(3, c5306g);
                    }
                }
            }
            if (!Arrays.equals(this.f28128b, C5309j.f19699a)) {
                c5301a.m23511a(6, this.f28128b);
            }
            if (!Arrays.equals(this.f28137k, C5309j.f19699a)) {
                c5301a.m23511a(8, this.f28137k);
            }
            if (!Arrays.equals(this.f28138l, C5309j.f19699a)) {
                c5301a.m23511a(13, this.f28138l);
            }
            if (!this.f28140p.equals("")) {
                c5301a.m23509a(14, this.f28140p);
            }
            if (this.f28129c != DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS) {
                c5301a.m23515b(15, this.f28129c);
            }
            if (!Arrays.equals(this.f28142r, C5309j.f19699a)) {
                c5301a.m23511a(18, this.f28142r);
            }
            super.mo5392a(c5301a);
        }

        /* renamed from: b */
        protected final int mo5393b() {
            int b = super.mo5393b();
            if (this.f28127a != 0) {
                b += C5301a.m23500c(1, this.f28127a);
            }
            if (!this.f28131e.equals("")) {
                b += C5301a.m23494b(2, this.f28131e);
            }
            if (this.f28135i != null && this.f28135i.length > 0) {
                for (C5306g c5306g : this.f28135i) {
                    if (c5306g != null) {
                        b += C5301a.m23493b(3, c5306g);
                    }
                }
            }
            if (!Arrays.equals(this.f28128b, C5309j.f19699a)) {
                b += C5301a.m23496b(6, this.f28128b);
            }
            if (!Arrays.equals(this.f28137k, C5309j.f19699a)) {
                b += C5301a.m23496b(8, this.f28137k);
            }
            if (!Arrays.equals(this.f28138l, C5309j.f19699a)) {
                b += C5301a.m23496b(13, this.f28138l);
            }
            if (!this.f28140p.equals("")) {
                b += C5301a.m23494b(14, this.f28140p);
            }
            if (this.f28129c != DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS) {
                b += C5301a.m23502d(15, this.f28129c);
            }
            return !Arrays.equals(this.f28142r, C5309j.f19699a) ? b + C5301a.m23496b(18, this.f28142r) : b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.dd.a$e */
    public static final class C7536e extends C6667b<C7536e> {
        /* renamed from: a */
        private static volatile C7536e[] f28143a;
        /* renamed from: b */
        private String f28144b;
        /* renamed from: c */
        private String f28145c;

        /* renamed from: a */
        public static C7536e[] m33212a() {
            if (f28143a == null) {
                synchronized (C5305f.f19695a) {
                    if (f28143a == null) {
                        f28143a = new C7536e[0];
                    }
                }
            }
            return f28143a;
        }

        public C7536e() {
            this.f28144b = "";
            this.f28145c = "";
            this.m = null;
            this.n = -1;
        }

        /* renamed from: a */
        public final void mo5392a(C5301a c5301a) {
            if (!this.f28144b.equals("")) {
                c5301a.m23509a(1, this.f28144b);
            }
            if (!this.f28145c.equals("")) {
                c5301a.m23509a(2, this.f28145c);
            }
            super.mo5392a(c5301a);
        }

        /* renamed from: b */
        protected final int mo5393b() {
            int b = super.mo5393b();
            if (!this.f28144b.equals("")) {
                b += C5301a.m23494b(1, this.f28144b);
            }
            return !this.f28145c.equals("") ? b + C5301a.m23494b(2, this.f28145c) : b;
        }
    }
}
