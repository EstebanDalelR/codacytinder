package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.v4.p010a.C0360a;
import android.support.v4.text.C0542b;
import android.support.v4.view.C0593c;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.C0667R;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: android.support.design.widget.e */
final class C0230e {
    /* renamed from: a */
    private static final boolean f799a = (VERSION.SDK_INT < 18);
    /* renamed from: b */
    private static final Paint f800b = null;
    /* renamed from: A */
    private boolean f801A;
    /* renamed from: B */
    private Bitmap f802B;
    /* renamed from: C */
    private Paint f803C;
    /* renamed from: D */
    private float f804D;
    /* renamed from: E */
    private float f805E;
    /* renamed from: F */
    private float f806F;
    /* renamed from: G */
    private float f807G;
    /* renamed from: H */
    private int[] f808H;
    /* renamed from: I */
    private boolean f809I;
    /* renamed from: J */
    private final TextPaint f810J;
    /* renamed from: K */
    private Interpolator f811K;
    /* renamed from: L */
    private Interpolator f812L;
    /* renamed from: M */
    private float f813M;
    /* renamed from: N */
    private float f814N;
    /* renamed from: O */
    private float f815O;
    /* renamed from: P */
    private int f816P;
    /* renamed from: Q */
    private float f817Q;
    /* renamed from: R */
    private float f818R;
    /* renamed from: S */
    private float f819S;
    /* renamed from: T */
    private int f820T;
    /* renamed from: c */
    private final View f821c;
    /* renamed from: d */
    private boolean f822d;
    /* renamed from: e */
    private float f823e;
    /* renamed from: f */
    private final Rect f824f;
    /* renamed from: g */
    private final Rect f825g;
    /* renamed from: h */
    private final RectF f826h;
    /* renamed from: i */
    private int f827i = 16;
    /* renamed from: j */
    private int f828j = 16;
    /* renamed from: k */
    private float f829k = 15.0f;
    /* renamed from: l */
    private float f830l = 15.0f;
    /* renamed from: m */
    private ColorStateList f831m;
    /* renamed from: n */
    private ColorStateList f832n;
    /* renamed from: o */
    private float f833o;
    /* renamed from: p */
    private float f834p;
    /* renamed from: q */
    private float f835q;
    /* renamed from: r */
    private float f836r;
    /* renamed from: s */
    private float f837s;
    /* renamed from: t */
    private float f838t;
    /* renamed from: u */
    private Typeface f839u;
    /* renamed from: v */
    private Typeface f840v;
    /* renamed from: w */
    private Typeface f841w;
    /* renamed from: x */
    private CharSequence f842x;
    /* renamed from: y */
    private CharSequence f843y;
    /* renamed from: z */
    private boolean f844z;

    static {
        if (f800b != null) {
            f800b.setAntiAlias(true);
            f800b.setColor(-65281);
        }
    }

    public C0230e(View view) {
        this.f821c = view;
        this.f810J = new TextPaint(129);
        this.f825g = new Rect();
        this.f824f = new Rect();
        this.f826h = new RectF();
    }

    /* renamed from: a */
    void m832a(Interpolator interpolator) {
        this.f812L = interpolator;
        m851i();
    }

    /* renamed from: b */
    void m841b(Interpolator interpolator) {
        this.f811K = interpolator;
        m851i();
    }

    /* renamed from: a */
    void m826a(float f) {
        if (this.f829k != f) {
            this.f829k = f;
            m851i();
        }
    }

    /* renamed from: a */
    void m829a(ColorStateList colorStateList) {
        if (this.f832n != colorStateList) {
            this.f832n = colorStateList;
            m851i();
        }
    }

    /* renamed from: b */
    void m839b(ColorStateList colorStateList) {
        if (this.f831m != colorStateList) {
            this.f831m = colorStateList;
            m851i();
        }
    }

    /* renamed from: a */
    void m828a(int i, int i2, int i3, int i4) {
        if (!C0230e.m811a(this.f824f, i, i2, i3, i4)) {
            this.f824f.set(i, i2, i3, i4);
            this.f809I = true;
            m825a();
        }
    }

    /* renamed from: b */
    void m838b(int i, int i2, int i3, int i4) {
        if (!C0230e.m811a(this.f825g, i, i2, i3, i4)) {
            this.f825g.set(i, i2, i3, i4);
            this.f809I = true;
            m825a();
        }
    }

    /* renamed from: a */
    void m825a() {
        boolean z = this.f825g.width() > 0 && this.f825g.height() > 0 && this.f824f.width() > 0 && this.f824f.height() > 0;
        this.f822d = z;
    }

    /* renamed from: a */
    void m827a(int i) {
        if (this.f827i != i) {
            this.f827i = i;
            m851i();
        }
    }

    /* renamed from: b */
    int m835b() {
        return this.f827i;
    }

    /* renamed from: b */
    void m837b(int i) {
        if (this.f828j != i) {
            this.f828j = i;
            m851i();
        }
    }

    /* renamed from: c */
    int m842c() {
        return this.f828j;
    }

    /* renamed from: c */
    void m843c(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f821c.getContext(), i, C0667R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0667R.styleable.TextAppearance_android_textColor)) {
            this.f832n = obtainStyledAttributes.getColorStateList(C0667R.styleable.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(C0667R.styleable.TextAppearance_android_textSize)) {
            this.f830l = (float) obtainStyledAttributes.getDimensionPixelSize(C0667R.styleable.TextAppearance_android_textSize, (int) this.f830l);
        }
        this.f816P = obtainStyledAttributes.getInt(C0667R.styleable.TextAppearance_android_shadowColor, 0);
        this.f814N = obtainStyledAttributes.getFloat(C0667R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f815O = obtainStyledAttributes.getFloat(C0667R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f813M = obtainStyledAttributes.getFloat(C0667R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.f839u = m816e(i);
        }
        m851i();
    }

    /* renamed from: d */
    void m846d(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f821c.getContext(), i, C0667R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0667R.styleable.TextAppearance_android_textColor)) {
            this.f831m = obtainStyledAttributes.getColorStateList(C0667R.styleable.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(C0667R.styleable.TextAppearance_android_textSize)) {
            this.f829k = (float) obtainStyledAttributes.getDimensionPixelSize(C0667R.styleable.TextAppearance_android_textSize, (int) this.f829k);
        }
        this.f820T = obtainStyledAttributes.getInt(C0667R.styleable.TextAppearance_android_shadowColor, 0);
        this.f818R = obtainStyledAttributes.getFloat(C0667R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f819S = obtainStyledAttributes.getFloat(C0667R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f817Q = obtainStyledAttributes.getFloat(C0667R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.f840v = m816e(i);
        }
        m851i();
    }

    /* renamed from: e */
    private Typeface m816e(int i) {
        i = this.f821c.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = i.getString(0);
            if (string != null) {
                Typeface create = Typeface.create(string, 0);
                return create;
            }
            i.recycle();
            return 0;
        } finally {
            i.recycle();
        }
    }

    /* renamed from: a */
    void m831a(Typeface typeface) {
        if (m812a(this.f839u, typeface)) {
            this.f839u = typeface;
            m851i();
        }
    }

    /* renamed from: b */
    void m840b(Typeface typeface) {
        if (m812a(this.f840v, typeface)) {
            this.f840v = typeface;
            m851i();
        }
    }

    /* renamed from: c */
    void m844c(Typeface typeface) {
        this.f840v = typeface;
        this.f839u = typeface;
        m851i();
    }

    /* renamed from: d */
    Typeface m845d() {
        return this.f839u != null ? this.f839u : Typeface.DEFAULT;
    }

    /* renamed from: e */
    Typeface m847e() {
        return this.f840v != null ? this.f840v : Typeface.DEFAULT;
    }

    /* renamed from: b */
    void m836b(float f) {
        f = C0360a.m1308a(f, 0.0f, 1.0f);
        if (f != this.f823e) {
            this.f823e = f;
            m819l();
        }
    }

    /* renamed from: a */
    final boolean m834a(int[] iArr) {
        this.f808H = iArr;
        if (m848f() == null) {
            return null;
        }
        m851i();
        return 1;
    }

    /* renamed from: f */
    final boolean m848f() {
        return (this.f832n != null && this.f832n.isStateful()) || (this.f831m != null && this.f831m.isStateful());
    }

    /* renamed from: g */
    float m849g() {
        return this.f823e;
    }

    /* renamed from: h */
    float m850h() {
        return this.f830l;
    }

    /* renamed from: l */
    private void m819l() {
        m814c(this.f823e);
    }

    /* renamed from: c */
    private void m814c(float f) {
        m815d(f);
        this.f837s = C0230e.m808a(this.f835q, this.f836r, f, this.f811K);
        this.f838t = C0230e.m808a(this.f833o, this.f834p, f, this.f811K);
        m817e(C0230e.m808a(this.f829k, this.f830l, f, this.f812L));
        if (this.f832n != this.f831m) {
            this.f810J.setColor(C0230e.m809a(m820m(), m821n(), f));
        } else {
            this.f810J.setColor(m821n());
        }
        this.f810J.setShadowLayer(C0230e.m808a(this.f817Q, this.f813M, f, null), C0230e.m808a(this.f818R, this.f814N, f, null), C0230e.m808a(this.f819S, this.f815O, f, null), C0230e.m809a(this.f820T, this.f816P, f));
        ViewCompat.m2200c(this.f821c);
    }

    @ColorInt
    /* renamed from: m */
    private int m820m() {
        if (this.f808H != null) {
            return this.f831m.getColorForState(this.f808H, 0);
        }
        return this.f831m.getDefaultColor();
    }

    @ColorInt
    /* renamed from: n */
    private int m821n() {
        if (this.f808H != null) {
            return this.f832n.getColorForState(this.f808H, 0);
        }
        return this.f832n.getDefaultColor();
    }

    /* renamed from: o */
    private void m822o() {
        float f = this.f807G;
        m818f(this.f830l);
        float f2 = 0.0f;
        float measureText = this.f843y != null ? this.f810J.measureText(this.f843y, 0, this.f843y.length()) : 0.0f;
        int a = C0593c.m2313a(this.f828j, this.f844z);
        int i = a & 112;
        if (i == 48) {
            this.f834p = ((float) this.f825g.top) - this.f810J.ascent();
        } else if (i != 80) {
            this.f834p = ((float) this.f825g.centerY()) + (((this.f810J.descent() - this.f810J.ascent()) / 2.0f) - this.f810J.descent());
        } else {
            this.f834p = (float) this.f825g.bottom;
        }
        a &= 8388615;
        if (a == 1) {
            this.f836r = ((float) this.f825g.centerX()) - (measureText / 2.0f);
        } else if (a != 5) {
            this.f836r = (float) this.f825g.left;
        } else {
            this.f836r = ((float) this.f825g.right) - measureText;
        }
        m818f(this.f829k);
        if (this.f843y != null) {
            f2 = this.f810J.measureText(this.f843y, 0, this.f843y.length());
        }
        int a2 = C0593c.m2313a(this.f827i, this.f844z);
        int i2 = a2 & 112;
        if (i2 == 48) {
            this.f833o = ((float) this.f824f.top) - this.f810J.ascent();
        } else if (i2 != 80) {
            this.f833o = ((float) this.f824f.centerY()) + (((this.f810J.descent() - this.f810J.ascent()) / 2.0f) - this.f810J.descent());
        } else {
            this.f833o = (float) this.f824f.bottom;
        }
        a2 &= 8388615;
        if (a2 == 1) {
            this.f835q = ((float) this.f824f.centerX()) - (f2 / 2.0f);
        } else if (a2 != 5) {
            this.f835q = (float) this.f824f.left;
        } else {
            this.f835q = ((float) this.f824f.right) - f2;
        }
        m824q();
        m817e(f);
    }

    /* renamed from: d */
    private void m815d(float f) {
        this.f826h.left = C0230e.m808a((float) this.f824f.left, (float) this.f825g.left, f, this.f811K);
        this.f826h.top = C0230e.m808a(this.f833o, this.f834p, f, this.f811K);
        this.f826h.right = C0230e.m808a((float) this.f824f.right, (float) this.f825g.right, f, this.f811K);
        this.f826h.bottom = C0230e.m808a((float) this.f824f.bottom, (float) this.f825g.bottom, f, this.f811K);
    }

    /* renamed from: a */
    public void m830a(Canvas canvas) {
        int save = canvas.save();
        if (this.f843y != null && this.f822d) {
            float f;
            float f2 = this.f837s;
            float f3 = this.f838t;
            Object obj = (!this.f801A || this.f802B == null) ? null : 1;
            float f4;
            if (obj != null) {
                f = this.f804D * this.f806F;
                f4 = this.f805E;
                f4 = this.f806F;
            } else {
                f = this.f810J.ascent() * this.f806F;
                this.f810J.descent();
                f4 = this.f806F;
            }
            if (obj != null) {
                f3 += f;
            }
            float f5 = f3;
            if (this.f806F != 1.0f) {
                canvas.scale(this.f806F, this.f806F, f2, f5);
            }
            if (obj != null) {
                canvas.drawBitmap(this.f802B, f2, f5, this.f803C);
            } else {
                canvas.drawText(this.f843y, 0, this.f843y.length(), f2, f5, this.f810J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: b */
    private boolean m813b(CharSequence charSequence) {
        Object obj = 1;
        if (ViewCompat.m2208f(this.f821c) != 1) {
            obj = null;
        }
        return (obj != null ? C0542b.f1679d : C0542b.f1678c).isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: e */
    private void m817e(float f) {
        m818f(f);
        f = (f799a == null || this.f806F == 1.0f) ? 0.0f : Float.MIN_VALUE;
        this.f801A = f;
        if (this.f801A != null) {
            m823p();
        }
        ViewCompat.m2200c(this.f821c);
    }

    /* renamed from: a */
    private boolean m812a(Typeface typeface, Typeface typeface2) {
        return ((typeface == null || typeface.equals(typeface2)) && (typeface != null || typeface2 == null)) ? null : true;
    }

    /* renamed from: f */
    private void m818f(float f) {
        if (this.f842x != null) {
            float f2;
            Object obj;
            float width = (float) this.f825g.width();
            float width2 = (float) this.f824f.width();
            boolean z = true;
            if (C0230e.m810a(f, this.f830l)) {
                Object obj2;
                f = this.f830l;
                this.f806F = 1.0f;
                if (m812a(this.f841w, this.f839u)) {
                    this.f841w = this.f839u;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                f2 = f;
                obj = obj2;
            } else {
                f2 = this.f829k;
                if (m812a(this.f841w, this.f840v)) {
                    this.f841w = this.f840v;
                    obj = 1;
                } else {
                    obj = null;
                }
                if (C0230e.m810a(f, this.f829k)) {
                    this.f806F = 1.0f;
                } else {
                    this.f806F = f / this.f829k;
                }
                f = this.f830l / this.f829k;
                width = width2 * f > width ? Math.min(width / f, width2) : width2;
            }
            if (width > 0.0f) {
                if (this.f807G == f2 && this.f809I == null) {
                    if (obj == null) {
                        obj = null;
                        this.f807G = f2;
                        this.f809I = false;
                    }
                }
                obj = 1;
                this.f807G = f2;
                this.f809I = false;
            }
            if (this.f843y == null || r6 != null) {
                this.f810J.setTextSize(this.f807G);
                this.f810J.setTypeface(this.f841w);
                f = this.f810J;
                if (this.f806F == 1.0f) {
                    z = false;
                }
                f.setLinearText(z);
                f = TextUtils.ellipsize(this.f842x, this.f810J, width, TruncateAt.END);
                if (!TextUtils.equals(f, this.f843y)) {
                    this.f843y = f;
                    this.f844z = m813b(this.f843y);
                }
            }
        }
    }

    /* renamed from: p */
    private void m823p() {
        if (this.f802B == null && !this.f824f.isEmpty()) {
            if (!TextUtils.isEmpty(this.f843y)) {
                m814c(0.0f);
                this.f804D = this.f810J.ascent();
                this.f805E = this.f810J.descent();
                int round = Math.round(this.f810J.measureText(this.f843y, 0, this.f843y.length()));
                int round2 = Math.round(this.f805E - this.f804D);
                if (round > 0) {
                    if (round2 > 0) {
                        this.f802B = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                        new Canvas(this.f802B).drawText(this.f843y, 0, this.f843y.length(), 0.0f, ((float) round2) - this.f810J.descent(), this.f810J);
                        if (this.f803C == null) {
                            this.f803C = new Paint(3);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void m851i() {
        if (this.f821c.getHeight() > 0 && this.f821c.getWidth() > 0) {
            m822o();
            m819l();
        }
    }

    /* renamed from: a */
    void m833a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f842x)) {
            this.f842x = charSequence;
            this.f843y = null;
            m824q();
            m851i();
        }
    }

    /* renamed from: j */
    CharSequence m852j() {
        return this.f842x;
    }

    /* renamed from: q */
    private void m824q() {
        if (this.f802B != null) {
            this.f802B.recycle();
            this.f802B = null;
        }
    }

    /* renamed from: a */
    private static boolean m810a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: k */
    ColorStateList m853k() {
        return this.f832n;
    }

    /* renamed from: a */
    private static int m809a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m808a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return C0226a.m801a(f, f2, f3);
    }

    /* renamed from: a */
    private static boolean m811a(Rect rect, int i, int i2, int i3, int i4) {
        return (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) ? true : null;
    }
}
