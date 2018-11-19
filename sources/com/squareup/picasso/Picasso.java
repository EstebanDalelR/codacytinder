package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class Picasso {
    /* renamed from: a */
    static final Handler f22316a = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                List list;
                if (i == 8) {
                    list = (List) message.obj;
                    i = list.size();
                    while (i2 < i) {
                        C6090c c6090c = (C6090c) list.get(i2);
                        c6090c.f22356b.m26434a(c6090c);
                        i2++;
                    }
                    return;
                } else if (i != 13) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown handler message received: ");
                    stringBuilder.append(message.what);
                    throw new AssertionError(stringBuilder.toString());
                } else {
                    list = (List) message.obj;
                    i = list.size();
                    while (i2 < i) {
                        C6084a c6084a = (C6084a) list.get(i2);
                        c6084a.f22334a.m26437c(c6084a);
                        i2++;
                    }
                    return;
                }
            }
            C6084a c6084a2 = (C6084a) message.obj;
            if (c6084a2.m26448j().f22327l) {
                C6120v.m26579a("Main", "canceled", c6084a2.f22335b.m26517a(), "target got garbage collected");
            }
            c6084a2.f22334a.m26426a(c6084a2.m26442d());
        }
    };
    /* renamed from: b */
    static volatile Picasso f22317b;
    /* renamed from: c */
    final Context f22318c;
    /* renamed from: d */
    final C6097g f22319d;
    /* renamed from: e */
    final Cache f22320e;
    /* renamed from: f */
    final C6110s f22321f;
    /* renamed from: g */
    final Map<Object, C6084a> f22322g;
    /* renamed from: h */
    final Map<ImageView, C6092f> f22323h;
    /* renamed from: i */
    final ReferenceQueue<Object> f22324i;
    /* renamed from: j */
    final Config f22325j;
    /* renamed from: k */
    boolean f22326k;
    /* renamed from: l */
    volatile boolean f22327l;
    /* renamed from: m */
    boolean f22328m;
    /* renamed from: n */
    private final Listener f22329n;
    /* renamed from: o */
    private final RequestTransformer f22330o;
    /* renamed from: p */
    private final C6082b f22331p;
    /* renamed from: q */
    private final List<C6107q> f22332q;

    public interface Listener {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception);
    }

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        private LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    public interface RequestTransformer {
        /* renamed from: a */
        public static final RequestTransformer f22301a = new C72501();

        /* renamed from: com.squareup.picasso.Picasso$RequestTransformer$1 */
        static class C72501 implements RequestTransformer {
            public C6104o transformRequest(C6104o c6104o) {
                return c6104o;
            }

            C72501() {
            }
        }

        C6104o transformRequest(C6104o c6104o);
    }

    /* renamed from: com.squareup.picasso.Picasso$a */
    public static class C6080a {
        /* renamed from: a */
        private final Context f22302a;
        /* renamed from: b */
        private Downloader f22303b;
        /* renamed from: c */
        private ExecutorService f22304c;
        /* renamed from: d */
        private Cache f22305d;
        /* renamed from: e */
        private Listener f22306e;
        /* renamed from: f */
        private RequestTransformer f22307f;
        /* renamed from: g */
        private List<C6107q> f22308g;
        /* renamed from: h */
        private Config f22309h;
        /* renamed from: i */
        private boolean f22310i;
        /* renamed from: j */
        private boolean f22311j;

        public C6080a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f22302a = context.getApplicationContext();
        }

        /* renamed from: a */
        public C6080a m26421a(Downloader downloader) {
            if (downloader == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (this.f22303b != null) {
                throw new IllegalStateException("Downloader already set.");
            } else {
                this.f22303b = downloader;
                return this;
            }
        }

        /* renamed from: a */
        public Picasso m26422a() {
            Context context = this.f22302a;
            if (this.f22303b == null) {
                this.f22303b = C6120v.m26568a(context);
            }
            if (this.f22305d == null) {
                this.f22305d = new C7256j(context);
            }
            if (this.f22304c == null) {
                this.f22304c = new C6101n();
            }
            if (this.f22307f == null) {
                this.f22307f = RequestTransformer.f22301a;
            }
            C6110s c6110s = new C6110s(this.f22305d);
            Context context2 = context;
            return new Picasso(context2, new C6097g(context2, this.f22304c, Picasso.f22316a, this.f22303b, this.f22305d, c6110s), this.f22305d, this.f22306e, this.f22307f, this.f22308g, c6110s, this.f22309h, this.f22310i, this.f22311j);
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$b */
    private static class C6082b extends Thread {
        /* renamed from: a */
        private final ReferenceQueue<Object> f22314a;
        /* renamed from: b */
        private final Handler f22315b;

        C6082b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f22314a = referenceQueue;
            this.f22315b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = 10;
            android.os.Process.setThreadPriority(r0);
        L_0x0005:
            r0 = r3.f22314a;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r0 = r0.remove(r1);	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r0 = (com.squareup.picasso.C6084a.C6083a) r0;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r1 = r3.f22315b;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r1 = r1.obtainMessage();	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            if (r0 == 0) goto L_0x0024;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
        L_0x0017:
            r2 = 3;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r1.what = r2;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r0 = r0.f22333a;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r1.obj = r0;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r0 = r3.f22315b;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            r0.sendMessage(r1);	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            goto L_0x0005;	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
        L_0x0024:
            r1.recycle();	 Catch:{ InterruptedException -> 0x0033, Exception -> 0x0028 }
            goto L_0x0005;
        L_0x0028:
            r0 = move-exception;
            r1 = r3.f22315b;
            r2 = new com.squareup.picasso.Picasso$b$1;
            r2.<init>(r3, r0);
            r1.post(r2);
        L_0x0033:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Picasso.b.run():void");
        }
    }

    Picasso(Context context, C6097g c6097g, Cache cache, Listener listener, RequestTransformer requestTransformer, List<C6107q> list, C6110s c6110s, Config config, boolean z, boolean z2) {
        this.f22318c = context;
        this.f22319d = c6097g;
        this.f22320e = cache;
        this.f22329n = listener;
        this.f22330o = requestTransformer;
        this.f22325j = config;
        listener = new ArrayList((list != null ? list.size() : null) + 7);
        listener.add(new C7258r(context));
        if (list != null) {
            listener.addAll(list);
        }
        listener.add(new C7253d(context));
        listener.add(new MediaStoreRequestHandler(context));
        listener.add(new C7254e(context));
        listener.add(new C7251b(context));
        listener.add(new C7950h(context));
        listener.add(new NetworkRequestHandler(c6097g.f22384d, c6110s));
        this.f22332q = Collections.unmodifiableList(listener);
        this.f22321f = c6110s;
        this.f22322g = new WeakHashMap();
        this.f22323h = new WeakHashMap();
        this.f22326k = z;
        this.f22327l = z2;
        this.f22324i = new ReferenceQueue();
        this.f22331p = new C6082b(this.f22324i, f22316a);
        this.f22331p.start();
    }

    /* renamed from: a */
    public void m26431a(ImageView imageView) {
        m26426a((Object) imageView);
    }

    /* renamed from: a */
    public C6105p m26428a(Uri uri) {
        return new C6105p(this, uri, 0);
    }

    /* renamed from: a */
    public C6105p m26429a(String str) {
        if (str == null) {
            return new C6105p(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return m26428a(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* renamed from: a */
    List<C6107q> m26430a() {
        return this.f22332q;
    }

    /* renamed from: a */
    C6104o m26427a(C6104o c6104o) {
        C6104o transformRequest = this.f22330o.transformRequest(c6104o);
        if (transformRequest != null) {
            return transformRequest;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request transformer ");
        stringBuilder.append(this.f22330o.getClass().getCanonicalName());
        stringBuilder.append(" returned null for ");
        stringBuilder.append(c6104o);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    void m26432a(ImageView imageView, C6092f c6092f) {
        this.f22323h.put(imageView, c6092f);
    }

    /* renamed from: a */
    void m26433a(C6084a c6084a) {
        Object d = c6084a.m26442d();
        if (!(d == null || this.f22322g.get(d) == c6084a)) {
            m26426a(d);
            this.f22322g.put(d, c6084a);
        }
        m26436b(c6084a);
    }

    /* renamed from: b */
    void m26436b(C6084a c6084a) {
        this.f22319d.m26486a(c6084a);
    }

    /* renamed from: b */
    Bitmap m26435b(String str) {
        str = this.f22320e.get(str);
        if (str != null) {
            this.f22321f.m26546a();
        } else {
            this.f22321f.m26550b();
        }
        return str;
    }

    /* renamed from: a */
    void m26434a(C6090c c6090c) {
        C6084a i = c6090c.m26470i();
        List k = c6090c.m26472k();
        Object obj = 1;
        Object obj2 = (k == null || k.isEmpty()) ? null : 1;
        if (i == null) {
            if (obj2 == null) {
                obj = null;
            }
        }
        if (obj != null) {
            Uri uri = c6090c.m26469h().f22430d;
            Exception l = c6090c.m26473l();
            Bitmap e = c6090c.m26466e();
            c6090c = c6090c.m26474m();
            if (i != null) {
                m26424a(e, c6090c, i);
            }
            if (obj2 != null) {
                int size = k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m26424a(e, c6090c, (C6084a) k.get(i2));
                }
            }
            if (!(this.f22329n == null || l == null)) {
                this.f22329n.onImageLoadFailed(this, uri, l);
            }
        }
    }

    /* renamed from: c */
    void m26437c(C6084a c6084a) {
        Bitmap b = MemoryPolicy.shouldReadFromMemoryCache(c6084a.f22338e) ? m26435b(c6084a.m26443e()) : null;
        if (b != null) {
            m26424a(b, LoadedFrom.MEMORY, c6084a);
            if (this.f22327l) {
                c6084a = c6084a.f22335b.m26517a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("from ");
                stringBuilder.append(LoadedFrom.MEMORY);
                C6120v.m26579a("Main", "completed", c6084a, stringBuilder.toString());
                return;
            }
            return;
        }
        m26433a(c6084a);
        if (this.f22327l) {
            C6120v.m26578a("Main", "resumed", c6084a.f22335b.m26517a());
        }
    }

    /* renamed from: a */
    private void m26424a(Bitmap bitmap, LoadedFrom loadedFrom, C6084a c6084a) {
        if (!c6084a.m26444f()) {
            if (!c6084a.m26445g()) {
                this.f22322g.remove(c6084a.m26442d());
            }
            if (bitmap == null) {
                c6084a.mo6579a();
                if (this.f22327l != null) {
                    C6120v.m26578a("Main", "errored", c6084a.f22335b.m26517a());
                }
            } else if (loadedFrom == null) {
                throw new AssertionError("LoadedFrom cannot be null.");
            } else {
                c6084a.mo6580a(bitmap, loadedFrom);
                if (this.f22327l != null) {
                    c6084a = c6084a.f22335b.m26517a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("from ");
                    stringBuilder.append(loadedFrom);
                    C6120v.m26579a("Main", "completed", c6084a, stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m26426a(Object obj) {
        C6120v.m26575a();
        C6084a c6084a = (C6084a) this.f22322g.remove(obj);
        if (c6084a != null) {
            c6084a.mo6581b();
            this.f22319d.m26493b(c6084a);
        }
        if (obj instanceof ImageView) {
            C6092f c6092f = (C6092f) this.f22323h.remove((ImageView) obj);
            if (c6092f != null) {
                c6092f.m26477a();
            }
        }
    }

    /* renamed from: a */
    public static Picasso m26423a(Context context) {
        if (f22317b == null) {
            synchronized (Picasso.class) {
                if (f22317b == null) {
                    f22317b = new C6080a(context).m26422a();
                }
            }
        }
        return f22317b;
    }
}
