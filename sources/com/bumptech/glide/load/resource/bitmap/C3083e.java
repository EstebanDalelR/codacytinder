package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import com.bumptech.glide.p026d.C0979a;
import com.bumptech.glide.p026d.C0981c;
import com.bumptech.glide.p026d.C0984f;
import com.bumptech.glide.p026d.C0987h;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
public abstract class C3083e implements BitmapDecoder<InputStream> {
    /* renamed from: a */
    public static final C3083e f9541a = new C41041();
    /* renamed from: b */
    public static final C3083e f9542b = new C41052();
    /* renamed from: c */
    public static final C3083e f9543c = new C41063();
    /* renamed from: d */
    private static final Set<ImageType> f9544d = EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG);
    /* renamed from: e */
    private static final Queue<Options> f9545e = C0987h.m3410a(0);

    /* renamed from: com.bumptech.glide.load.resource.bitmap.e$1 */
    static class C41041 extends C3083e {
        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        C41041() {
        }

        public /* synthetic */ Bitmap decode(Object obj, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws Exception {
            return super.m12037a((InputStream) obj, bitmapPool, i, i2, decodeFormat);
        }

        /* renamed from: a */
        protected int mo3188a(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.e$2 */
    static class C41052 extends C3083e {
        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        C41052() {
        }

        public /* synthetic */ Bitmap decode(Object obj, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws Exception {
            return super.m12037a((InputStream) obj, bitmapPool, i, i2, decodeFormat);
        }

        /* renamed from: a */
        protected int mo3188a(int i, int i2, int i3, int i4) {
            i = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            i3 = 1;
            i2 = Math.max(1, Integer.highestOneBit(i));
            if (i2 >= i) {
                i3 = 0;
            }
            return i2 << i3;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.e$3 */
    static class C41063 extends C3083e {
        /* renamed from: a */
        protected int mo3188a(int i, int i2, int i3, int i4) {
            return 0;
        }

        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

        C41063() {
        }

        public /* synthetic */ Bitmap decode(Object obj, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws Exception {
            return super.m12037a((InputStream) obj, bitmapPool, i, i2, decodeFormat);
        }
    }

    /* renamed from: a */
    protected abstract int mo3188a(int i, int i2, int i3, int i4);

    public /* synthetic */ Bitmap decode(Object obj, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws Exception {
        return m12037a((InputStream) obj, bitmapPool, i, i2, decodeFormat);
    }

    /* renamed from: a */
    public Bitmap m12037a(InputStream inputStream, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) {
        Throwable e;
        Throwable th;
        Options options;
        int i3;
        BitmapPool bitmapPool2 = bitmapPool;
        C0979a a = C0979a.m3383a();
        byte[] b = a.m3385b();
        byte[] b2 = a.m3385b();
        Options a2 = C3083e.m12030a();
        InputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, b2);
        InputStream a3 = C0981c.m3388a(recyclableBufferedInputStream);
        C0984f c0984f = new C0984f(a3);
        try {
            a3.mark(5242880);
            try {
                int c = new ImageHeaderParser(a3).m3608c();
                try {
                    a3.reset();
                } catch (Throwable e2) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot reset the input stream", e2);
                    }
                } catch (Throwable e22) {
                    th = e22;
                    options = a2;
                    a.m3384a(b);
                    a.m3384a(b2);
                    a3.m3390b();
                    C3083e.m12031a(options);
                    throw th;
                }
                i3 = c;
            } catch (Throwable e222) {
                Throwable th2 = e222;
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot determine the image orientation from header", th2);
                }
                a3.reset();
                i3 = 0;
            } catch (Throwable e2222) {
                th = e2222;
                options = a2;
                a3.reset();
                throw th;
            }
        } catch (Throwable e22222) {
            if (Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Cannot reset the input stream", e22222);
            }
        } catch (Throwable th3) {
            e22222 = th3;
            options = a2;
            th = e22222;
            a.m3384a(b);
            a.m3384a(b2);
            a3.m3390b();
            C3083e.m12031a(options);
            throw th;
        }
        a2.inTempStorage = b;
        int[] a4 = m12038a(c0984f, recyclableBufferedInputStream, a2);
        int i4 = a4[0];
        int i5 = a4[1];
        Options options2 = a2;
        Options options3 = a2;
        int i6 = i3;
        try {
            Bitmap a5 = m12029a(c0984f, recyclableBufferedInputStream, options2, bitmapPool2, i4, i5, m12027a(C1047o.m3615a(i3), i4, i5, i, i2), decodeFormat);
            th = a3.m3389a();
            if (th != null) {
                try {
                    throw new RuntimeException(th);
                } catch (Throwable e222222) {
                    th = e222222;
                    options = options3;
                    a.m3384a(b);
                    a.m3384a(b2);
                    a3.m3390b();
                    C3083e.m12031a(options);
                    throw th;
                }
            }
            Bitmap bitmap = null;
            if (a5 != null) {
                bitmap = C1047o.m3618a(a5, bitmapPool2, i6);
                if (!(a5.equals(bitmap) || bitmapPool2.put(a5))) {
                    a5.recycle();
                }
            }
            a.m3384a(b);
            a.m3384a(b2);
            a3.m3390b();
            C3083e.m12031a(options3);
            return bitmap;
        } catch (Throwable th4) {
            e222222 = th4;
            options = options3;
            th = e222222;
            a.m3384a(b);
            a.m3384a(b2);
            a3.m3390b();
            C3083e.m12031a(options);
            throw th;
        }
    }

    /* renamed from: a */
    private int m12027a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = i2;
        }
        if (i != 90) {
            if (i != 270) {
                i = mo3188a(i2, i3, i4, i5);
                if (i != 0) {
                    i = 0;
                } else {
                    i = Integer.highestOneBit(i);
                }
                return Math.max(1, i);
            }
        }
        i = mo3188a(i3, i2, i4, i5);
        if (i != 0) {
            i = Integer.highestOneBit(i);
        } else {
            i = 0;
        }
        return Math.max(1, i);
    }

    /* renamed from: a */
    private Bitmap m12029a(C0984f c0984f, RecyclableBufferedInputStream recyclableBufferedInputStream, Options options, BitmapPool bitmapPool, int i, int i2, int i3, DecodeFormat decodeFormat) {
        decodeFormat = C3083e.m12028a((InputStream) c0984f, decodeFormat);
        options.inSampleSize = i3;
        options.inPreferredConfig = decodeFormat;
        if ((options.inSampleSize == 1 || 19 <= VERSION.SDK_INT) && C3083e.m12033a((InputStream) c0984f)) {
            double d = (double) i3;
            C3083e.m12032a(options, bitmapPool.getDirty((int) Math.ceil(((double) i) / d), (int) Math.ceil(((double) i2) / d), decodeFormat));
        }
        return C3083e.m12034b(c0984f, recyclableBufferedInputStream, options);
    }

    /* renamed from: a */
    private static boolean m12033a(InputStream inputStream) {
        if (19 <= VERSION.SDK_INT) {
            return true;
        }
        inputStream.mark(1024);
        boolean contains;
        try {
            contains = f9544d.contains(new ImageHeaderParser(inputStream).m3607b());
            return contains;
        } catch (IOException e) {
            contains = e;
            if (Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Cannot determine the image type from header", contains);
            }
            return null;
        } finally {
            try {
                inputStream.reset();
            } catch (InputStream inputStream2) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot reset the input stream", inputStream2);
                }
            }
        }
    }

    /* renamed from: a */
    private static Config m12028a(InputStream inputStream, DecodeFormat decodeFormat) {
        boolean a;
        if (!(decodeFormat == DecodeFormat.ALWAYS_ARGB_8888 || decodeFormat == DecodeFormat.PREFER_ARGB_8888)) {
            if (VERSION.SDK_INT != 16) {
                boolean z = false;
                inputStream.mark(1024);
                try {
                    a = new ImageHeaderParser(inputStream).m3606a();
                    z = a;
                } catch (IOException e) {
                    a = e;
                    if (Log.isLoggable("Downsampler", 5)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Cannot determine whether the image has alpha or not from header for format ");
                        stringBuilder.append(decodeFormat);
                        Log.w("Downsampler", stringBuilder.toString(), a);
                    }
                    if (z) {
                        inputStream = Config.ARGB_8888;
                    } else {
                        inputStream = Config.RGB_565;
                    }
                    return inputStream;
                } finally {
                    try {
                        inputStream.reset();
                    } catch (InputStream inputStream2) {
                        if (Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Cannot reset the input stream", inputStream2);
                        }
                    }
                }
                if (z) {
                    inputStream2 = Config.ARGB_8888;
                } else {
                    inputStream2 = Config.RGB_565;
                }
                return inputStream2;
            }
        }
        return Config.ARGB_8888;
    }

    /* renamed from: a */
    public int[] m12038a(C0984f c0984f, RecyclableBufferedInputStream recyclableBufferedInputStream, Options options) {
        options.inJustDecodeBounds = true;
        C3083e.m12034b(c0984f, recyclableBufferedInputStream, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: b */
    private static Bitmap m12034b(C0984f c0984f, RecyclableBufferedInputStream recyclableBufferedInputStream, Options options) {
        if (options.inJustDecodeBounds) {
            c0984f.mark(5242880);
        } else {
            recyclableBufferedInputStream.m3611a();
        }
        recyclableBufferedInputStream = BitmapFactory.decodeStream(c0984f, null, options);
        try {
            if (options.inJustDecodeBounds) {
                c0984f.reset();
            }
        } catch (C0984f c0984f2) {
            if (Log.isLoggable("Downsampler", 6)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Exception loading inDecodeBounds=");
                stringBuilder.append(options.inJustDecodeBounds);
                stringBuilder.append(" sample=");
                stringBuilder.append(options.inSampleSize);
                Log.e("Downsampler", stringBuilder.toString(), c0984f2);
            }
        }
        return recyclableBufferedInputStream;
    }

    @TargetApi(11)
    /* renamed from: a */
    private static void m12032a(Options options, Bitmap bitmap) {
        if (11 <= VERSION.SDK_INT) {
            options.inBitmap = bitmap;
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    private static synchronized Options m12030a() {
        Options options;
        synchronized (C3083e.class) {
            synchronized (f9545e) {
                options = (Options) f9545e.poll();
            }
            if (options == null) {
                options = new Options();
                C3083e.m12035b(options);
            }
        }
        return options;
    }

    /* renamed from: a */
    private static void m12031a(Options options) {
        C3083e.m12035b(options);
        synchronized (f9545e) {
            f9545e.offer(options);
        }
    }

    @TargetApi(11)
    /* renamed from: b */
    private static void m12035b(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }
}
