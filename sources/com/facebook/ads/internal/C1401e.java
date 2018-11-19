package com.facebook.ads.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p047k.an;

/* renamed from: com.facebook.ads.internal.e */
public class C1401e extends View {
    /* renamed from: a */
    private Paint f3816a;
    /* renamed from: b */
    private Paint f3817b;
    /* renamed from: c */
    private Paint f3818c;
    /* renamed from: d */
    private int f3819d;
    /* renamed from: e */
    private boolean f3820e;

    public C1401e(Context context) {
        this(context, 60, true);
    }

    public C1401e(Context context, int i, boolean z) {
        super(context);
        this.f3819d = i;
        this.f3820e = z;
        if (z) {
            this.f3816a = new Paint();
            this.f3816a.setColor(-3355444);
            this.f3816a.setStyle(Style.STROKE);
            this.f3816a.setStrokeWidth(3.0f);
            this.f3816a.setAntiAlias(true);
            this.f3817b = new Paint();
            this.f3817b.setColor(-1287371708);
            this.f3817b.setStyle(Style.FILL);
            this.f3817b.setAntiAlias(true);
            this.f3818c = new Paint();
            this.f3818c.setColor(-1);
            this.f3818c.setStyle(Style.STROKE);
            this.f3818c.setStrokeWidth(6.0f);
            this.f3818c.setAntiAlias(true);
        }
        m4871a();
    }

    /* renamed from: a */
    private void m4871a() {
        float f = an.f4090b;
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((float) this.f3819d) * f), (int) (((float) this.f3819d) * f));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        setLayoutParams(layoutParams);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f3820e) {
            if (canvas.isHardwareAccelerated() && VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            int i = min / 2;
            int i2 = (i * 2) / 3;
            float f = (float) i;
            canvas.drawCircle(f, f, (float) i2, this.f3816a);
            canvas.drawCircle(f, f, (float) (i2 - 2), this.f3817b);
            min /= 3;
            float f2 = (float) min;
            float f3 = (float) (min * 2);
            Canvas canvas2 = canvas;
            float f4 = f2;
            float f5 = f3;
            canvas2.drawLine(f2, f4, f3, f5, this.f3818c);
            canvas2.drawLine(f3, f4, f2, f5, this.f3818c);
        }
        super.onDraw(canvas);
    }
}
