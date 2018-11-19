package com.leanplum.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.leanplum.utils.SizeUtil;

public class CloseButton extends View {
    /* renamed from: a */
    private Paint f21451a = new Paint();
    /* renamed from: b */
    private Paint f21452b = new Paint();
    /* renamed from: c */
    private Paint f21453c = new Paint();
    /* renamed from: d */
    private float f21454d;
    /* renamed from: e */
    private float f21455e;
    /* renamed from: f */
    private float f21456f;
    /* renamed from: g */
    private float f21457g;
    /* renamed from: h */
    private float f21458h;
    /* renamed from: i */
    private boolean f21459i = null;

    public CloseButton(Context context) {
        super(context);
        m25300a();
    }

    public CloseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25300a();
    }

    /* renamed from: a */
    private void m25300a() {
        this.f21451a.setAntiAlias(true);
        this.f21451a.setColor(-2236963);
        this.f21451a.setStrokeWidth(2.0f);
        this.f21451a.setStyle(Style.FILL_AND_STROKE);
        this.f21452b.setAntiAlias(true);
        this.f21452b.setColor(-6710887);
        this.f21452b.setStrokeWidth(2.0f);
        this.f21452b.setStyle(Style.FILL_AND_STROKE);
        this.f21453c.setAntiAlias(true);
        this.f21453c.setColor(-16777216);
        this.f21453c.setStrokeWidth(3.0f);
        this.f21453c.setStyle(Style.FILL_AND_STROKE);
        this.f21454d = (float) SizeUtil.dp30;
        this.f21455e = this.f21454d * 0.33333334f;
        this.f21457g = this.f21454d * 0.6666667f;
        this.f21456f = this.f21454d * 0.33333334f;
        this.f21458h = this.f21454d * 0.6666667f;
    }

    public boolean performClick() {
        return super.performClick();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f21459i = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() != 1) {
            return super.onTouchEvent(motionEvent);
        } else {
            this.f21459i = null;
            invalidate();
            performClick();
            return true;
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        setMeasuredDimension((int) this.f21454d, (int) this.f21454d);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (((float) getWidth()) / 2.0f) - 1.0f, this.f21459i ? this.f21452b : this.f21451a);
        canvas.drawLine(this.f21455e, this.f21456f, this.f21457g, this.f21458h, this.f21453c);
        canvas.drawLine(this.f21457g, this.f21456f, this.f21455e, this.f21458h, this.f21453c);
    }
}
