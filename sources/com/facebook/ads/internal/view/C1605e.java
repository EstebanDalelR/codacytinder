package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: com.facebook.ads.internal.view.e */
public class C1605e extends LinearLayout {
    /* renamed from: a */
    private final ImageView f4439a;
    /* renamed from: b */
    private final ImageView f4440b;
    /* renamed from: c */
    private final ImageView f4441c;
    /* renamed from: d */
    private Bitmap f4442d;
    /* renamed from: e */
    private Bitmap f4443e;
    /* renamed from: f */
    private Bitmap f4444f;
    /* renamed from: g */
    private Bitmap f4445g;
    /* renamed from: h */
    private int f4446h;
    /* renamed from: i */
    private int f4447i;
    /* renamed from: j */
    private int f4448j;
    /* renamed from: k */
    private int f4449k;
    /* renamed from: l */
    private int f4450l;
    /* renamed from: m */
    private int f4451m;
    /* renamed from: n */
    private double f4452n;
    /* renamed from: o */
    private double f4453o;

    public C1605e(Context context) {
        super(context);
        this.f4439a = new ImageView(context);
        this.f4440b = new ImageView(context);
        this.f4441c = new ImageView(context);
        m5475a();
    }

    public C1605e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4439a = new ImageView(context, attributeSet);
        this.f4440b = new ImageView(context, attributeSet);
        this.f4441c = new ImageView(context, attributeSet);
        m5475a();
    }

    public C1605e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4439a = new ImageView(context, attributeSet, i);
        this.f4440b = new ImageView(context, attributeSet, i);
        this.f4441c = new ImageView(context, attributeSet, i);
        m5475a();
    }

    @TargetApi(21)
    public C1605e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4439a = new ImageView(context, attributeSet, i, i2);
        this.f4440b = new ImageView(context, attributeSet, i, i2);
        this.f4441c = new ImageView(context, attributeSet, i, i2);
        m5475a();
    }

    /* renamed from: a */
    private void m5475a() {
        setOrientation(1);
        this.f4439a.setScaleType(ScaleType.FIT_XY);
        addView(this.f4439a);
        this.f4440b.setLayoutParams(new LayoutParams(-1, -1));
        this.f4440b.setScaleType(ScaleType.FIT_XY);
        addView(this.f4440b);
        this.f4441c.setScaleType(ScaleType.FIT_XY);
        addView(this.f4441c);
    }

    /* renamed from: b */
    private void m5476b() {
        if (getHeight() > 0 && getWidth() > 0) {
            this.f4453o = ((double) getMeasuredWidth()) / ((double) getMeasuredHeight());
            this.f4452n = ((double) this.f4442d.getWidth()) / ((double) this.f4442d.getHeight());
            if (this.f4452n > this.f4453o) {
                m5477c();
            } else {
                m5478d();
            }
        }
    }

    /* renamed from: c */
    private void m5477c() {
        this.f4448j = (int) Math.round(((double) getWidth()) / this.f4452n);
        this.f4449k = getWidth();
        this.f4446h = (int) Math.ceil((double) (((float) (getHeight() - this.f4448j)) / 2.0f));
        if (this.f4443e != null) {
            Matrix matrix = new Matrix();
            matrix.preScale(1.0f, -1.0f);
            this.f4447i = (int) Math.floor((double) (((float) (getHeight() - this.f4448j)) / 2.0f));
            float height = ((float) this.f4442d.getHeight()) / ((float) this.f4448j);
            int min = Math.min(Math.round(((float) this.f4446h) * height), this.f4443e.getHeight());
            if (min > 0) {
                this.f4444f = Bitmap.createBitmap(this.f4443e, 0, 0, this.f4443e.getWidth(), min, matrix, true);
                this.f4439a.setImageBitmap(this.f4444f);
            }
            min = Math.min(Math.round(((float) this.f4447i) * height), this.f4443e.getHeight());
            if (min > 0) {
                this.f4445g = Bitmap.createBitmap(this.f4443e, 0, this.f4443e.getHeight() - min, this.f4443e.getWidth(), min, matrix, true);
                this.f4441c.setImageBitmap(this.f4445g);
            }
        }
    }

    /* renamed from: d */
    private void m5478d() {
        this.f4449k = (int) Math.round(((double) getHeight()) * this.f4452n);
        this.f4448j = getHeight();
        this.f4450l = (int) Math.ceil((double) (((float) (getWidth() - this.f4449k)) / 2.0f));
        if (this.f4443e != null) {
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            this.f4451m = (int) Math.floor((double) (((float) (getWidth() - this.f4449k)) / 2.0f));
            float width = ((float) this.f4442d.getWidth()) / ((float) this.f4449k);
            int min = Math.min(Math.round(((float) this.f4450l) * width), this.f4443e.getWidth());
            if (min > 0) {
                this.f4444f = Bitmap.createBitmap(this.f4443e, 0, 0, min, this.f4443e.getHeight(), matrix, true);
                this.f4439a.setImageBitmap(this.f4444f);
            }
            min = Math.min(Math.round(((float) this.f4451m) * width), this.f4443e.getWidth());
            if (min > 0) {
                this.f4445g = Bitmap.createBitmap(this.f4443e, this.f4443e.getWidth() - min, 0, min, this.f4443e.getHeight(), matrix, true);
                this.f4441c.setImageBitmap(this.f4445g);
            }
        }
    }

    /* renamed from: e */
    private boolean m5479e() {
        if ((this.f4446h + this.f4448j) + this.f4447i == getMeasuredHeight()) {
            if ((this.f4450l + this.f4449k) + this.f4451m == getMeasuredWidth()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m5480a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 == null) {
            this.f4439a.setImageDrawable(null);
            this.f4441c.setImageDrawable(null);
        }
        if (bitmap == null) {
            this.f4440b.setImageDrawable(null);
            return;
        }
        this.f4440b.setImageBitmap(Bitmap.createBitmap(bitmap));
        this.f4442d = bitmap;
        this.f4443e = bitmap2;
        m5476b();
    }

    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x005a in {3, 7, 8, 11, 13, 14} preds:[]
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
        r4 = this;
        r0 = r4.f4442d;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        super.onLayout(r5, r6, r7, r8, r9);
        return;
    L_0x0008:
        r5 = r4.f4444f;
        if (r5 == 0) goto L_0x0012;
    L_0x000c:
        r5 = r4.m5479e();
        if (r5 == 0) goto L_0x0015;
    L_0x0012:
        r4.m5476b();
    L_0x0015:
        r0 = r4.f4452n;
        r2 = r4.f4453o;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 <= 0) goto L_0x003d;
    L_0x001d:
        r5 = r4.f4439a;
        r0 = r4.f4446h;
        r5.layout(r6, r7, r8, r0);
        r5 = r4.f4440b;
        r0 = r4.f4446h;
        r0 = r0 + r7;
        r1 = r4.f4446h;
        r2 = r4.f4448j;
        r1 = r1 + r2;
        r5.layout(r6, r0, r8, r1);
        r5 = r4.f4441c;
        r0 = r4.f4446h;
        r7 = r7 + r0;
        r0 = r4.f4448j;
        r7 = r7 + r0;
    L_0x0039:
        r5.layout(r6, r7, r8, r9);
        return;
    L_0x003d:
        r5 = r4.f4439a;
        r0 = r4.f4450l;
        r5.layout(r6, r7, r0, r9);
        r5 = r4.f4440b;
        r0 = r4.f4450l;
        r0 = r0 + r6;
        r1 = r4.f4450l;
        r2 = r4.f4449k;
        r1 = r1 + r2;
        r5.layout(r0, r7, r1, r9);
        r5 = r4.f4441c;
        r0 = r4.f4450l;
        r6 = r6 + r0;
        r0 = r4.f4449k;
        r6 = r6 + r0;
        goto L_0x0039;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.e.onLayout(boolean, int, int, int, int):void");
    }
}
