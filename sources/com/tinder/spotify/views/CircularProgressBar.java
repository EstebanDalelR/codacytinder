package com.tinder.spotify.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.C6250b.C6249b;
import com.tinder.R;

public class CircularProgressBar extends View {
    /* renamed from: a */
    private final RectF f46874a = new RectF();
    /* renamed from: b */
    private final Paint f46875b = new Paint(1);
    /* renamed from: c */
    private float f46876c = 0.0f;
    /* renamed from: d */
    private float f46877d = 20.0f;
    /* renamed from: e */
    private int f46878e;

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.getTheme().obtainStyledAttributes(attributeSet, C6249b.CircularProgressBar, 0, 0);
        try {
            this.f46877d = context.getDimension(2, 30.0f);
            this.f46878e = context.getColor(1, R.color.tinder_red);
            this.f46875b.setColor(this.f46878e);
            this.f46875b.setStrokeWidth(this.f46877d);
            this.f46875b.setStyle(Style.STROKE);
        } finally {
            context.recycle();
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i = this.f46877d / 1073741824;
        this.f46874a.set(i, i, ((float) getWidth()) - i, ((float) getWidth()) - i);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f46874a, -90.0f, this.f46876c * 360.0f, false, this.f46875b);
    }

    /* renamed from: a */
    public void m56742a() {
        this.f46876c = 0.0f;
        invalidate();
    }

    /* renamed from: a */
    public void m56743a(float f) {
        this.f46876c = f;
        invalidate();
    }
}
