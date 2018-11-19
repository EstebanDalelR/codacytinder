package com.tinder.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.annotation.FontRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.res.C0441a;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import com.tinder.R;
import com.tinder.enums.UserPhotoSize;
import com.tinder.profile.p365d.C14398a;
import java.lang.ref.SoftReference;
import java.util.Hashtable;

public class av {
    /* renamed from: a */
    private static final Hashtable<Integer, SoftReference<Typeface>> f8395a = new Hashtable();
    @Nullable
    /* renamed from: b */
    private static UserPhotoSize f8396b = null;
    /* renamed from: c */
    private static int f8397c = 0;
    /* renamed from: d */
    private static int f8398d = 0;
    /* renamed from: e */
    private static float f8399e = 0.0f;
    /* renamed from: f */
    private static float f8400f = 0.0f;
    /* renamed from: g */
    private static int f8401g = -1;
    /* renamed from: h */
    private static float f8402h = 0.0f;
    /* renamed from: i */
    private static float f8403i = 0.0f;
    /* renamed from: j */
    private static int f8404j = -1;

    @Deprecated
    /* renamed from: a */
    public static void m10208a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.densityDpi;
        if (context.getResources().getBoolean(R.bool.isTablet) == null && i != 213) {
            if (i < 240) {
                if (i <= 120) {
                    f8396b = UserPhotoSize.SMALL;
                } else {
                    f8396b = UserPhotoSize.MED;
                }
                f8398d = displayMetrics.heightPixels;
                f8397c = displayMetrics.widthPixels;
            }
        }
        f8396b = UserPhotoSize.LARGE;
        f8398d = displayMetrics.heightPixels;
        f8397c = displayMetrics.widthPixels;
    }

    @NonNull
    /* renamed from: a */
    public static Point m10205a(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    @Nullable
    /* renamed from: a */
    public static UserPhotoSize m10207a() {
        return f8396b;
    }

    /* renamed from: b */
    public static void m10221b(@NonNull View view) {
        m10211a(view, 0.5f);
    }

    /* renamed from: a */
    public static void m10211a(@NonNull View view, float f) {
        view.setOnTouchListener(new aw(f));
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m10214a(float f, View view, MotionEvent motionEvent) {
        motionEvent = motionEvent.getActionMasked();
        if (motionEvent != 3) {
            switch (motionEvent) {
                case null:
                    view.setAlpha(f);
                    break;
                case 1:
                    break;
                default:
                    ad.m10190a("motion event not recognized");
                    break;
            }
        }
        view.setAlpha(1.0f);
        return false;
    }

    /* renamed from: a */
    public static boolean m10217a(android.view.View r1, @android.support.annotation.NonNull android.content.Context r2, @android.support.annotation.FontRes int r3) {
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
        r2 = m10206a(r2, r3);	 Catch:{ Exception -> 0x000f }
        r0 = r1 instanceof android.widget.TextView;	 Catch:{ Exception -> 0x000f }
        if (r0 == 0) goto L_0x000d;	 Catch:{ Exception -> 0x000f }
    L_0x0008:
        r1 = (android.widget.TextView) r1;	 Catch:{ Exception -> 0x000f }
        r1.setTypeface(r2);	 Catch:{ Exception -> 0x000f }
    L_0x000d:
        r1 = 1;
        return r1;
    L_0x000f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Could not get font Res id: ";
        r1.append(r2);
        r1.append(r3);
        r1 = r1.toString();
        com.tinder.utils.ad.m10200e(r1);
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.utils.av.a(android.view.View, android.content.Context, int):boolean");
    }

    /* renamed from: a */
    public static Typeface m10206a(@NonNull Context context, @FontRes int i) {
        synchronized (f8395a) {
            if (f8395a.get(Integer.valueOf(i)) != null) {
                SoftReference softReference = (SoftReference) f8395a.get(Integer.valueOf(i));
                if (softReference.get() != null) {
                    Typeface typeface = (Typeface) softReference.get();
                    return typeface;
                }
            }
            context = C0441a.m1665a(context, i);
            f8395a.put(Integer.valueOf(i), new SoftReference(context));
            return context;
        }
    }

    @NonNull
    /* renamed from: a */
    public static Point m10204a(@Nullable Activity activity) {
        Point point = new Point();
        if (activity != null) {
            activity = activity.getWindowManager().getDefaultDisplay();
            point.set(activity.getWidth(), activity.getHeight());
        }
        return point;
    }

    /* renamed from: a */
    public static void m10209a(@NonNull Context context, @Nullable View view) {
        if (view == null) {
            ad.m10195b("View is null, can't show keyboard");
            return;
        }
        view.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        } else {
            ad.m10195b("inputMethodManager or view null, can't show keyboard");
        }
    }

    /* renamed from: c */
    public static void m10226c(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        view = view.getWindowToken();
        if (inputMethodManager == null || view == null) {
            ad.m10195b("inputMethodManager or view null, can't hide keyboard");
        } else {
            inputMethodManager.hideSoftInputFromWindow(view, 0);
        }
    }

    /* renamed from: a */
    public static void m10210a(@Nullable IBinder iBinder, @NonNull Activity activity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("windowToken=");
        stringBuilder.append(iBinder);
        ad.m10190a(stringBuilder.toString());
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || iBinder == null) {
            ad.m10195b("inputMethodManager or view null, can't hide keyboard");
        } else {
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }

    /* renamed from: a */
    public static void m10212a(@NonNull View view, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("view=");
        stringBuilder.append(view);
        ad.m10190a(stringBuilder.toString());
        for (view = view.getParent(); view != null; view = view.getParent()) {
            view.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: a */
    public static double m10201a(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        double d = Double.MIN_VALUE;
        if (motionEvent.getPointerCount() == 0) {
            return Double.MIN_VALUE;
        }
        switch (actionMasked) {
            case 0:
                f8401g = motionEvent.getPointerId(0);
                actionMasked = motionEvent.findPointerIndex(f8401g);
                f8399e = motionEvent.getX(actionMasked);
                f8400f = motionEvent.getY(actionMasked);
                break;
            case 1:
                f8401g = -1;
                break;
            case 2:
                actionMasked = motionEvent.findPointerIndex(f8401g);
                if (actionMasked != -1) {
                    float x = motionEvent.getX(actionMasked);
                    d = (Math.atan2((double) (f8400f - motionEvent.getY(actionMasked)), (double) (f8399e - x)) * 180.0d) / 3.141592653589793d;
                    break;
                }
                motionEvent = new StringBuilder();
                motionEvent.append("Invalid pointerId=");
                motionEvent.append(f8401g);
                motionEvent.append(" in getMovementAngle");
                ad.m10197c(motionEvent.toString());
                return Double.MIN_VALUE;
            default:
                break;
        }
        return d;
    }

    /* renamed from: a */
    public static boolean m10216a(@NonNull MotionEvent motionEvent, int i, int i2, int i3, boolean z, boolean z2) {
        double a = m10201a(motionEvent);
        boolean z3 = false;
        switch (motionEvent.getActionMasked()) {
            case 0:
                f8404j = motionEvent.getPointerId(0);
                int findPointerIndex = motionEvent.findPointerIndex(f8404j);
                f8402h = motionEvent.getX(findPointerIndex);
                f8403i = motionEvent.getY(findPointerIndex);
                a = Double.MIN_VALUE;
                break;
            case 1:
                f8404j = -1;
                break;
            case 2:
                break;
            default:
                break;
        }
        if (a != Double.MIN_VALUE) {
            if (z) {
                a = Math.abs(a);
                i2 = Math.abs(i2);
                i3 = Math.abs(i3);
            }
            z = motionEvent.findPointerIndex(f8404j);
            if (z) {
                motionEvent = new StringBuilder();
                motionEvent.append("Invalid pointerId=");
                motionEvent.append(f8404j);
                motionEvent.append(" in getMovementAngle");
                ad.m10197c(motionEvent.toString());
                return false;
            }
            float x = motionEvent.getX(z);
            motionEvent = motionEvent.getY(z);
            z = f8402h - x;
            motionEvent = f8403i - motionEvent;
            if (!z2) {
                motionEvent = z;
            }
            if (Math.abs(motionEvent) > ((float) i) && r0 >= ((double) r10) && r0 <= ((double) r9)) {
                z3 = true;
            }
            return z3;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m10224b(@NonNull MotionEvent motionEvent) {
        return m10216a(motionEvent, 0, 130, 50, true, true);
    }

    /* renamed from: b */
    public static void m10222b(@NonNull View view, float f) {
        Animation alphaAnimation = new AlphaAnimation(view.getAlpha(), (float) Math.min(255, (int) (f * 255.0f)));
        alphaAnimation.setDuration(0);
        alphaAnimation.setFillAfter(Float.MIN_VALUE);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: c */
    public static void m10227c(@NonNull View view, float f) {
        if (view.getScaleX() != f) {
            view.setScaleX(f);
        }
        if (view.getScaleY() != f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: a */
    public static float m10203a(float f, @NonNull Context context) {
        return f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    /* renamed from: a */
    public static float m10202a(float f) {
        return ((float) f8397c) * f;
    }

    /* renamed from: b */
    public static int m10219b() {
        return f8397c;
    }

    @Deprecated
    /* renamed from: c */
    public static int m10225c() {
        return f8398d;
    }

    /* renamed from: b */
    public static int m10220b(@NonNull Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : null;
    }

    /* renamed from: a */
    public static boolean m10218a(@NonNull Dialog... dialogArr) {
        boolean z = true;
        for (Dialog a : dialogArr) {
            z = m10215a(a) && z;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m10215a(@Nullable Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Activity activity = (Activity) C14398a.a(dialog.getContext());
            if (!(activity.isDestroyed() || activity.isFinishing())) {
                dialog.dismiss();
                return true;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m10229d() {
        return (!C15358e.f47625a.a() || "5.0.2".equals(VERSION.RELEASE) || "5.1.1".equals(VERSION.RELEASE)) ? false : true;
    }

    /* renamed from: a */
    public static void m10213a(@Nullable View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public static void m10223b(@Nullable View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(4);
            }
        }
    }

    /* renamed from: c */
    public static void m10228c(@Nullable View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }
}
