package com.google.android.exoplayer2.text;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.exoplayer2.util.C2314v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CaptionStyleCompat {
    /* renamed from: a */
    public static final CaptionStyleCompat f6430a = new CaptionStyleCompat(-1, -16777216, 0, 0, -1, null);
    /* renamed from: b */
    public final int f6431b;
    /* renamed from: c */
    public final int f6432c;
    /* renamed from: d */
    public final int f6433d;
    /* renamed from: e */
    public final int f6434e;
    /* renamed from: f */
    public final int f6435f;
    /* renamed from: g */
    public final Typeface f6436g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface EdgeType {
    }

    @TargetApi(19)
    /* renamed from: a */
    public static CaptionStyleCompat m7922a(CaptionStyle captionStyle) {
        if (C2314v.f6956a >= 21) {
            return m7924c(captionStyle);
        }
        return m7923b(captionStyle);
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f6431b = i;
        this.f6432c = i2;
        this.f6433d = i3;
        this.f6434e = i4;
        this.f6435f = i5;
        this.f6436g = typeface;
    }

    @TargetApi(19)
    /* renamed from: b */
    private static CaptionStyleCompat m7923b(CaptionStyle captionStyle) {
        return new CaptionStyleCompat(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    /* renamed from: c */
    private static CaptionStyleCompat m7924c(CaptionStyle captionStyle) {
        return new CaptionStyleCompat(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f6430a.f6431b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f6430a.f6432c, captionStyle.hasWindowColor() ? captionStyle.windowColor : f6430a.f6433d, captionStyle.hasEdgeType() ? captionStyle.edgeType : f6430a.f6434e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f6430a.f6435f, captionStyle.getTypeface());
    }
}
