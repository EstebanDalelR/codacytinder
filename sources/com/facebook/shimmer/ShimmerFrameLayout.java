package com.facebook.shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.facebook.ads.AdError;
import com.facebook.shimmer.C1870a.C1869a;

public class ShimmerFrameLayout extends FrameLayout {
    /* renamed from: c */
    private static final PorterDuffXfermode f5064c = new PorterDuffXfermode(Mode.DST_IN);
    /* renamed from: a */
    protected ValueAnimator f5065a;
    /* renamed from: b */
    protected Bitmap f5066b;
    /* renamed from: d */
    private Paint f5067d;
    /* renamed from: e */
    private Paint f5068e;
    /* renamed from: f */
    private C1867a f5069f;
    /* renamed from: g */
    private C1868b f5070g;
    /* renamed from: h */
    private Bitmap f5071h;
    /* renamed from: i */
    private Bitmap f5072i;
    /* renamed from: j */
    private boolean f5073j;
    /* renamed from: k */
    private int f5074k;
    /* renamed from: l */
    private int f5075l;
    /* renamed from: m */
    private int f5076m;
    /* renamed from: n */
    private int f5077n;
    /* renamed from: o */
    private int f5078o;
    /* renamed from: p */
    private int f5079p;
    /* renamed from: q */
    private boolean f5080q;
    /* renamed from: r */
    private OnGlobalLayoutListener f5081r;

    /* renamed from: com.facebook.shimmer.ShimmerFrameLayout$1 */
    class C18641 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ ShimmerFrameLayout f5047a;

        C18641(ShimmerFrameLayout shimmerFrameLayout) {
            this.f5047a = shimmerFrameLayout;
        }

        public void onGlobalLayout() {
            boolean a = this.f5047a.f5080q;
            this.f5047a.m6556g();
            if (this.f5047a.f5073j || a) {
                this.f5047a.m6560b();
            }
        }
    }

    /* renamed from: com.facebook.shimmer.ShimmerFrameLayout$2 */
    class C18652 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ ShimmerFrameLayout f5048a;

        C18652(ShimmerFrameLayout shimmerFrameLayout) {
            this.f5048a = shimmerFrameLayout;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator = Math.max(0.0f, Math.min(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            float f = 1.0f - valueAnimator;
            this.f5048a.setMaskOffsetX((int) ((((float) this.f5048a.f5070g.f5060a) * f) + (((float) this.f5048a.f5070g.f5062c) * valueAnimator)));
            this.f5048a.setMaskOffsetY((int) ((((float) this.f5048a.f5070g.f5061b) * f) + (((float) this.f5048a.f5070g.f5063d) * valueAnimator)));
        }
    }

    /* renamed from: com.facebook.shimmer.ShimmerFrameLayout$3 */
    static /* synthetic */ class C18663 {
        /* renamed from: a */
        static final /* synthetic */ int[] f5049a = new int[MaskShape.values().length];

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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.facebook.shimmer.ShimmerFrameLayout.MaskAngle.values();
            r0 = r0.length;
            r0 = new int[r0];
            f5050b = r0;
            r0 = 1;
            r1 = f5050b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.facebook.shimmer.ShimmerFrameLayout.MaskAngle.CW_0;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f5050b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.facebook.shimmer.ShimmerFrameLayout.MaskAngle.CW_90;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = f5050b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r3 = com.facebook.shimmer.ShimmerFrameLayout.MaskAngle.CW_180;	 Catch:{ NoSuchFieldError -> 0x002a }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r3] = r4;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r2 = f5050b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r3 = com.facebook.shimmer.ShimmerFrameLayout.MaskAngle.CW_270;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2[r3] = r4;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r2 = com.facebook.shimmer.ShimmerFrameLayout.MaskShape.values();
            r2 = r2.length;
            r2 = new int[r2];
            f5049a = r2;
            r2 = f5049a;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r3 = com.facebook.shimmer.ShimmerFrameLayout.MaskShape.LINEAR;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            r0 = f5049a;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r2 = com.facebook.shimmer.ShimmerFrameLayout.MaskShape.RADIAL;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.3.<clinit>():void");
        }
    }

    public enum MaskAngle {
        CW_0,
        CW_90,
        CW_180,
        CW_270
    }

    public enum MaskShape {
        LINEAR,
        RADIAL
    }

    /* renamed from: com.facebook.shimmer.ShimmerFrameLayout$a */
    private static class C1867a {
        /* renamed from: a */
        public MaskAngle f5051a;
        /* renamed from: b */
        public float f5052b;
        /* renamed from: c */
        public float f5053c;
        /* renamed from: d */
        public int f5054d;
        /* renamed from: e */
        public int f5055e;
        /* renamed from: f */
        public float f5056f;
        /* renamed from: g */
        public float f5057g;
        /* renamed from: h */
        public float f5058h;
        /* renamed from: i */
        public MaskShape f5059i;

        private C1867a() {
        }

        /* renamed from: a */
        public int m6537a(int i) {
            return this.f5054d > 0 ? this.f5054d : (int) (((float) i) * this.f5057g);
        }

        /* renamed from: b */
        public int m6539b(int i) {
            return this.f5055e > 0 ? this.f5055e : (int) (((float) i) * this.f5058h);
        }

        /* renamed from: a */
        public int[] m6538a() {
            if (C18663.f5049a[this.f5059i.ordinal()] != 2) {
                return new int[]{0, -16777216, -16777216, 0};
            }
            return new int[]{-16777216, -16777216, 0};
        }

        /* renamed from: b */
        public float[] m6540b() {
            if (C18663.f5049a[this.f5059i.ordinal()] != 2) {
                return new float[]{Math.max(((1.0f - this.f5056f) - this.f5053c) / 2.0f, 0.0f), Math.max((1.0f - this.f5056f) / 2.0f, 0.0f), Math.min((this.f5056f + 1.0f) / 2.0f, 1.0f), Math.min(((this.f5056f + 1.0f) + this.f5053c) / 2.0f, 1.0f)};
            }
            return new float[]{0.0f, Math.min(this.f5056f, 1.0f), Math.min(this.f5056f + this.f5053c, 1.0f)};
        }
    }

    /* renamed from: com.facebook.shimmer.ShimmerFrameLayout$b */
    private static class C1868b {
        /* renamed from: a */
        public int f5060a;
        /* renamed from: b */
        public int f5061b;
        /* renamed from: c */
        public int f5062c;
        /* renamed from: d */
        public int f5063d;

        private C1868b() {
        }

        /* renamed from: a */
        public void m6541a(int i, int i2, int i3, int i4) {
            this.f5060a = i;
            this.f5061b = i2;
            this.f5062c = i3;
            this.f5063d = i4;
        }
    }

    public ShimmerFrameLayout(Context context) {
        this(context, null, 0);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.f5069f = new C1867a();
        this.f5067d = new Paint();
        this.f5068e = new Paint();
        this.f5068e.setAntiAlias(true);
        this.f5068e.setDither(true);
        this.f5068e.setFilterBitmap(true);
        this.f5068e.setXfermode(f5064c);
        m6559a();
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C1869a.ShimmerFrameLayout, 0, 0);
            try {
                if (context.hasValue(0) != null) {
                    setAutoStart(context.getBoolean(0, false));
                }
                if (context.hasValue(1) != null) {
                    setBaseAlpha(context.getFloat(1, 0.0f));
                }
                if (context.hasValue(2)) {
                    setDuration(context.getInt(2, 0));
                }
                if (context.hasValue(3)) {
                    setRepeatCount(context.getInt(3, 0));
                }
                if (context.hasValue(4)) {
                    setRepeatDelay(context.getInt(4, 0));
                }
                if (context.hasValue(5)) {
                    setRepeatMode(context.getInt(5, 0));
                }
                if (context.hasValue(6)) {
                    attributeSet = context.getInt(6, 0);
                    if (attributeSet == 90) {
                        this.f5069f.f5051a = MaskAngle.CW_90;
                    } else if (attributeSet == 180) {
                        this.f5069f.f5051a = MaskAngle.CW_180;
                    } else if (attributeSet != 270) {
                        this.f5069f.f5051a = MaskAngle.CW_0;
                    } else {
                        this.f5069f.f5051a = MaskAngle.CW_270;
                    }
                }
                if (context.hasValue(13)) {
                    if (context.getInt(13, 0) != 1) {
                        this.f5069f.f5059i = MaskShape.LINEAR;
                    } else {
                        this.f5069f.f5059i = MaskShape.RADIAL;
                    }
                }
                if (context.hasValue(7)) {
                    this.f5069f.f5053c = context.getFloat(7, 0.0f);
                }
                if (context.hasValue(8)) {
                    this.f5069f.f5054d = context.getDimensionPixelSize(8, 0);
                }
                if (context.hasValue(9)) {
                    this.f5069f.f5055e = context.getDimensionPixelSize(9, 0);
                }
                if (context.hasValue(10) != 0) {
                    this.f5069f.f5056f = context.getFloat(10, 0.0f);
                }
                if (context.hasValue(11) != 0) {
                    this.f5069f.f5057g = context.getFloat(11, 0.0f);
                }
                if (context.hasValue(12) != 0) {
                    this.f5069f.f5058h = context.getFloat(12, 0.0f);
                }
                if (context.hasValue(14) != null) {
                    this.f5069f.f5052b = context.getFloat(14, 0.0f);
                }
                context.recycle();
            } catch (Throwable th) {
                context.recycle();
            }
        }
    }

    /* renamed from: a */
    public void m6559a() {
        setAutoStart(false);
        setDuration(AdError.NETWORK_ERROR_CODE);
        setRepeatCount(-1);
        setRepeatDelay(0);
        setRepeatMode(1);
        this.f5069f.f5051a = MaskAngle.CW_0;
        this.f5069f.f5059i = MaskShape.LINEAR;
        this.f5069f.f5053c = 0.5f;
        this.f5069f.f5054d = 0;
        this.f5069f.f5055e = 0;
        this.f5069f.f5056f = 0.0f;
        this.f5069f.f5057g = 1.0f;
        this.f5069f.f5058h = 1.0f;
        this.f5069f.f5052b = 20.0f;
        this.f5070g = new C1868b();
        setBaseAlpha(0.3f);
        m6556g();
    }

    public void setAutoStart(boolean z) {
        this.f5073j = z;
        m6556g();
    }

    public float getBaseAlpha() {
        return ((float) this.f5067d.getAlpha()) / 255.0f;
    }

    public void setBaseAlpha(float f) {
        this.f5067d.setAlpha((int) (m6542a(0.0f, 1.0f, f) * 255.0f));
        m6556g();
    }

    public int getDuration() {
        return this.f5074k;
    }

    public void setDuration(int i) {
        this.f5074k = i;
        m6556g();
    }

    public int getRepeatCount() {
        return this.f5075l;
    }

    public void setRepeatCount(int i) {
        this.f5075l = i;
        m6556g();
    }

    public int getRepeatDelay() {
        return this.f5076m;
    }

    public void setRepeatDelay(int i) {
        this.f5076m = i;
        m6556g();
    }

    public int getRepeatMode() {
        return this.f5077n;
    }

    public void setRepeatMode(int i) {
        this.f5077n = i;
        m6556g();
    }

    public MaskShape getMaskShape() {
        return this.f5069f.f5059i;
    }

    public void setMaskShape(MaskShape maskShape) {
        this.f5069f.f5059i = maskShape;
        m6556g();
    }

    public MaskAngle getAngle() {
        return this.f5069f.f5051a;
    }

    public void setAngle(MaskAngle maskAngle) {
        this.f5069f.f5051a = maskAngle;
        m6556g();
    }

    public float getDropoff() {
        return this.f5069f.f5053c;
    }

    public void setDropoff(float f) {
        this.f5069f.f5053c = f;
        m6556g();
    }

    public int getFixedWidth() {
        return this.f5069f.f5054d;
    }

    public void setFixedWidth(int i) {
        this.f5069f.f5054d = i;
        m6556g();
    }

    public int getFixedHeight() {
        return this.f5069f.f5055e;
    }

    public void setFixedHeight(int i) {
        this.f5069f.f5055e = i;
        m6556g();
    }

    public float getIntensity() {
        return this.f5069f.f5056f;
    }

    public void setIntensity(float f) {
        this.f5069f.f5056f = f;
        m6556g();
    }

    public float getRelativeWidth() {
        return this.f5069f.f5057g;
    }

    public void setRelativeWidth(int i) {
        this.f5069f.f5057g = (float) i;
        m6556g();
    }

    public float getRelativeHeight() {
        return this.f5069f.f5058h;
    }

    public void setRelativeHeight(int i) {
        this.f5069f.f5058h = (float) i;
        m6556g();
    }

    public float getTilt() {
        return this.f5069f.f5052b;
    }

    public void setTilt(float f) {
        this.f5069f.f5052b = f;
        m6556g();
    }

    /* renamed from: b */
    public void m6560b() {
        if (!this.f5080q) {
            getShimmerAnimation().start();
            this.f5080q = true;
        }
    }

    /* renamed from: c */
    public void m6561c() {
        if (this.f5065a != null) {
            this.f5065a.end();
            this.f5065a.removeAllUpdateListeners();
            this.f5065a.cancel();
        }
        this.f5065a = null;
        this.f5080q = false;
    }

    private void setMaskOffsetX(int i) {
        if (this.f5078o != i) {
            this.f5078o = i;
            invalidate();
        }
    }

    private void setMaskOffsetY(int i) {
        if (this.f5079p != i) {
            this.f5079p = i;
            invalidate();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5081r == null) {
            this.f5081r = getLayoutListener();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f5081r);
    }

    private OnGlobalLayoutListener getLayoutListener() {
        return new C18641(this);
    }

    protected void onDetachedFromWindow() {
        m6561c();
        if (this.f5081r != null) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f5081r);
            this.f5081r = null;
        }
        super.onDetachedFromWindow();
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.f5080q && getWidth() > 0) {
            if (getHeight() > 0) {
                m6545a(canvas);
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    private static float m6542a(float f, float f2, float f3) {
        return Math.min(f2, Math.max(f, f3));
    }

    /* renamed from: a */
    private boolean m6545a(Canvas canvas) {
        Bitmap d = m6552d();
        Bitmap e = m6554e();
        if (d != null) {
            if (e != null) {
                m6547b(new Canvas(d));
                canvas.drawBitmap(d, 0.0f, 0.0f, this.f5067d);
                m6550c(new Canvas(e));
                canvas.drawBitmap(e, 0.0f, 0.0f, null);
                return true;
            }
        }
        return null;
    }

    /* renamed from: d */
    private Bitmap m6552d() {
        if (this.f5072i == null) {
            this.f5072i = m6555f();
        }
        return this.f5072i;
    }

    /* renamed from: e */
    private Bitmap m6554e() {
        if (this.f5071h == null) {
            this.f5071h = m6555f();
        }
        return this.f5071h;
    }

    /* renamed from: f */
    private android.graphics.Bitmap m6555f() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.getWidth();
        r1 = r5.getHeight();
        r2 = m6543a(r0, r1);	 Catch:{ OutOfMemoryError -> 0x000d }
        return r2;
    L_0x000d:
        r2 = "ShimmerFrameLayout failed to create working bitmap";
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = " (width = ";
        r3.append(r2);
        r3.append(r0);
        r0 = ", height = ";
        r3.append(r0);
        r3.append(r1);
        r0 = ")\n\n";
        r3.append(r0);
        r0 = java.lang.Thread.currentThread();
        r0 = r0.getStackTrace();
        r1 = r0.length;
        r2 = 0;
    L_0x0033:
        if (r2 >= r1) goto L_0x0046;
    L_0x0035:
        r4 = r0[r2];
        r4 = r4.toString();
        r3.append(r4);
        r4 = "\n";
        r3.append(r4);
        r2 = r2 + 1;
        goto L_0x0033;
    L_0x0046:
        r0 = r3.toString();
        r1 = "ShimmerFrameLayout";
        android.util.Log.d(r1, r0);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.f():android.graphics.Bitmap");
    }

    /* renamed from: b */
    private void m6547b(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* renamed from: c */
    private void m6550c(Canvas canvas) {
        Bitmap maskBitmap = getMaskBitmap();
        if (maskBitmap != null) {
            canvas.clipRect(this.f5078o, this.f5079p, this.f5078o + maskBitmap.getWidth(), this.f5079p + maskBitmap.getHeight());
            super.dispatchDraw(canvas);
            canvas.drawBitmap(maskBitmap, (float) this.f5078o, (float) this.f5079p, this.f5068e);
        }
    }

    /* renamed from: g */
    private void m6556g() {
        m6561c();
        m6557h();
        m6558i();
    }

    /* renamed from: h */
    private void m6557h() {
        if (this.f5066b != null) {
            this.f5066b.recycle();
            this.f5066b = null;
        }
    }

    /* renamed from: i */
    private void m6558i() {
        if (this.f5072i != null) {
            this.f5072i.recycle();
            this.f5072i = null;
        }
        if (this.f5071h != null) {
            this.f5071h.recycle();
            this.f5071h = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap getMaskBitmap() {
        /*
        r20 = this;
        r0 = r20;
        r1 = r0.f5066b;
        if (r1 == 0) goto L_0x0009;
    L_0x0006:
        r1 = r0.f5066b;
        return r1;
    L_0x0009:
        r1 = r0.f5069f;
        r2 = r20.getWidth();
        r1 = r1.m6537a(r2);
        r2 = r0.f5069f;
        r3 = r20.getHeight();
        r2 = r2.m6539b(r3);
        r3 = m6543a(r1, r2);
        r0.f5066b = r3;
        r4 = new android.graphics.Canvas;
        r3 = r0.f5066b;
        r4.<init>(r3);
        r3 = com.facebook.shimmer.ShimmerFrameLayout.C18663.f5049a;
        r5 = r0.f5069f;
        r5 = r5.f5059i;
        r5 = r5.ordinal();
        r3 = r3[r5];
        r5 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r7 = 2;
        if (r3 == r7) goto L_0x0074;
    L_0x003b:
        r3 = com.facebook.shimmer.ShimmerFrameLayout.C18663.f5050b;
        r8 = r0.f5069f;
        r8 = r8.f5051a;
        r8 = r8.ordinal();
        r3 = r3[r8];
        r8 = 0;
        switch(r3) {
            case 2: goto L_0x0055;
            case 3: goto L_0x0051;
            case 4: goto L_0x004f;
            default: goto L_0x004b;
        };
    L_0x004b:
        r9 = r1;
        r3 = 0;
    L_0x004d:
        r10 = 0;
        goto L_0x0058;
    L_0x004f:
        r3 = r2;
        goto L_0x0053;
    L_0x0051:
        r8 = r1;
        r3 = 0;
    L_0x0053:
        r9 = 0;
        goto L_0x004d;
    L_0x0055:
        r10 = r2;
        r3 = 0;
        r9 = 0;
    L_0x0058:
        r19 = new android.graphics.LinearGradient;
        r12 = (float) r8;
        r13 = (float) r3;
        r14 = (float) r9;
        r15 = (float) r10;
        r3 = r0.f5069f;
        r16 = r3.m6538a();
        r3 = r0.f5069f;
        r17 = r3.m6540b();
        r18 = android.graphics.Shader.TileMode.REPEAT;
        r11 = r19;
        r11.<init>(r12, r13, r14, r15, r16, r17, r18);
        r3 = r19;
        goto L_0x009c;
    L_0x0074:
        r3 = r1 / 2;
        r8 = r2 / 2;
        r16 = new android.graphics.RadialGradient;
        r10 = (float) r3;
        r11 = (float) r8;
        r3 = java.lang.Math.max(r1, r2);
        r8 = (double) r3;
        r12 = java.lang.Math.sqrt(r5);
        r8 = r8 / r12;
        r12 = (float) r8;
        r3 = r0.f5069f;
        r13 = r3.m6538a();
        r3 = r0.f5069f;
        r14 = r3.m6540b();
        r15 = android.graphics.Shader.TileMode.REPEAT;
        r9 = r16;
        r9.<init>(r10, r11, r12, r13, r14, r15);
        r3 = r16;
    L_0x009c:
        r8 = r0.f5069f;
        r8 = r8.f5052b;
        r9 = r1 / 2;
        r9 = (float) r9;
        r10 = r2 / 2;
        r10 = (float) r10;
        r4.rotate(r8, r9, r10);
        r9 = new android.graphics.Paint;
        r9.<init>();
        r9.setShader(r3);
        r5 = java.lang.Math.sqrt(r5);
        r3 = java.lang.Math.max(r1, r2);
        r10 = (double) r3;
        r5 = r5 * r10;
        r3 = (int) r5;
        r3 = r3 / r7;
        r5 = -r3;
        r6 = (float) r5;
        r1 = r1 + r3;
        r7 = (float) r1;
        r2 = r2 + r3;
        r8 = (float) r2;
        r5 = r6;
        r4.drawRect(r5, r6, r7, r8, r9);
        r1 = r0.f5066b;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.getMaskBitmap():android.graphics.Bitmap");
    }

    private Animator getShimmerAnimation() {
        if (this.f5065a != null) {
            return this.f5065a;
        }
        int width = getWidth();
        int height = getHeight();
        int i = C18663.f5049a[this.f5069f.f5059i.ordinal()];
        switch (this.f5069f.f5051a) {
            case CW_90:
                this.f5070g.m6541a(0, -height, 0, height);
                break;
            case CW_180:
                this.f5070g.m6541a(width, 0, -width, 0);
                break;
            case CW_270:
                this.f5070g.m6541a(0, height, 0, -height);
                break;
            default:
                this.f5070g.m6541a(-width, 0, width, 0);
                break;
        }
        this.f5065a = ValueAnimator.ofFloat(new float[]{0.0f, (((float) this.f5076m) / ((float) this.f5074k)) + 1.0f});
        this.f5065a.setDuration((long) (this.f5074k + this.f5076m));
        this.f5065a.setRepeatCount(this.f5075l);
        this.f5065a.setRepeatMode(this.f5077n);
        this.f5065a.addUpdateListener(new C18652(this));
        return this.f5065a;
    }

    /* renamed from: a */
    protected static android.graphics.Bitmap m6543a(int r1, int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ OutOfMemoryError -> 0x0007 }
        r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0);	 Catch:{ OutOfMemoryError -> 0x0007 }
        return r0;
    L_0x0007:
        java.lang.System.gc();
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        r1 = android.graphics.Bitmap.createBitmap(r1, r2, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.a(int, int):android.graphics.Bitmap");
    }
}
