package com.bumptech.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.load.C3021a;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C3030b;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.C3098d;
import com.bumptech.glide.manager.C1064i;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.p025c.C3016b;
import com.bumptech.glide.p026d.C0987h;
import com.bumptech.glide.provider.C4115a;
import com.bumptech.glide.provider.LoadProvider;
import com.bumptech.glide.request.C3124b;
import com.bumptech.glide.request.C4329a;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.GenericRequest;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.C3121c;
import com.bumptech.glide.request.animation.GlideAnimationFactory;
import com.bumptech.glide.request.target.Target;

/* renamed from: com.bumptech.glide.e */
public class C0990e<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {
    /* renamed from: A */
    private boolean f2687A;
    /* renamed from: B */
    private Drawable f2688B;
    /* renamed from: C */
    private int f2689C;
    /* renamed from: a */
    protected final Class<ModelType> f2690a;
    /* renamed from: b */
    protected final Context f2691b;
    /* renamed from: c */
    protected final C0994i f2692c;
    /* renamed from: d */
    protected final Class<TranscodeType> f2693d;
    /* renamed from: e */
    protected final C1064i f2694e;
    /* renamed from: f */
    protected final Lifecycle f2695f;
    /* renamed from: g */
    private C4115a<ModelType, DataType, ResourceType, TranscodeType> f2696g;
    /* renamed from: h */
    private ModelType f2697h;
    /* renamed from: i */
    private Key f2698i;
    /* renamed from: j */
    private boolean f2699j;
    /* renamed from: k */
    private int f2700k;
    /* renamed from: l */
    private int f2701l;
    /* renamed from: m */
    private RequestListener<? super ModelType, TranscodeType> f2702m;
    /* renamed from: n */
    private Float f2703n;
    /* renamed from: o */
    private C0990e<?, ?, ?, TranscodeType> f2704o;
    /* renamed from: p */
    private Float f2705p;
    /* renamed from: q */
    private Drawable f2706q;
    /* renamed from: r */
    private Drawable f2707r;
    /* renamed from: s */
    private Priority f2708s;
    /* renamed from: t */
    private boolean f2709t;
    /* renamed from: u */
    private GlideAnimationFactory<TranscodeType> f2710u;
    /* renamed from: v */
    private int f2711v;
    /* renamed from: w */
    private int f2712w;
    /* renamed from: x */
    private DiskCacheStrategy f2713x;
    /* renamed from: y */
    private Transformation<ResourceType> f2714y;
    /* renamed from: z */
    private boolean f2715z;

    /* renamed from: com.bumptech.glide.e$2 */
    static /* synthetic */ class C09892 {
        /* renamed from: a */
        static final /* synthetic */ int[] f2686a = new int[ScaleType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = android.widget.ImageView.ScaleType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f2686a = r0;
            r0 = f2686a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f2686a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.widget.ImageView.ScaleType.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f2686a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.widget.ImageView.ScaleType.FIT_START;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f2686a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.widget.ImageView.ScaleType.FIT_END;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.2.<clinit>():void");
        }
    }

    /* renamed from: f */
    void mo1253f() {
    }

    /* renamed from: g */
    void mo1254g() {
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo1255h();
    }

    C0990e(LoadProvider<ModelType, DataType, ResourceType, TranscodeType> loadProvider, Class<TranscodeType> cls, C0990e<ModelType, ?, ?, ?> c0990e) {
        this(c0990e.f2691b, c0990e.f2690a, loadProvider, cls, c0990e.f2692c, c0990e.f2694e, c0990e.f2695f);
        this.f2697h = c0990e.f2697h;
        this.f2699j = c0990e.f2699j;
        this.f2698i = c0990e.f2698i;
        this.f2713x = c0990e.f2713x;
        this.f2709t = c0990e.f2709t;
    }

    C0990e(Context context, Class<ModelType> cls, LoadProvider<ModelType, DataType, ResourceType, TranscodeType> loadProvider, Class<TranscodeType> cls2, C0994i c0994i, C1064i c1064i, Lifecycle lifecycle) {
        this.f2698i = C3016b.m11827a();
        this.f2705p = Float.valueOf(1.0f);
        C4115a c4115a = null;
        this.f2708s = null;
        this.f2709t = true;
        this.f2710u = C3121c.m12096a();
        this.f2711v = -1;
        this.f2712w = -1;
        this.f2713x = DiskCacheStrategy.RESULT;
        this.f2714y = C3098d.m12053a();
        this.f2691b = context;
        this.f2690a = cls;
        this.f2693d = cls2;
        this.f2692c = c0994i;
        this.f2694e = c1064i;
        this.f2695f = lifecycle;
        if (loadProvider != null) {
            c4115a = new C4115a(loadProvider);
        }
        this.f2696g = c4115a;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        } else if (cls != null && loadProvider == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1240b(C0990e<?, ?, ?, TranscodeType> c0990e) {
        if (equals(c0990e)) {
            throw new IllegalArgumentException("You cannot set a request as a thumbnail for itself. Consider using clone() on the request you are passing to thumbnail()");
        }
        this.f2704o = c0990e;
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1243b(ResourceDecoder<DataType, ResourceType> resourceDecoder) {
        if (this.f2696g != null) {
            this.f2696g.m15994a((ResourceDecoder) resourceDecoder);
        }
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1241b(Encoder<DataType> encoder) {
        if (this.f2696g != null) {
            this.f2696g.m15993a((Encoder) encoder);
        }
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1244b(DiskCacheStrategy diskCacheStrategy) {
        this.f2713x = diskCacheStrategy;
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1239b(Priority priority) {
        this.f2708s = priority;
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1249b(Transformation<ResourceType>... transformationArr) {
        this.f2715z = true;
        if (transformationArr.length == 1) {
            this.f2714y = transformationArr[0];
        } else {
            this.f2714y = new C3021a(transformationArr);
        }
        return this;
    }

    /* renamed from: j */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1257j() {
        return mo1249b(C3098d.m12053a());
    }

    /* renamed from: i */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1256i() {
        return mo1246b(C3121c.m12096a());
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1246b(GlideAnimationFactory<TranscodeType> glideAnimationFactory) {
        if (glideAnimationFactory == null) {
            throw new NullPointerException("Animation factory must not be null!");
        }
        this.f2710u = glideAnimationFactory;
        return this;
    }

    /* renamed from: d */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1252d(int i) {
        this.f2700k = i;
        return this;
    }

    /* renamed from: c */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1250c(int i) {
        this.f2701l = i;
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1238b(Drawable drawable) {
        this.f2707r = drawable;
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1245b(RequestListener<? super ModelType, TranscodeType> requestListener) {
        this.f2702m = requestListener;
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1248b(boolean z) {
        this.f2709t = z ^ 1;
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1237b(int i, int i2) {
        if (C0987h.m3412a(i, i2)) {
            this.f2712w = i;
            this.f2711v = i2;
            return this;
        }
        throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1242b(Key key) {
        if (key == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f2698i = key;
        return this;
    }

    /* renamed from: b */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1247b(ModelType modelType) {
        this.f2697h = modelType;
        this.f2699j = true;
        return this;
    }

    /* renamed from: h */
    public C0990e<ModelType, DataType, ResourceType, TranscodeType> mo1255h() {
        try {
            C0990e<ModelType, DataType, ResourceType, TranscodeType> c0990e = (C0990e) super.clone();
            c0990e.f2696g = this.f2696g != null ? this.f2696g.m15992a() : null;
            return c0990e;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public <Y extends Target<TranscodeType>> Y m3435b(Y y) {
        C0987h.m3411a();
        if (y == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        } else if (this.f2699j) {
            Request request = y.getRequest();
            if (request != null) {
                request.clear();
                this.f2694e.m3668b(request);
                request.recycle();
            }
            request = mo1261a((Target) y);
            y.setRequest(request);
            this.f2695f.addListener(y);
            this.f2694e.m3666a(request);
            return y;
        } else {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
    }

    /* renamed from: a */
    public Target<TranscodeType> mo1236a(ImageView imageView) {
        C0987h.m3411a();
        if (imageView == null) {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (!(this.f2715z || imageView.getScaleType() == null)) {
            switch (C09892.f2686a[imageView.getScaleType().ordinal()]) {
                case 1:
                    mo1254g();
                    break;
                case 2:
                case 3:
                case 4:
                    mo1253f();
                    break;
                default:
                    break;
            }
        }
        return m3435b(this.f2692c.m3492a(imageView, this.f2693d));
    }

    /* renamed from: d */
    public FutureTarget<TranscodeType> m3438d(int i, int i2) {
        final FutureTarget c4329a = new C4329a(this.f2692c.m3501g(), i, i2);
        this.f2692c.m3501g().post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C0990e f2685b;

            public void run() {
                if (!c4329a.isCancelled()) {
                    this.f2685b.m3435b(c4329a);
                }
            }
        });
        return c4329a;
    }

    /* renamed from: a */
    private Priority mo1235a() {
        if (this.f2708s == Priority.LOW) {
            return Priority.NORMAL;
        }
        if (this.f2708s == Priority.NORMAL) {
            return Priority.HIGH;
        }
        return Priority.IMMEDIATE;
    }

    /* renamed from: a */
    private Request mo1261a(Target<TranscodeType> target) {
        if (this.f2708s == null) {
            this.f2708s = Priority.NORMAL;
        }
        return m3420a(target, null);
    }

    /* renamed from: a */
    private Request m3420a(Target<TranscodeType> target, C3124b c3124b) {
        Request c3124b2;
        if (this.f2704o != null) {
            if (this.f2687A) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (this.f2704o.f2710u.equals(C3121c.m12096a())) {
                this.f2704o.f2710u = this.f2710u;
            }
            if (this.f2704o.f2708s == null) {
                this.f2704o.f2708s = mo1235a();
            }
            if (C0987h.m3412a(this.f2712w, this.f2711v) && !C0987h.m3412a(this.f2704o.f2712w, this.f2704o.f2711v)) {
                this.f2704o.mo1237b(this.f2712w, this.f2711v);
            }
            c3124b2 = new C3124b(c3124b);
            c3124b = m3419a(target, this.f2705p.floatValue(), this.f2708s, c3124b2);
            this.f2687A = true;
            target = this.f2704o.m3420a(target, c3124b2);
            this.f2687A = false;
            c3124b2.m12102a(c3124b, target);
            return c3124b2;
        } else if (this.f2703n == null) {
            return m3419a(target, this.f2705p.floatValue(), this.f2708s, c3124b);
        } else {
            c3124b2 = new C3124b(c3124b);
            c3124b2.m12102a(m3419a(target, this.f2705p.floatValue(), this.f2708s, c3124b2), m3419a(target, this.f2703n.floatValue(), mo1235a(), c3124b2));
            return c3124b2;
        }
    }

    /* renamed from: a */
    private Request m3419a(Target<TranscodeType> target, float f, Priority priority, RequestCoordinator requestCoordinator) {
        LoadProvider loadProvider = this.f2696g;
        Object obj = this.f2697h;
        Key key = this.f2698i;
        Context context = this.f2691b;
        Drawable drawable = this.f2706q;
        int i = this.f2700k;
        Drawable drawable2 = this.f2707r;
        int i2 = this.f2701l;
        Drawable drawable3 = this.f2688B;
        int i3 = this.f2689C;
        RequestListener requestListener = this.f2702m;
        C3030b b = this.f2692c.m3495b();
        Transformation transformation = this.f2714y;
        Class cls = this.f2693d;
        boolean z = this.f2709t;
        GlideAnimationFactory glideAnimationFactory = this.f2710u;
        Transformation transformation2 = transformation;
        return GenericRequest.m12077a(loadProvider, obj, key, context, priority, target, f, drawable, i, drawable2, i2, drawable3, i3, requestListener, requestCoordinator, b, transformation2, cls, z, glideAnimationFactory, this.f2712w, this.f2711v, this.f2713x);
    }
}
