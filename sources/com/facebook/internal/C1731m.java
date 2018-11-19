package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.ImageRequest.Callback;
import com.facebook.internal.WorkQueue.WorkItem;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.m */
public class C1731m {
    /* renamed from: a */
    private static Handler f4783a;
    /* renamed from: b */
    private static WorkQueue f4784b = new WorkQueue(8);
    /* renamed from: c */
    private static WorkQueue f4785c = new WorkQueue(2);
    /* renamed from: d */
    private static final Map<C1730d, C1729c> f4786d = new HashMap();

    /* renamed from: com.facebook.internal.m$a */
    private static class C1727a implements Runnable {
        /* renamed from: a */
        private Context f4773a;
        /* renamed from: b */
        private C1730d f4774b;
        /* renamed from: c */
        private boolean f4775c;

        C1727a(Context context, C1730d c1730d, boolean z) {
            this.f4773a = context;
            this.f4774b = c1730d;
            this.f4775c = z;
        }

        public void run() {
            C1731m.m5960b(this.f4774b, this.f4773a, this.f4775c);
        }
    }

    /* renamed from: com.facebook.internal.m$b */
    private static class C1728b implements Runnable {
        /* renamed from: a */
        private Context f4776a;
        /* renamed from: b */
        private C1730d f4777b;

        C1728b(Context context, C1730d c1730d) {
            this.f4776a = context;
            this.f4777b = c1730d;
        }

        public void run() {
            C1731m.m5959b(this.f4777b, this.f4776a);
        }
    }

    /* renamed from: com.facebook.internal.m$c */
    private static class C1729c {
        /* renamed from: a */
        WorkItem f4778a;
        /* renamed from: b */
        ImageRequest f4779b;
        /* renamed from: c */
        boolean f4780c;

        private C1729c() {
        }
    }

    /* renamed from: com.facebook.internal.m$d */
    private static class C1730d {
        /* renamed from: a */
        Uri f4781a;
        /* renamed from: b */
        Object f4782b;

        C1730d(Uri uri, Object obj) {
            this.f4781a = uri;
            this.f4782b = obj;
        }

        public int hashCode() {
            return ((1073 + this.f4781a.hashCode()) * 37) + this.f4782b.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C1730d)) {
                return false;
            }
            C1730d c1730d = (C1730d) obj;
            if (c1730d.f4781a == this.f4781a && c1730d.f4782b == this.f4782b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m5952a(ImageRequest imageRequest) {
        if (imageRequest != null) {
            C1730d c1730d = new C1730d(imageRequest.m5734b(), imageRequest.m5737e());
            synchronized (f4786d) {
                C1729c c1729c = (C1729c) f4786d.get(c1730d);
                if (c1729c != null) {
                    c1729c.f4779b = imageRequest;
                    c1729c.f4780c = null;
                    c1729c.f4778a.moveToFront();
                } else {
                    C1731m.m5955a(imageRequest, c1730d, imageRequest.m5736d());
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m5961b(ImageRequest imageRequest) {
        boolean z;
        C1730d c1730d = new C1730d(imageRequest.m5734b(), imageRequest.m5737e());
        synchronized (f4786d) {
            C1729c c1729c = (C1729c) f4786d.get(c1730d);
            z = true;
            if (c1729c == null) {
                z = false;
            } else if (c1729c.f4778a.cancel()) {
                f4786d.remove(c1730d);
            } else {
                c1729c.f4780c = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static void m5955a(ImageRequest imageRequest, C1730d c1730d, boolean z) {
        C1731m.m5954a(imageRequest, c1730d, f4785c, new C1727a(imageRequest.m5733a(), c1730d, z));
    }

    /* renamed from: a */
    private static void m5953a(ImageRequest imageRequest, C1730d c1730d) {
        C1731m.m5954a(imageRequest, c1730d, f4784b, new C1728b(imageRequest.m5733a(), c1730d));
    }

    /* renamed from: a */
    private static void m5954a(ImageRequest imageRequest, C1730d c1730d, WorkQueue workQueue, Runnable runnable) {
        synchronized (f4786d) {
            C1729c c1729c = new C1729c();
            c1729c.f4779b = imageRequest;
            f4786d.put(c1730d, c1729c);
            c1729c.f4778a = workQueue.m5854a(runnable);
        }
    }

    /* renamed from: a */
    private static void m5958a(C1730d c1730d, Exception exception, Bitmap bitmap, boolean z) {
        c1730d = C1731m.m5951a(c1730d);
        if (c1730d != null && !c1730d.f4780c) {
            final ImageRequest imageRequest = c1730d.f4779b;
            final Callback c = imageRequest.m5735c();
            if (c != null) {
                final Exception exception2 = exception;
                final boolean z2 = z;
                final Bitmap bitmap2 = bitmap;
                C1731m.m5950a().post(new Runnable() {
                    public void run() {
                        c.onCompleted(new C1732n(imageRequest, exception2, z2, bitmap2));
                    }
                });
            }
        }
    }

    /* renamed from: b */
    private static void m5960b(C1730d c1730d, Context context, boolean z) {
        Closeable a;
        boolean z2 = false;
        if (z) {
            Uri a2 = C1748w.m6058a(c1730d.f4781a);
            if (a2 == true) {
                a = C1734o.m5968a(a2, context);
                if (a == true) {
                    z2 = true;
                }
                if (!z2) {
                    a = C1734o.m5968a(c1730d.f4781a, context);
                }
                if (a == true) {
                    context = C1731m.m5951a(c1730d);
                    if (context != null && !context.f4780c) {
                        C1731m.m5953a(context.f4779b, c1730d);
                        return;
                    }
                    return;
                }
                Bitmap decodeStream = BitmapFactory.decodeStream(a);
                Utility.m5774a(a);
                C1731m.m5958a(c1730d, null, decodeStream, z2);
            }
        }
        a = false;
        if (z2) {
            a = C1734o.m5968a(c1730d.f4781a, context);
        }
        if (a == true) {
            context = C1731m.m5951a(c1730d);
            if (context != null) {
                return;
            }
            return;
        }
        Bitmap decodeStream2 = BitmapFactory.decodeStream(a);
        Utility.m5774a(a);
        C1731m.m5958a(c1730d, null, decodeStream2, z2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static void m5959b(com.facebook.internal.C1731m.C1730d r9, android.content.Context r10) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = 1;
        r3 = new java.net.URL;	 Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
        r4 = r9.f4781a;	 Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
        r3 = r3.openConnection();	 Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
        r3 = (java.net.HttpURLConnection) r3;	 Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
        r3.setInstanceFollowRedirects(r1);	 Catch:{ IOException -> 0x009f, all -> 0x009d }
        r4 = r3.getResponseCode();	 Catch:{ IOException -> 0x009f, all -> 0x009d }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 == r5) goto L_0x008e;
    L_0x001f:
        switch(r4) {
            case 301: goto L_0x005b;
            case 302: goto L_0x005b;
            default: goto L_0x0022;
        };	 Catch:{ IOException -> 0x009f, all -> 0x009d }
    L_0x0022:
        r10 = r3.getErrorStream();	 Catch:{ IOException -> 0x009f, all -> 0x009d }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        r4.<init>();	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        if (r10 == 0) goto L_0x0045;
    L_0x002d:
        r5 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        r5.<init>(r10);	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = new char[r6];	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
    L_0x0036:
        r7 = r6.length;	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        r7 = r5.read(r6, r1, r7);	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        if (r7 <= 0) goto L_0x0041;
    L_0x003d:
        r4.append(r6, r1, r7);	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        goto L_0x0036;
    L_0x0041:
        com.facebook.internal.Utility.m5774a(r5);	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        goto L_0x004a;
    L_0x0045:
        r5 = "Unexpected error while downloading an image.";
        r4.append(r5);	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
    L_0x004a:
        r5 = new com.facebook.FacebookException;	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
        r4 = r0;
        r0 = r5;
        goto L_0x0096;
    L_0x0056:
        r9 = move-exception;
        r0 = r10;
        goto L_0x00a4;
    L_0x0059:
        r4 = move-exception;
        goto L_0x00ae;
    L_0x005b:
        r10 = "location";
        r10 = r3.getHeaderField(r10);	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        r2 = com.facebook.internal.Utility.m5785a(r10);	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        if (r2 != 0) goto L_0x0086;
    L_0x0067:
        r10 = android.net.Uri.parse(r10);	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        r2 = r9.f4781a;	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        com.facebook.internal.C1748w.m6060a(r2, r10);	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        r2 = com.facebook.internal.C1731m.m5951a(r9);	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        if (r2 == 0) goto L_0x0086;
    L_0x0076:
        r4 = r2.f4780c;	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        if (r4 != 0) goto L_0x0086;
    L_0x007a:
        r2 = r2.f4779b;	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        r4 = new com.facebook.internal.m$d;	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        r5 = r9.f4782b;	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        r4.<init>(r10, r5);	 Catch:{ IOException -> 0x008a, all -> 0x009d }
        com.facebook.internal.C1731m.m5955a(r2, r4, r1);	 Catch:{ IOException -> 0x008a, all -> 0x009d }
    L_0x0086:
        r10 = r0;
        r4 = r10;
        r2 = 0;
        goto L_0x0096;
    L_0x008a:
        r4 = move-exception;
        r10 = r0;
        r2 = 0;
        goto L_0x00ae;
    L_0x008e:
        r10 = com.facebook.internal.C1734o.m5967a(r10, r3);	 Catch:{ IOException -> 0x009f, all -> 0x009d }
        r4 = android.graphics.BitmapFactory.decodeStream(r10);	 Catch:{ IOException -> 0x0059, all -> 0x0056 }
    L_0x0096:
        com.facebook.internal.Utility.m5774a(r10);
        com.facebook.internal.Utility.m5779a(r3);
        goto L_0x00b7;
    L_0x009d:
        r9 = move-exception;
        goto L_0x00a4;
    L_0x009f:
        r4 = move-exception;
        r10 = r0;
        goto L_0x00ae;
    L_0x00a2:
        r9 = move-exception;
        r3 = r0;
    L_0x00a4:
        com.facebook.internal.Utility.m5774a(r0);
        com.facebook.internal.Utility.m5779a(r3);
        throw r9;
    L_0x00ab:
        r4 = move-exception;
        r10 = r0;
        r3 = r10;
    L_0x00ae:
        com.facebook.internal.Utility.m5774a(r10);
        com.facebook.internal.Utility.m5779a(r3);
        r8 = r4;
        r4 = r0;
        r0 = r8;
    L_0x00b7:
        if (r2 == 0) goto L_0x00bc;
    L_0x00b9:
        com.facebook.internal.C1731m.m5958a(r9, r0, r4, r1);
    L_0x00bc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.m.b(com.facebook.internal.m$d, android.content.Context):void");
    }

    /* renamed from: a */
    private static synchronized Handler m5950a() {
        Handler handler;
        synchronized (C1731m.class) {
            if (f4783a == null) {
                f4783a = new Handler(Looper.getMainLooper());
            }
            handler = f4783a;
        }
        return handler;
    }

    /* renamed from: a */
    private static C1729c m5951a(C1730d c1730d) {
        C1729c c1729c;
        synchronized (f4786d) {
            c1729c = (C1729c) f4786d.remove(c1730d);
        }
        return c1729c;
    }
}
