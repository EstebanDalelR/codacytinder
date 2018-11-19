package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.C6104o.C6103a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.p */
public class C6105p {
    /* renamed from: a */
    private static final AtomicInteger f22445a = new AtomicInteger();
    /* renamed from: b */
    private final Picasso f22446b;
    /* renamed from: c */
    private final C6103a f22447c;
    /* renamed from: d */
    private boolean f22448d;
    /* renamed from: e */
    private boolean f22449e;
    /* renamed from: f */
    private boolean f22450f;
    /* renamed from: g */
    private int f22451g;
    /* renamed from: h */
    private int f22452h;
    /* renamed from: i */
    private int f22453i;
    /* renamed from: j */
    private int f22454j;
    /* renamed from: k */
    private Drawable f22455k;
    /* renamed from: l */
    private Drawable f22456l;
    /* renamed from: m */
    private Object f22457m;

    C6105p(Picasso picasso, Uri uri, int i) {
        this.f22450f = true;
        if (picasso.f22328m) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f22446b = picasso;
        this.f22447c = new C6103a(uri, i, picasso.f22325j);
    }

    C6105p() {
        this.f22450f = true;
        this.f22446b = null;
        this.f22447c = new C6103a(null, 0, null);
    }

    /* renamed from: a */
    public C6105p m26527a(int i) {
        if (!this.f22450f) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f22455k != null) {
            throw new IllegalStateException("Placeholder image already set.");
        } else {
            this.f22451g = i;
            return this;
        }
    }

    /* renamed from: a */
    C6105p m26526a() {
        this.f22449e = false;
        return this;
    }

    /* renamed from: a */
    public C6105p m26528a(int i, int i2) {
        this.f22447c.m26513a(i, i2);
        return this;
    }

    /* renamed from: a */
    public void m26529a(ImageView imageView) {
        m26530a(imageView, null);
    }

    /* renamed from: a */
    public void m26530a(ImageView imageView, Callback callback) {
        C6105p c6105p = this;
        ImageView imageView2 = imageView;
        Callback callback2 = callback;
        long nanoTime = System.nanoTime();
        C6120v.m26575a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (c6105p.f22447c.m26514a()) {
            if (c6105p.f22449e) {
                if (c6105p.f22447c.m26515b()) {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                if (width != 0) {
                    if (height != 0) {
                        c6105p.f22447c.m26513a(width, height);
                    }
                }
                if (c6105p.f22450f) {
                    C6099m.m26509a(imageView2, m26525b());
                }
                c6105p.f22446b.m26432a(imageView2, new C6092f(c6105p, imageView2, callback2));
                return;
            }
            C6104o a = m26524a(nanoTime);
            String a2 = C6120v.m26573a(a);
            if (MemoryPolicy.shouldReadFromMemoryCache(c6105p.f22453i)) {
                Bitmap b = c6105p.f22446b.m26435b(a2);
                if (b != null) {
                    c6105p.f22446b.m26431a(imageView2);
                    C6099m.m26508a(imageView2, c6105p.f22446b.f22318c, b, LoadedFrom.MEMORY, c6105p.f22448d, c6105p.f22446b.f22326k);
                    if (c6105p.f22446b.f22327l) {
                        String b2 = a.m26518b();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("from ");
                        stringBuilder.append(LoadedFrom.MEMORY);
                        C6120v.m26579a("Main", "completed", b2, stringBuilder.toString());
                    }
                    if (callback2 != null) {
                        callback.onSuccess();
                    }
                    return;
                }
            }
            if (c6105p.f22450f) {
                C6099m.m26509a(imageView2, m26525b());
            }
            c6105p.f22446b.m26433a(new C7255i(c6105p.f22446b, imageView2, a, c6105p.f22453i, c6105p.f22454j, c6105p.f22452h, c6105p.f22456l, a2, c6105p.f22457m, callback2, c6105p.f22448d));
        } else {
            c6105p.f22446b.m26431a(imageView2);
            if (c6105p.f22450f) {
                C6099m.m26509a(imageView2, m26525b());
            }
        }
    }

    /* renamed from: b */
    private Drawable m26525b() {
        if (this.f22451g != 0) {
            return this.f22446b.f22318c.getResources().getDrawable(this.f22451g);
        }
        return this.f22455k;
    }

    /* renamed from: a */
    private C6104o m26524a(long j) {
        int andIncrement = f22445a.getAndIncrement();
        C6104o c = this.f22447c.m26516c();
        c.f22427a = andIncrement;
        c.f22428b = j;
        boolean z = this.f22446b.f22327l;
        if (z) {
            C6120v.m26579a("Main", "created", c.m26518b(), c.toString());
        }
        C6104o a = this.f22446b.m26427a(c);
        if (a != c) {
            a.f22427a = andIncrement;
            a.f22428b = j;
            if (z) {
                String a2 = a.m26517a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("into ");
                stringBuilder.append(a);
                C6120v.m26579a("Main", "changed", a2, stringBuilder.toString());
            }
        }
        return a;
    }
}
