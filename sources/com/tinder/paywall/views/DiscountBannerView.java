package com.tinder.paywall.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.ButterKnife;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DiscountBannerView extends View {
    /* renamed from: a */
    private Path f33018a;
    /* renamed from: b */
    private Paint f33019b;
    /* renamed from: c */
    private Paint f33020c;
    /* renamed from: d */
    private Paint f33021d;
    /* renamed from: e */
    private int f33022e;
    @BindColor(2131099904)
    int endColor;
    /* renamed from: f */
    private int f33023f;
    /* renamed from: g */
    private String f33024g = "";
    /* renamed from: h */
    private String f33025h = "";
    @BindString(2131821183)
    String hoursLeft;
    /* renamed from: i */
    private CountDownTimer f33026i;
    /* renamed from: j */
    private Rect f33027j;
    /* renamed from: k */
    private Rect f33028k;
    @BindString(2131821265)
    String left;
    @BindColor(2131099905)
    int startColor;
    @BindDimen(2131166253)
    int textLarge;
    @BindDimen(2131166127)
    int textSize;
    @BindDimen(2131165739)
    int topPadding;
    @BindColor(2131100300)
    int white;

    public DiscountBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m41268b();
    }

    /* renamed from: b */
    private void m41268b() {
        ButterKnife.a(this);
        this.f33018a = new Path();
        this.f33019b = new Paint();
        this.f33019b.setAntiAlias(true);
        this.f33020c = new Paint();
        this.f33020c.setAntiAlias(true);
        this.f33020c.setColor(this.white);
        this.f33020c.setTextSize((float) this.textSize);
        this.f33021d = new Paint();
        this.f33021d.setAntiAlias(true);
        this.f33021d.setColor(this.white);
        this.f33021d.setTextSize((float) this.textLarge);
        this.f33027j = new Rect();
        this.f33028k = new Rect();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f33022e = (int) (((float) i2) * 1048576000);
        this.f33023f = (int) (((float) i) * 1048576000);
        this.f33019b.setShader(new LinearGradient(0.0f, (float) (i2 - this.f33022e), (float) (i - this.f33023f), 0.0f, this.startColor, this.endColor, TileMode.CLAMP));
        i3 = new Point(0, this.f33022e);
        i4 = new Point(0, i2);
        i2 = new Point(i, 0);
        i = new Point(this.f33023f, 0);
        this.f33018a.reset();
        this.f33018a.moveTo((float) i3.x, (float) i3.y);
        this.f33018a.lineTo((float) i4.x, (float) i4.y);
        this.f33018a.lineTo((float) i2.x, (float) i2.y);
        this.f33018a.lineTo((float) i.x, (float) i.y);
        this.f33018a.lineTo((float) i3.x, (float) i3.y);
        this.f33018a.close();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f33018a, this.f33019b);
        this.f33020c.getTextBounds(this.f33024g, 0, this.f33024g.length(), this.f33027j);
        int i = 0 - ((int) (((double) this.topPadding) * 1.5d));
        int height = this.f33022e - (this.f33027j.height() / 2);
        float f = (float) i;
        float f2 = (float) height;
        canvas.rotate(-45.0f, this.f33027j.exactCenterX() - f, this.f33027j.exactCenterY() + f2);
        canvas.drawText(this.f33024g, f, f2, this.f33020c);
        this.f33021d.getTextBounds(this.f33025h, 0, this.f33025h.length(), this.f33028k);
        canvas.drawText(this.f33025h, (float) (0 - (((this.f33028k.width() - this.f33027j.width()) / 2) - i)), (float) (this.f33027j.height() + height), this.f33021d);
    }

    /* renamed from: a */
    public void m41273a(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33024g = str;
            invalidate();
        }
    }

    /* renamed from: a */
    public void m41272a(long j) {
        this.f33026i = new CountDownTimer(this, m41270c(j), 1000) {
            /* renamed from: a */
            final /* synthetic */ DiscountBannerView f33017a;

            public void onTick(long j) {
                this.f33017a.m41269b(j);
            }

            public void onFinish() {
                this.f33017a.f33025h = String.format(this.f33017a.left, new Object[]{Integer.valueOf(0), Integer.valueOf(0)});
                this.f33017a.invalidate();
            }
        };
        this.f33026i.start();
    }

    /* renamed from: a */
    public void m41271a() {
        if (this.f33026i != null) {
            this.f33026i.cancel();
            this.f33026i = null;
        }
    }

    /* renamed from: b */
    private void m41269b(long j) {
        if (TimeUnit.MILLISECONDS.toHours(j) > 1) {
            j = String.format(this.hoursLeft, new Object[]{Long.valueOf(r0)});
        } else {
            j = String.format(this.left, new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1))});
        }
        this.f33025h = j;
        invalidate();
    }

    /* renamed from: c */
    private long m41270c(long j) {
        Date date = new Date(j);
        return (date.getTime() + 1000) - System.currentTimeMillis();
    }
}
