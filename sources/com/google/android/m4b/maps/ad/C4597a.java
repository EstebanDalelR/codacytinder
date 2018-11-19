package com.google.android.m4b.maps.ad;

import com.google.android.m4b.maps.cu.C5301a;
import com.google.android.m4b.maps.cu.C5306g;
import com.google.android.m4b.maps.cu.C6667b;

/* renamed from: com.google.android.m4b.maps.ad.a */
public interface C4597a {

    /* renamed from: com.google.android.m4b.maps.ad.a$a */
    public static final class C7425a extends C6667b<C7425a> implements Cloneable {
        /* renamed from: a */
        public int f27223a;
        /* renamed from: b */
        public String f27224b;
        /* renamed from: c */
        public int f27225c;
        /* renamed from: d */
        public String f27226d;
        /* renamed from: e */
        public int f27227e;
        /* renamed from: f */
        public int f27228f;
        /* renamed from: g */
        public int f27229g;
        /* renamed from: h */
        public boolean f27230h;
        /* renamed from: i */
        public String f27231i;
        /* renamed from: j */
        public int f27232j;
        /* renamed from: k */
        public boolean f27233k;
        /* renamed from: l */
        public int f27234l;
        /* renamed from: o */
        private long f27235o;

        /* renamed from: c */
        public final /* synthetic */ C6667b mo7021c() {
            return m31998a();
        }

        public final /* synthetic */ Object clone() {
            return m31998a();
        }

        /* renamed from: d */
        public final /* synthetic */ C5306g mo5395d() {
            return m31998a();
        }

        public C7425a() {
            this.f27223a = 1;
            this.f27224b = "";
            this.f27225c = 0;
            this.f27226d = "";
            this.f27227e = 0;
            this.f27228f = 0;
            this.f27229g = 0;
            this.f27230h = false;
            this.f27231i = "";
            this.f27232j = 0;
            this.f27235o = 0;
            this.f27233k = false;
            this.f27234l = 0;
            this.m = null;
            this.n = -1;
        }

        /* renamed from: a */
        public final C7425a m31998a() {
            try {
                return (C7425a) super.mo7021c();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public final void mo5392a(C5301a c5301a) {
            if (this.f27223a != 1) {
                c5301a.m23506a(1, this.f27223a);
            }
            if (!this.f27224b.equals("")) {
                c5301a.m23509a(2, this.f27224b);
            }
            if (this.f27225c != 0) {
                c5301a.m23506a(3, this.f27225c);
            }
            if (!this.f27226d.equals("")) {
                c5301a.m23509a(4, this.f27226d);
            }
            if (this.f27227e != 0) {
                c5301a.m23506a(5, this.f27227e);
            }
            if (this.f27228f != 0) {
                c5301a.m23506a(6, this.f27228f);
            }
            if (this.f27229g != 0) {
                c5301a.m23506a(7, this.f27229g);
            }
            if (this.f27230h) {
                c5301a.m23510a(8, this.f27230h);
            }
            if (!this.f27231i.equals("")) {
                c5301a.m23509a(9, this.f27231i);
            }
            if (this.f27232j != 0) {
                c5301a.m23506a(10, this.f27232j);
            }
            if (this.f27233k) {
                c5301a.m23510a(12, this.f27233k);
            }
            if (this.f27234l != 0) {
                c5301a.m23506a(13, this.f27234l);
            }
            super.mo5392a(c5301a);
        }

        /* renamed from: b */
        protected final int mo5393b() {
            int b = super.mo5393b();
            if (this.f27223a != 1) {
                b += C5301a.m23492b(1, this.f27223a);
            }
            if (!this.f27224b.equals("")) {
                b += C5301a.m23494b(2, this.f27224b);
            }
            if (this.f27225c != 0) {
                b += C5301a.m23492b(3, this.f27225c);
            }
            if (!this.f27226d.equals("")) {
                b += C5301a.m23494b(4, this.f27226d);
            }
            if (this.f27227e != 0) {
                b += C5301a.m23492b(5, this.f27227e);
            }
            if (this.f27228f != 0) {
                b += C5301a.m23492b(6, this.f27228f);
            }
            if (this.f27229g != 0) {
                b += C5301a.m23492b(7, this.f27229g);
            }
            if (this.f27230h) {
                b += C5301a.m23495b(8, this.f27230h);
            }
            if (!this.f27231i.equals("")) {
                b += C5301a.m23494b(9, this.f27231i);
            }
            if (this.f27232j != 0) {
                b += C5301a.m23492b(10, this.f27232j);
            }
            if (this.f27233k) {
                b += C5301a.m23495b(12, this.f27233k);
            }
            return this.f27234l != 0 ? b + C5301a.m23492b(13, this.f27234l) : b;
        }
    }
}
