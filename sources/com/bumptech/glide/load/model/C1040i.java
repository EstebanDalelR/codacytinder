package com.bumptech.glide.load.model;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.bumptech.glide.p026d.C0983e;
import com.bumptech.glide.p026d.C0987h;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.model.i */
public class C1040i<A, B> {
    /* renamed from: a */
    private final C0983e<C1039a<A>, B> f2860a;

    /* renamed from: com.bumptech.glide.load.model.i$a */
    static final class C1039a<A> {
        /* renamed from: a */
        private static final Queue<C1039a<?>> f2856a = C0987h.m3410a(0);
        /* renamed from: b */
        private int f2857b;
        /* renamed from: c */
        private int f2858c;
        /* renamed from: d */
        private A f2859d;

        /* renamed from: a */
        static <A> C1039a<A> m3585a(A a, int i, int i2) {
            C1039a<A> c1039a = (C1039a) f2856a.poll();
            if (c1039a == null) {
                c1039a = new C1039a();
            }
            c1039a.m3586b(a, i, i2);
            return c1039a;
        }

        private C1039a() {
        }

        /* renamed from: b */
        private void m3586b(A a, int i, int i2) {
            this.f2859d = a;
            this.f2858c = i;
            this.f2857b = i2;
        }

        /* renamed from: a */
        public void m3587a() {
            f2856a.offer(this);
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C1039a)) {
                return false;
            }
            C1039a c1039a = (C1039a) obj;
            if (this.f2858c == c1039a.f2858c && this.f2857b == c1039a.f2857b && this.f2859d.equals(c1039a.f2859d) != null) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (((this.f2857b * 31) + this.f2858c) * 31) + this.f2859d.hashCode();
        }
    }

    public C1040i() {
        this(Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    public C1040i(int i) {
        this.f2860a = new C0983e<C1039a<A>, B>(this, i) {
            /* renamed from: a */
            final /* synthetic */ C1040i f9522a;

            /* renamed from: a */
            protected void m12008a(C1039a<A> c1039a, B b) {
                c1039a.m3587a();
            }
        };
    }

    /* renamed from: a */
    public B m3588a(A a, int i, int i2) {
        a = C1039a.m3585a(a, i, i2);
        i = this.f2860a.m3398b(a);
        a.m3587a();
        return i;
    }

    /* renamed from: a */
    public void m3589a(A a, int i, int i2, B b) {
        this.f2860a.m3399b(C1039a.m3585a(a, i, i2), b);
    }
}
