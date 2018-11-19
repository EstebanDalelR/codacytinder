package com.tinder.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tinder.C6250b.C6249b;
import com.tinder.utils.C15367r;

public class RoundedLinearLayout extends LinearLayout {
    /* renamed from: a */
    private Path f47839a;
    /* renamed from: b */
    private int f47840b;
    /* renamed from: c */
    private boolean f47841c;

    public RoundedLinearLayout(Context context) {
        super(context);
    }

    public RoundedLinearLayout(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        if (C15367r.m57677a() < 18 && C15367r.m57677a() > 10) {
            setLayerType(1, null);
        }
        context = context.obtainStyledAttributes(attributeSet, C6249b.com_tinder_views_RoundedRelativeLayout, 0, 0);
        this.f47840b = context.getDimensionPixelSize(0, 0);
        context.recycle();
        m57929a();
    }

    /* renamed from: a */
    private void m57929a() {
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0 && !this.f47841c) {
            this.f47841c = true;
            this.f47839a = new Path();
            this.f47839a.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), (float) this.f47840b, (float) this.f47840b, Direction.CCW);
        }
    }

    /* renamed from: a */
    private void m57930a(@NonNull Canvas canvas) {
        m57929a();
        canvas.clipPath(this.f47839a);
    }

    protected void dispatchDraw(@NonNull Canvas canvas) {
        m57930a(canvas);
        super.dispatchDraw(canvas);
    }

    public void draw(@NonNull Canvas canvas) {
        m57930a(canvas);
        super.draw(canvas);
    }
}
