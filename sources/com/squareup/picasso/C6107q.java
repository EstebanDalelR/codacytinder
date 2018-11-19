package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.q */
public abstract class C6107q {

    /* renamed from: com.squareup.picasso.q$a */
    public static final class C6106a {
        /* renamed from: a */
        private final LoadedFrom f22458a;
        /* renamed from: b */
        private final Bitmap f22459b;
        /* renamed from: c */
        private final InputStream f22460c;
        /* renamed from: d */
        private final int f22461d;

        public C6106a(Bitmap bitmap, LoadedFrom loadedFrom) {
            this((Bitmap) C6120v.m26570a((Object) bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public C6106a(InputStream inputStream, LoadedFrom loadedFrom) {
            this(null, (InputStream) C6120v.m26570a((Object) inputStream, "stream == null"), loadedFrom, 0);
        }

        C6106a(Bitmap bitmap, InputStream inputStream, LoadedFrom loadedFrom, int i) {
            int i2 = 0;
            int i3 = bitmap != null ? 1 : 0;
            if (inputStream != null) {
                i2 = 1;
            }
            if ((i2 ^ i3) == 0) {
                throw new AssertionError();
            }
            this.f22459b = bitmap;
            this.f22460c = inputStream;
            this.f22458a = (LoadedFrom) C6120v.m26570a((Object) loadedFrom, "loadedFrom == null");
            this.f22461d = i;
        }

        /* renamed from: a */
        public Bitmap m26531a() {
            return this.f22459b;
        }

        /* renamed from: b */
        public InputStream m26532b() {
            return this.f22460c;
        }

        /* renamed from: c */
        public LoadedFrom m26533c() {
            return this.f22458a;
        }

        /* renamed from: d */
        int m26534d() {
            return this.f22461d;
        }
    }

    /* renamed from: a */
    int mo6573a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C6106a mo6574a(C6104o c6104o, int i) throws IOException;

    /* renamed from: a */
    public abstract boolean mo6575a(C6104o c6104o);

    /* renamed from: a */
    boolean mo6576a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* renamed from: b */
    boolean mo6577b() {
        return false;
    }

    /* renamed from: c */
    static Options m26538c(C6104o c6104o) {
        boolean d = c6104o.m26520d();
        Object obj = c6104o.f22443q != null ? 1 : null;
        Options options = null;
        if (d || obj != null) {
            options = new Options();
            options.inJustDecodeBounds = d;
            if (obj != null) {
                options.inPreferredConfig = c6104o.f22443q;
            }
        }
        return options;
    }

    /* renamed from: a */
    static boolean m26537a(Options options) {
        return (options == null || options.inJustDecodeBounds == null) ? null : true;
    }

    /* renamed from: a */
    static void m26536a(int i, int i2, Options options, C6104o c6104o) {
        C6107q.m26535a(i, i2, options.outWidth, options.outHeight, options, c6104o);
    }

    /* renamed from: a */
    static void m26535a(int i, int i2, int i3, int i4, Options options, C6104o c6104o) {
        if (i4 <= i2) {
            if (i3 <= i) {
                i = 1;
                options.inSampleSize = i;
                options.inJustDecodeBounds = false;
            }
        }
        if (i2 == 0) {
            i = (int) Math.floor((double) (((float) i3) / ((float) i)));
        } else if (i == 0) {
            i = (int) Math.floor((double) (((float) i4) / ((float) i2)));
        } else {
            i2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
            i = (int) Math.floor((double) (((float) i3) / ((float) i)));
            i = c6104o.f22437k != 0 ? Math.max(i2, i) : Math.min(i2, i);
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
    }
}
