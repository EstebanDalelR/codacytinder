package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p047k.an;

/* renamed from: com.facebook.ads.internal.view.component.e */
public final class C1599e extends RelativeLayout {
    /* renamed from: a */
    private static final int f4430a = ((int) (an.f4090b * 1.0f));
    /* renamed from: b */
    private static final int f4431b = ((int) (an.f4090b * 4.0f));
    /* renamed from: c */
    private static final int f4432c = ((int) (an.f4090b * 6.0f));
    /* renamed from: d */
    private Paint f4433d = new Paint();

    public C1599e(Context context) {
        super(context);
        an.m5204a((View) this, 0);
        this.f4433d.setColor(-16777216);
        this.f4433d.setStyle(Style.FILL);
        this.f4433d.setAlpha(16);
        this.f4433d.setAntiAlias(true);
    }

    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), (float) f4432c, (float) f4432c, Direction.CW);
        canvas.drawPath(path, this.f4433d);
        path = new Path();
        path.addRoundRect(new RectF((float) f4430a, 0.0f, (float) (getWidth() - f4430a), (float) (getHeight() - f4430a)), (float) f4431b, (float) f4431b, Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
