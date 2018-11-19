package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.squareup.picasso.C6107q.C6106a;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Picasso.Priority;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.c */
class C6090c implements Runnable {
    /* renamed from: t */
    private static final Object f22351t = new Object();
    /* renamed from: u */
    private static final ThreadLocal<StringBuilder> f22352u = new C60851();
    /* renamed from: v */
    private static final AtomicInteger f22353v = new AtomicInteger();
    /* renamed from: w */
    private static final C6107q f22354w = new C72522();
    /* renamed from: a */
    final int f22355a = f22353v.incrementAndGet();
    /* renamed from: b */
    final Picasso f22356b;
    /* renamed from: c */
    final C6097g f22357c;
    /* renamed from: d */
    final Cache f22358d;
    /* renamed from: e */
    final C6110s f22359e;
    /* renamed from: f */
    final String f22360f;
    /* renamed from: g */
    final C6104o f22361g;
    /* renamed from: h */
    final int f22362h;
    /* renamed from: i */
    int f22363i;
    /* renamed from: j */
    final C6107q f22364j;
    /* renamed from: k */
    C6084a f22365k;
    /* renamed from: l */
    List<C6084a> f22366l;
    /* renamed from: m */
    Bitmap f22367m;
    /* renamed from: n */
    Future<?> f22368n;
    /* renamed from: o */
    LoadedFrom f22369o;
    /* renamed from: p */
    Exception f22370p;
    /* renamed from: q */
    int f22371q;
    /* renamed from: r */
    int f22372r;
    /* renamed from: s */
    Priority f22373s;

    /* renamed from: com.squareup.picasso.c$1 */
    static class C60851 extends ThreadLocal<StringBuilder> {
        C60851() {
        }

        protected /* synthetic */ Object initialValue() {
            return m26451a();
        }

        /* renamed from: a */
        protected StringBuilder m26451a() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$2 */
    static class C72522 extends C6107q {
        /* renamed from: a */
        public boolean mo6575a(C6104o c6104o) {
            return true;
        }

        C72522() {
        }

        /* renamed from: a */
        public C6106a mo6574a(C6104o c6104o, int i) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unrecognized type of request: ");
            stringBuilder.append(c6104o);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static boolean m26457a(boolean z, int i, int i2, int i3, int i4) {
        if (z && i <= i3) {
            if (i2 <= i4) {
                return false;
            }
        }
        return true;
    }

    C6090c(Picasso picasso, C6097g c6097g, Cache cache, C6110s c6110s, C6084a c6084a, C6107q c6107q) {
        this.f22356b = picasso;
        this.f22357c = c6097g;
        this.f22358d = cache;
        this.f22359e = c6110s;
        this.f22365k = c6084a;
        this.f22360f = c6084a.m26443e();
        this.f22361g = c6084a.m26441c();
        this.f22373s = c6084a.m26449k();
        this.f22362h = c6084a.m26446h();
        this.f22363i = c6084a.m26447i();
        this.f22364j = c6107q;
        this.f22372r = c6107q.mo6573a();
    }

    /* renamed from: a */
    static Bitmap m26453a(InputStream inputStream, C6104o c6104o) throws IOException {
        InputStream c6098k = new C6098k(inputStream);
        long a = c6098k.m26504a(65536);
        Options c = C6107q.m26538c(c6104o);
        boolean a2 = C6107q.m26537a(c);
        boolean c2 = C6120v.m26586c(c6098k);
        c6098k.m26505a(a);
        if (c2) {
            byte[] b = C6120v.m26584b(c6098k);
            if (a2) {
                BitmapFactory.decodeByteArray(b, 0, b.length, c);
                C6107q.m26536a(c6104o.f22434h, c6104o.f22435i, c, c6104o);
            }
            return BitmapFactory.decodeByteArray(b, 0, b.length, c);
        }
        if (a2) {
            BitmapFactory.decodeStream(c6098k, null, c);
            C6107q.m26536a(c6104o.f22434h, c6104o.f22435i, c, c6104o);
            c6098k.m26505a(a);
        }
        inputStream = BitmapFactory.decodeStream(c6098k, null, c);
        if (inputStream != null) {
            return inputStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public void run() {
        try {
            C6090c.m26456a(this.f22361g);
            if (this.f22356b.f22327l) {
                C6120v.m26578a("Hunter", "executing", C6120v.m26571a(this));
            }
            this.f22367m = m26459a();
            if (this.f22367m == null) {
                this.f22357c.m26498c(this);
            } else {
                this.f22357c.m26488a(this);
            }
        } catch (Exception e) {
            if (!(e.f22295a && e.f22296b == 504)) {
                this.f22370p = e;
            }
            this.f22357c.m26498c(this);
        } catch (Exception e2) {
            this.f22370p = e2;
            this.f22357c.m26494b(this);
        } catch (Exception e22) {
            this.f22370p = e22;
            this.f22357c.m26494b(this);
        } catch (Throwable e3) {
            Writer stringWriter = new StringWriter();
            this.f22359e.m26556e().m26557a(new PrintWriter(stringWriter));
            this.f22370p = new RuntimeException(stringWriter.toString(), e3);
            this.f22357c.m26498c(this);
        } catch (Exception e222) {
            this.f22370p = e222;
            this.f22357c.m26498c(this);
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* renamed from: a */
    Bitmap m26459a() throws IOException {
        Bitmap bitmap;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.f22362h)) {
            bitmap = this.f22358d.get(this.f22360f);
            if (bitmap != null) {
                this.f22359e.m26546a();
                this.f22369o = LoadedFrom.MEMORY;
                if (this.f22356b.f22327l) {
                    C6120v.m26579a("Hunter", "decoded", this.f22361g.m26517a(), "from cache");
                }
                return bitmap;
            }
        }
        bitmap = null;
        this.f22361g.f22429c = this.f22372r == 0 ? NetworkPolicy.OFFLINE.index : this.f22363i;
        C6106a a = this.f22364j.mo6574a(this.f22361g, this.f22363i);
        if (a != null) {
            this.f22369o = a.m26533c();
            this.f22371q = a.m26534d();
            bitmap = a.m26531a();
            if (bitmap == null) {
                InputStream b = a.m26532b();
                try {
                    Bitmap a2 = C6090c.m26453a(b, this.f22361g);
                    bitmap = a2;
                } finally {
                    C6120v.m26577a(b);
                }
            }
        }
        if (bitmap != null) {
            if (this.f22356b.f22327l) {
                C6120v.m26578a("Hunter", "decoded", this.f22361g.m26517a());
            }
            this.f22359e.m26548a(bitmap);
            if (this.f22361g.m26521e() || this.f22371q != 0) {
                synchronized (f22351t) {
                    if (this.f22361g.m26522f() || this.f22371q != 0) {
                        bitmap = C6090c.m26452a(this.f22361g, bitmap, this.f22371q);
                        if (this.f22356b.f22327l) {
                            C6120v.m26578a("Hunter", "transformed", this.f22361g.m26517a());
                        }
                    }
                    if (this.f22361g.m26523g()) {
                        bitmap = C6090c.m26454a(this.f22361g.f22433g, bitmap);
                        if (this.f22356b.f22327l) {
                            C6120v.m26579a("Hunter", "transformed", this.f22361g.m26517a(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f22359e.m26552b(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    void m26460a(C6084a c6084a) {
        boolean z = this.f22356b.f22327l;
        C6104o c6104o = c6084a.f22335b;
        if (this.f22365k == null) {
            this.f22365k = c6084a;
            if (z) {
                if (this.f22366l != null) {
                    if (this.f22366l.isEmpty() == null) {
                        C6120v.m26579a("Hunter", "joined", c6104o.m26517a(), C6120v.m26572a(this, "to "));
                    }
                }
                C6120v.m26579a("Hunter", "joined", c6104o.m26517a(), "to empty hunter");
            }
            return;
        }
        if (this.f22366l == null) {
            this.f22366l = new ArrayList(3);
        }
        this.f22366l.add(c6084a);
        if (z) {
            C6120v.m26579a("Hunter", "joined", c6104o.m26517a(), C6120v.m26572a(this, "to "));
        }
        c6084a = c6084a.m26449k();
        if (c6084a.ordinal() > this.f22373s.ordinal()) {
            this.f22373s = c6084a;
        }
    }

    /* renamed from: b */
    void m26462b(C6084a c6084a) {
        boolean z;
        if (this.f22365k == c6084a) {
            this.f22365k = null;
            z = true;
        } else {
            z = this.f22366l != null ? this.f22366l.remove(c6084a) : false;
        }
        if (z && c6084a.m26449k() == this.f22373s) {
            this.f22373s = m26458o();
        }
        if (this.f22356b.f22327l) {
            C6120v.m26579a("Hunter", "removed", c6084a.f22335b.m26517a(), C6120v.m26572a(this, "from "));
        }
    }

    /* renamed from: o */
    private Priority m26458o() {
        Priority priority = Priority.LOW;
        Object obj = 1;
        Object obj2 = (this.f22366l == null || this.f22366l.isEmpty()) ? null : 1;
        if (this.f22365k == null) {
            if (obj2 == null) {
                obj = null;
            }
        }
        if (obj == null) {
            return priority;
        }
        if (this.f22365k != null) {
            priority = this.f22365k.m26449k();
        }
        if (obj2 != null) {
            int size = this.f22366l.size();
            for (int i = 0; i < size; i++) {
                Priority k = ((C6084a) this.f22366l.get(i)).m26449k();
                if (k.ordinal() > priority.ordinal()) {
                    priority = k;
                }
            }
        }
        return priority;
    }

    /* renamed from: b */
    boolean m26463b() {
        if (this.f22365k != null) {
            return false;
        }
        if ((this.f22366l == null || this.f22366l.isEmpty()) && this.f22368n != null && this.f22368n.cancel(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    boolean m26464c() {
        return this.f22368n != null && this.f22368n.isCancelled();
    }

    /* renamed from: a */
    boolean m26461a(boolean z, NetworkInfo networkInfo) {
        if ((this.f22372r > 0 ? 1 : null) == null) {
            return false;
        }
        this.f22372r--;
        return this.f22364j.mo6576a(z, networkInfo);
    }

    /* renamed from: d */
    boolean m26465d() {
        return this.f22364j.mo6577b();
    }

    /* renamed from: e */
    Bitmap m26466e() {
        return this.f22367m;
    }

    /* renamed from: f */
    String m26467f() {
        return this.f22360f;
    }

    /* renamed from: g */
    int m26468g() {
        return this.f22362h;
    }

    /* renamed from: h */
    C6104o m26469h() {
        return this.f22361g;
    }

    /* renamed from: i */
    C6084a m26470i() {
        return this.f22365k;
    }

    /* renamed from: j */
    Picasso m26471j() {
        return this.f22356b;
    }

    /* renamed from: k */
    List<C6084a> m26472k() {
        return this.f22366l;
    }

    /* renamed from: l */
    Exception m26473l() {
        return this.f22370p;
    }

    /* renamed from: m */
    LoadedFrom m26474m() {
        return this.f22369o;
    }

    /* renamed from: n */
    Priority m26475n() {
        return this.f22373s;
    }

    /* renamed from: a */
    static void m26456a(C6104o c6104o) {
        c6104o = c6104o.m26519c();
        StringBuilder stringBuilder = (StringBuilder) f22352u.get();
        stringBuilder.ensureCapacity("Picasso-".length() + c6104o.length());
        stringBuilder.replace("Picasso-".length(), stringBuilder.length(), c6104o);
        Thread.currentThread().setName(stringBuilder.toString());
    }

    /* renamed from: a */
    static C6090c m26455a(Picasso picasso, C6097g c6097g, Cache cache, C6110s c6110s, C6084a c6084a) {
        C6104o c = c6084a.m26441c();
        List a = picasso.m26430a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C6107q c6107q = (C6107q) a.get(i);
            if (c6107q.mo6575a(c)) {
                return new C6090c(picasso, c6097g, cache, c6110s, c6084a, c6107q);
            }
        }
        return new C6090c(picasso, c6097g, cache, c6110s, c6084a, f22354w);
    }

    /* renamed from: a */
    static Bitmap m26454a(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final Transformation transformation = (Transformation) list.get(i);
            try {
                Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    bitmap = new StringBuilder();
                    bitmap.append("Transformation ");
                    bitmap.append(transformation.key());
                    bitmap.append(" returned null after ");
                    bitmap.append(i);
                    bitmap.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (Transformation key : list) {
                        bitmap.append(key.key());
                        bitmap.append('\n');
                    }
                    Picasso.f22316a.post(new Runnable() {
                        public void run() {
                            throw new NullPointerException(bitmap.toString());
                        }
                    });
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.f22316a.post(new Runnable() {
                        public void run() {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Transformation ");
                            stringBuilder.append(transformation.key());
                            stringBuilder.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    });
                    return null;
                } else if (transform == bitmap || bitmap.isRecycled() != null) {
                    i++;
                    bitmap = transform;
                } else {
                    Picasso.f22316a.post(new Runnable() {
                        public void run() {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Transformation ");
                            stringBuilder.append(transformation.key());
                            stringBuilder.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    });
                    return null;
                }
            } catch (final List<Transformation> list2) {
                Picasso.f22316a.post(new Runnable() {
                    public void run() {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Transformation ");
                        stringBuilder.append(transformation.key());
                        stringBuilder.append(" crashed with exception.");
                        throw new RuntimeException(stringBuilder.toString(), list2);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    static Bitmap m26452a(C6104o c6104o, Bitmap bitmap, int i) {
        int i2;
        int i3;
        int i4;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = c6104o.f22438l;
        Matrix matrix = new Matrix();
        int i5 = 0;
        if (c6104o.m26522f()) {
            int i6 = c6104o.f22434h;
            i2 = c6104o.f22435i;
            float f = c6104o.f22439m;
            if (f != 0.0f) {
                if (c6104o.f22442p) {
                    matrix.setRotate(f, c6104o.f22440n, c6104o.f22441o);
                } else {
                    matrix.setRotate(f);
                }
            }
            float f2;
            if (c6104o.f22436j) {
                C6104o c6104o2;
                c6104o = (float) i6;
                f = (float) width;
                f2 = c6104o / f;
                float f3 = (float) i2;
                float f4 = (float) height;
                float f5 = f3 / f4;
                if (f2 > f5) {
                    c6104o = (int) Math.ceil((double) (f4 * (f5 / f2)));
                    i3 = (height - c6104o) / 2;
                    f5 = f3 / ((float) c6104o);
                    c6104o2 = c6104o;
                    c6104o = f2;
                    i4 = width;
                } else {
                    i3 = (int) Math.ceil((double) (f * (f2 / f5)));
                    c6104o /= (float) i3;
                    c6104o2 = height;
                    i5 = (width - i3) / 2;
                    i4 = i3;
                    i3 = 0;
                }
                if (C6090c.m26457a(z, width, height, i6, i2)) {
                    matrix.preScale(c6104o, f5);
                }
                i2 = i3;
                i3 = i4;
                i4 = c6104o2;
                if (i != 0) {
                    matrix.preRotate((float) i);
                }
                createBitmap = Bitmap.createBitmap(bitmap, i5, i2, i3, i4, matrix, true);
                if (createBitmap != bitmap) {
                    return bitmap;
                }
                bitmap.recycle();
                return createBitmap;
            } else if (c6104o.f22437k != null) {
                c6104o = ((float) i6) / ((float) width);
                f = ((float) i2) / ((float) height);
                if (c6104o >= f) {
                    c6104o = f;
                }
                if (C6090c.m26457a(z, width, height, i6, i2)) {
                    matrix.preScale(c6104o, c6104o);
                }
            } else if (!((i6 == 0 && i2 == 0) || (i6 == width && i2 == height))) {
                if (i6 != 0) {
                    c6104o = (float) i6;
                    f = (float) width;
                } else {
                    c6104o = (float) i2;
                    f = (float) height;
                }
                c6104o /= f;
                if (i2 != 0) {
                    f = (float) i2;
                    f2 = (float) height;
                } else {
                    f = (float) i6;
                    f2 = (float) width;
                }
                f /= f2;
                if (C6090c.m26457a(z, width, height, i6, i2)) {
                    matrix.preScale(c6104o, f);
                }
            }
        }
        i3 = width;
        i4 = height;
        i2 = 0;
        if (i != 0) {
            matrix.preRotate((float) i);
        }
        createBitmap = Bitmap.createBitmap(bitmap, i5, i2, i3, i4, matrix, true);
        if (createBitmap != bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return createBitmap;
    }
}
