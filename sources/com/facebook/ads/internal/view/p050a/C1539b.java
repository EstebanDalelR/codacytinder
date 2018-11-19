package com.facebook.ads.internal.view.p050a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.a.b */
public class C1539b extends ProgressBar {
    /* renamed from: a */
    private static final int f4305a = Color.argb(26, 0, 0, 0);
    /* renamed from: b */
    private static final int f4306b = Color.rgb(88, 144, 255);
    /* renamed from: c */
    private Rect f4307c;
    /* renamed from: d */
    private Paint f4308d;

    public C1539b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5402a();
    }

    /* renamed from: a */
    private void m5402a() {
        setIndeterminate(false);
        setMax(100);
        setProgressDrawable(m5403b());
        this.f4307c = new Rect();
        this.f4308d = new Paint();
        this.f4308d.setStyle(Style.FILL);
        this.f4308d.setColor(f4305a);
    }

    /* renamed from: b */
    private Drawable m5403b() {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(f4306b), 3, 1);
        return new LayerDrawable(new Drawable[]{colorDrawable, clipDrawable});
    }

    protected synchronized void onDraw(Canvas canvas) {
        canvas.drawRect(this.f4307c, this.f4308d);
        super.onDraw(canvas);
    }

    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4307c.set(0, 0, getMeasuredWidth(), 2);
    }

    public synchronized void setProgress(int i) {
        super.setProgress(i == 100 ? 0 : Math.max(i, 5));
    }
}
