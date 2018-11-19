package com.tinder.utils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.tinder.utils.CustomFont.Font;

/* renamed from: com.tinder.utils.q */
public class C15366q extends MetricAffectingSpan {
    /* renamed from: a */
    private Typeface f47634a;

    public C15366q(Context context, Font font) {
        this.f47634a = av.a(context, font.getFontResource());
    }

    public void updateDrawState(TextPaint textPaint) {
        m57676a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m57676a(textPaint);
    }

    /* renamed from: a */
    private void m57676a(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int style = (typeface != null ? typeface.getStyle() : 0) & (this.f47634a.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.f47634a);
    }
}
