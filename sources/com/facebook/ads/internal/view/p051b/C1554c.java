package com.facebook.ads.internal.view.p051b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.internal.view.b.c */
public class C1554c extends RelativeLayout {
    /* renamed from: a */
    private final Paint f4333a = new Paint();
    /* renamed from: b */
    private final RectF f4334b;

    public C1554c(Context context, String str) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        View textView = new TextView(context);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        int i = (int) (f * 6.0f);
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.f4333a.setStyle(Style.FILL);
        this.f4333a.setColor(-1);
        this.f4334b = new RectF();
        setBackgroundColor(0);
    }

    protected void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f4334b.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        f *= 10.0f;
        canvas.drawRoundRect(this.f4334b, f, f, this.f4333a);
        super.onDraw(canvas);
    }
}
