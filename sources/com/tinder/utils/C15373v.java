package com.tinder.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.SweepGradient;

/* renamed from: com.tinder.utils.v */
public class C15373v {
    /* renamed from: a */
    private final Paint f47637a;
    /* renamed from: b */
    private final Paint f47638b;
    /* renamed from: c */
    private int f47639c;
    /* renamed from: d */
    private RectF f47640d;
    /* renamed from: e */
    private Float f47641e;
    /* renamed from: f */
    private int f47642f;
    /* renamed from: g */
    private int f47643g;

    /* renamed from: com.tinder.utils.v$a */
    public static class C15372a {
        /* renamed from: a */
        private final C15373v f47636a = new C15373v();

        /* renamed from: a */
        public C15372a m57686a(int i) {
            this.f47636a.f47639c = i;
            i = (float) i;
            this.f47636a.f47637a.setStrokeWidth(i);
            this.f47636a.f47638b.setStrokeWidth(i);
            return this;
        }

        /* renamed from: b */
        public C15372a m57688b(int i) {
            this.f47636a.f47638b.setColor(i);
            return this;
        }

        /* renamed from: c */
        public C15372a m57689c(int i) {
            this.f47636a.f47642f = i;
            return this;
        }

        /* renamed from: d */
        public C15372a m57690d(int i) {
            this.f47636a.f47643g = i;
            return this;
        }

        /* renamed from: a */
        public C15373v m57687a() {
            return this.f47636a;
        }
    }

    private C15373v() {
        this.f47637a = new Paint();
        this.f47637a.setStyle(Style.STROKE);
        this.f47637a.setAntiAlias(true);
        this.f47638b = new Paint();
        this.f47638b.setStyle(Style.STROKE);
        this.f47638b.setAntiAlias(true);
    }

    /* renamed from: a */
    public void m57698a(int i, int i2, boolean z) {
        if (z) {
            this.f47640d = new RectF((float) this.f47639c, (float) this.f47639c, (float) (i - this.f47639c), (float) (i2 - this.f47639c));
        } else {
            this.f47640d = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        }
        if (this.f47642f && this.f47643g) {
            this.f47637a.setShader(new SweepGradient(((float) i) / 1073741824, ((float) i2) / 1073741824, new int[]{this.f47642f, this.f47643g, this.f47642f}, null));
        }
    }

    /* renamed from: a */
    public void m57699a(Canvas canvas) {
        if (this.f47640d != null) {
            if (this.f47641e != null) {
                if (this.f47641e.floatValue() != -200.0f) {
                    if (this.f47641e.floatValue() == -100.0f) {
                        this.f47641e = Float.valueOf(360.0f);
                    }
                    canvas.drawArc(this.f47640d, -90.0f, 360.0f, false, this.f47638b);
                    canvas.drawArc(this.f47640d, -90.0f, this.f47641e.floatValue(), false, this.f47637a);
                }
            }
        }
    }

    /* renamed from: a */
    public void m57697a(float f) {
        this.f47641e = Float.valueOf(f * 360.0f);
    }

    /* renamed from: a */
    public void m57696a() {
        this.f47641e = Float.valueOf(-100.0f);
    }

    /* renamed from: b */
    public void m57700b() {
        this.f47641e = Float.valueOf(-200.0f);
    }
}
