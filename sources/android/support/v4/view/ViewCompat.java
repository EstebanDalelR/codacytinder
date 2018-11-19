package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.accessibility.C0586b;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ViewCompat {
    /* renamed from: a */
    static final C0568j f1762a;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    /* renamed from: android.support.v4.view.ViewCompat$j */
    static class C0568j {
        /* renamed from: b */
        static Field f1753b = null;
        /* renamed from: c */
        static boolean f1754c = false;
        /* renamed from: d */
        private static Field f1755d;
        /* renamed from: e */
        private static boolean f1756e;
        /* renamed from: f */
        private static Field f1757f;
        /* renamed from: g */
        private static boolean f1758g;
        /* renamed from: h */
        private static WeakHashMap<View, String> f1759h;
        /* renamed from: i */
        private static final AtomicInteger f1760i = new AtomicInteger(1);
        /* renamed from: a */
        WeakHashMap<View, C0609n> f1761a = null;

        /* renamed from: a */
        public C0610p mo4044a(View view, C0610p c0610p) {
            return c0610p;
        }

        /* renamed from: a */
        public void mo4045a(View view, float f) {
        }

        /* renamed from: a */
        public void mo3043a(View view, int i) {
        }

        /* renamed from: a */
        public void mo4066a(View view, int i, int i2) {
        }

        /* renamed from: a */
        public void mo3957a(View view, Rect rect) {
        }

        /* renamed from: a */
        public void mo4048a(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        }

        /* renamed from: a */
        public void mo4100a(View view, C0601j c0601j) {
        }

        /* renamed from: a */
        public void mo3048a(View view, boolean z) {
        }

        /* renamed from: a */
        public boolean mo588a(View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3049a(View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: b */
        public C0610p mo4050b(View view, C0610p c0610p) {
            return c0610p;
        }

        /* renamed from: b */
        public void mo4051b(View view, float f) {
        }

        /* renamed from: b */
        public void mo4021b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo3050b(View view) {
            return false;
        }

        /* renamed from: c */
        public void mo4052c(View view, float f) {
        }

        /* renamed from: d */
        public int mo3052d(View view) {
            return 0;
        }

        /* renamed from: g */
        public void mo3055g(View view) {
        }

        /* renamed from: h */
        public boolean mo3056h(View view) {
            return false;
        }

        /* renamed from: i */
        public boolean mo3057i(View view) {
            return true;
        }

        /* renamed from: j */
        public int mo3667j(View view) {
            return 0;
        }

        /* renamed from: m */
        public int mo3670m(View view) {
            return 0;
        }

        /* renamed from: n */
        public boolean mo3671n(View view) {
            return false;
        }

        /* renamed from: p */
        public Rect mo3958p(View view) {
            return null;
        }

        /* renamed from: t */
        public float mo4056t(View view) {
            return 0.0f;
        }

        /* renamed from: u */
        public float mo4057u(View view) {
            return 0.0f;
        }

        C0568j() {
        }

        /* renamed from: a */
        public void m2128a(View view, @Nullable C0582a c0582a) {
            view.setAccessibilityDelegate(c0582a == null ? null : c0582a.getBridge());
        }

        /* renamed from: A */
        public boolean m2114A(android.view.View r5) {
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
            r4 = this;
            r0 = f1754c;
            r1 = 0;
            if (r0 == 0) goto L_0x0006;
        L_0x0005:
            return r1;
        L_0x0006:
            r0 = f1753b;
            r2 = 1;
            if (r0 != 0) goto L_0x001e;
        L_0x000b:
            r0 = android.view.View.class;	 Catch:{ Throwable -> 0x001b }
            r3 = "mAccessibilityDelegate";	 Catch:{ Throwable -> 0x001b }
            r0 = r0.getDeclaredField(r3);	 Catch:{ Throwable -> 0x001b }
            f1753b = r0;	 Catch:{ Throwable -> 0x001b }
            r0 = f1753b;	 Catch:{ Throwable -> 0x001b }
            r0.setAccessible(r2);	 Catch:{ Throwable -> 0x001b }
            goto L_0x001e;
        L_0x001b:
            f1754c = r2;
            return r1;
        L_0x001e:
            r0 = f1753b;	 Catch:{ Throwable -> 0x0028 }
            r5 = r0.get(r5);	 Catch:{ Throwable -> 0x0028 }
            if (r5 == 0) goto L_0x0027;
        L_0x0026:
            r1 = 1;
        L_0x0027:
            return r1;
        L_0x0028:
            f1754c = r2;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewCompat.j.A(android.view.View):boolean");
        }

        /* renamed from: a */
        public void m2129a(View view, C0586b c0586b) {
            view.onInitializeAccessibilityNodeInfo(c0586b.m2254a());
        }

        /* renamed from: c */
        public void mo3051c(View view) {
            view.postInvalidate();
        }

        /* renamed from: a */
        public void mo3044a(View view, int i, int i2, int i3, int i4) {
            view.postInvalidate(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo3046a(View view, Runnable runnable) {
            view.postDelayed(runnable, m2116a());
        }

        /* renamed from: a */
        public void mo3047a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, m2116a() + j);
        }

        /* renamed from: a */
        long m2116a() {
            return ValueAnimator.getFrameDelay();
        }

        /* renamed from: a */
        public void mo3665a(View view, Paint paint) {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }

        /* renamed from: k */
        public int mo3668k(View view) {
            return view.getPaddingLeft();
        }

        /* renamed from: l */
        public int mo3669l(View view) {
            return view.getPaddingRight();
        }

        /* renamed from: b */
        public void mo3666b(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        /* renamed from: e */
        public int mo3053e(android.view.View r4) {
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
            r3 = this;
            r0 = f1756e;
            if (r0 != 0) goto L_0x0016;
        L_0x0004:
            r0 = 1;
            r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r2 = "mMinWidth";	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0014 }
            f1755d = r1;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = f1755d;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0014 }
        L_0x0014:
            f1756e = r0;
        L_0x0016:
            r0 = f1755d;
            if (r0 == 0) goto L_0x0027;
        L_0x001a:
            r0 = f1755d;	 Catch:{ Exception -> 0x0027 }
            r4 = r0.get(r4);	 Catch:{ Exception -> 0x0027 }
            r4 = (java.lang.Integer) r4;	 Catch:{ Exception -> 0x0027 }
            r4 = r4.intValue();	 Catch:{ Exception -> 0x0027 }
            return r4;
        L_0x0027:
            r4 = 0;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewCompat.j.e(android.view.View):int");
        }

        /* renamed from: f */
        public int mo3054f(android.view.View r4) {
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
            r3 = this;
            r0 = f1758g;
            if (r0 != 0) goto L_0x0016;
        L_0x0004:
            r0 = 1;
            r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r2 = "mMinHeight";	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0014 }
            f1757f = r1;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = f1757f;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0014 }
        L_0x0014:
            f1758g = r0;
        L_0x0016:
            r0 = f1757f;
            if (r0 == 0) goto L_0x0027;
        L_0x001a:
            r0 = f1757f;	 Catch:{ Exception -> 0x0027 }
            r4 = r0.get(r4);	 Catch:{ Exception -> 0x0027 }
            r4 = (java.lang.Integer) r4;	 Catch:{ Exception -> 0x0027 }
            r4 = r4.intValue();	 Catch:{ Exception -> 0x0027 }
            return r4;
        L_0x0027:
            r4 = 0;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewCompat.j.f(android.view.View):int");
        }

        /* renamed from: B */
        public C0609n m2115B(View view) {
            if (this.f1761a == null) {
                this.f1761a = new WeakHashMap();
            }
            C0609n c0609n = (C0609n) this.f1761a.get(view);
            if (c0609n != null) {
                return c0609n;
            }
            c0609n = new C0609n(view);
            this.f1761a.put(view, c0609n);
            return c0609n;
        }

        /* renamed from: a */
        public void mo4049a(View view, String str) {
            if (f1759h == null) {
                f1759h = new WeakHashMap();
            }
            f1759h.put(view, str);
        }

        /* renamed from: s */
        public String mo4055s(View view) {
            if (f1759h == null) {
                return null;
            }
            return (String) f1759h.get(view);
        }

        /* renamed from: v */
        public boolean mo4058v(View view) {
            return view instanceof NestedScrollingChild ? ((NestedScrollingChild) view).isNestedScrollingEnabled() : null;
        }

        /* renamed from: a */
        public void mo3045a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        /* renamed from: x */
        public ColorStateList mo4060x(View view) {
            return view instanceof TintableBackgroundView ? ((TintableBackgroundView) view).getSupportBackgroundTintList() : null;
        }

        /* renamed from: a */
        public void mo4046a(View view, ColorStateList colorStateList) {
            if (view instanceof TintableBackgroundView) {
                ((TintableBackgroundView) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo4047a(View view, Mode mode) {
            if (view instanceof TintableBackgroundView) {
                ((TintableBackgroundView) view).setSupportBackgroundTintMode(mode);
            }
        }

        /* renamed from: y */
        public Mode mo4061y(View view) {
            return view instanceof TintableBackgroundView ? ((TintableBackgroundView) view).getSupportBackgroundTintMode() : null;
        }

        /* renamed from: w */
        public void mo4059w(View view) {
            if (view instanceof NestedScrollingChild) {
                ((NestedScrollingChild) view).stopNestedScroll();
            }
        }

        /* renamed from: q */
        public boolean mo4022q(View view) {
            return (view.getWidth() <= 0 || view.getHeight() <= null) ? null : true;
        }

        /* renamed from: z */
        public float mo4062z(View view) {
            return mo4057u(view) + mo4056t(view);
        }

        /* renamed from: r */
        public boolean mo4023r(View view) {
            return view.getWindowToken() != null ? true : null;
        }

        /* renamed from: c */
        public void mo4053c(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                C0568j.m2113C(view);
                view = view.getParent();
                if ((view instanceof View) != 0) {
                    C0568j.m2113C(view);
                }
            }
        }

        /* renamed from: d */
        public void mo4054d(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                C0568j.m2113C(view);
                view = view.getParent();
                if ((view instanceof View) != 0) {
                    C0568j.m2113C(view);
                }
            }
        }

        /* renamed from: C */
        private static void m2113C(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        /* renamed from: o */
        public Display mo3672o(View view) {
            return mo4023r(view) ? ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay() : null;
        }
    }

    @RequiresApi(15)
    /* renamed from: android.support.v4.view.ViewCompat$a */
    static class C2884a extends C0568j {
        C2884a() {
        }

        /* renamed from: a */
        public boolean mo588a(View view) {
            return view.hasOnClickListeners();
        }
    }

    @RequiresApi(16)
    /* renamed from: android.support.v4.view.ViewCompat$b */
    static class C4030b extends C2884a {
        C4030b() {
        }

        /* renamed from: b */
        public boolean mo3050b(View view) {
            return view.hasTransientState();
        }

        /* renamed from: a */
        public void mo3048a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: c */
        public void mo3051c(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: a */
        public void mo3044a(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo3046a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: a */
        public void mo3047a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: d */
        public int mo3052d(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: a */
        public void mo3043a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        /* renamed from: a */
        public boolean mo3049a(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: e */
        public int mo3053e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public int mo3054f(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: g */
        public void mo3055g(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: h */
        public boolean mo3056h(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: i */
        public boolean mo3057i(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: a */
        public void mo3045a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }
    }

    @RequiresApi(17)
    /* renamed from: android.support.v4.view.ViewCompat$c */
    static class C4317c extends C4030b {
        C4317c() {
        }

        /* renamed from: a */
        public void mo3665a(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public int mo3667j(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: k */
        public int mo3668k(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: l */
        public int mo3669l(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: b */
        public void mo3666b(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        /* renamed from: m */
        public int mo3670m(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: n */
        public boolean mo3671n(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: o */
        public Display mo3672o(View view) {
            return view.getDisplay();
        }
    }

    @RequiresApi(18)
    /* renamed from: android.support.v4.view.ViewCompat$d */
    static class C4432d extends C4317c {
        C4432d() {
        }

        /* renamed from: a */
        public void mo3957a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        /* renamed from: p */
        public Rect mo3958p(View view) {
            return view.getClipBounds();
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.v4.view.ViewCompat$e */
    static class C4453e extends C4432d {
        C4453e() {
        }

        /* renamed from: b */
        public void mo4021b(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: a */
        public void mo3043a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        /* renamed from: q */
        public boolean mo4022q(View view) {
            return view.isLaidOut();
        }

        /* renamed from: r */
        public boolean mo4023r(View view) {
            return view.isAttachedToWindow();
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.view.ViewCompat$f */
    static class C4459f extends C4453e {
        /* renamed from: d */
        private static ThreadLocal<Rect> f14844d;

        C4459f() {
        }

        /* renamed from: a */
        public void mo4049a(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: s */
        public String mo4055s(View view) {
            return view.getTransitionName();
        }

        /* renamed from: g */
        public void mo3055g(View view) {
            view.requestApplyInsets();
        }

        /* renamed from: a */
        public void mo4045a(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        public float mo4056t(View view) {
            return view.getElevation();
        }

        /* renamed from: b */
        public void mo4051b(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: u */
        public float mo4057u(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: a */
        public void mo4048a(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4459f f1752b;

                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return (WindowInsets) C0610p.m2387a(onApplyWindowInsetsListener.onApplyWindowInsets(view, C0610p.m2386a((Object) windowInsets)));
                    }
                });
            }
        }

        /* renamed from: v */
        public boolean mo4058v(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: w */
        public void mo4059w(View view) {
            view.stopNestedScroll();
        }

        /* renamed from: x */
        public ColorStateList mo4060x(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: a */
        public void mo4046a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Object obj;
                colorStateList = view.getBackground();
                if (view.getBackgroundTintList() == null) {
                    if (view.getBackgroundTintMode() == null) {
                        obj = null;
                        if (colorStateList != null && r0 != null) {
                            if (colorStateList.isStateful()) {
                                colorStateList.setState(view.getDrawableState());
                            }
                            view.setBackground(colorStateList);
                            return;
                        }
                    }
                }
                obj = 1;
                if (colorStateList != null) {
                }
            }
        }

        /* renamed from: a */
        public void mo4047a(View view, Mode mode) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Object obj;
                mode = view.getBackground();
                if (view.getBackgroundTintList() == null) {
                    if (view.getBackgroundTintMode() == null) {
                        obj = null;
                        if (mode != null && r0 != null) {
                            if (mode.isStateful()) {
                                mode.setState(view.getDrawableState());
                            }
                            view.setBackground(mode);
                            return;
                        }
                    }
                }
                obj = 1;
                if (mode != null) {
                }
            }
        }

        /* renamed from: y */
        public Mode mo4061y(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: a */
        public C0610p mo4044a(View view, C0610p c0610p) {
            Object obj = (WindowInsets) C0610p.m2387a(c0610p);
            view = view.onApplyWindowInsets(obj);
            if (view != obj) {
                obj = new WindowInsets(view);
            }
            return C0610p.m2386a(obj);
        }

        /* renamed from: b */
        public C0610p mo4050b(View view, C0610p c0610p) {
            Object obj = (WindowInsets) C0610p.m2387a(c0610p);
            view = view.dispatchApplyWindowInsets(obj);
            if (view != obj) {
                obj = new WindowInsets(view);
            }
            return C0610p.m2386a(obj);
        }

        /* renamed from: z */
        public float mo4062z(View view) {
            return view.getZ();
        }

        /* renamed from: c */
        public void mo4052c(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: c */
        public void mo4053c(View view, int i) {
            int intersects;
            Rect b = C4459f.m18667b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            super.mo4053c(view, i);
            if (intersects != 0 && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != null) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: d */
        public void mo4054d(View view, int i) {
            int intersects;
            Rect b = C4459f.m18667b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            super.mo4054d(view, i);
            if (intersects != 0 && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != null) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: b */
        private static Rect m18667b() {
            if (f14844d == null) {
                f14844d = new ThreadLocal();
            }
            Rect rect = (Rect) f14844d.get();
            if (rect == null) {
                rect = new Rect();
                f14844d.set(rect);
            }
            rect.setEmpty();
            return rect;
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.view.ViewCompat$g */
    static class C4462g extends C4459f {
        C4462g() {
        }

        /* renamed from: a */
        public void mo4066a(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }

        /* renamed from: c */
        public void mo4053c(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        /* renamed from: d */
        public void mo4054d(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.v4.view.ViewCompat$h */
    static class C4463h extends C4462g {
        C4463h() {
        }

        /* renamed from: a */
        public void mo4100a(View view, C0601j c0601j) {
            view.setPointerIcon((PointerIcon) (c0601j != null ? c0601j.m2351a() : null));
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.view.ViewCompat$i */
    static class C4464i extends C4463h {
        C4464i() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1762a = new C4464i();
        } else if (VERSION.SDK_INT >= 24) {
            f1762a = new C4463h();
        } else if (VERSION.SDK_INT >= 23) {
            f1762a = new C4462g();
        } else if (VERSION.SDK_INT >= 21) {
            f1762a = new C4459f();
        } else if (VERSION.SDK_INT >= 19) {
            f1762a = new C4453e();
        } else if (VERSION.SDK_INT >= 18) {
            f1762a = new C4432d();
        } else if (VERSION.SDK_INT >= 17) {
            f1762a = new C4317c();
        } else if (VERSION.SDK_INT >= 16) {
            f1762a = new C4030b();
        } else if (VERSION.SDK_INT >= 15) {
            f1762a = new C2884a();
        } else {
            f1762a = new C0568j();
        }
    }

    /* renamed from: a */
    public static void m2186a(View view, C0586b c0586b) {
        f1762a.m2129a(view, c0586b);
    }

    /* renamed from: a */
    public static void m2185a(View view, C0582a c0582a) {
        f1762a.m2128a(view, c0582a);
    }

    /* renamed from: a */
    public static boolean m2192a(View view) {
        return f1762a.m2114A(view);
    }

    /* renamed from: b */
    public static boolean m2199b(View view) {
        return f1762a.mo3050b(view);
    }

    /* renamed from: a */
    public static void m2191a(View view, boolean z) {
        f1762a.mo3048a(view, z);
    }

    /* renamed from: c */
    public static void m2200c(View view) {
        f1762a.mo3051c(view);
    }

    /* renamed from: a */
    public static void m2178a(View view, int i, int i2, int i3, int i4) {
        f1762a.mo3044a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m2188a(View view, Runnable runnable) {
        f1762a.mo3046a(view, runnable);
    }

    /* renamed from: a */
    public static void m2189a(View view, Runnable runnable, long j) {
        f1762a.mo3047a(view, runnable, j);
    }

    /* renamed from: d */
    public static int m2203d(View view) {
        return f1762a.mo3052d(view);
    }

    /* renamed from: a */
    public static void m2176a(View view, int i) {
        f1762a.mo3043a(view, i);
    }

    /* renamed from: a */
    public static boolean m2193a(View view, int i, Bundle bundle) {
        return f1762a.mo3049a(view, i, bundle);
    }

    @Deprecated
    /* renamed from: e */
    public static float m2206e(View view) {
        return view.getAlpha();
    }

    /* renamed from: a */
    public static void m2180a(View view, Paint paint) {
        f1762a.mo3665a(view, paint);
    }

    /* renamed from: f */
    public static int m2208f(View view) {
        return f1762a.mo3667j(view);
    }

    /* renamed from: b */
    public static void m2196b(View view, int i) {
        f1762a.mo4021b(view, i);
    }

    /* renamed from: g */
    public static int m2210g(View view) {
        return f1762a.mo3668k(view);
    }

    /* renamed from: h */
    public static int m2212h(View view) {
        return f1762a.mo3669l(view);
    }

    /* renamed from: b */
    public static void m2197b(View view, int i, int i2, int i3, int i4) {
        f1762a.mo3666b(view, i, i2, i3, i4);
    }

    @Deprecated
    /* renamed from: i */
    public static float m2214i(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    /* renamed from: j */
    public static float m2216j(View view) {
        return view.getTranslationY();
    }

    /* renamed from: k */
    public static int m2218k(View view) {
        return f1762a.mo3053e(view);
    }

    /* renamed from: l */
    public static int m2220l(View view) {
        return f1762a.mo3054f(view);
    }

    /* renamed from: m */
    public static C0609n m2221m(View view) {
        return f1762a.m2115B(view);
    }

    @Deprecated
    /* renamed from: a */
    public static void m2175a(View view, float f) {
        view.setTranslationX(f);
    }

    @Deprecated
    /* renamed from: b */
    public static void m2195b(View view, float f) {
        view.setTranslationY(f);
    }

    @Deprecated
    /* renamed from: c */
    public static void m2201c(View view, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        view.setAlpha(f);
    }

    @Deprecated
    /* renamed from: d */
    public static void m2204d(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    /* renamed from: e */
    public static void m2207e(View view, float f) {
        view.setRotationX(f);
    }

    @Deprecated
    /* renamed from: f */
    public static void m2209f(View view, float f) {
        view.setRotationY(f);
    }

    @Deprecated
    /* renamed from: g */
    public static void m2211g(View view, float f) {
        view.setScaleX(f);
    }

    @Deprecated
    /* renamed from: h */
    public static void m2213h(View view, float f) {
        view.setScaleY(f);
    }

    @Deprecated
    /* renamed from: n */
    public static float m2222n(View view) {
        return view.getRotation();
    }

    /* renamed from: i */
    public static void m2215i(View view, float f) {
        f1762a.mo4045a(view, f);
    }

    /* renamed from: o */
    public static float m2223o(View view) {
        return f1762a.mo4056t(view);
    }

    /* renamed from: j */
    public static void m2217j(View view, float f) {
        f1762a.mo4051b(view, f);
    }

    /* renamed from: a */
    public static void m2190a(View view, String str) {
        f1762a.mo4049a(view, str);
    }

    /* renamed from: p */
    public static String m2224p(View view) {
        return f1762a.mo4055s(view);
    }

    /* renamed from: q */
    public static int m2225q(View view) {
        return f1762a.mo3670m(view);
    }

    /* renamed from: r */
    public static void m2226r(View view) {
        f1762a.mo3055g(view);
    }

    /* renamed from: s */
    public static boolean m2227s(View view) {
        return f1762a.mo3056h(view);
    }

    @Deprecated
    /* renamed from: b */
    public static void m2198b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: a */
    public static void m2184a(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        f1762a.mo4048a(view, onApplyWindowInsetsListener);
    }

    /* renamed from: a */
    public static C0610p m2174a(View view, C0610p c0610p) {
        return f1762a.mo4044a(view, c0610p);
    }

    /* renamed from: b */
    public static C0610p m2194b(View view, C0610p c0610p) {
        return f1762a.mo4050b(view, c0610p);
    }

    /* renamed from: t */
    public static boolean m2228t(View view) {
        return f1762a.mo3057i(view);
    }

    /* renamed from: u */
    public static boolean m2229u(View view) {
        return f1762a.mo3671n(view);
    }

    /* renamed from: a */
    public static void m2183a(View view, Drawable drawable) {
        f1762a.mo3045a(view, drawable);
    }

    /* renamed from: v */
    public static ColorStateList m2230v(View view) {
        return f1762a.mo4060x(view);
    }

    /* renamed from: a */
    public static void m2179a(View view, ColorStateList colorStateList) {
        f1762a.mo4046a(view, colorStateList);
    }

    /* renamed from: w */
    public static Mode m2231w(View view) {
        return f1762a.mo4061y(view);
    }

    /* renamed from: a */
    public static void m2181a(View view, Mode mode) {
        f1762a.mo4047a(view, mode);
    }

    /* renamed from: x */
    public static boolean m2232x(@NonNull View view) {
        return f1762a.mo4058v(view);
    }

    /* renamed from: y */
    public static void m2233y(@NonNull View view) {
        f1762a.mo4059w(view);
    }

    /* renamed from: z */
    public static boolean m2234z(View view) {
        return f1762a.mo4022q(view);
    }

    /* renamed from: A */
    public static float m2169A(View view) {
        return f1762a.mo4062z(view);
    }

    /* renamed from: k */
    public static void m2219k(View view, float f) {
        f1762a.mo4052c(view, f);
    }

    /* renamed from: c */
    public static void m2202c(View view, int i) {
        f1762a.mo4054d(view, i);
    }

    /* renamed from: d */
    public static void m2205d(View view, int i) {
        f1762a.mo4053c(view, i);
    }

    /* renamed from: a */
    public static void m2182a(View view, Rect rect) {
        f1762a.mo3957a(view, rect);
    }

    /* renamed from: B */
    public static Rect m2170B(View view) {
        return f1762a.mo3958p(view);
    }

    /* renamed from: C */
    public static boolean m2171C(View view) {
        return f1762a.mo4023r(view);
    }

    /* renamed from: D */
    public static boolean m2172D(View view) {
        return f1762a.mo588a(view);
    }

    /* renamed from: a */
    public static void m2177a(@NonNull View view, int i, int i2) {
        f1762a.mo4066a(view, i, i2);
    }

    /* renamed from: a */
    public static void m2187a(@NonNull View view, C0601j c0601j) {
        f1762a.mo4100a(view, c0601j);
    }

    /* renamed from: E */
    public static Display m2173E(@NonNull View view) {
        return f1762a.mo3672o(view);
    }
}
