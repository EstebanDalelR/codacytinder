package com.facebook.ads.internal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.ads.internal.p049l.C1517a;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.f */
public class C1404f extends Drawable {
    /* renamed from: a */
    private final Paint f3836a = new Paint();
    /* renamed from: b */
    private final Paint f3837b = new Paint();
    /* renamed from: c */
    private final Path f3838c = new Path();
    /* renamed from: d */
    private final TextPaint f3839d = new TextPaint();
    /* renamed from: e */
    private final Paint f3840e = new Paint();
    /* renamed from: f */
    private int f3841f;
    /* renamed from: g */
    private int f3842g;
    /* renamed from: h */
    private String f3843h;
    /* renamed from: i */
    private int f3844i;
    /* renamed from: j */
    private boolean f3845j;
    @Nullable
    /* renamed from: k */
    private String f3846k;
    /* renamed from: l */
    private String f3847l;
    /* renamed from: m */
    private long f3848m;
    /* renamed from: n */
    private final Handler f3849n = new Handler();
    @Nullable
    /* renamed from: o */
    private WeakReference<C1517a> f3850o;
    /* renamed from: p */
    private final Runnable f3851p = new C14021(this);

    /* renamed from: com.facebook.ads.internal.f$1 */
    class C14021 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1404f f3821a;

        C14021(C1404f c1404f) {
            this.f3821a = c1404f;
        }

        public void run() {
            this.f3821a.m4878c();
            if (this.f3821a.f3845j) {
                this.f3821a.f3849n.postDelayed(this.f3821a.f3851p, 250);
            }
        }
    }

    public C1404f() {
        this.f3836a.setColor(Color.argb(127, 36, 36, 36));
        this.f3836a.setStyle(Style.FILL_AND_STROKE);
        this.f3837b.setAntiAlias(true);
        this.f3837b.setColor(Color.argb(191, 0, 255, 0));
        this.f3837b.setStrokeWidth(20.0f);
        this.f3837b.setStyle(Style.STROKE);
        this.f3839d.setAntiAlias(true);
        this.f3839d.setColor(-1);
        this.f3839d.setStyle(Style.FILL_AND_STROKE);
        this.f3839d.setTextSize(30.0f);
        this.f3840e.setColor(Color.argb(212, 0, 0, 0));
        this.f3840e.setStyle(Style.FILL_AND_STROKE);
        m4886b();
    }

    /* renamed from: c */
    private void m4878c() {
        String str;
        float f;
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f3841f <= 0) {
            if (!TextUtils.isEmpty(this.f3846k)) {
                stringBuilder.append(this.f3846k);
                stringBuilder.append("\n");
            }
            if (!TextUtils.isEmpty(this.f3847l)) {
                stringBuilder.append(this.f3847l);
                stringBuilder.append("\n");
            }
            stringBuilder.append("Sdk ");
            stringBuilder.append("4.27.0");
            stringBuilder.append(", Loaded ");
            if (this.f3848m > 0) {
                long max = Math.max(0, System.currentTimeMillis() - this.f3848m);
                int i2 = (int) (max / 3600000);
                max %= 3600000;
                int i3 = (int) (max / 60000);
                int i4 = (int) ((max % 60000) / 1000);
                if (i2 > 0) {
                    stringBuilder.append(i2);
                    stringBuilder.append("h ");
                }
                if (i2 > 0 || i3 > 0) {
                    stringBuilder.append(i3);
                    stringBuilder.append("m ");
                }
                stringBuilder.append(i4);
                str = "s ago";
            } else {
                str = "Unknown";
            }
            stringBuilder.append(str);
        } else {
            stringBuilder.append("Card ");
            stringBuilder.append(this.f3842g + 1);
            stringBuilder.append(" of ");
            stringBuilder.append(this.f3841f);
        }
        stringBuilder.append("\nView: ");
        if (this.f3850o != null) {
            if (this.f3850o.get() != null) {
                str = ((C1517a) this.f3850o.get()).m5353c();
                stringBuilder.append(str);
                this.f3843h = stringBuilder.toString();
                f = -2.14748365E9f;
                for (String str2 : this.f3843h.split("\n")) {
                    f = Math.max(f, this.f3839d.measureText(str2, 0, str2.length()));
                }
                this.f3844i = (int) (f + 0.5f);
                invalidateSelf();
            }
        }
        str = "Viewability Checker not set";
        stringBuilder.append(str);
        this.f3843h = stringBuilder.toString();
        f = -2.14748365E9f;
        for (i = 0; i < r2; i++) {
            f = Math.max(f, this.f3839d.measureText(str2, 0, str2.length()));
        }
        this.f3844i = (int) (f + 0.5f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m4880a(int i, int i2) {
        this.f3841f = i;
        this.f3842g = i2;
        m4878c();
    }

    /* renamed from: a */
    public void m4881a(long j) {
        this.f3848m = j;
        m4878c();
    }

    /* renamed from: a */
    public void m4882a(C1517a c1517a) {
        this.f3850o = new WeakReference(c1517a);
        m4878c();
    }

    /* renamed from: a */
    public void m4883a(String str) {
        this.f3846k = str;
        m4878c();
    }

    /* renamed from: a */
    public void m4884a(boolean z) {
        this.f3845j = z;
        if (this.f3845j) {
            this.f3849n.post(this.f3851p);
        } else {
            this.f3849n.removeCallbacks(this.f3851p);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public boolean m4885a() {
        return this.f3845j;
    }

    /* renamed from: b */
    public void m4886b() {
        this.f3841f = 0;
        this.f3842g = -1;
        this.f3843h = "Initializing...";
        this.f3844i = 100;
        this.f3846k = null;
        this.f3848m = -1;
        this.f3850o = null;
        m4884a(false);
    }

    /* renamed from: b */
    public void m4887b(String str) {
        this.f3847l = str;
        m4878c();
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.f3845j) {
            float width = (float) canvas.getWidth();
            float height = (float) canvas.getHeight();
            canvas2.drawRect(0.0f, 0.0f, width, height, r0.f3836a);
            StaticLayout staticLayout = new StaticLayout(r0.f3843h, r0.f3839d, r0.f3844i, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            float width2 = ((float) staticLayout.getWidth()) / 2.0f;
            float height2 = ((float) staticLayout.getHeight()) / 2.0f;
            float f3 = f - width2;
            float f4 = f2 - height2;
            StaticLayout staticLayout2 = staticLayout;
            canvas2.drawRect(f3 - 40.0f, f4 - 40.0f, (f + width2) + 40.0f, (f2 + height2) + 40.0f, r0.f3840e);
            canvas.save();
            canvas2.translate(f3, f4);
            staticLayout2.draw(canvas2);
            canvas.restore();
            r0.f3838c.reset();
            r0.f3838c.moveTo(0.0f, 0.0f);
            r0.f3838c.lineTo(width, 0.0f);
            r0.f3838c.lineTo(width, height);
            r0.f3838c.lineTo(0.0f, height);
            r0.f3838c.lineTo(0.0f, 0.0f);
            canvas2.drawPath(r0.f3838c, r0.f3837b);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
