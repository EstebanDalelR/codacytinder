package com.squareup.picasso;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.squareup.picasso.Picasso.Priority;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.o */
public final class C6104o {
    /* renamed from: s */
    private static final long f22426s = TimeUnit.SECONDS.toNanos(5);
    /* renamed from: a */
    int f22427a;
    /* renamed from: b */
    long f22428b;
    /* renamed from: c */
    int f22429c;
    /* renamed from: d */
    public final Uri f22430d;
    /* renamed from: e */
    public final int f22431e;
    /* renamed from: f */
    public final String f22432f;
    /* renamed from: g */
    public final List<Transformation> f22433g;
    /* renamed from: h */
    public final int f22434h;
    /* renamed from: i */
    public final int f22435i;
    /* renamed from: j */
    public final boolean f22436j;
    /* renamed from: k */
    public final boolean f22437k;
    /* renamed from: l */
    public final boolean f22438l;
    /* renamed from: m */
    public final float f22439m;
    /* renamed from: n */
    public final float f22440n;
    /* renamed from: o */
    public final float f22441o;
    /* renamed from: p */
    public final boolean f22442p;
    /* renamed from: q */
    public final Config f22443q;
    /* renamed from: r */
    public final Priority f22444r;

    /* renamed from: com.squareup.picasso.o$a */
    public static final class C6103a {
        /* renamed from: a */
        private Uri f22411a;
        /* renamed from: b */
        private int f22412b;
        /* renamed from: c */
        private String f22413c;
        /* renamed from: d */
        private int f22414d;
        /* renamed from: e */
        private int f22415e;
        /* renamed from: f */
        private boolean f22416f;
        /* renamed from: g */
        private boolean f22417g;
        /* renamed from: h */
        private boolean f22418h;
        /* renamed from: i */
        private float f22419i;
        /* renamed from: j */
        private float f22420j;
        /* renamed from: k */
        private float f22421k;
        /* renamed from: l */
        private boolean f22422l;
        /* renamed from: m */
        private List<Transformation> f22423m;
        /* renamed from: n */
        private Config f22424n;
        /* renamed from: o */
        private Priority f22425o;

        C6103a(Uri uri, int i, Config config) {
            this.f22411a = uri;
            this.f22412b = i;
            this.f22424n = config;
        }

        /* renamed from: a */
        boolean m26514a() {
            if (this.f22411a == null) {
                if (this.f22412b == 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        boolean m26515b() {
            if (this.f22414d == 0) {
                if (this.f22415e == 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public C6103a m26513a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f22414d = i;
                this.f22415e = i2;
                return this;
            }
        }

        /* renamed from: c */
        public C6104o m26516c() {
            if (this.f22417g && r0.f22416f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (r0.f22416f && r0.f22414d == 0 && r0.f22415e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (r0.f22417g && r0.f22414d == 0 && r0.f22415e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (r0.f22425o == null) {
                    r0.f22425o = Priority.NORMAL;
                }
                Uri uri = r0.f22411a;
                int i = r0.f22412b;
                String str = r0.f22413c;
                List list = r0.f22423m;
                int i2 = r0.f22414d;
                int i3 = r0.f22415e;
                boolean z = r0.f22416f;
                boolean z2 = r0.f22417g;
                boolean z3 = r0.f22418h;
                float f = r0.f22419i;
                float f2 = r0.f22420j;
                float f3 = r0.f22421k;
                boolean z4 = r0.f22422l;
                boolean z5 = z4;
                return new C6104o(uri, i, str, list, i2, i3, z, z2, z3, f, f2, f3, z5, r0.f22424n, r0.f22425o);
            }
        }
    }

    private C6104o(Uri uri, int i, String str, List<Transformation> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Config config, Priority priority) {
        this.f22430d = uri;
        this.f22431e = i;
        this.f22432f = str;
        if (list == null) {
            this.f22433g = null;
        } else {
            this.f22433g = Collections.unmodifiableList(list);
        }
        this.f22434h = i2;
        this.f22435i = i3;
        this.f22436j = z;
        this.f22437k = z2;
        this.f22438l = z3;
        this.f22439m = f;
        this.f22440n = f2;
        this.f22441o = f3;
        this.f22442p = z4;
        this.f22443q = config;
        this.f22444r = priority;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request{");
        if (this.f22431e > 0) {
            stringBuilder.append(this.f22431e);
        } else {
            stringBuilder.append(this.f22430d);
        }
        if (!(this.f22433g == null || this.f22433g.isEmpty())) {
            for (Transformation transformation : this.f22433g) {
                stringBuilder.append(' ');
                stringBuilder.append(transformation.key());
            }
        }
        if (this.f22432f != null) {
            stringBuilder.append(" stableKey(");
            stringBuilder.append(this.f22432f);
            stringBuilder.append(')');
        }
        if (this.f22434h > 0) {
            stringBuilder.append(" resize(");
            stringBuilder.append(this.f22434h);
            stringBuilder.append(',');
            stringBuilder.append(this.f22435i);
            stringBuilder.append(')');
        }
        if (this.f22436j) {
            stringBuilder.append(" centerCrop");
        }
        if (this.f22437k) {
            stringBuilder.append(" centerInside");
        }
        if (this.f22439m != 0.0f) {
            stringBuilder.append(" rotation(");
            stringBuilder.append(this.f22439m);
            if (this.f22442p) {
                stringBuilder.append(" @ ");
                stringBuilder.append(this.f22440n);
                stringBuilder.append(',');
                stringBuilder.append(this.f22441o);
            }
            stringBuilder.append(')');
        }
        if (this.f22443q != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.f22443q);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    String m26517a() {
        long nanoTime = System.nanoTime() - this.f22428b;
        if (nanoTime > f22426s) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m26518b());
            stringBuilder.append('+');
            stringBuilder.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            stringBuilder.append('s');
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(m26518b());
        stringBuilder.append('+');
        stringBuilder.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        stringBuilder.append("ms");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    String m26518b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[R");
        stringBuilder.append(this.f22427a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* renamed from: c */
    String m26519c() {
        if (this.f22430d != null) {
            return String.valueOf(this.f22430d.getPath());
        }
        return Integer.toHexString(this.f22431e);
    }

    /* renamed from: d */
    public boolean m26520d() {
        if (this.f22434h == 0) {
            if (this.f22435i == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    boolean m26521e() {
        if (!m26522f()) {
            if (!m26523g()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    boolean m26522f() {
        if (!m26520d()) {
            if (this.f22439m == 0.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    boolean m26523g() {
        return this.f22433g != null;
    }
}
