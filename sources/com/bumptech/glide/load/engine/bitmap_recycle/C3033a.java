package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p026d.C0987h;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.a */
class C3033a implements C1011f {
    /* renamed from: a */
    private final C3032b f9455a = new C3032b();
    /* renamed from: b */
    private final C1008d<C3031a, Bitmap> f9456b = new C1008d();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.a$a */
    static class C3031a implements C1012g {
        /* renamed from: a */
        private final C3032b f9451a;
        /* renamed from: b */
        private int f9452b;
        /* renamed from: c */
        private int f9453c;
        /* renamed from: d */
        private Config f9454d;

        public C3031a(C3032b c3032b) {
            this.f9451a = c3032b;
        }

        /* renamed from: a */
        public void m11951a(int i, int i2, Config config) {
            this.f9452b = i;
            this.f9453c = i2;
            this.f9454d = config;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C3031a)) {
                return false;
            }
            C3031a c3031a = (C3031a) obj;
            if (this.f9452b == c3031a.f9452b && this.f9453c == c3031a.f9453c && this.f9454d == c3031a.f9454d) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (((this.f9452b * 31) + this.f9453c) * 31) + (this.f9454d != null ? this.f9454d.hashCode() : 0);
        }

        public String toString() {
            return C3033a.m11956d(this.f9452b, this.f9453c, this.f9454d);
        }

        /* renamed from: a */
        public void mo1280a() {
            this.f9451a.m3526a(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.a$b */
    static class C3032b extends C1006b<C3031a> {
        C3032b() {
        }

        /* renamed from: b */
        protected /* synthetic */ C1012g mo1281b() {
            return m11952a();
        }

        /* renamed from: a */
        public C3031a m11953a(int i, int i2, Config config) {
            C3031a c3031a = (C3031a) m3528c();
            c3031a.m11951a(i, i2, config);
            return c3031a;
        }

        /* renamed from: a */
        protected C3031a m11952a() {
            return new C3031a(this);
        }
    }

    C3033a() {
    }

    /* renamed from: a */
    public void mo1284a(Bitmap bitmap) {
        this.f9456b.m3539a(this.f9455a.m11953a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: a */
    public Bitmap mo1283a(int i, int i2, Config config) {
        return (Bitmap) this.f9456b.m3538a(this.f9455a.m11953a(i, i2, config));
    }

    /* renamed from: a */
    public Bitmap mo1282a() {
        return (Bitmap) this.f9456b.m3537a();
    }

    /* renamed from: b */
    public String mo1286b(Bitmap bitmap) {
        return C3033a.m11957d(bitmap);
    }

    /* renamed from: b */
    public String mo1285b(int i, int i2, Config config) {
        return C3033a.m11956d(i, i2, config);
    }

    /* renamed from: c */
    public int mo1287c(Bitmap bitmap) {
        return C0987h.m3406a(bitmap);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AttributeStrategy:\n  ");
        stringBuilder.append(this.f9456b);
        return stringBuilder.toString();
    }

    /* renamed from: d */
    private static String m11957d(Bitmap bitmap) {
        return C3033a.m11956d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: d */
    private static String m11956d(int i, int i2, Config config) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append("], ");
        stringBuilder.append(config);
        return stringBuilder.toString();
    }
}
