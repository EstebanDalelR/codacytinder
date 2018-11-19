package com.google.android.m4b.maps.ay;

import android.graphics.Bitmap;
import android.support.v4.util.C0551g;
import com.google.android.m4b.maps.aj.C4639i;
import com.google.android.m4b.maps.p101a.C4515b;
import com.google.android.m4b.maps.p101a.C4520e;
import com.google.android.m4b.maps.p101a.C4525k;
import com.google.android.m4b.maps.p101a.C4526l;
import com.google.android.m4b.maps.p101a.C4529m;
import com.google.android.m4b.maps.p101a.C4530n;
import com.google.android.m4b.maps.p101a.C4532r;
import com.google.android.m4b.maps.p101a.C6302d;

/* renamed from: com.google.android.m4b.maps.ay.h */
public final class C6411h extends C4526l {
    /* renamed from: a */
    private final C0551g<String, C4529m<?>> f23774a;
    /* renamed from: b */
    private final C6302d f23775b = new C6302d(C4639i.m20764a());

    /* renamed from: com.google.android.m4b.maps.ay.h$1 */
    class C64101 extends C0551g<String, C4529m<?>> {
        C64101(int i) {
            super(i);
        }

        protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            C4529m c4529m = (C4529m) obj2;
            if ((c4529m.f16833a instanceof Bitmap) != null) {
                Bitmap bitmap = (Bitmap) c4529m.f16833a;
                return bitmap.getRowBytes() * bitmap.getHeight();
            } else if ((c4529m.f16833a instanceof String) != null) {
                return ((String) c4529m.f16833a).getBytes().length;
            } else {
                if ((c4529m.f16833a instanceof byte[]) != null) {
                    return ((byte[]) c4529m.f16833a).length;
                }
                obj2 = String.valueOf(c4529m.f16833a);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj2).length() + 52);
                stringBuilder.append("LruCache does not have a sizeOf implementation for: ");
                stringBuilder.append(obj2);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ay.h$a */
    static class C7437a extends C6415t {
        /* renamed from: a */
        private final C0551g<String, C4529m<?>> f27244a;
        /* renamed from: b */
        private final C4530n f27245b;

        public C7437a(C0551g<String, C4529m<?>> c0551g, C4530n c4530n) {
            this.f27244a = c0551g;
            this.f27245b = c4530n;
        }

        /* renamed from: a */
        public final void mo4769a(C4525k<?> c4525k, C4529m<?> c4529m) {
            super.mo4769a((C4525k) c4525k, (C4529m) c4529m);
            if (c4525k.m20443l()) {
                this.f27244a.put(c4525k.m20434c(), c4529m);
            }
            this.f27245b.mo4769a((C4525k) c4525k, (C4529m) c4529m);
        }

        /* renamed from: a */
        public final void mo4770a(C4525k<?> c4525k, C4529m<?> c4529m, Runnable runnable) {
            super.mo4770a(c4525k, c4529m, runnable);
            if (c4525k.m20443l()) {
                this.f27244a.put(c4525k.m20434c(), c4529m);
            }
            this.f27245b.mo4770a(c4525k, c4529m, runnable);
        }

        /* renamed from: a */
        public final void mo4771a(C4525k<?> c4525k, C4532r c4532r) {
            super.mo4771a((C4525k) c4525k, c4532r);
            this.f27245b.mo4771a((C4525k) c4525k, c4532r);
        }
    }

    C6411h(C4515b c4515b, C4520e c4520e, C0551g<String, C4529m<?>> c0551g, C4530n c4530n) {
        super(c4515b, c4520e, 4, new C7437a(c0551g, c4530n));
        this.f23774a = c0551g;
    }

    /* renamed from: a */
    public final C4525k mo4884a(C4525k c4525k) {
        C4529m c4529m = (C4529m) this.f23774a.get(c4525k.m20434c());
        if (c4529m == null) {
            return super.mo4884a(c4525k);
        }
        this.f23775b.mo4769a(c4525k, c4529m);
        return c4525k;
    }
}
