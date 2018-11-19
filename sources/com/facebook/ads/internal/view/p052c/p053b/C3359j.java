package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;
import com.facebook.ads.internal.view.p052c.p080a.C3340m;
import com.facebook.ads.internal.view.p052c.p080a.C3341n;
import com.facebook.ads.internal.view.p052c.p080a.C3342o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.view.c.b.j */
public class C3359j extends View implements C1582n {
    /* renamed from: a */
    private final Paint f10178a;
    /* renamed from: b */
    private final Paint f10179b;
    /* renamed from: c */
    private final Paint f10180c;
    /* renamed from: d */
    private C1577a f10181d = C1577a.CLOSE_BUTTON_MODE;
    /* renamed from: e */
    private final Paint f10182e;
    /* renamed from: f */
    private final RectF f10183f;
    @Nullable
    /* renamed from: g */
    private C3394u f10184g;
    /* renamed from: h */
    private int f10185h;
    /* renamed from: i */
    private final AtomicInteger f10186i = new AtomicInteger(0);
    /* renamed from: j */
    private final AtomicBoolean f10187j = new AtomicBoolean(false);
    /* renamed from: k */
    private final C3340m f10188k = new C41741(this);
    /* renamed from: l */
    private final C3342o f10189l = new C41752(this);
    /* renamed from: m */
    private final C3330c f10190m = new C41763(this);

    /* renamed from: com.facebook.ads.internal.view.c.b.j$a */
    public enum C1577a {
        CLOSE_BUTTON_MODE,
        SKIP_BUTTON_MODE
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.j$1 */
    class C41741 extends C3340m {
        /* renamed from: a */
        final /* synthetic */ C3359j f13328a;

        C41741(C3359j c3359j) {
            this.f13328a = c3359j;
        }

        /* renamed from: a */
        public void m16551a(C3339l c3339l) {
            this.f13328a.f10187j.set(true);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.j$2 */
    class C41752 extends C3342o {
        /* renamed from: a */
        final /* synthetic */ C3359j f13329a;

        C41752(C3359j c3359j) {
            this.f13329a = c3359j;
        }

        /* renamed from: a */
        public void m16553a(C3341n c3341n) {
            if (this.f13329a.f10184g != null) {
                int c = this.f13329a.f10185h;
                int duration = this.f13329a.f10184g.getDuration();
                if (c <= 0) {
                    this.f13329a.f10186i.set(0);
                } else {
                    c = Math.min(duration, c * AdError.NETWORK_ERROR_CODE);
                    if (c != 0) {
                        this.f13329a.f10186i.set(((c - this.f13329a.f10184g.getCurrentPosition()) * 100) / c);
                    } else {
                        return;
                    }
                }
                this.f13329a.postInvalidate();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.j$3 */
    class C41763 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C3359j f13330a;

        C41763(C3359j c3359j) {
            this.f13330a = c3359j;
        }

        /* renamed from: a */
        public void m16555a(C3329b c3329b) {
            this.f13330a.f10185h = 0;
            this.f13330a.f10186i.set(0);
            this.f13330a.postInvalidate();
        }
    }

    public C3359j(Context context, int i, int i2) {
        super(context);
        float f = getResources().getDisplayMetrics().density;
        this.f10185h = i;
        this.f10179b = new Paint();
        this.f10179b.setStyle(Style.FILL);
        this.f10179b.setColor(i2);
        this.f10180c = new Paint();
        this.f10180c.setColor(-1);
        this.f10180c.setAlpha(230);
        this.f10180c.setStyle(Style.FILL);
        this.f10180c.setStrokeWidth(1.0f * f);
        this.f10180c.setAntiAlias(true);
        this.f10178a = new Paint();
        this.f10178a.setColor(-16777216);
        this.f10178a.setStyle(Style.STROKE);
        this.f10178a.setAlpha(102);
        this.f10178a.setStrokeWidth(1.5f * f);
        this.f10178a.setAntiAlias(true);
        setLayerType(1, null);
        this.f10178a.setMaskFilter(new BlurMaskFilter(6.0f, Blur.NORMAL));
        this.f10182e = new Paint();
        this.f10182e.setColor(-10066330);
        this.f10182e.setStyle(Style.STROKE);
        this.f10182e.setStrokeWidth(f * 2.0f);
        this.f10182e.setAntiAlias(true);
        this.f10183f = new RectF();
    }

    /* renamed from: a */
    public void mo1788a(C3394u c3394u) {
        this.f10184g = c3394u;
        this.f10184g.getEventBus().m4995a(this.f10188k, this.f10189l, this.f10190m);
    }

    /* renamed from: a */
    public boolean m12918a() {
        return this.f10184g != null && (this.f10185h <= 0 || this.f10186i.get() < 0);
    }

    /* renamed from: b */
    public void mo1789b(C3394u c3394u) {
        this.f10184g.getEventBus().m4997b(this.f10190m, this.f10189l, this.f10188k);
        this.f10184g = null;
    }

    public int getSkipSeconds() {
        return this.f10185h;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f10187j.get()) {
            int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            int i = min / 2;
            float f = (float) i;
            canvas.drawCircle((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), f, this.f10178a);
            canvas.drawCircle((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), f, this.f10180c);
            if (this.f10186i.get() > 0) {
                this.f10183f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
                canvas.drawArc(this.f10183f, -90.0f, ((float) (-(this.f10186i.get() * 360))) / 100.0f, true, this.f10179b);
            } else if (this.f10181d == C1577a.SKIP_BUTTON_MODE) {
                int i2 = min / 4;
                min /= 3;
                Path path = new Path();
                path.moveTo((float) (getPaddingLeft() + i2), (float) (getPaddingTop() + min));
                path.lineTo((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i));
                int i3 = min * 2;
                path.lineTo((float) (getPaddingLeft() + i2), (float) (getPaddingTop() + i3));
                canvas.drawPath(path, this.f10182e);
                path = new Path();
                path.moveTo((float) (getPaddingLeft() + i), (float) (min + getPaddingTop()));
                path.lineTo((float) ((i2 * 3) + getPaddingLeft()), (float) (getPaddingTop() + i));
                path.lineTo((float) (i + getPaddingLeft()), (float) (i3 + getPaddingTop()));
                canvas.drawPath(path, this.f10182e);
            } else {
                min /= 3;
                i = min * 2;
                Canvas canvas2 = canvas;
                canvas2.drawLine((float) (getPaddingLeft() + min), (float) (getPaddingTop() + min), (float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), this.f10182e);
                canvas.drawLine((float) (getPaddingLeft() + i), (float) (getPaddingTop() + min), (float) (min + getPaddingLeft()), (float) (i + getPaddingTop()), this.f10182e);
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public void setButtonMode(C1577a c1577a) {
        this.f10181d = c1577a;
    }
}
