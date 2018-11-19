package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.design.C0181a.C0175f;
import android.support.design.C0181a.C0179j;
import android.support.design.C0181a.C0180k;
import android.support.design.widget.AppBarLayout.OnOffsetChangedListener;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.p010a.C0360a;
import android.support.v4.util.C0558i;
import android.support.v4.view.C0610p;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.C0651o;
import android.support.v7.appcompat.C0667R;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;

public class CollapsingToolbarLayout extends FrameLayout {
    /* renamed from: a */
    final C0230e f658a;
    /* renamed from: b */
    Drawable f659b;
    /* renamed from: c */
    int f660c;
    /* renamed from: d */
    C0610p f661d;
    /* renamed from: e */
    private boolean f662e;
    /* renamed from: f */
    private int f663f;
    /* renamed from: g */
    private Toolbar f664g;
    /* renamed from: h */
    private View f665h;
    /* renamed from: i */
    private View f666i;
    /* renamed from: j */
    private int f667j;
    /* renamed from: k */
    private int f668k;
    /* renamed from: l */
    private int f669l;
    /* renamed from: m */
    private int f670m;
    /* renamed from: n */
    private final Rect f671n;
    /* renamed from: o */
    private boolean f672o;
    /* renamed from: p */
    private boolean f673p;
    /* renamed from: q */
    private Drawable f674q;
    /* renamed from: r */
    private int f675r;
    /* renamed from: s */
    private boolean f676s;
    /* renamed from: t */
    private ValueAnimator f677t;
    /* renamed from: u */
    private long f678u;
    /* renamed from: v */
    private int f679v;
    /* renamed from: w */
    private OnOffsetChangedListener f680w;

    /* renamed from: android.support.design.widget.CollapsingToolbarLayout$2 */
    class C02022 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ CollapsingToolbarLayout f655a;

        C02022(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f655a = collapsingToolbarLayout;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f655a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        /* renamed from: a */
        int f656a = 0;
        /* renamed from: b */
        float f657b = 1056964608;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0180k.CollapsingToolbarLayout_Layout);
            this.f656a = context.getInt(C0180k.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            m663a(context.getFloat(C0180k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            context.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void m663a(float f) {
            this.f657b = f;
        }
    }

    /* renamed from: android.support.design.widget.CollapsingToolbarLayout$1 */
    class C27631 implements OnApplyWindowInsetsListener {
        /* renamed from: a */
        final /* synthetic */ CollapsingToolbarLayout f8713a;

        C27631(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f8713a = collapsingToolbarLayout;
        }

        public C0610p onApplyWindowInsets(View view, C0610p c0610p) {
            return this.f8713a.m672a(c0610p);
        }
    }

    /* renamed from: android.support.design.widget.CollapsingToolbarLayout$a */
    private class C2764a implements OnOffsetChangedListener {
        /* renamed from: a */
        final /* synthetic */ CollapsingToolbarLayout f8714a;

        C2764a(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f8714a = collapsingToolbarLayout;
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f8714a.f660c = i;
            appBarLayout = this.f8714a.f661d != null ? this.f8714a.f661d.m2390b() : null;
            int childCount = this.f8714a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f8714a.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C0249p a = CollapsingToolbarLayout.m664a(childAt);
                switch (layoutParams.f656a) {
                    case 1:
                        a.m920a(C0360a.m1309a(-i, 0, this.f8714a.m675b(childAt)));
                        break;
                    case 2:
                        a.m920a(Math.round(((float) (-i)) * layoutParams.f657b));
                        break;
                    default:
                        break;
                }
            }
            this.f8714a.m676b();
            if (this.f8714a.f659b != null && appBarLayout > null) {
                ViewCompat.m2200c(this.f8714a);
            }
            this.f8714a.f658a.m836b(((float) Math.abs(i)) / ((float) ((this.f8714a.getHeight() - ViewCompat.m2220l(this.f8714a)) - appBarLayout)));
        }
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m671a();
    }

    /* renamed from: generateDefaultLayoutParams */
    protected /* synthetic */ android.widget.FrameLayout.LayoutParams m71743generateDefaultLayoutParams() {
        return m671a();
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m673a(layoutParams);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f662e = true;
        this.f671n = new Rect();
        this.f679v = -1;
        C0248o.m917a(context);
        this.f658a = new C0230e(this);
        this.f658a.m832a(C0226a.f784e);
        context = context.obtainStyledAttributes(attributeSet, C0180k.CollapsingToolbarLayout, i, C0179j.Widget_Design_CollapsingToolbar);
        this.f658a.m827a(context.getInt(C0180k.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f658a.m837b(context.getInt(C0180k.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        attributeSet = context.getDimensionPixelSize(C0180k.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f670m = attributeSet;
        this.f669l = attributeSet;
        this.f668k = attributeSet;
        this.f667j = attributeSet;
        if (context.hasValue(C0180k.CollapsingToolbarLayout_expandedTitleMarginStart) != null) {
            this.f667j = context.getDimensionPixelSize(C0180k.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (context.hasValue(C0180k.CollapsingToolbarLayout_expandedTitleMarginEnd) != null) {
            this.f669l = context.getDimensionPixelSize(C0180k.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (context.hasValue(C0180k.CollapsingToolbarLayout_expandedTitleMarginTop) != null) {
            this.f668k = context.getDimensionPixelSize(C0180k.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (context.hasValue(C0180k.CollapsingToolbarLayout_expandedTitleMarginBottom) != null) {
            this.f670m = context.getDimensionPixelSize(C0180k.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f672o = context.getBoolean(C0180k.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(context.getText(C0180k.CollapsingToolbarLayout_title));
        this.f658a.m846d(C0179j.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f658a.m843c(C0667R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (context.hasValue(C0180k.CollapsingToolbarLayout_expandedTitleTextAppearance) != null) {
            this.f658a.m846d(context.getResourceId(C0180k.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (context.hasValue(C0180k.CollapsingToolbarLayout_collapsedTitleTextAppearance) != null) {
            this.f658a.m843c(context.getResourceId(C0180k.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f679v = context.getDimensionPixelSize(C0180k.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.f678u = (long) context.getInt(C0180k.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(context.getDrawable(C0180k.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(context.getDrawable(C0180k.CollapsingToolbarLayout_statusBarScrim));
        this.f663f = context.getResourceId(C0180k.CollapsingToolbarLayout_toolbarId, -1);
        context.recycle();
        setWillNotDraw(false);
        ViewCompat.m2184a((View) this, new C27631(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            ViewCompat.m2198b((View) this, ViewCompat.m2227s((View) parent));
            if (this.f680w == null) {
                this.f680w = new C2764a(this);
            }
            ((AppBarLayout) parent).m629a(this.f680w);
            ViewCompat.m2226r(this);
        }
    }

    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (this.f680w != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m632b(this.f680w);
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    C0610p m672a(C0610p c0610p) {
        C0610p c0610p2 = ViewCompat.m2227s(this) ? c0610p : null;
        if (!C0558i.m2057a(this.f661d, c0610p2)) {
            this.f661d = c0610p2;
            requestLayout();
        }
        return c0610p.m2394f();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m666c();
        if (this.f664g == null && this.f674q != null && this.f675r > 0) {
            this.f674q.mutate().setAlpha(this.f675r);
            this.f674q.draw(canvas);
        }
        if (this.f672o && this.f673p) {
            this.f658a.m830a(canvas);
        }
        if (this.f659b != null && this.f675r > 0) {
            int b = this.f661d != null ? this.f661d.m2390b() : 0;
            if (b > 0) {
                this.f659b.setBounds(0, -this.f660c, getWidth(), b - this.f660c);
                this.f659b.mutate().setAlpha(this.f675r);
                this.f659b.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        Object obj;
        if (this.f674q == null || this.f675r <= 0 || !m667c(view)) {
            obj = null;
        } else {
            this.f674q.mutate().setAlpha(this.f675r);
            this.f674q.draw(canvas);
            obj = 1;
        }
        if (super.drawChild(canvas, view, j) != null) {
            return true;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f674q != 0) {
            this.f674q.setBounds(0, 0, i, i2);
        }
    }

    /* renamed from: c */
    private void m666c() {
        if (this.f662e) {
            Toolbar toolbar = null;
            this.f664g = null;
            this.f665h = null;
            if (this.f663f != -1) {
                this.f664g = (Toolbar) findViewById(this.f663f);
                if (this.f664g != null) {
                    this.f665h = m668d(this.f664g);
                }
            }
            if (this.f664g == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                }
                this.f664g = toolbar;
            }
            m669d();
            this.f662e = false;
        }
    }

    /* renamed from: c */
    private boolean m667c(View view) {
        if (this.f665h != null) {
            if (this.f665h != this) {
                return view == this.f665h;
            }
        }
        if (view != this.f664g) {
            return false;
        }
    }

    /* renamed from: d */
    private View m668d(View view) {
        View parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: d */
    private void m669d() {
        if (!(this.f672o || this.f666i == null)) {
            ViewParent parent = this.f666i.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f666i);
            }
        }
        if (this.f672o && this.f664g != null) {
            if (this.f666i == null) {
                this.f666i = new View(getContext());
            }
            if (this.f666i.getParent() == null) {
                this.f664g.addView(this.f666i, -1, -1);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        m666c();
        super.onMeasure(i, i2);
        i2 = MeasureSpec.getMode(i2);
        int b = this.f661d != null ? this.f661d.m2390b() : 0;
        if (i2 == 0 && b > 0) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight() + b, 1073741824));
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f661d) {
            int b = this.f661d.m2390b();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!ViewCompat.m2227s(childAt) && childAt.getTop() < b) {
                    ViewCompat.m2202c(childAt, b);
                }
            }
        }
        if (this.f672o && this.f666i) {
            Object obj = 1;
            z = ViewCompat.m2171C(this.f666i) && !this.f666i.getVisibility();
            this.f673p = z;
            if (this.f673p) {
                int titleMarginEnd;
                int titleMarginStart;
                if (!ViewCompat.m2208f(this)) {
                    obj = null;
                }
                z = m675b(this.f665h ? this.f665h : this.f664g);
                C0651o.m2650b(this, this.f666i, this.f671n);
                C0230e c0230e = this.f658a;
                int i6 = this.f671n.left;
                if (obj != null) {
                    titleMarginEnd = this.f664g.getTitleMarginEnd();
                } else {
                    titleMarginEnd = this.f664g.getTitleMarginStart();
                }
                i6 += titleMarginEnd;
                titleMarginEnd = (this.f671n.top + z) + this.f664g.getTitleMarginTop();
                int i7 = this.f671n.right;
                if (obj != null) {
                    titleMarginStart = this.f664g.getTitleMarginStart();
                } else {
                    titleMarginStart = this.f664g.getTitleMarginEnd();
                }
                c0230e.m838b(i6, titleMarginEnd, i7 + titleMarginStart, (this.f671n.bottom + z) - this.f664g.getTitleMarginBottom());
                this.f658a.m828a(obj != null ? this.f669l : this.f667j, this.f671n.top + this.f668k, (i3 - i) - (obj != null ? this.f667j : this.f669l), (i4 - i2) - this.f670m);
                this.f658a.m851i();
            }
        }
        z = getChildCount();
        for (boolean z2 = false; z2 < z; z2++) {
            m664a(getChildAt(z2)).m919a();
        }
        if (this.f664g) {
            if (this.f672o && TextUtils.isEmpty(this.f658a.m852j())) {
                this.f658a.m833a(this.f664g.getTitle());
            }
            if (this.f665h) {
                if (this.f665h != this) {
                    setMinimumHeight(m670e(this.f665h));
                }
            }
            setMinimumHeight(m670e(this.f664g));
        }
        m676b();
    }

    /* renamed from: e */
    private static int m670e(@NonNull View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return (view.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    static C0249p m664a(View view) {
        C0249p c0249p = (C0249p) view.getTag(C0175f.view_offset_helper);
        if (c0249p != null) {
            return c0249p;
        }
        c0249p = new C0249p(view);
        view.setTag(C0175f.view_offset_helper, c0249p);
        return c0249p;
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f658a.m833a(charSequence);
    }

    @Nullable
    public CharSequence getTitle() {
        return this.f672o ? this.f658a.m852j() : null;
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f672o) {
            this.f672o = z;
            m669d();
            requestLayout();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = ViewCompat.m2234z(this) && !isInEditMode();
        m674a(z, z2);
    }

    /* renamed from: a */
    public void m674a(boolean z, boolean z2) {
        if (this.f676s != z) {
            int i = 0;
            if (z2) {
                if (z) {
                    i = 255;
                }
                m665a(i);
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.f676s = z;
        }
    }

    /* renamed from: a */
    private void m665a(int i) {
        m666c();
        if (this.f677t == null) {
            this.f677t = new ValueAnimator();
            this.f677t.setDuration(this.f678u);
            this.f677t.setInterpolator(i > this.f675r ? C0226a.f782c : C0226a.f783d);
            this.f677t.addUpdateListener(new C02022(this));
        } else if (this.f677t.isRunning()) {
            this.f677t.cancel();
        }
        this.f677t.setIntValues(new int[]{this.f675r, i});
        this.f677t.start();
    }

    void setScrimAlpha(int i) {
        if (i != this.f675r) {
            if (!(this.f674q == null || this.f664g == null)) {
                ViewCompat.m2200c(this.f664g);
            }
            this.f675r = i;
            ViewCompat.m2200c(this);
        }
    }

    int getScrimAlpha() {
        return this.f675r;
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        if (this.f674q != drawable) {
            Drawable drawable2 = null;
            if (this.f674q != null) {
                this.f674q.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f674q = drawable2;
            if (this.f674q != null) {
                this.f674q.setBounds(0, 0, getWidth(), getHeight());
                this.f674q.setCallback(this);
                this.f674q.setAlpha(this.f675r);
            }
            ViewCompat.m2200c(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        setContentScrim(C0432b.m1640a(getContext(), i));
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f674q;
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        if (this.f659b != drawable) {
            Drawable drawable2 = null;
            if (this.f659b != null) {
                this.f659b.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f659b = drawable2;
            if (this.f659b != null) {
                if (this.f659b.isStateful() != null) {
                    this.f659b.setState(getDrawableState());
                }
                C0450a.m1725b(this.f659b, ViewCompat.m2208f(this));
                this.f659b.setVisible(getVisibility() == 0, false);
                this.f659b.setCallback(this);
                this.f659b.setAlpha(this.f675r);
            }
            ViewCompat.m2200c(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f659b;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        drawable = this.f674q;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (this.f658a != null) {
            i |= this.f658a.m834a(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!(super.verifyDrawable(drawable) || drawable == this.f674q)) {
            if (drawable != this.f659b) {
                return null;
            }
        }
        return true;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (!(this.f659b == null || this.f659b.isVisible() == z)) {
            this.f659b.setVisible(z, false);
        }
        if (this.f674q != null && this.f674q.isVisible() != z) {
            this.f674q.setVisible(z, false);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        setStatusBarScrim(C0432b.m1640a(getContext(), i));
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f659b;
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.f658a.m843c(i);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f658a.m829a(colorStateList);
    }

    public void setCollapsedTitleGravity(int i) {
        this.f658a.m837b(i);
    }

    public int getCollapsedTitleGravity() {
        return this.f658a.m842c();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.f658a.m846d(i);
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f658a.m839b(colorStateList);
    }

    public void setExpandedTitleGravity(int i) {
        this.f658a.m827a(i);
    }

    public int getExpandedTitleGravity() {
        return this.f658a.m835b();
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.f658a.m831a(typeface);
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.f658a.m845d();
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.f658a.m840b(typeface);
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.f658a.m847e();
    }

    public int getExpandedTitleMarginStart() {
        return this.f667j;
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f667j = i;
        requestLayout();
    }

    public int getExpandedTitleMarginTop() {
        return this.f668k;
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f668k = i;
        requestLayout();
    }

    public int getExpandedTitleMarginEnd() {
        return this.f669l;
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f669l = i;
        requestLayout();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f670m;
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f670m = i;
        requestLayout();
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i) {
        if (this.f679v != i) {
            this.f679v = i;
            m676b();
        }
    }

    public int getScrimVisibleHeightTrigger() {
        if (this.f679v >= 0) {
            return this.f679v;
        }
        int b = this.f661d != null ? this.f661d.m2390b() : 0;
        int l = ViewCompat.m2220l(this);
        if (l > 0) {
            return Math.min((l * 2) + b, getHeight());
        }
        return getHeight() / 3;
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j) {
        this.f678u = j;
    }

    public long getScrimAnimationDuration() {
        return this.f678u;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    protected LayoutParams m671a() {
        return new LayoutParams(-1, -1);
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected android.widget.FrameLayout.LayoutParams m673a(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: b */
    final void m676b() {
        if (this.f674q != null || this.f659b != null) {
            setScrimsShown(getHeight() + this.f660c < getScrimVisibleHeightTrigger());
        }
    }

    /* renamed from: b */
    final int m675b(View view) {
        return ((getHeight() - m664a(view).m923c()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }
}
