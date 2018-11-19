package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.widget.Button;

/* renamed from: com.facebook.ads.internal.view.c.b.m */
public class C1581m extends Button {
    /* renamed from: a */
    private final Path f4382a;
    /* renamed from: b */
    private final Path f4383b;
    /* renamed from: c */
    private final Paint f4384c;
    /* renamed from: d */
    private final Path f4385d;
    /* renamed from: e */
    private boolean f4386e;

    public C1581m(Context context) {
        this(context, false);
    }

    public C1581m(Context context, final boolean z) {
        super(context);
        this.f4386e = false;
        this.f4382a = new Path();
        this.f4383b = new Path();
        this.f4385d = new Path();
        this.f4384c = new Paint(this) {
            /* renamed from: b */
            final /* synthetic */ C1581m f4381b;
        };
        setClickable(true);
        setBackgroundColor(0);
    }

    protected void onDraw(Canvas canvas) {
        Path path;
        if (canvas.isHardwareAccelerated() && VERSION.SDK_INT < 17) {
            setLayerType(1, null);
        }
        float max = ((float) Math.max(canvas.getWidth(), canvas.getHeight())) / 100.0f;
        float f;
        float f2;
        if (this.f4386e) {
            this.f4385d.rewind();
            f = 26.5f * max;
            f2 = 15.5f * max;
            this.f4385d.moveTo(f, f2);
            this.f4385d.lineTo(f, 84.5f * max);
            this.f4385d.lineTo(90.0f * max, max * 50.0f);
            this.f4385d.lineTo(f, f2);
            this.f4385d.close();
            path = this.f4385d;
        } else {
            this.f4382a.rewind();
            f = 29.0f * max;
            f2 = 21.0f * max;
            this.f4382a.moveTo(f, f2);
            float f3 = 79.0f * max;
            this.f4382a.lineTo(f, f3);
            float f4 = 45.0f * max;
            this.f4382a.lineTo(f4, f3);
            this.f4382a.lineTo(f4, f2);
            this.f4382a.lineTo(f, f2);
            this.f4382a.close();
            this.f4383b.rewind();
            f = 55.0f * max;
            this.f4383b.moveTo(f, f2);
            this.f4383b.lineTo(f, f3);
            max *= 71.0f;
            this.f4383b.lineTo(max, f3);
            this.f4383b.lineTo(max, f2);
            this.f4383b.lineTo(f, f2);
            this.f4383b.close();
            canvas.drawPath(this.f4382a, this.f4384c);
            path = this.f4383b;
        }
        canvas.drawPath(path, this.f4384c);
        super.onDraw(canvas);
    }

    public void setChecked(boolean z) {
        this.f4386e = z;
        refreshDrawableState();
        invalidate();
    }
}
