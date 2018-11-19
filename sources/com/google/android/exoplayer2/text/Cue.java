package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Cue {
    /* renamed from: a */
    public final CharSequence f6437a;
    /* renamed from: b */
    public final Alignment f6438b;
    /* renamed from: c */
    public final Bitmap f6439c;
    /* renamed from: d */
    public final float f6440d;
    /* renamed from: e */
    public final int f6441e;
    /* renamed from: f */
    public final int f6442f;
    /* renamed from: g */
    public final float f6443g;
    /* renamed from: h */
    public final int f6444h;
    /* renamed from: i */
    public final float f6445i;
    /* renamed from: j */
    public final float f6446j;
    /* renamed from: k */
    public final boolean f6447k;
    /* renamed from: l */
    public final int f6448l;
    /* renamed from: m */
    public final int f6449m;
    /* renamed from: n */
    public final float f6450n;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    public Cue(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public Cue(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public Cue(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public Cue(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, -16777216);
    }

    public Cue(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    private Cue(CharSequence charSequence, Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.f6437a = charSequence;
        this.f6438b = alignment;
        this.f6439c = bitmap;
        this.f6440d = f;
        this.f6441e = i;
        this.f6442f = i2;
        this.f6443g = f2;
        this.f6444h = i3;
        this.f6445i = f4;
        this.f6446j = f5;
        this.f6447k = z;
        this.f6448l = i5;
        this.f6449m = i4;
        this.f6450n = f3;
    }
}
