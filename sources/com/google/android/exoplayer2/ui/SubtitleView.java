package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.text.CaptionStyleCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.util.C2314v;
import java.util.ArrayList;
import java.util.List;

public final class SubtitleView extends View implements TextOutput {
    /* renamed from: a */
    private final List<C2274c> f11632a;
    /* renamed from: b */
    private List<Cue> f11633b;
    /* renamed from: c */
    private int f11634c;
    /* renamed from: d */
    private float f11635d;
    /* renamed from: e */
    private boolean f11636e;
    /* renamed from: f */
    private boolean f11637f;
    /* renamed from: g */
    private CaptionStyleCompat f11638g;
    /* renamed from: h */
    private float f11639h;

    /* renamed from: a */
    private float m14067a(int i, float f, int i2, int i3) {
        switch (i) {
            case 0:
                return f * ((float) i3);
            case 1:
                return f * ((float) i2);
            case 2:
                return f;
            default:
                return Float.MIN_VALUE;
        }
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11632a = new ArrayList();
        this.f11634c = null;
        this.f11635d = 0.0533f;
        this.f11636e = true;
        this.f11637f = true;
        this.f11638g = CaptionStyleCompat.f6430a;
        this.f11639h = 0.08f;
    }

    public void onCues(List<Cue> list) {
        setCues(list);
    }

    public void setCues(@Nullable List<Cue> list) {
        if (this.f11633b != list) {
            this.f11633b = list;
            if (list == null) {
                list = null;
            } else {
                list = list.size();
            }
            while (this.f11632a.size() < list) {
                this.f11632a.add(new C2274c(getContext()));
            }
            invalidate();
        }
    }

    /* renamed from: a */
    public void m14070a() {
        float userCaptionFontScaleV19 = (C2314v.f6956a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19();
        setFractionalTextSize(userCaptionFontScaleV19 * 0.0533f);
    }

    public void setFractionalTextSize(float f) {
        m14071a(f, false);
    }

    /* renamed from: a */
    public void m14071a(float f, boolean z) {
        m14069a((int) z, f);
    }

    /* renamed from: a */
    private void m14069a(int i, float f) {
        if (this.f11634c != i || this.f11635d != f) {
            this.f11634c = i;
            this.f11635d = f;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.f11636e != z || this.f11637f != z) {
            this.f11636e = z;
            this.f11637f = z;
            invalidate();
        }
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.f11637f != z) {
            this.f11637f = z;
            invalidate();
        }
    }

    /* renamed from: b */
    public void m14072b() {
        CaptionStyleCompat userCaptionStyleV19 = (C2314v.f6956a < 19 || isInEditMode()) ? CaptionStyleCompat.f6430a : getUserCaptionStyleV19();
        setStyle(userCaptionStyleV19);
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        if (this.f11638g != captionStyleCompat) {
            this.f11638g = captionStyleCompat;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f) {
        if (this.f11639h != f) {
            this.f11639h = f;
            invalidate();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        int i = 0;
        int size = this.f11633b == null ? 0 : r0.f11633b.size();
        int top = getTop();
        int bottom = getBottom();
        int left = getLeft() + getPaddingLeft();
        int paddingTop = getPaddingTop() + top;
        int right = getRight() + getPaddingRight();
        int paddingBottom = bottom - getPaddingBottom();
        if (paddingBottom > paddingTop) {
            if (right > left) {
                bottom -= top;
                top = paddingBottom - paddingTop;
                float a = m14067a(r0.f11634c, r0.f11635d, bottom, top);
                if (a > 0.0f) {
                    while (i < size) {
                        Cue cue = (Cue) r0.f11633b.get(i);
                        int i2 = size;
                        float f = a;
                        size = paddingBottom;
                        int i3 = right;
                        ((C2274c) r0.f11632a.get(i)).m8233a(cue, r0.f11636e, r0.f11637f, r0.f11638g, m14068a(cue, bottom, top, a), r0.f11639h, canvas, left, paddingTop, i3, size);
                        i++;
                        paddingBottom = size;
                        size = i2;
                        a = f;
                        right = i3;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private float m14068a(Cue cue, int i, int i2, float f) {
        if (cue.f6449m != Integer.MIN_VALUE) {
            if (cue.f6450n != Float.MIN_VALUE) {
                cue = m14067a(cue.f6449m, cue.f6450n, i, i2);
                if (cue <= 0) {
                    cue = f;
                }
                return cue;
            }
        }
        return f;
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private CaptionStyleCompat getUserCaptionStyleV19() {
        return CaptionStyleCompat.m7922a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }
}
