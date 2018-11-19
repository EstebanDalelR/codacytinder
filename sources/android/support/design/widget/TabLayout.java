package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.design.C0181a.C0173d;
import android.support.design.C0181a.C0177h;
import android.support.design.C0181a.C0179j;
import android.support.design.C0181a.C0180k;
import android.support.v4.util.Pools.C2878a;
import android.support.v4.util.Pools.C4028b;
import android.support.v4.util.Pools.Pool;
import android.support.v4.view.C0600i;
import android.support.v4.view.C0601j;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.DecorView;
import android.support.v4.view.ViewPager.OnAdapterChangeListener;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.appcompat.C0667R;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.TooltipCompat;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@DecorView
public class TabLayout extends HorizontalScrollView {
    /* renamed from: n */
    private static final Pool<C0218d> f743n = new C4028b(16);
    /* renamed from: A */
    private DataSetObserver f744A;
    /* renamed from: B */
    private C2771e f745B;
    /* renamed from: C */
    private C2770a f746C;
    /* renamed from: D */
    private boolean f747D;
    /* renamed from: E */
    private final Pool<C0219f> f748E;
    /* renamed from: a */
    int f749a;
    /* renamed from: b */
    int f750b;
    /* renamed from: c */
    int f751c;
    /* renamed from: d */
    int f752d;
    /* renamed from: e */
    int f753e;
    /* renamed from: f */
    ColorStateList f754f;
    /* renamed from: g */
    float f755g;
    /* renamed from: h */
    float f756h;
    /* renamed from: i */
    final int f757i;
    /* renamed from: j */
    int f758j;
    /* renamed from: k */
    int f759k;
    /* renamed from: l */
    int f760l;
    /* renamed from: m */
    ViewPager f761m;
    /* renamed from: o */
    private final ArrayList<C0218d> f762o;
    /* renamed from: p */
    private C0218d f763p;
    /* renamed from: q */
    private final C0217c f764q;
    /* renamed from: r */
    private final int f765r;
    /* renamed from: s */
    private final int f766s;
    /* renamed from: t */
    private final int f767t;
    /* renamed from: u */
    private int f768u;
    /* renamed from: v */
    private OnTabSelectedListener f769v;
    /* renamed from: w */
    private final ArrayList<OnTabSelectedListener> f770w;
    /* renamed from: x */
    private OnTabSelectedListener f771x;
    /* renamed from: y */
    private ValueAnimator f772y;
    /* renamed from: z */
    private C0600i f773z;

    /* renamed from: android.support.design.widget.TabLayout$1 */
    class C02131 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ TabLayout f709a;

        C02131(TabLayout tabLayout) {
            this.f709a = tabLayout;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f709a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener {
        void onTabReselected(C0218d c0218d);

        void onTabSelected(C0218d c0218d);

        void onTabUnselected(C0218d c0218d);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    /* renamed from: android.support.design.widget.TabLayout$b */
    private class C0214b extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ TabLayout f710a;

        C0214b(TabLayout tabLayout) {
            this.f710a = tabLayout;
        }

        public void onChanged() {
            this.f710a.m797c();
        }

        public void onInvalidated() {
            this.f710a.m797c();
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$c */
    private class C0217c extends LinearLayout {
        /* renamed from: a */
        int f718a = -1;
        /* renamed from: b */
        float f719b;
        /* renamed from: c */
        final /* synthetic */ TabLayout f720c;
        /* renamed from: d */
        private int f721d;
        /* renamed from: e */
        private final Paint f722e;
        /* renamed from: f */
        private int f723f = -1;
        /* renamed from: g */
        private int f724g = -1;
        /* renamed from: h */
        private int f725h = -1;
        /* renamed from: i */
        private ValueAnimator f726i;

        C0217c(TabLayout tabLayout, Context context) {
            this.f720c = tabLayout;
            super(context);
            setWillNotDraw(null);
            this.f722e = new Paint();
        }

        /* renamed from: a */
        void m736a(int i) {
            if (this.f722e.getColor() != i) {
                this.f722e.setColor(i);
                ViewCompat.m2200c(this);
            }
        }

        /* renamed from: b */
        void m741b(int i) {
            if (this.f721d != i) {
                this.f721d = i;
                ViewCompat.m2200c(this);
            }
        }

        /* renamed from: a */
        boolean m739a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        void m737a(int i, float f) {
            if (this.f726i != null && this.f726i.isRunning()) {
                this.f726i.cancel();
            }
            this.f718a = i;
            this.f719b = f;
            m735c();
        }

        /* renamed from: b */
        float m740b() {
            return ((float) this.f718a) + this.f719b;
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f723f != i) {
                requestLayout();
                this.f723f = i;
            }
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                Object obj = 1;
                if (this.f720c.f760l == 1 && this.f720c.f759k == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (this.f720c.m792b(16) * 2)) {
                            Object obj2 = null;
                            while (i3 < childCount) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    obj2 = 1;
                                }
                                i3++;
                            }
                            obj = obj2;
                        } else {
                            this.f720c.f759k = 0;
                            this.f720c.m791a(false);
                        }
                        if (obj != null) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f726i && this.f726i.isRunning()) {
                this.f726i.cancel();
                m742b(this.f718a, Math.round((1065353216 - this.f726i.getAnimatedFraction()) * ((float) this.f726i.getDuration())));
                return;
            }
            m735c();
        }

        /* renamed from: c */
        private void m735c() {
            int i;
            int i2;
            View childAt = getChildAt(this.f718a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f719b > 0.0f && this.f718a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f718a + 1);
                    i = (int) ((this.f719b * ((float) childAt2.getLeft())) + ((1.0f - this.f719b) * ((float) i)));
                    i2 = (int) ((this.f719b * ((float) childAt2.getRight())) + ((1.0f - this.f719b) * ((float) i2)));
                }
            }
            m738a(i, i2);
        }

        /* renamed from: a */
        void m738a(int i, int i2) {
            if (i != this.f724g || i2 != this.f725h) {
                this.f724g = i;
                this.f725h = i2;
                ViewCompat.m2200c(this);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m742b(final int r10, int r11) {
            /*
            r9 = this;
            r0 = r9.f726i;
            if (r0 == 0) goto L_0x0011;
        L_0x0004:
            r0 = r9.f726i;
            r0 = r0.isRunning();
            if (r0 == 0) goto L_0x0011;
        L_0x000c:
            r0 = r9.f726i;
            r0.cancel();
        L_0x0011:
            r0 = android.support.v4.view.ViewCompat.m2208f(r9);
            r1 = 1;
            if (r0 != r1) goto L_0x001a;
        L_0x0018:
            r0 = 1;
            goto L_0x001b;
        L_0x001a:
            r0 = 0;
        L_0x001b:
            r2 = r9.getChildAt(r10);
            if (r2 != 0) goto L_0x0025;
        L_0x0021:
            r9.m735c();
            return;
        L_0x0025:
            r6 = r2.getLeft();
            r8 = r2.getRight();
            r2 = r9.f718a;
            r2 = r10 - r2;
            r2 = java.lang.Math.abs(r2);
            if (r2 > r1) goto L_0x003e;
        L_0x0037:
            r0 = r9.f724g;
            r1 = r9.f725h;
            r5 = r0;
            r7 = r1;
            goto L_0x005b;
        L_0x003e:
            r1 = r9.f720c;
            r2 = 24;
            r1 = r1.m792b(r2);
            r2 = r9.f718a;
            if (r10 >= r2) goto L_0x0054;
        L_0x004a:
            if (r0 == 0) goto L_0x0051;
        L_0x004c:
            r0 = r6 - r1;
        L_0x004e:
            r5 = r0;
        L_0x004f:
            r7 = r5;
            goto L_0x005b;
        L_0x0051:
            r1 = r1 + r8;
        L_0x0052:
            r5 = r1;
            goto L_0x004f;
        L_0x0054:
            if (r0 == 0) goto L_0x0058;
        L_0x0056:
            r1 = r1 + r8;
            goto L_0x0052;
        L_0x0058:
            r0 = r6 - r1;
            goto L_0x004e;
        L_0x005b:
            if (r5 != r6) goto L_0x005f;
        L_0x005d:
            if (r7 == r8) goto L_0x008d;
        L_0x005f:
            r0 = new android.animation.ValueAnimator;
            r0.<init>();
            r9.f726i = r0;
            r1 = android.support.design.widget.C0226a.f781b;
            r0.setInterpolator(r1);
            r1 = (long) r11;
            r0.setDuration(r1);
            r11 = 2;
            r11 = new float[r11];
            r11 = {0, 1065353216};
            r0.setFloatValues(r11);
            r11 = new android.support.design.widget.TabLayout$c$1;
            r3 = r11;
            r4 = r9;
            r3.<init>(r4, r5, r6, r7, r8);
            r0.addUpdateListener(r11);
            r11 = new android.support.design.widget.TabLayout$c$2;
            r11.<init>(r9, r10);
            r0.addListener(r11);
            r0.start();
        L_0x008d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.c.b(int, int):void");
        }

        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f724g >= 0 && this.f725h > this.f724g) {
                canvas.drawRect((float) this.f724g, (float) (getHeight() - this.f721d), (float) this.f725h, (float) getHeight(), this.f722e);
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$d */
    public static final class C0218d {
        /* renamed from: a */
        TabLayout f727a;
        /* renamed from: b */
        C0219f f728b;
        /* renamed from: c */
        private Object f729c;
        /* renamed from: d */
        private Drawable f730d;
        /* renamed from: e */
        private CharSequence f731e;
        /* renamed from: f */
        private CharSequence f732f;
        /* renamed from: g */
        private int f733g = -1;
        /* renamed from: h */
        private View f734h;

        C0218d() {
        }

        @Nullable
        /* renamed from: a */
        public View m747a() {
            return this.f734h;
        }

        @NonNull
        /* renamed from: a */
        public C0218d m745a(@Nullable View view) {
            this.f734h = view;
            m756h();
            return this;
        }

        @NonNull
        /* renamed from: a */
        public C0218d m743a(@LayoutRes int i) {
            return m745a(LayoutInflater.from(this.f728b.getContext()).inflate(i, this.f728b, false));
        }

        @Nullable
        /* renamed from: b */
        public Drawable m748b() {
            return this.f730d;
        }

        /* renamed from: c */
        public int m751c() {
            return this.f733g;
        }

        /* renamed from: b */
        void m750b(int i) {
            this.f733g = i;
        }

        @Nullable
        /* renamed from: d */
        public CharSequence m752d() {
            return this.f731e;
        }

        @NonNull
        /* renamed from: a */
        public C0218d m744a(@Nullable Drawable drawable) {
            this.f730d = drawable;
            m756h();
            return this;
        }

        @NonNull
        /* renamed from: a */
        public C0218d m746a(@Nullable CharSequence charSequence) {
            this.f731e = charSequence;
            m756h();
            return this;
        }

        /* renamed from: e */
        public void m753e() {
            if (this.f727a == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            this.f727a.m795b(this);
        }

        /* renamed from: f */
        public boolean m754f() {
            if (this.f727a != null) {
                return this.f727a.getSelectedTabPosition() == this.f733g;
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        @NonNull
        /* renamed from: b */
        public C0218d m749b(@Nullable CharSequence charSequence) {
            this.f732f = charSequence;
            m756h();
            return this;
        }

        @Nullable
        /* renamed from: g */
        public CharSequence m755g() {
            return this.f732f;
        }

        /* renamed from: h */
        void m756h() {
            if (this.f728b != null) {
                this.f728b.m762b();
            }
        }

        /* renamed from: i */
        void m757i() {
            this.f727a = null;
            this.f728b = null;
            this.f729c = null;
            this.f730d = null;
            this.f731e = null;
            this.f732f = null;
            this.f733g = -1;
            this.f734h = null;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$f */
    class C0219f extends LinearLayout {
        /* renamed from: a */
        final /* synthetic */ TabLayout f735a;
        /* renamed from: b */
        private C0218d f736b;
        /* renamed from: c */
        private TextView f737c;
        /* renamed from: d */
        private ImageView f738d;
        /* renamed from: e */
        private View f739e;
        /* renamed from: f */
        private TextView f740f;
        /* renamed from: g */
        private ImageView f741g;
        /* renamed from: h */
        private int f742h = 2;

        public C0219f(TabLayout tabLayout, Context context) {
            this.f735a = tabLayout;
            super(context);
            if (tabLayout.f757i != 0) {
                ViewCompat.m2183a((View) this, AppCompatResources.getDrawable(context, tabLayout.f757i));
            }
            ViewCompat.m2197b(this, tabLayout.f749a, tabLayout.f750b, tabLayout.f751c, tabLayout.f752d);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.m2187a((View) this, C0601j.m2350a(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE));
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f736b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f736b.m753e();
            return true;
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f737c != null) {
                this.f737c.setSelected(z);
            }
            if (this.f738d != null) {
                this.f738d.setSelected(z);
            }
            if (this.f739e != null) {
                this.f739e.setSelected(z);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(Tab.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Tab.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = this.f735a.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(this.f735a.f758j, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f737c != null) {
                getResources();
                float f = this.f735a.f755g;
                mode = this.f742h;
                Object obj = 1;
                if (this.f738d != null && this.f738d.getVisibility() == 0) {
                    mode = 1;
                } else if (this.f737c != null && this.f737c.getLineCount() > 1) {
                    f = this.f735a.f756h;
                }
                float textSize = this.f737c.getTextSize();
                int lineCount = this.f737c.getLineCount();
                int a = TextViewCompat.m2516a(this.f737c);
                if (f != textSize || (a >= 0 && mode != a)) {
                    if (this.f735a.f760l == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f737c.getLayout();
                        if (layout == null || m758a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        this.f737c.setTextSize(0, f);
                        this.f737c.setMaxLines(mode);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: a */
        void m761a(@Nullable C0218d c0218d) {
            if (c0218d != this.f736b) {
                this.f736b = c0218d;
                m762b();
            }
        }

        /* renamed from: a */
        void m760a() {
            m761a(null);
            setSelected(false);
        }

        /* renamed from: b */
        final void m762b() {
            C0218d c0218d = this.f736b;
            View a = c0218d != null ? c0218d.m747a() : null;
            if (a != null) {
                C0219f parent = a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(a);
                    }
                    addView(a);
                }
                this.f739e = a;
                if (this.f737c != null) {
                    this.f737c.setVisibility(8);
                }
                if (this.f738d != null) {
                    this.f738d.setVisibility(8);
                    this.f738d.setImageDrawable(null);
                }
                this.f740f = (TextView) a.findViewById(16908308);
                if (this.f740f != null) {
                    this.f742h = TextViewCompat.m2516a(this.f740f);
                }
                this.f741g = (ImageView) a.findViewById(16908294);
            } else {
                if (this.f739e != null) {
                    removeView(this.f739e);
                    this.f739e = null;
                }
                this.f740f = null;
                this.f741g = null;
            }
            boolean z = false;
            if (this.f739e == null) {
                if (this.f738d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0177h.design_layout_tab_icon, this, false);
                    addView(imageView, 0);
                    this.f738d = imageView;
                }
                if (this.f737c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0177h.design_layout_tab_text, this, false);
                    addView(textView);
                    this.f737c = textView;
                    this.f742h = TextViewCompat.m2516a(this.f737c);
                }
                TextViewCompat.m2517a(this.f737c, this.f735a.f753e);
                if (this.f735a.f754f != null) {
                    this.f737c.setTextColor(this.f735a.f754f);
                }
                m759a(this.f737c, this.f738d);
            } else if (!(this.f740f == null && this.f741g == null)) {
                m759a(this.f740f, this.f741g);
            }
            if (c0218d != null && c0218d.m754f()) {
                z = true;
            }
            setSelected(z);
        }

        /* renamed from: a */
        private void m759a(@Nullable TextView textView, @Nullable ImageView imageView) {
            CharSequence charSequence = null;
            Drawable b = this.f736b != null ? this.f736b.m748b() : null;
            CharSequence d = this.f736b != null ? this.f736b.m752d() : null;
            CharSequence g = this.f736b != null ? this.f736b.m755g() : null;
            int i = 0;
            if (imageView != null) {
                if (b != null) {
                    imageView.setImageDrawable(b);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(g);
            }
            int isEmpty = TextUtils.isEmpty(d) ^ 1;
            if (textView != null) {
                if (isEmpty != 0) {
                    textView.setText(d);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(g);
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                if (isEmpty != 0 && imageView.getVisibility() == 0) {
                    i = this.f735a.m792b(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (isEmpty == 0) {
                charSequence = g;
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }

        /* renamed from: a */
        private float m758a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$a */
    private class C2770a implements OnAdapterChangeListener {
        /* renamed from: a */
        final /* synthetic */ TabLayout f8742a;
        /* renamed from: b */
        private boolean f8743b;

        C2770a(TabLayout tabLayout) {
            this.f8742a = tabLayout;
        }

        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable C0600i c0600i, @Nullable C0600i c0600i2) {
            if (this.f8742a.f761m == viewPager) {
                this.f8742a.m790a(c0600i2, this.f8743b);
            }
        }

        /* renamed from: a */
        void m10783a(boolean z) {
            this.f8743b = z;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$e */
    public static class C2771e implements OnPageChangeListener {
        /* renamed from: a */
        private final WeakReference<TabLayout> f8744a;
        /* renamed from: b */
        private int f8745b;
        /* renamed from: c */
        private int f8746c;

        public C2771e(TabLayout tabLayout) {
            this.f8744a = new WeakReference(tabLayout);
        }

        public void onPageScrollStateChanged(int i) {
            this.f8745b = this.f8746c;
            this.f8746c = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f8744a.get();
            if (tabLayout != null) {
                boolean z;
                boolean z2 = false;
                if (this.f8746c == 2) {
                    if (this.f8745b != 1) {
                        z = false;
                        if (!(this.f8746c == 2 && this.f8745b == 0)) {
                            z2 = true;
                        }
                        tabLayout.m784a(i, f, z, z2);
                    }
                }
                z = true;
                z2 = true;
                tabLayout.m784a(i, f, z, z2);
            }
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = (TabLayout) this.f8744a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                boolean z;
                if (this.f8746c != 0) {
                    if (this.f8746c != 2 || this.f8745b != 0) {
                        z = false;
                        tabLayout.m796b(tabLayout.m782a(i), z);
                    }
                }
                z = true;
                tabLayout.m796b(tabLayout.m782a(i), z);
            }
        }

        /* renamed from: a */
        void m10784a() {
            this.f8746c = 0;
            this.f8745b = 0;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$g */
    public static class C2772g implements OnTabSelectedListener {
        /* renamed from: a */
        private final ViewPager f8747a;

        public void onTabReselected(C0218d c0218d) {
        }

        public void onTabUnselected(C0218d c0218d) {
        }

        public C2772g(ViewPager viewPager) {
            this.f8747a = viewPager;
        }

        public void onTabSelected(C0218d c0218d) {
            this.f8747a.setCurrentItem(c0218d.m751c());
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f762o = new ArrayList();
        this.f758j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f770w = new ArrayList();
        this.f748E = new C2878a(12);
        C0248o.m917a(context);
        setHorizontalScrollBarEnabled(false);
        this.f764q = new C0217c(this, context);
        super.addView(this.f764q, 0, new FrameLayout.LayoutParams(-2, -1));
        attributeSet = context.obtainStyledAttributes(attributeSet, C0180k.TabLayout, i, C0179j.Widget_Design_TabLayout);
        this.f764q.m741b(attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabIndicatorHeight, 0));
        this.f764q.m736a(attributeSet.getColor(C0180k.TabLayout_tabIndicatorColor, 0));
        i = attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabPadding, 0);
        this.f752d = i;
        this.f751c = i;
        this.f750b = i;
        this.f749a = i;
        this.f749a = attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabPaddingStart, this.f749a);
        this.f750b = attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabPaddingTop, this.f750b);
        this.f751c = attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabPaddingEnd, this.f751c);
        this.f752d = attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabPaddingBottom, this.f752d);
        this.f753e = attributeSet.getResourceId(C0180k.TabLayout_tabTextAppearance, C0179j.TextAppearance_Design_Tab);
        context = context.obtainStyledAttributes(this.f753e, C0667R.styleable.TextAppearance);
        try {
            this.f755g = (float) context.getDimensionPixelSize(C0667R.styleable.TextAppearance_android_textSize, 0);
            this.f754f = context.getColorStateList(C0667R.styleable.TextAppearance_android_textColor);
            if (attributeSet.hasValue(C0180k.TabLayout_tabTextColor) != null) {
                this.f754f = attributeSet.getColorStateList(C0180k.TabLayout_tabTextColor);
            }
            if (attributeSet.hasValue(C0180k.TabLayout_tabSelectedTextColor) != null) {
                this.f754f = m764a(this.f754f.getDefaultColor(), attributeSet.getColor(C0180k.TabLayout_tabSelectedTextColor, 0));
            }
            this.f765r = attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabMinWidth, -1);
            this.f766s = attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabMaxWidth, -1);
            this.f757i = attributeSet.getResourceId(C0180k.TabLayout_tabBackground, 0);
            this.f768u = attributeSet.getDimensionPixelSize(C0180k.TabLayout_tabContentStart, 0);
            this.f760l = attributeSet.getInt(C0180k.TabLayout_tabMode, 1);
            this.f759k = attributeSet.getInt(C0180k.TabLayout_tabGravity, 0);
            attributeSet.recycle();
            context = getResources();
            this.f756h = (float) context.getDimensionPixelSize(C0173d.design_tab_text_size_2line);
            this.f767t = context.getDimensionPixelSize(C0173d.design_tab_scrollable_min_width);
            m779g();
        } finally {
            context.recycle();
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f764q.m736a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f764q.m741b(i);
    }

    /* renamed from: a */
    public void m783a(int i, float f, boolean z) {
        m784a(i, f, z, true);
    }

    /* renamed from: a */
    void m784a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0) {
            if (round < this.f764q.getChildCount()) {
                if (z2) {
                    this.f764q.m737a(i, f);
                }
                if (this.f772y && this.f772y.isRunning()) {
                    this.f772y.cancel();
                }
                scrollTo(m763a(i, f), 0.0f);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    private float getScrollPosition() {
        return this.f764q.m740b();
    }

    /* renamed from: a */
    public void m786a(@NonNull C0218d c0218d) {
        m788a(c0218d, this.f762o.isEmpty());
    }

    /* renamed from: a */
    public void m788a(@NonNull C0218d c0218d, boolean z) {
        m787a(c0218d, this.f762o.size(), z);
    }

    /* renamed from: a */
    public void m787a(@NonNull C0218d c0218d, int i, boolean z) {
        if (c0218d.f727a != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m765a(c0218d, i);
        m774d(c0218d);
        if (z) {
            c0218d.m753e();
        }
    }

    /* renamed from: a */
    private void m766a(@NonNull C0247m c0247m) {
        C0218d a = m781a();
        if (c0247m.f894a != null) {
            a.m746a(c0247m.f894a);
        }
        if (c0247m.f895b != null) {
            a.m744a(c0247m.f895b);
        }
        if (c0247m.f896c != 0) {
            a.m743a(c0247m.f896c);
        }
        if (!TextUtils.isEmpty(c0247m.getContentDescription())) {
            a.m749b(c0247m.getContentDescription());
        }
        m786a(a);
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        if (this.f769v != null) {
            m794b(this.f769v);
        }
        this.f769v = onTabSelectedListener;
        if (onTabSelectedListener != null) {
            m785a(onTabSelectedListener);
        }
    }

    /* renamed from: a */
    public void m785a(@NonNull OnTabSelectedListener onTabSelectedListener) {
        if (!this.f770w.contains(onTabSelectedListener)) {
            this.f770w.add(onTabSelectedListener);
        }
    }

    /* renamed from: b */
    public void m794b(@NonNull OnTabSelectedListener onTabSelectedListener) {
        this.f770w.remove(onTabSelectedListener);
    }

    @NonNull
    /* renamed from: a */
    public C0218d m781a() {
        C0218d c0218d = (C0218d) f743n.acquire();
        if (c0218d == null) {
            c0218d = new C0218d();
        }
        c0218d.f727a = this;
        c0218d.f728b = m770c(c0218d);
        return c0218d;
    }

    public int getTabCount() {
        return this.f762o.size();
    }

    @Nullable
    /* renamed from: a */
    public C0218d m782a(int i) {
        if (i >= 0) {
            if (i < getTabCount()) {
                return (C0218d) this.f762o.get(i);
            }
        }
        return 0;
    }

    public int getSelectedTabPosition() {
        return this.f763p != null ? this.f763p.m751c() : -1;
    }

    /* renamed from: b */
    public void m793b() {
        for (int childCount = this.f764q.getChildCount() - 1; childCount >= 0; childCount--) {
            m771c(childCount);
        }
        Iterator it = this.f762o.iterator();
        while (it.hasNext()) {
            C0218d c0218d = (C0218d) it.next();
            it.remove();
            c0218d.m757i();
            f743n.release(c0218d);
        }
        this.f763p = null;
    }

    public void setTabMode(int i) {
        if (i != this.f760l) {
            this.f760l = i;
            m779g();
        }
    }

    public int getTabMode() {
        return this.f760l;
    }

    public void setTabGravity(int i) {
        if (this.f759k != i) {
            this.f759k = i;
            m779g();
        }
    }

    public int getTabGravity() {
        return this.f759k;
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f754f != colorStateList) {
            this.f754f = colorStateList;
            m772d();
        }
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f754f;
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        m789a(viewPager, true);
    }

    /* renamed from: a */
    public void m789a(@Nullable ViewPager viewPager, boolean z) {
        m767a(viewPager, z, false);
    }

    /* renamed from: a */
    private void m767a(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        if (this.f761m != null) {
            if (this.f745B != null) {
                this.f761m.removeOnPageChangeListener(this.f745B);
            }
            if (this.f746C != null) {
                this.f761m.removeOnAdapterChangeListener(this.f746C);
            }
        }
        if (this.f771x != null) {
            m794b(this.f771x);
            this.f771x = null;
        }
        if (viewPager != null) {
            this.f761m = viewPager;
            if (this.f745B == null) {
                this.f745B = new C2771e(this);
            }
            this.f745B.m10784a();
            viewPager.addOnPageChangeListener(this.f745B);
            this.f771x = new C2772g(viewPager);
            m785a(this.f771x);
            C0600i adapter = viewPager.getAdapter();
            if (adapter != null) {
                m790a(adapter, z);
            }
            if (this.f746C == null) {
                this.f746C = new C2770a(this);
            }
            this.f746C.m10783a(z);
            viewPager.addOnAdapterChangeListener(this.f746C);
            m783a(viewPager.getCurrentItem(), (float) false, true);
        } else {
            this.f761m = null;
            m790a(null, false);
        }
        this.f747D = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable C0600i c0600i) {
        m790a(c0600i, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f761m == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m767a((ViewPager) parent, true, true);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f747D) {
            setupWithViewPager(null);
            this.f747D = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f764q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: a */
    void m790a(@Nullable C0600i c0600i, boolean z) {
        if (!(this.f773z == null || this.f744A == null)) {
            this.f773z.unregisterDataSetObserver(this.f744A);
        }
        this.f773z = c0600i;
        if (z && c0600i != null) {
            if (!this.f744A) {
                this.f744A = new C0214b(this);
            }
            c0600i.registerDataSetObserver(this.f744A);
        }
        m797c();
    }

    /* renamed from: c */
    void m797c() {
        m793b();
        if (this.f773z != null) {
            int count = this.f773z.getCount();
            for (int i = 0; i < count; i++) {
                m788a(m781a().m746a(this.f773z.getPageTitle(i)), false);
            }
            if (this.f761m != null && count > 0) {
                count = this.f761m.getCurrentItem();
                if (count != getSelectedTabPosition() && count < getTabCount()) {
                    m795b(m782a(count));
                }
            }
        }
    }

    /* renamed from: d */
    private void m772d() {
        int size = this.f762o.size();
        for (int i = 0; i < size; i++) {
            ((C0218d) this.f762o.get(i)).m756h();
        }
    }

    /* renamed from: c */
    private C0219f m770c(@NonNull C0218d c0218d) {
        C0219f c0219f = this.f748E != null ? (C0219f) this.f748E.acquire() : null;
        if (c0219f == null) {
            c0219f = new C0219f(this, getContext());
        }
        c0219f.m761a(c0218d);
        c0219f.setFocusable(true);
        c0219f.setMinimumWidth(getTabMinWidth());
        return c0219f;
    }

    /* renamed from: a */
    private void m765a(C0218d c0218d, int i) {
        c0218d.m750b(i);
        this.f762o.add(i, c0218d);
        c0218d = this.f762o.size();
        while (true) {
            i++;
            if (i < c0218d) {
                ((C0218d) this.f762o.get(i)).m750b(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private void m774d(C0218d c0218d) {
        this.f764q.addView(c0218d.f728b, c0218d.m751c(), m775e());
    }

    public void addView(View view) {
        m768a(view);
    }

    public void addView(View view, int i) {
        m768a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m768a(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m768a(view);
    }

    /* renamed from: a */
    private void m768a(View view) {
        if (view instanceof C0247m) {
            m766a((C0247m) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: e */
    private LayoutParams m775e() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m769a(layoutParams);
        return layoutParams;
    }

    /* renamed from: a */
    private void m769a(LayoutParams layoutParams) {
        if (this.f760l == 1 && this.f759k == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* renamed from: b */
    int m792b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.getDefaultHeight();
        r0 = r5.m792b(r0);
        r1 = r5.getPaddingTop();
        r0 = r0 + r1;
        r1 = r5.getPaddingBottom();
        r0 = r0 + r1;
        r1 = android.view.View.MeasureSpec.getMode(r7);
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 == r2) goto L_0x0024;
    L_0x001c:
        if (r1 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0030;
    L_0x001f:
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3);
        goto L_0x0030;
    L_0x0024:
        r7 = android.view.View.MeasureSpec.getSize(r7);
        r7 = java.lang.Math.min(r0, r7);
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3);
    L_0x0030:
        r0 = android.view.View.MeasureSpec.getSize(r6);
        r1 = android.view.View.MeasureSpec.getMode(r6);
        if (r1 == 0) goto L_0x004a;
    L_0x003a:
        r1 = r5.f766s;
        if (r1 <= 0) goto L_0x0041;
    L_0x003e:
        r0 = r5.f766s;
        goto L_0x0048;
    L_0x0041:
        r1 = 56;
        r1 = r5.m792b(r1);
        r0 = r0 - r1;
    L_0x0048:
        r5.f758j = r0;
    L_0x004a:
        super.onMeasure(r6, r7);
        r6 = r5.getChildCount();
        r0 = 1;
        if (r6 != r0) goto L_0x0096;
    L_0x0054:
        r6 = 0;
        r1 = r5.getChildAt(r6);
        r2 = r5.f760l;
        switch(r2) {
            case 0: goto L_0x006b;
            case 1: goto L_0x005f;
            default: goto L_0x005e;
        };
    L_0x005e:
        goto L_0x0076;
    L_0x005f:
        r2 = r1.getMeasuredWidth();
        r4 = r5.getMeasuredWidth();
        if (r2 == r4) goto L_0x0076;
    L_0x0069:
        r6 = 1;
        goto L_0x0076;
    L_0x006b:
        r2 = r1.getMeasuredWidth();
        r4 = r5.getMeasuredWidth();
        if (r2 >= r4) goto L_0x0076;
    L_0x0075:
        goto L_0x0069;
    L_0x0076:
        if (r6 == 0) goto L_0x0096;
    L_0x0078:
        r6 = r5.getPaddingTop();
        r0 = r5.getPaddingBottom();
        r6 = r6 + r0;
        r0 = r1.getLayoutParams();
        r0 = r0.height;
        r6 = getChildMeasureSpec(r7, r6, r0);
        r7 = r5.getMeasuredWidth();
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3);
        r1.measure(r7, r6);
    L_0x0096:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: c */
    private void m771c(int i) {
        C0219f c0219f = (C0219f) this.f764q.getChildAt(i);
        this.f764q.removeViewAt(i);
        if (c0219f != null) {
            c0219f.m760a();
            this.f748E.release(c0219f);
        }
        requestLayout();
    }

    /* renamed from: d */
    private void m773d(int i) {
        if (i != -1) {
            if (getWindowToken() != null && ViewCompat.m2234z(this)) {
                if (!this.f764q.m739a()) {
                    if (getScrollX() != m763a(i, 0.0f)) {
                        m777f();
                        this.f772y.setIntValues(new int[]{r0, r2});
                        this.f772y.start();
                    }
                    this.f764q.m742b(i, MapboxConstants.ANIMATION_DURATION);
                    return;
                }
            }
            m783a(i, 0.0f, true);
        }
    }

    /* renamed from: f */
    private void m777f() {
        if (this.f772y == null) {
            this.f772y = new ValueAnimator();
            this.f772y.setInterpolator(C0226a.f781b);
            this.f772y.setDuration(300);
            this.f772y.addUpdateListener(new C02131(this));
        }
    }

    void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m777f();
        this.f772y.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f764q.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f764q.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    /* renamed from: b */
    void m795b(C0218d c0218d) {
        m796b(c0218d, true);
    }

    /* renamed from: b */
    void m796b(C0218d c0218d, boolean z) {
        C0218d c0218d2 = this.f763p;
        if (c0218d2 != c0218d) {
            int c = c0218d != null ? c0218d.m751c() : -1;
            if (z) {
                if ((c0218d2 == null || c0218d2.m751c()) && c != -1) {
                    m783a(c, (float) false, true);
                } else {
                    m773d(c);
                }
                if (c != -1) {
                    setSelectedTabView(c);
                }
            }
            if (c0218d2 != null) {
                m778f(c0218d2);
            }
            this.f763p = c0218d;
            if (c0218d != null) {
                m776e(c0218d);
            }
        } else if (c0218d2 != null) {
            m780g(c0218d);
            m773d(c0218d.m751c());
        }
    }

    /* renamed from: e */
    private void m776e(@NonNull C0218d c0218d) {
        for (int size = this.f770w.size() - 1; size >= 0; size--) {
            ((OnTabSelectedListener) this.f770w.get(size)).onTabSelected(c0218d);
        }
    }

    /* renamed from: f */
    private void m778f(@NonNull C0218d c0218d) {
        for (int size = this.f770w.size() - 1; size >= 0; size--) {
            ((OnTabSelectedListener) this.f770w.get(size)).onTabUnselected(c0218d);
        }
    }

    /* renamed from: g */
    private void m780g(@NonNull C0218d c0218d) {
        for (int size = this.f770w.size() - 1; size >= 0; size--) {
            ((OnTabSelectedListener) this.f770w.get(size)).onTabReselected(c0218d);
        }
    }

    /* renamed from: a */
    private int m763a(int i, float f) {
        int i2 = 0;
        if (this.f760l != 0) {
            return 0;
        }
        View childAt = this.f764q.getChildAt(i);
        i++;
        i = i < this.f764q.getChildCount() ? this.f764q.getChildAt(i) : 0;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (i != 0) {
            i2 = i.getWidth();
        }
        i = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        f = (int) ((((float) (width + i2)) * 0.5f) * f);
        return ViewCompat.m2208f(this) == 0 ? i + f : i - f;
    }

    /* renamed from: g */
    private void m779g() {
        ViewCompat.m2197b(this.f764q, this.f760l == 0 ? Math.max(0, this.f768u - this.f749a) : 0, 0, 0, 0);
        switch (this.f760l) {
            case 0:
                this.f764q.setGravity(8388611);
                break;
            case 1:
                this.f764q.setGravity(1);
                break;
            default:
                break;
        }
        m791a(true);
    }

    /* renamed from: a */
    void m791a(boolean z) {
        for (int i = 0; i < this.f764q.getChildCount(); i++) {
            View childAt = this.f764q.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m769a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: a */
    private static ColorStateList m764a(int i, int i2) {
        r1 = new int[2][];
        int[] iArr = new int[]{SELECTED_STATE_SET, i2};
        r1[1] = EMPTY_STATE_SET;
        iArr[1] = i;
        return new ColorStateList(r1, iArr);
    }

    private int getDefaultHeight() {
        int size = this.f762o.size();
        Object obj = null;
        for (int i = 0; i < size; i++) {
            C0218d c0218d = (C0218d) this.f762o.get(i);
            if (c0218d != null && c0218d.m748b() != null && !TextUtils.isEmpty(c0218d.m752d())) {
                obj = 1;
                break;
            }
        }
        return obj != null ? 72 : 48;
    }

    private int getTabMinWidth() {
        if (this.f765r != -1) {
            return this.f765r;
        }
        return this.f760l == 0 ? this.f767t : 0;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    int getTabMaxWidth() {
        return this.f758j;
    }
}
