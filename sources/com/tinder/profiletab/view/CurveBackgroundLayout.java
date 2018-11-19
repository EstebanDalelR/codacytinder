package com.tinder.profiletab.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.utils.au;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J(\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/profiletab/view/CurveBackgroundLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "controlPointDelta", "", "curveCenter", "Landroid/graphics/PointF;", "curveHeight", "gradientHeight", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "shadowPaint", "shadowPath", "shadowStrokeSize", "topLeft", "topRight", "applyBezierCurveToPath", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "", "h", "oldw", "oldh", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class CurveBackgroundLayout extends FrameLayout {
    /* renamed from: a */
    private final float f8358a = au.a(this, R.dimen.gradient_curve_gradient_height);
    /* renamed from: b */
    private final float f8359b = au.a(this, R.dimen.gradient_curve_height);
    /* renamed from: c */
    private final float f8360c = au.a(this, R.dimen.gradient_curve_control_point_delta);
    /* renamed from: d */
    private final float f8361d = au.a(this, R.dimen.gradient_curve_shadow_stroke);
    /* renamed from: e */
    private final Paint f8362e;
    /* renamed from: f */
    private final Paint f8363f;
    /* renamed from: g */
    private final Path f8364g;
    /* renamed from: h */
    private final Path f8365h;
    /* renamed from: i */
    private final PointF f8366i;
    /* renamed from: j */
    private final PointF f8367j;
    /* renamed from: k */
    private final PointF f8368k;

    public CurveBackgroundLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context = new Paint(1);
        context.setColor(au.c(this, R.color.profile_tab_curve_bg));
        this.f8362e = context;
        context = new Paint();
        context.setStyle(Style.STROKE);
        context.setColor(au.c(this, R.color.gradient_curve_stroke_color));
        context.setStrokeWidth(this.f8361d);
        context.setShadowLayer(au.a(this, R.dimen.gradient_curve_shadow_radius), 0.0f, 0.0f, au.c(this, R.color.gradient_curve_shadow_color));
        this.f8363f = context;
        this.f8364g = new Path();
        this.f8365h = new Path();
        this.f8366i = new PointF();
        this.f8367j = new PointF();
        this.f8368k = new PointF();
        setWillNotDraw(null);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8364g.reset();
        this.f8365h.reset();
        i = (float) i;
        i3 = (float) (i2 - ((int) this.f8358a));
        this.f8366i.set(i, i3);
        this.f8367j.set(0.0f, i3);
        this.f8368k.set(i / 2.0f, i3 + this.f8359b);
        i3 = this.f8364g;
        i3.moveTo(this.f8367j.x, this.f8367j.y);
        i2 = (float) i2;
        i3.lineTo(0.0f, i2);
        i3.lineTo(i, i2);
        i3.lineTo(this.f8366i.x, this.f8366i.y);
        m10162a(this.f8364g);
        i2 = this.f8365h;
        i2.moveTo(i, this.f8367j.y - this.f8361d);
        i2.lineTo(this.f8366i.x, this.f8366i.y);
        m10162a(this.f8365h);
    }

    protected void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != 0) {
            if (getHeight() != 0) {
                if (canvas != null) {
                    canvas.drawPath(this.f8364g, this.f8362e);
                }
                if (canvas != null) {
                    canvas.drawPath(this.f8365h, this.f8363f);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m10162a(Path path) {
        path.cubicTo(this.f8366i.x, this.f8366i.y, ((float) getWidth()) - this.f8360c, this.f8368k.y, this.f8368k.x, this.f8368k.y);
        path.cubicTo(this.f8360c, this.f8368k.y, this.f8367j.x, this.f8367j.y, this.f8367j.x, this.f8367j.y);
    }
}
