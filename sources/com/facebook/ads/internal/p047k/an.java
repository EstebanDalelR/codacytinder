package com.facebook.ads.internal.p047k;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.k.an */
public class an {
    /* renamed from: a */
    public static final DisplayMetrics f4089a = Resources.getSystem().getDisplayMetrics();
    /* renamed from: b */
    public static final float f4090b = f4089a.density;
    /* renamed from: c */
    private static final AtomicInteger f4091c = new AtomicInteger(1);

    /* renamed from: a */
    public static int m5201a() {
        int i;
        int i2;
        do {
            i = f4091c.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f4091c.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: a */
    public static int m5202a(int i) {
        return (int) TypedValue.applyDimension(2, (float) i, f4089a);
    }

    /* renamed from: a */
    public static void m5203a(android.view.View r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x0013 in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 17;
        if (r0 < r1) goto L_0x000e;
    L_0x0006:
        r0 = android.view.View.generateViewId();
    L_0x000a:
        r2.setId(r0);
        return;
    L_0x000e:
        r0 = com.facebook.ads.internal.p047k.an.m5201a();
        goto L_0x000a;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.an.a(android.view.View):void");
    }

    /* renamed from: a */
    public static void m5204a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    /* renamed from: a */
    public static void m5205a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: b */
    public static void m5206b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }
}
