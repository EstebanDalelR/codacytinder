package com.leanplum.utils;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;

public class SizeUtil {
    /* renamed from: a */
    private static boolean f21446a = false;
    public static int dp10 = 0;
    public static int dp100 = 0;
    public static int dp14 = 0;
    public static int dp16 = 0;
    public static int dp18 = 0;
    public static int dp2 = 0;
    public static int dp20 = 0;
    public static int dp200 = 0;
    public static int dp250 = 0;
    public static int dp30 = 0;
    public static int dp5 = 0;
    public static int dp50 = 0;
    public static int dp7 = 0;
    public static final int textSize0 = 20;
    public static final int textSize0_1 = 18;
    public static final int textSize0_2 = 16;
    public static final int textSize1 = 22;
    public static final int textSize2 = 24;

    public static void init(Context context) {
        if (!f21446a) {
            f21446a = true;
            dp30 = dpToPx(context, 30);
            dp5 = dpToPx(context, 5);
            dp20 = dpToPx(context, 20);
            dp10 = dpToPx(context, 10);
            dp7 = dpToPx(context, 7);
            dp18 = dpToPx(context, 18);
            dp16 = dpToPx(context, 16);
            dp14 = dpToPx(context, 14);
            dp100 = dpToPx(context, 100);
            dp200 = dpToPx(context, Callback.DEFAULT_DRAG_ANIMATION_DURATION);
            dp250 = dpToPx(context, Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            dp2 = dpToPx(context, 2);
            dp50 = dpToPx(context, 50);
        }
    }

    public static int dpToPx(Context context, int i) {
        init(context);
        return Math.round(((float) i) * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public static int pxToDp(Context context, int i) {
        init(context);
        return Math.round(((float) i) / (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public static int spToPx(Context context, int i) {
        init(context);
        return (int) (((float) i) * context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static int pxToSp(Context context, int i) {
        init(context);
        return (int) (((float) i) / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static int getStatusBarHeight(Activity activity) {
        init(activity);
        int i = 0;
        if (((activity.getWindow().getAttributes().flags & 1024) == 1024 ? 1 : null) != null) {
            return 0;
        }
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = activity.getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    public static int getStatusBarHeight(android.content.Context r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        init(r5);
        r0 = 0;
        r1 = r5.getResources();	 Catch:{ Throwable -> 0x001d }
        r2 = "status_bar_height";	 Catch:{ Throwable -> 0x001d }
        r3 = "dimen";	 Catch:{ Throwable -> 0x001d }
        r4 = "android";	 Catch:{ Throwable -> 0x001d }
        r1 = r1.getIdentifier(r2, r3, r4);	 Catch:{ Throwable -> 0x001d }
        if (r1 <= 0) goto L_0x001d;	 Catch:{ Throwable -> 0x001d }
    L_0x0014:
        r5 = r5.getResources();	 Catch:{ Throwable -> 0x001d }
        r5 = r5.getDimensionPixelSize(r1);	 Catch:{ Throwable -> 0x001d }
        r0 = r5;
    L_0x001d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.utils.SizeUtil.getStatusBarHeight(android.content.Context):int");
    }

    public static android.graphics.Point getDisplaySize(android.app.Activity r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new android.graphics.Point;
        r0.<init>();
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = r1.getWindowManager();	 Catch:{ Throwable -> 0x0013 }
        r1 = r1.getDefaultDisplay();	 Catch:{ Throwable -> 0x0013 }
        r1.getSize(r0);	 Catch:{ Throwable -> 0x0013 }
    L_0x0013:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.utils.SizeUtil.getDisplaySize(android.app.Activity):android.graphics.Point");
    }
}
