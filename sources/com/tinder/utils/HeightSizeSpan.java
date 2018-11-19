package com.tinder.utils;

import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;

@Deprecated
public class HeightSizeSpan extends RelativeSizeSpan {
    private float mAscentSpan;

    public HeightSizeSpan(float f, float f2) {
        super(f);
        this.mAscentSpan = f2;
    }

    public void updateDrawState(@NonNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.baselineShift += (int) (textPaint.ascent() * this.mAscentSpan);
    }
}
