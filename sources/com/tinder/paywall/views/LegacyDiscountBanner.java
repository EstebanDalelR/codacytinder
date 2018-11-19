package com.tinder.paywall.views;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.view.View;
import butterknife.BindColor;
import butterknife.BindDimen;
import java.util.concurrent.TimeUnit;

public class LegacyDiscountBanner extends View {
    /* renamed from: a */
    private Path f33029a;
    /* renamed from: b */
    private Point f33030b;
    /* renamed from: c */
    private Point f33031c;
    /* renamed from: d */
    private Point f33032d;
    /* renamed from: e */
    private Point f33033e;
    /* renamed from: f */
    private Paint f33034f;
    /* renamed from: g */
    private Paint f33035g;
    /* renamed from: h */
    private Paint f33036h;
    /* renamed from: i */
    private int f33037i;
    /* renamed from: j */
    private int f33038j;
    /* renamed from: k */
    private String f33039k;
    /* renamed from: l */
    private String f33040l;
    @BindColor(2131099904)
    int mEndColor;
    @BindColor(2131099905)
    int mStartColor;
    @BindDimen(2131166253)
    int mTextLarge;
    @BindDimen(2131166127)
    int mTextSize;
    @BindDimen(2131165739)
    int mTopPadding;
    @BindColor(2131100300)
    int mWhite;

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f33037i = (int) (((float) i2) * 1052770304);
        this.f33038j = (int) (((float) i) * 1052770304);
        this.f33034f.setShader(new LinearGradient(0.0f, (float) (i2 - this.f33037i), (float) (i - this.f33038j), 0.0f, this.mStartColor, this.mEndColor, TileMode.CLAMP));
        this.f33030b = new Point(0, this.f33037i);
        this.f33031c = new Point(0, i2);
        this.f33032d = new Point(i, 0);
        this.f33033e = new Point(this.f33038j, 0);
        this.f33029a.moveTo((float) this.f33030b.x, (float) this.f33030b.y);
        this.f33029a.lineTo((float) this.f33031c.x, (float) this.f33031c.y);
        this.f33029a.lineTo((float) this.f33032d.x, (float) this.f33032d.y);
        this.f33029a.lineTo((float) this.f33033e.x, (float) this.f33033e.y);
        this.f33029a.lineTo((float) this.f33030b.x, (float) this.f33030b.y);
        this.f33029a.close();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f33029a, this.f33034f);
        Rect rect = new Rect();
        this.f33035g.getTextBounds(this.f33039k, 0, this.f33039k.length(), rect);
        int i = 0 - this.mTopPadding;
        int height = this.f33037i - rect.height();
        float f = (float) i;
        float f2 = (float) height;
        canvas.rotate(-45.0f, rect.exactCenterX() - f, rect.exactCenterY() + f2);
        canvas.drawText(this.f33039k, f, f2, this.f33035g);
        Rect rect2 = new Rect();
        this.f33036h.getTextBounds(this.f33040l, 0, this.f33040l.length(), rect2);
        canvas.drawText(this.f33040l, (float) (0 - (((rect2.width() - rect.width()) / 2) - i)), (float) (rect.height() + height), this.f33036h);
    }

    public void setSaleText(String str) {
        this.f33039k = str;
        invalidate();
    }

    private void setTimerText(long j) {
        this.f33040l = String.format("%02d:%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1))});
        invalidate();
    }
}
