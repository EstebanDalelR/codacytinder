package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.CaptionStyleCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.ui.c */
final class C2274c {
    /* renamed from: A */
    private float f6784A;
    /* renamed from: B */
    private float f6785B;
    /* renamed from: C */
    private int f6786C;
    /* renamed from: D */
    private int f6787D;
    /* renamed from: E */
    private int f6788E;
    /* renamed from: F */
    private int f6789F;
    /* renamed from: G */
    private StaticLayout f6790G;
    /* renamed from: H */
    private int f6791H;
    /* renamed from: I */
    private int f6792I;
    /* renamed from: J */
    private int f6793J;
    /* renamed from: K */
    private Rect f6794K;
    /* renamed from: a */
    private final RectF f6795a = new RectF();
    /* renamed from: b */
    private final float f6796b;
    /* renamed from: c */
    private final float f6797c;
    /* renamed from: d */
    private final float f6798d;
    /* renamed from: e */
    private final float f6799e;
    /* renamed from: f */
    private final float f6800f;
    /* renamed from: g */
    private final float f6801g;
    /* renamed from: h */
    private final TextPaint f6802h;
    /* renamed from: i */
    private final Paint f6803i;
    /* renamed from: j */
    private CharSequence f6804j;
    /* renamed from: k */
    private Alignment f6805k;
    /* renamed from: l */
    private Bitmap f6806l;
    /* renamed from: m */
    private float f6807m;
    /* renamed from: n */
    private int f6808n;
    /* renamed from: o */
    private int f6809o;
    /* renamed from: p */
    private float f6810p;
    /* renamed from: q */
    private int f6811q;
    /* renamed from: r */
    private float f6812r;
    /* renamed from: s */
    private float f6813s;
    /* renamed from: t */
    private boolean f6814t;
    /* renamed from: u */
    private boolean f6815u;
    /* renamed from: v */
    private int f6816v;
    /* renamed from: w */
    private int f6817w;
    /* renamed from: x */
    private int f6818x;
    /* renamed from: y */
    private int f6819y;
    /* renamed from: z */
    private int f6820z;

    public C2274c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f6801g = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6800f = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        context = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f6796b = context;
        this.f6797c = context;
        this.f6798d = context;
        this.f6799e = context;
        this.f6802h = new TextPaint();
        this.f6802h.setAntiAlias(true);
        this.f6802h.setSubpixelText(true);
        this.f6803i = new Paint();
        this.f6803i.setAntiAlias(true);
        this.f6803i.setStyle(Style.FILL);
    }

    /* renamed from: a */
    public void m8233a(Cue cue, boolean z, boolean z2, CaptionStyleCompat captionStyleCompat, float f, float f2, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z3 = cue.f6439c == null;
        int i5 = -16777216;
        if (z3) {
            if (!TextUtils.isEmpty(cue.f6437a)) {
                i5 = (cue.f6447k && z) ? cue.f6448l : captionStyleCompat.f6433d;
            } else {
                return;
            }
        }
        if (C2274c.m8230a(this.f6804j, cue.f6437a) && C2314v.m8480a(this.f6805k, cue.f6438b) && this.f6806l == cue.f6439c && this.f6807m == cue.f6440d && this.f6808n == cue.f6441e && C2314v.m8480a(Integer.valueOf(this.f6809o), Integer.valueOf(cue.f6442f)) && this.f6810p == cue.f6443g && C2314v.m8480a(Integer.valueOf(this.f6811q), Integer.valueOf(cue.f6444h)) && this.f6812r == cue.f6445i && this.f6813s == cue.f6446j && this.f6814t == z && this.f6815u == z2 && this.f6816v == captionStyleCompat.f6431b && this.f6817w == captionStyleCompat.f6432c && this.f6818x == i5 && this.f6820z == captionStyleCompat.f6434e && this.f6819y == captionStyleCompat.f6435f && C2314v.m8480a(this.f6802h.getTypeface(), captionStyleCompat.f6436g) && this.f6784A == f && this.f6785B == f2 && this.f6786C == i && this.f6787D == i2 && this.f6788E == i3 && this.f6789F == i4) {
            m8229a(canvas, z3);
            return;
        }
        this.f6804j = cue.f6437a;
        this.f6805k = cue.f6438b;
        this.f6806l = cue.f6439c;
        this.f6807m = cue.f6440d;
        this.f6808n = cue.f6441e;
        this.f6809o = cue.f6442f;
        this.f6810p = cue.f6443g;
        this.f6811q = cue.f6444h;
        this.f6812r = cue.f6445i;
        this.f6813s = cue.f6446j;
        this.f6814t = z;
        this.f6815u = z2;
        this.f6816v = captionStyleCompat.f6431b;
        this.f6817w = captionStyleCompat.f6432c;
        this.f6818x = i5;
        this.f6820z = captionStyleCompat.f6434e;
        this.f6819y = captionStyleCompat.f6435f;
        this.f6802h.setTypeface(captionStyleCompat.f6436g);
        this.f6784A = f;
        this.f6785B = f2;
        this.f6786C = i;
        this.f6787D = i2;
        this.f6788E = i3;
        this.f6789F = i4;
        if (z3) {
            m8227a();
        } else {
            m8231b();
        }
        m8229a(canvas, z3);
    }

    /* renamed from: a */
    private void m8227a() {
        int i = this.f6788E - this.f6786C;
        int i2 = this.f6789F - this.f6787D;
        this.f6802h.setTextSize(this.f6784A);
        int i3 = (int) ((this.f6784A * 0.125f) + 0.5f);
        int i4 = i3 * 2;
        int i5 = i - i4;
        if (this.f6812r != Float.MIN_VALUE) {
            i5 = (int) (((float) i5) * r0.f6812r);
        }
        if (i5 <= 0) {
            Log.w("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        CharSequence charSequence;
        int length;
        int i6;
        if (r0.f6815u && r0.f6814t) {
            charSequence = r0.f6804j;
        } else if (r0.f6814t) {
            charSequence = new SpannableStringBuilder(r0.f6804j);
            length = charSequence.length();
            AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) charSequence.getSpans(0, length, AbsoluteSizeSpan.class);
            RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) charSequence.getSpans(0, length, RelativeSizeSpan.class);
            for (Object removeSpan : absoluteSizeSpanArr) {
                charSequence.removeSpan(removeSpan);
            }
            for (Object removeSpan2 : relativeSizeSpanArr) {
                charSequence.removeSpan(removeSpan2);
            }
        } else {
            charSequence = r0.f6804j.toString();
        }
        CharSequence charSequence2 = charSequence;
        Alignment alignment = r0.f6805k == null ? Alignment.ALIGN_CENTER : r0.f6805k;
        r0.f6790G = new StaticLayout(charSequence2, r0.f6802h, i5, alignment, r0.f6800f, r0.f6801g, true);
        int height = r0.f6790G.getHeight();
        length = r0.f6790G.getLineCount();
        int i7 = 0;
        for (i6 = 0; i6 < length; i6++) {
            i7 = Math.max((int) Math.ceil((double) r0.f6790G.getLineWidth(i6)), i7);
        }
        if (r0.f6812r == Float.MIN_VALUE || i7 >= i5) {
            i5 = i7;
        }
        i5 += i4;
        if (r0.f6810p != Float.MIN_VALUE) {
            i = Math.round(((float) i) * r0.f6810p) + r0.f6786C;
            if (r0.f6811q == 2) {
                i -= i5;
            } else if (r0.f6811q == 1) {
                i = ((i * 2) - i5) / 2;
            }
            i = Math.max(i, r0.f6786C);
            i4 = Math.min(i5 + i, r0.f6788E);
        } else {
            i = (i - i5) / 2;
            i4 = i + i5;
        }
        int i8 = i4 - i;
        if (i8 <= 0) {
            Log.w("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        if (r0.f6807m != Float.MIN_VALUE) {
            if (r0.f6808n == 0) {
                i2 = Math.round(((float) i2) * r0.f6807m) + r0.f6787D;
            } else {
                i2 = r0.f6790G.getLineBottom(0) - r0.f6790G.getLineTop(0);
                if (r0.f6807m >= 0.0f) {
                    i2 = Math.round(r0.f6807m * ((float) i2)) + r0.f6787D;
                } else {
                    i2 = Math.round((r0.f6807m + 1.0f) * ((float) i2)) + r0.f6789F;
                }
            }
            if (r0.f6809o == 2) {
                i2 -= height;
            } else if (r0.f6809o == 1) {
                i2 = ((i2 * 2) - height) / 2;
            }
            if (i2 + height > r0.f6789F) {
                i2 = r0.f6789F - height;
            } else if (i2 < r0.f6787D) {
                i2 = r0.f6787D;
            }
        } else {
            i2 = (r0.f6789F - height) - ((int) (((float) i2) * r0.f6785B));
        }
        r0.f6790G = new StaticLayout(charSequence2, r0.f6802h, i8, alignment, r0.f6800f, r0.f6801g, true);
        r0.f6791H = i;
        r0.f6792I = i2;
        r0.f6793J = i3;
    }

    /* renamed from: b */
    private void m8231b() {
        int round;
        float f;
        int round2;
        int round3;
        float f2 = (float) (this.f6788E - this.f6786C);
        float f3 = ((float) this.f6786C) + (this.f6810p * f2);
        float f4 = (float) (this.f6789F - this.f6787D);
        float f5 = ((float) this.f6787D) + (this.f6807m * f4);
        int round4 = Math.round(f2 * this.f6812r);
        if (this.f6813s != Float.MIN_VALUE) {
            round = Math.round(f4 * this.f6813s);
        } else {
            round = Math.round(((float) round4) * (((float) this.f6806l.getHeight()) / ((float) this.f6806l.getWidth())));
        }
        if (this.f6809o == 2) {
            f = (float) round4;
        } else {
            if (this.f6809o == 1) {
                f = (float) (round4 / 2);
            }
            round2 = Math.round(f3);
            if (this.f6811q != 2) {
                f = (float) round;
            } else {
                if (this.f6811q == 1) {
                    f = (float) (round / 2);
                }
                round3 = Math.round(f5);
                this.f6794K = new Rect(round2, round3, round4 + round2, round + round3);
            }
            f5 -= f;
            round3 = Math.round(f5);
            this.f6794K = new Rect(round2, round3, round4 + round2, round + round3);
        }
        f3 -= f;
        round2 = Math.round(f3);
        if (this.f6811q != 2) {
            if (this.f6811q == 1) {
                f = (float) (round / 2);
            }
            round3 = Math.round(f5);
            this.f6794K = new Rect(round2, round3, round4 + round2, round + round3);
        }
        f = (float) round;
        f5 -= f;
        round3 = Math.round(f5);
        this.f6794K = new Rect(round2, round3, round4 + round2, round + round3);
    }

    /* renamed from: a */
    private void m8229a(Canvas canvas, boolean z) {
        if (z) {
            m8228a(canvas);
        } else {
            m8232b(canvas);
        }
    }

    /* renamed from: a */
    private void m8228a(Canvas canvas) {
        StaticLayout staticLayout = this.f6790G;
        if (staticLayout != null) {
            int i;
            int save = canvas.save();
            canvas.translate((float) this.f6791H, (float) this.f6792I);
            if (Color.alpha(this.f6818x) > 0) {
                this.f6803i.setColor(this.f6818x);
                canvas.drawRect((float) (-this.f6793J), 0.0f, (float) (staticLayout.getWidth() + this.f6793J), (float) staticLayout.getHeight(), this.f6803i);
            }
            if (Color.alpha(this.f6817w) > 0) {
                this.f6803i.setColor(this.f6817w);
                float lineTop = (float) staticLayout.getLineTop(0);
                int lineCount = staticLayout.getLineCount();
                float f = lineTop;
                for (i = 0; i < lineCount; i++) {
                    float lineLeft = staticLayout.getLineLeft(i);
                    float lineRight = staticLayout.getLineRight(i);
                    this.f6795a.left = lineLeft - ((float) this.f6793J);
                    this.f6795a.right = ((float) this.f6793J) + lineRight;
                    this.f6795a.top = f;
                    this.f6795a.bottom = (float) staticLayout.getLineBottom(i);
                    f = this.f6795a.bottom;
                    if (lineRight - lineLeft > 0.0f) {
                        canvas.drawRoundRect(this.f6795a, this.f6796b, this.f6796b, this.f6803i);
                    }
                }
            }
            Object obj = 1;
            if (this.f6820z == 1) {
                this.f6802h.setStrokeJoin(Join.ROUND);
                this.f6802h.setStrokeWidth(this.f6797c);
                this.f6802h.setColor(this.f6819y);
                this.f6802h.setStyle(Style.FILL_AND_STROKE);
                staticLayout.draw(canvas);
            } else if (this.f6820z == 2) {
                this.f6802h.setShadowLayer(this.f6798d, this.f6799e, this.f6799e, this.f6819y);
            } else if (this.f6820z == 3 || this.f6820z == 4) {
                int i2;
                if (this.f6820z != 3) {
                    obj = null;
                }
                i = -1;
                if (obj != null) {
                    i2 = -1;
                } else {
                    i2 = this.f6819y;
                }
                if (obj != null) {
                    i = this.f6819y;
                }
                float f2 = this.f6798d / 2.0f;
                this.f6802h.setColor(this.f6816v);
                this.f6802h.setStyle(Style.FILL);
                float f3 = -f2;
                this.f6802h.setShadowLayer(this.f6798d, f3, f3, i2);
                staticLayout.draw(canvas);
                this.f6802h.setShadowLayer(this.f6798d, f2, f2, i);
            }
            this.f6802h.setColor(this.f6816v);
            this.f6802h.setStyle(Style.FILL);
            staticLayout.draw(canvas);
            this.f6802h.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: b */
    private void m8232b(Canvas canvas) {
        canvas.drawBitmap(this.f6806l, null, this.f6794K, null);
    }

    /* renamed from: a */
    private static boolean m8230a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            if (charSequence == null || charSequence.equals(charSequence2) == null) {
                return null;
            }
        }
        return true;
    }
}
