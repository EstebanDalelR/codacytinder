package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.C3030b;
import com.bumptech.glide.load.engine.C3030b.C1003c;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.p026d.C0982d;
import com.bumptech.glide.p026d.C0987h;
import com.bumptech.glide.provider.LoadProvider;
import com.bumptech.glide.request.animation.GlideAnimationFactory;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import java.util.Queue;

public final class GenericRequest<A, T, Z, R> implements Request, ResourceCallback, SizeReadyCallback {
    /* renamed from: a */
    private static final Queue<GenericRequest<?, ?, ?, ?>> f9633a = C0987h.m3410a(0);
    /* renamed from: A */
    private Resource<?> f9634A;
    /* renamed from: B */
    private C1003c f9635B;
    /* renamed from: C */
    private long f9636C;
    /* renamed from: D */
    private Status f9637D;
    /* renamed from: b */
    private final String f9638b = String.valueOf(hashCode());
    /* renamed from: c */
    private Key f9639c;
    /* renamed from: d */
    private Drawable f9640d;
    /* renamed from: e */
    private int f9641e;
    /* renamed from: f */
    private int f9642f;
    /* renamed from: g */
    private int f9643g;
    /* renamed from: h */
    private Context f9644h;
    /* renamed from: i */
    private Transformation<Z> f9645i;
    /* renamed from: j */
    private LoadProvider<A, T, Z, R> f9646j;
    /* renamed from: k */
    private RequestCoordinator f9647k;
    /* renamed from: l */
    private A f9648l;
    /* renamed from: m */
    private Class<R> f9649m;
    /* renamed from: n */
    private boolean f9650n;
    /* renamed from: o */
    private Priority f9651o;
    /* renamed from: p */
    private Target<R> f9652p;
    /* renamed from: q */
    private RequestListener<? super A, R> f9653q;
    /* renamed from: r */
    private float f9654r;
    /* renamed from: s */
    private C3030b f9655s;
    /* renamed from: t */
    private GlideAnimationFactory<R> f9656t;
    /* renamed from: u */
    private int f9657u;
    /* renamed from: v */
    private int f9658v;
    /* renamed from: w */
    private DiskCacheStrategy f9659w;
    /* renamed from: x */
    private Drawable f9660x;
    /* renamed from: y */
    private Drawable f9661y;
    /* renamed from: z */
    private boolean f9662z;

    private enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    /* renamed from: a */
    public static <A, T, Z, R> GenericRequest<A, T, Z, R> m12077a(LoadProvider<A, T, Z, R> loadProvider, A a, Key key, Context context, Priority priority, Target<R> target, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, RequestListener<? super A, R> requestListener, RequestCoordinator requestCoordinator, C3030b c3030b, Transformation<Z> transformation, Class<R> cls, boolean z, GlideAnimationFactory<R> glideAnimationFactory, int i4, int i5, DiskCacheStrategy diskCacheStrategy) {
        GenericRequest<A, T, Z, R> genericRequest = (GenericRequest) f9633a.poll();
        if (genericRequest == null) {
            genericRequest = new GenericRequest();
        }
        genericRequest.m12084b(loadProvider, a, key, context, priority, target, f, drawable, i, drawable2, i2, drawable3, i3, requestListener, requestCoordinator, c3030b, transformation, cls, z, glideAnimationFactory, i4, i5, diskCacheStrategy);
        return genericRequest;
    }

    private GenericRequest() {
    }

    public void recycle() {
        this.f9646j = null;
        this.f9648l = null;
        this.f9644h = null;
        this.f9652p = null;
        this.f9660x = null;
        this.f9661y = null;
        this.f9640d = null;
        this.f9653q = null;
        this.f9647k = null;
        this.f9645i = null;
        this.f9656t = null;
        this.f9662z = false;
        this.f9635B = null;
        f9633a.offer(this);
    }

    /* renamed from: b */
    private void m12084b(LoadProvider<A, T, Z, R> loadProvider, A a, Key key, Context context, Priority priority, Target<R> target, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, RequestListener<? super A, R> requestListener, RequestCoordinator requestCoordinator, C3030b c3030b, Transformation<Z> transformation, Class<R> cls, boolean z, GlideAnimationFactory<R> glideAnimationFactory, int i4, int i5, DiskCacheStrategy diskCacheStrategy) {
        A a2 = a;
        Transformation<Z> transformation2 = transformation;
        LoadProvider<A, T, Z, R> loadProvider2 = loadProvider;
        this.f9646j = loadProvider2;
        this.f9648l = a2;
        this.f9639c = key;
        this.f9640d = drawable3;
        this.f9641e = i3;
        this.f9644h = context.getApplicationContext();
        this.f9651o = priority;
        this.f9652p = target;
        this.f9654r = f;
        this.f9660x = drawable;
        this.f9642f = i;
        this.f9661y = drawable2;
        this.f9643g = i2;
        this.f9653q = requestListener;
        this.f9647k = requestCoordinator;
        this.f9655s = c3030b;
        this.f9645i = transformation2;
        this.f9649m = cls;
        this.f9650n = z;
        this.f9656t = glideAnimationFactory;
        this.f9657u = i4;
        this.f9658v = i5;
        this.f9659w = diskCacheStrategy;
        this.f9637D = Status.PENDING;
        if (a2 != null) {
            m12082a("ModelLoader", loadProvider2.getModelLoader(), "try .using(ModelLoader)");
            m12082a("Transcoder", loadProvider2.getTranscoder(), "try .as*(Class).transcode(ResourceTranscoder)");
            m12082a("Transformation", transformation2, "try .transform(UnitTransformation.get())");
            if (diskCacheStrategy.cacheSource()) {
                m12082a("SourceEncoder", loadProvider2.getSourceEncoder(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else {
                m12082a("SourceDecoder", loadProvider2.getSourceDecoder(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (diskCacheStrategy.cacheSource() || diskCacheStrategy.cacheResult()) {
                m12082a("CacheDecoder", loadProvider2.getCacheDecoder(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (diskCacheStrategy.cacheResult()) {
                m12082a("Encoder", loadProvider2.getEncoder(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    /* renamed from: a */
    private static void m12082a(String str, Object obj, String str2) {
        if (obj == null) {
            obj = new StringBuilder(str);
            obj.append(" must not be null");
            if (str2 != null) {
                obj.append(", ");
                obj.append(str2);
            }
            throw new NullPointerException(obj.toString());
        }
    }

    public void begin() {
        this.f9636C = C0982d.m3393a();
        if (this.f9648l == null) {
            onException(null);
            return;
        }
        this.f9637D = Status.WAITING_FOR_SIZE;
        if (C0987h.m3412a(this.f9657u, this.f9658v)) {
            onSizeReady(this.f9657u, this.f9658v);
        } else {
            this.f9652p.getSize(this);
        }
        if (!(isComplete() || isFailed() || !m12088f())) {
            this.f9652p.onLoadStarted(m12086d());
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("finished run method in ");
            stringBuilder.append(C0982d.m3392a(this.f9636C));
            m12081a(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    void m12091a() {
        this.f9637D = Status.CANCELLED;
        if (this.f9635B != null) {
            this.f9635B.m3524a();
            this.f9635B = null;
        }
    }

    public void clear() {
        C0987h.m3411a();
        if (this.f9637D != Status.CLEARED) {
            m12091a();
            if (this.f9634A != null) {
                m12078a(this.f9634A);
            }
            if (m12088f()) {
                this.f9652p.onLoadCleared(m12086d());
            }
            this.f9637D = Status.CLEARED;
        }
    }

    public boolean isPaused() {
        return this.f9637D == Status.PAUSED;
    }

    public void pause() {
        clear();
        this.f9637D = Status.PAUSED;
    }

    /* renamed from: a */
    private void m12078a(Resource resource) {
        this.f9655s.m11947a(resource);
        this.f9634A = null;
    }

    public boolean isRunning() {
        if (this.f9637D != Status.RUNNING) {
            if (this.f9637D != Status.WAITING_FOR_SIZE) {
                return false;
            }
        }
        return true;
    }

    public boolean isComplete() {
        return this.f9637D == Status.COMPLETE;
    }

    public boolean isResourceSet() {
        return isComplete();
    }

    public boolean isCancelled() {
        if (this.f9637D != Status.CANCELLED) {
            if (this.f9637D != Status.CLEARED) {
                return false;
            }
        }
        return true;
    }

    public boolean isFailed() {
        return this.f9637D == Status.FAILED;
    }

    /* renamed from: b */
    private Drawable m12083b() {
        if (this.f9640d == null && this.f9641e > 0) {
            this.f9640d = this.f9644h.getResources().getDrawable(this.f9641e);
        }
        return this.f9640d;
    }

    /* renamed from: a */
    private void m12080a(Exception exception) {
        if (m12088f()) {
            Drawable b = this.f9648l == null ? m12083b() : null;
            if (b == null) {
                b = m12085c();
            }
            if (b == null) {
                b = m12086d();
            }
            this.f9652p.onLoadFailed(exception, b);
        }
    }

    /* renamed from: c */
    private Drawable m12085c() {
        if (this.f9661y == null && this.f9643g > 0) {
            this.f9661y = this.f9644h.getResources().getDrawable(this.f9643g);
        }
        return this.f9661y;
    }

    /* renamed from: d */
    private Drawable m12086d() {
        if (this.f9660x == null && this.f9642f > 0) {
            this.f9660x = this.f9644h.getResources().getDrawable(this.f9642f);
        }
        return this.f9660x;
    }

    public void onSizeReady(int i, int i2) {
        GenericRequest genericRequest = this;
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got onSizeReady in ");
            stringBuilder.append(C0982d.m3392a(genericRequest.f9636C));
            m12081a(stringBuilder.toString());
        }
        if (genericRequest.f9637D == Status.WAITING_FOR_SIZE) {
            genericRequest.f9637D = Status.RUNNING;
            int round = Math.round(genericRequest.f9654r * ((float) i));
            int round2 = Math.round(genericRequest.f9654r * ((float) i2));
            DataFetcher resourceFetcher = genericRequest.f9646j.getModelLoader().getResourceFetcher(genericRequest.f9648l, round, round2);
            if (resourceFetcher == null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Failed to load model: '");
                stringBuilder2.append(genericRequest.f9648l);
                stringBuilder2.append("'");
                onException(new Exception(stringBuilder2.toString()));
                return;
            }
            ResourceTranscoder transcoder = genericRequest.f9646j.getTranscoder();
            if (Log.isLoggable("GenericRequest", 2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("finished setup for calling load in ");
                stringBuilder.append(C0982d.m3392a(genericRequest.f9636C));
                m12081a(stringBuilder.toString());
            }
            boolean z = true;
            genericRequest.f9662z = true;
            genericRequest.f9635B = genericRequest.f9655s.m11945a(genericRequest.f9639c, round, round2, resourceFetcher, genericRequest.f9646j, genericRequest.f9645i, transcoder, genericRequest.f9651o, genericRequest.f9650n, genericRequest.f9659w, genericRequest);
            if (genericRequest.f9634A == null) {
                z = false;
            }
            genericRequest.f9662z = z;
            if (Log.isLoggable("GenericRequest", 2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("finished onSizeReady in ");
                stringBuilder.append(C0982d.m3392a(genericRequest.f9636C));
                m12081a(stringBuilder.toString());
            }
        }
    }

    /* renamed from: e */
    private boolean m12087e() {
        if (this.f9647k != null) {
            if (!this.f9647k.canSetImage(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private boolean m12088f() {
        if (this.f9647k != null) {
            if (!this.f9647k.canNotifyStatusChanged(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private boolean m12089g() {
        if (this.f9647k != null) {
            if (this.f9647k.isAnyResourceSet()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private void m12090h() {
        if (this.f9647k != null) {
            this.f9647k.onRequestSuccess(this);
        }
    }

    public void onResourceReady(Resource<?> resource) {
        if (resource == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected to receive a Resource<R> with an object of ");
            stringBuilder.append(this.f9649m);
            stringBuilder.append(" inside, but instead got null.");
            onException(new Exception(stringBuilder.toString()));
            return;
        }
        Object obj = resource.get();
        if (obj != null) {
            if (this.f9649m.isAssignableFrom(obj.getClass())) {
                if (m12087e()) {
                    m12079a(resource, obj);
                    return;
                }
                m12078a((Resource) resource);
                this.f9637D = Status.COMPLETE;
                return;
            }
        }
        m12078a((Resource) resource);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Expected to receive an object of ");
        stringBuilder2.append(this.f9649m);
        stringBuilder2.append(" but instead got ");
        stringBuilder2.append(obj != null ? obj.getClass() : "");
        stringBuilder2.append("{");
        stringBuilder2.append(obj);
        stringBuilder2.append("}");
        stringBuilder2.append(" inside Resource{");
        stringBuilder2.append(resource);
        stringBuilder2.append("}.");
        stringBuilder2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        onException(new Exception(stringBuilder2.toString()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m12079a(com.bumptech.glide.load.engine.Resource<?> r8, R r9) {
        /*
        r7 = this;
        r6 = r7.m12089g();
        r0 = com.bumptech.glide.request.GenericRequest.Status.COMPLETE;
        r7.f9637D = r0;
        r7.f9634A = r8;
        r0 = r7.f9653q;
        if (r0 == 0) goto L_0x001e;
    L_0x000e:
        r0 = r7.f9653q;
        r2 = r7.f9648l;
        r3 = r7.f9652p;
        r4 = r7.f9662z;
        r1 = r9;
        r5 = r6;
        r0 = r0.onResourceReady(r1, r2, r3, r4, r5);
        if (r0 != 0) goto L_0x002b;
    L_0x001e:
        r0 = r7.f9656t;
        r1 = r7.f9662z;
        r0 = r0.build(r1, r6);
        r1 = r7.f9652p;
        r1.onResourceReady(r9, r0);
    L_0x002b:
        r7.m12090h();
        r9 = "GenericRequest";
        r0 = 2;
        r9 = android.util.Log.isLoggable(r9, r0);
        if (r9 == 0) goto L_0x006c;
    L_0x0037:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = "Resource ready in ";
        r9.append(r0);
        r0 = r7.f9636C;
        r0 = com.bumptech.glide.p026d.C0982d.m3392a(r0);
        r9.append(r0);
        r0 = " size: ";
        r9.append(r0);
        r8 = r8.getSize();
        r0 = (double) r8;
        r2 = 4517110426252607488; // 0x3eb0000000000000 float:0.0 double:9.5367431640625E-7;
        r0 = r0 * r2;
        r9.append(r0);
        r8 = " fromCache: ";
        r9.append(r8);
        r8 = r7.f9662z;
        r9.append(r8);
        r8 = r9.toString();
        r7.m12081a(r8);
    L_0x006c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.GenericRequest.a(com.bumptech.glide.load.engine.Resource, java.lang.Object):void");
    }

    public void onException(Exception exception) {
        if (Log.isLoggable("GenericRequest", 3)) {
            Log.d("GenericRequest", "load failed", exception);
        }
        this.f9637D = Status.FAILED;
        if (this.f9653q == null || !this.f9653q.onException(exception, this.f9648l, this.f9652p, m12089g())) {
            m12080a(exception);
        }
    }

    /* renamed from: a */
    private void m12081a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" this: ");
        stringBuilder.append(this.f9638b);
        Log.v("GenericRequest", stringBuilder.toString());
    }
}
