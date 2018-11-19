package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.squareup.picasso.v */
final class C6120v {
    /* renamed from: a */
    static final StringBuilder f22493a = new StringBuilder();

    @TargetApi(11)
    /* renamed from: com.squareup.picasso.v$a */
    private static class C6115a {
        /* renamed from: a */
        static int m26561a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    /* renamed from: com.squareup.picasso.v$b */
    private static class C6116b {
        /* renamed from: a */
        static int m26562a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: com.squareup.picasso.v$c */
    private static class C6117c {
        /* renamed from: a */
        static Downloader m26563a(Context context) {
            return new C7257l(context);
        }
    }

    /* renamed from: com.squareup.picasso.v$d */
    private static class C6118d extends Thread {
        public C6118d(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.squareup.picasso.v$e */
    static class C6119e implements ThreadFactory {
        C6119e() {
        }

        public Thread newThread(Runnable runnable) {
            return new C6118d(runnable);
        }
    }

    /* renamed from: a */
    static int m26565a(Bitmap bitmap) {
        int a;
        if (VERSION.SDK_INT >= 12) {
            a = C6116b.m26562a(bitmap);
        } else {
            a = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (a >= 0) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(bitmap);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    static <T> T m26570a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static void m26575a() {
        if (!C6120v.m26582b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: b */
    static boolean m26582b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    static String m26571a(C6090c c6090c) {
        return C6120v.m26572a(c6090c, "");
    }

    /* renamed from: a */
    static String m26572a(C6090c c6090c, String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        str = c6090c.m26470i();
        if (str != null) {
            stringBuilder.append(str.f22335b.m26517a());
        }
        c6090c = c6090c.m26472k();
        if (c6090c != null) {
            int size = c6090c.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || str != null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(((C6084a) c6090c.get(i)).f22335b.m26517a());
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static void m26578a(String str, String str2, String str3) {
        C6120v.m26579a(str, str2, str3, "");
    }

    /* renamed from: a */
    static void m26579a(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }

    /* renamed from: a */
    static String m26573a(C6104o c6104o) {
        c6104o = C6120v.m26574a(c6104o, f22493a);
        f22493a.setLength(0);
        return c6104o;
    }

    /* renamed from: a */
    static String m26574a(C6104o c6104o, StringBuilder stringBuilder) {
        if (c6104o.f22432f != null) {
            stringBuilder.ensureCapacity(c6104o.f22432f.length() + 50);
            stringBuilder.append(c6104o.f22432f);
        } else if (c6104o.f22430d != null) {
            String uri = c6104o.f22430d.toString();
            stringBuilder.ensureCapacity(uri.length() + 50);
            stringBuilder.append(uri);
        } else {
            stringBuilder.ensureCapacity(50);
            stringBuilder.append(c6104o.f22431e);
        }
        stringBuilder.append('\n');
        if (c6104o.f22439m != 0.0f) {
            stringBuilder.append("rotation:");
            stringBuilder.append(c6104o.f22439m);
            if (c6104o.f22442p) {
                stringBuilder.append('@');
                stringBuilder.append(c6104o.f22440n);
                stringBuilder.append('x');
                stringBuilder.append(c6104o.f22441o);
            }
            stringBuilder.append('\n');
        }
        if (c6104o.m26520d()) {
            stringBuilder.append("resize:");
            stringBuilder.append(c6104o.f22434h);
            stringBuilder.append('x');
            stringBuilder.append(c6104o.f22435i);
            stringBuilder.append('\n');
        }
        if (c6104o.f22436j) {
            stringBuilder.append("centerCrop");
            stringBuilder.append('\n');
        } else if (c6104o.f22437k) {
            stringBuilder.append("centerInside");
            stringBuilder.append('\n');
        }
        if (c6104o.f22433g != null) {
            int size = c6104o.f22433g.size();
            for (int i = 0; i < size; i++) {
                stringBuilder.append(((Transformation) c6104o.f22433g.get(i)).key());
                stringBuilder.append('\n');
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static void m26577a(java.io.InputStream r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r0 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0.close();	 Catch:{ IOException -> 0x0006 }
    L_0x0006:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.a(java.io.InputStream):void");
    }

    /* renamed from: a */
    static boolean m26580a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = " ";
        r2 = 2;
        r4 = r4.split(r1, r2);
        r1 = "CACHE";
        r2 = r4[r0];
        r1 = r1.equals(r2);
        r2 = 1;
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        return r2;
    L_0x0017:
        r1 = r4.length;
        if (r1 != r2) goto L_0x001b;
    L_0x001a:
        return r0;
    L_0x001b:
        r1 = "CONDITIONAL_CACHE";	 Catch:{ NumberFormatException -> 0x0031 }
        r3 = r4[r0];	 Catch:{ NumberFormatException -> 0x0031 }
        r1 = r1.equals(r3);	 Catch:{ NumberFormatException -> 0x0031 }
        if (r1 == 0) goto L_0x0030;	 Catch:{ NumberFormatException -> 0x0031 }
    L_0x0025:
        r4 = r4[r2];	 Catch:{ NumberFormatException -> 0x0031 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0031 }
        r1 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r4 != r1) goto L_0x0030;
    L_0x002f:
        r0 = 1;
    L_0x0030:
        return r0;
    L_0x0031:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.a(java.lang.String):boolean");
    }

    /* renamed from: a */
    static com.squareup.picasso.Downloader m26568a(android.content.Context r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "com.squareup.okhttp.p";	 Catch:{ ClassNotFoundException -> 0x000a }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000a }
        r0 = com.squareup.picasso.C6120v.C6117c.m26563a(r1);	 Catch:{ ClassNotFoundException -> 0x000a }
        return r0;
    L_0x000a:
        r0 = new com.squareup.picasso.u;
        r0.<init>(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.a(android.content.Context):com.squareup.picasso.Downloader");
    }

    /* renamed from: b */
    static File m26581b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (file.exists() == null) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    static long m26566a(java.io.File r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 5242880; // 0x500000 float:7.34684E-39 double:2.590327E-317;
        r2 = new android.os.StatFs;	 Catch:{ IllegalArgumentException -> 0x001d }
        r7 = r7.getAbsolutePath();	 Catch:{ IllegalArgumentException -> 0x001d }
        r2.<init>(r7);	 Catch:{ IllegalArgumentException -> 0x001d }
        r7 = r2.getBlockCount();	 Catch:{ IllegalArgumentException -> 0x001d }
        r3 = (long) r7;	 Catch:{ IllegalArgumentException -> 0x001d }
        r7 = r2.getBlockSize();	 Catch:{ IllegalArgumentException -> 0x001d }
        r5 = (long) r7;	 Catch:{ IllegalArgumentException -> 0x001d }
        r3 = r3 * r5;	 Catch:{ IllegalArgumentException -> 0x001d }
        r5 = 50;	 Catch:{ IllegalArgumentException -> 0x001d }
        r2 = r3 / r5;	 Catch:{ IllegalArgumentException -> 0x001d }
        goto L_0x001e;
    L_0x001d:
        r2 = r0;
    L_0x001e:
        r4 = 52428800; // 0x3200000 float:4.7019774E-37 double:2.5903269E-316;
        r2 = java.lang.Math.min(r2, r4);
        r0 = java.lang.Math.max(r2, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.a(java.io.File):long");
    }

    /* renamed from: c */
    static int m26585c(Context context) {
        ActivityManager activityManager = (ActivityManager) C6120v.m26569a(context, "activity");
        context = (context.getApplicationInfo().flags & 1048576) != null ? true : null;
        int memoryClass = activityManager.getMemoryClass();
        if (context != null && VERSION.SDK_INT >= 11) {
            memoryClass = C6115a.m26561a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    /* renamed from: d */
    static boolean m26587d(android.content.Context r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = r2.getContentResolver();
        r0 = 0;
        r1 = "airplane_mode_on";	 Catch:{ NullPointerException -> 0x000f }
        r2 = android.provider.Settings.System.getInt(r2, r1, r0);	 Catch:{ NullPointerException -> 0x000f }
        if (r2 == 0) goto L_0x000e;
    L_0x000d:
        r0 = 1;
    L_0x000e:
        return r0;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.d(android.content.Context):boolean");
    }

    /* renamed from: a */
    static <T> T m26569a(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: b */
    static boolean m26583b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == null ? true : null;
    }

    /* renamed from: b */
    static byte[] m26584b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: c */
    static boolean m26586c(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) != 12 || "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) == null || "WEBP".equals(new String(bArr, 8, 4, "US-ASCII")) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static int m26564a(android.content.res.Resources r6, com.squareup.picasso.C6104o r7) throws java.io.FileNotFoundException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r7.f22431e;
        if (r0 != 0) goto L_0x00b0;
    L_0x0004:
        r0 = r7.f22430d;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x00b0;
    L_0x000a:
        r0 = r7.f22430d;
        r0 = r0.getAuthority();
        if (r0 != 0) goto L_0x002b;
    L_0x0012:
        r6 = new java.io.FileNotFoundException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "No package provided: ";
        r0.append(r1);
        r7 = r7.f22430d;
        r0.append(r7);
        r7 = r0.toString();
        r6.<init>(r7);
        throw r6;
    L_0x002b:
        r1 = r7.f22430d;
        r1 = r1.getPathSegments();
        if (r1 == 0) goto L_0x0097;
    L_0x0033:
        r2 = r1.isEmpty();
        if (r2 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0097;
    L_0x003a:
        r2 = r1.size();
        r3 = 0;
        r4 = 1;
        if (r2 != r4) goto L_0x0066;
    L_0x0042:
        r6 = r1.get(r3);	 Catch:{ NumberFormatException -> 0x004d }
        r6 = (java.lang.String) r6;	 Catch:{ NumberFormatException -> 0x004d }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x004d }
        goto L_0x007d;
    L_0x004d:
        r6 = new java.io.FileNotFoundException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Last path segment is not a resource ID: ";
        r0.append(r1);
        r7 = r7.f22430d;
        r0.append(r7);
        r7 = r0.toString();
        r6.<init>(r7);
        throw r6;
    L_0x0066:
        r2 = r1.size();
        r5 = 2;
        if (r2 != r5) goto L_0x007e;
    L_0x006d:
        r7 = r1.get(r3);
        r7 = (java.lang.String) r7;
        r1 = r1.get(r4);
        r1 = (java.lang.String) r1;
        r6 = r6.getIdentifier(r1, r7, r0);
    L_0x007d:
        return r6;
    L_0x007e:
        r6 = new java.io.FileNotFoundException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "More than two path segments: ";
        r0.append(r1);
        r7 = r7.f22430d;
        r0.append(r7);
        r7 = r0.toString();
        r6.<init>(r7);
        throw r6;
    L_0x0097:
        r6 = new java.io.FileNotFoundException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "No path segments: ";
        r0.append(r1);
        r7 = r7.f22430d;
        r0.append(r7);
        r7 = r0.toString();
        r6.<init>(r7);
        throw r6;
    L_0x00b0:
        r6 = r7.f22431e;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.a(android.content.res.Resources, com.squareup.picasso.o):int");
    }

    /* renamed from: a */
    static android.content.res.Resources m26567a(android.content.Context r2, com.squareup.picasso.C6104o r3) throws java.io.FileNotFoundException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r3.f22431e;
        if (r0 != 0) goto L_0x004c;
    L_0x0004:
        r0 = r3.f22430d;
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        goto L_0x004c;
    L_0x0009:
        r0 = r3.f22430d;
        r0 = r0.getAuthority();
        if (r0 != 0) goto L_0x002a;
    L_0x0011:
        r2 = new java.io.FileNotFoundException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "No package provided: ";
        r0.append(r1);
        r3 = r3.f22430d;
        r0.append(r3);
        r3 = r0.toString();
        r2.<init>(r3);
        throw r2;
    L_0x002a:
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0033 }
        r2 = r2.getResourcesForApplication(r0);	 Catch:{ NameNotFoundException -> 0x0033 }
        return r2;
    L_0x0033:
        r2 = new java.io.FileNotFoundException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Unable to obtain resources for package: ";
        r0.append(r1);
        r3 = r3.f22430d;
        r0.append(r3);
        r3 = r0.toString();
        r2.<init>(r3);
        throw r2;
    L_0x004c:
        r2 = r2.getResources();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.a(android.content.Context, com.squareup.picasso.o):android.content.res.Resources");
    }

    /* renamed from: a */
    static void m26576a(Looper looper) {
        Handler c61141 = new Handler(looper) {
            public void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        c61141.sendMessageDelayed(c61141.obtainMessage(), 1000);
    }
}
