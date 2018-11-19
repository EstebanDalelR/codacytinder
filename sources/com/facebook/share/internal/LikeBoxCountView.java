package com.facebook.share.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

@Deprecated
public class LikeBoxCountView extends FrameLayout {
    /* renamed from: a */
    private TextView f5008a;
    /* renamed from: b */
    private LikeBoxCountViewCaretPosition f5009b;
    /* renamed from: c */
    private float f5010c;
    /* renamed from: d */
    private float f5011d;
    /* renamed from: e */
    private float f5012e;
    /* renamed from: f */
    private Paint f5013f;
    /* renamed from: g */
    private int f5014g;
    /* renamed from: h */
    private int f5015h;

    public enum LikeBoxCountViewCaretPosition {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    @Deprecated
    public void setText(String str) {
        this.f5008a.setText(str);
    }

    @Deprecated
    public void setCaretPosition(LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition) {
        this.f5009b = likeBoxCountViewCaretPosition;
        switch (likeBoxCountViewCaretPosition) {
            case LEFT:
                m6340a(this.f5015h, 0, 0, 0);
                return;
            case TOP:
                m6340a(0, this.f5015h, 0, 0);
                return;
            case RIGHT:
                m6340a(0, 0, this.f5015h, 0);
                return;
            case BOTTOM:
                m6340a(0, 0, 0, this.f5015h);
                return;
            default:
                return;
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        switch (this.f5009b) {
            case LEFT:
                paddingLeft = (int) (((float) paddingLeft) + this.f5010c);
                break;
            case TOP:
                paddingTop = (int) (((float) paddingTop) + this.f5010c);
                break;
            case RIGHT:
                width = (int) (((float) width) - this.f5010c);
                break;
            case BOTTOM:
                height = (int) (((float) height) - this.f5010c);
                break;
            default:
                break;
        }
        m6341a(canvas, (float) paddingLeft, (float) paddingTop, (float) width, (float) height);
    }

    /* renamed from: a */
    private void m6340a(int i, int i2, int i3, int i4) {
        this.f5008a.setPadding(this.f5014g + i, this.f5014g + i2, this.f5014g + i3, this.f5014g + i4);
    }

    /* renamed from: a */
    private void m6341a(Canvas canvas, float f, float f2, float f3, float f4) {
        Path path = new Path();
        float f5 = this.f5012e * 2.0f;
        float f6 = f + f5;
        float f7 = f2 + f5;
        path.addArc(new RectF(f, f2, f6, f7), -180.0f, 90.0f);
        if (this.f5009b == LikeBoxCountViewCaretPosition.TOP) {
            float f8 = f3 - f;
            path.lineTo(((f8 - this.f5011d) / 2.0f) + f, f2);
            path.lineTo((f8 / 2.0f) + f, f2 - this.f5010c);
            path.lineTo(((f8 + this.f5011d) / 2.0f) + f, f2);
        }
        path.lineTo(f3 - this.f5012e, f2);
        float f9 = f3 - f5;
        path.addArc(new RectF(f9, f2, f3, f7), -90.0f, 90.0f);
        if (this.f5009b == LikeBoxCountViewCaretPosition.RIGHT) {
            f8 = f4 - f2;
            path.lineTo(f3, ((f8 - this.f5011d) / 2.0f) + f2);
            path.lineTo(this.f5010c + f3, (f8 / 2.0f) + f2);
            path.lineTo(f3, ((f8 + this.f5011d) / 2.0f) + f2);
        }
        path.lineTo(f3, f4 - this.f5012e);
        f5 = f4 - f5;
        path.addArc(new RectF(f9, f5, f3, f4), 0.0f, 90.0f);
        if (this.f5009b == LikeBoxCountViewCaretPosition.BOTTOM) {
            f3 -= f;
            path.lineTo(((this.f5011d + f3) / 2.0f) + f, f4);
            path.lineTo((f3 / 2.0f) + f, this.f5010c + f4);
            path.lineTo(((f3 - this.f5011d) / 2.0f) + f, f4);
        }
        path.lineTo(this.f5012e + f, f4);
        path.addArc(new RectF(f, f5, f6, f4), 90.0f, 90.0f);
        if (this.f5009b == LikeBoxCountViewCaretPosition.LEFT) {
            f4 -= f2;
            path.lineTo(f, ((this.f5011d + f4) / 2.0f) + f2);
            path.lineTo(f - this.f5010c, (f4 / 2.0f) + f2);
            path.lineTo(f, ((f4 - this.f5011d) / 2.0f) + f2);
        }
        path.lineTo(f, f2 + this.f5012e);
        canvas.drawPath(path, this.f5013f);
    }
}
