package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import com.google.android.exoplayer2.ui.C2273b.C2272f;
import com.google.android.exoplayer2.ui.TimeBar.OnScrubListener;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class DefaultTimeBar extends View implements TimeBar {
    /* renamed from: A */
    private int[] f11595A;
    /* renamed from: B */
    private Point f11596B;
    /* renamed from: C */
    private boolean f11597C;
    /* renamed from: D */
    private long f11598D;
    /* renamed from: E */
    private long f11599E;
    /* renamed from: F */
    private long f11600F;
    /* renamed from: G */
    private long f11601G;
    /* renamed from: H */
    private int f11602H;
    /* renamed from: I */
    private long[] f11603I;
    /* renamed from: J */
    private boolean[] f11604J;
    /* renamed from: a */
    private final Rect f11605a = new Rect();
    /* renamed from: b */
    private final Rect f11606b = new Rect();
    /* renamed from: c */
    private final Rect f11607c = new Rect();
    /* renamed from: d */
    private final Rect f11608d = new Rect();
    /* renamed from: e */
    private final Paint f11609e = new Paint();
    /* renamed from: f */
    private final Paint f11610f = new Paint();
    /* renamed from: g */
    private final Paint f11611g = new Paint();
    /* renamed from: h */
    private final Paint f11612h = new Paint();
    /* renamed from: i */
    private final Paint f11613i = new Paint();
    /* renamed from: j */
    private final Paint f11614j = new Paint();
    /* renamed from: k */
    private final Drawable f11615k;
    /* renamed from: l */
    private final int f11616l;
    /* renamed from: m */
    private final int f11617m;
    /* renamed from: n */
    private final int f11618n;
    /* renamed from: o */
    private final int f11619o;
    /* renamed from: p */
    private final int f11620p;
    /* renamed from: q */
    private final int f11621q;
    /* renamed from: r */
    private final int f11622r;
    /* renamed from: s */
    private final int f11623s;
    /* renamed from: t */
    private final StringBuilder f11624t;
    /* renamed from: u */
    private final Formatter f11625u;
    /* renamed from: v */
    private final Runnable f11626v;
    /* renamed from: w */
    private final CopyOnWriteArraySet<OnScrubListener> f11627w;
    /* renamed from: x */
    private int f11628x;
    /* renamed from: y */
    private long f11629y;
    /* renamed from: z */
    private int f11630z;

    /* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar$1 */
    class C22591 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DefaultTimeBar f6701a;

        C22591(DefaultTimeBar defaultTimeBar) {
            this.f6701a = defaultTimeBar;
        }

        public void run() {
            this.f6701a.m14055a(false);
        }
    }

    /* renamed from: a */
    public static int m14048a(int i) {
        return i | -16777216;
    }

    /* renamed from: b */
    public static int m14060b(int i) {
        return (i & 16777215) | 855638016;
    }

    /* renamed from: c */
    public static int m14063c(int i) {
        return (i & 16777215) | -872415232;
    }

    /* renamed from: d */
    public static int m14065d(int i) {
        return (i & 16777215) | 855638016;
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11614j.setAntiAlias(true);
        this.f11627w = new CopyOnWriteArraySet();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f11623s = m14049a(displayMetrics, -50);
        int a = m14049a(displayMetrics, 4);
        int a2 = m14049a(displayMetrics, 26);
        int a3 = m14049a(displayMetrics, 4);
        int a4 = m14049a(displayMetrics, 12);
        int a5 = m14049a(displayMetrics, 0);
        int a6 = m14049a(displayMetrics, 16);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C2272f.DefaultTimeBar, 0, 0);
            try {
                this.f11615k = context.getDrawable(C2272f.DefaultTimeBar_scrubber_drawable);
                if (this.f11615k != null) {
                    m14058a(this.f11615k);
                    a2 = Math.max(this.f11615k.getMinimumHeight(), a2);
                }
                this.f11616l = context.getDimensionPixelSize(C2272f.DefaultTimeBar_bar_height, a);
                this.f11617m = context.getDimensionPixelSize(C2272f.DefaultTimeBar_touch_target_height, a2);
                this.f11618n = context.getDimensionPixelSize(C2272f.DefaultTimeBar_ad_marker_width, a3);
                this.f11619o = context.getDimensionPixelSize(C2272f.DefaultTimeBar_scrubber_enabled_size, a4);
                this.f11620p = context.getDimensionPixelSize(C2272f.DefaultTimeBar_scrubber_disabled_size, a5);
                this.f11621q = context.getDimensionPixelSize(C2272f.DefaultTimeBar_scrubber_dragged_size, a6);
                int i = context.getInt(C2272f.DefaultTimeBar_played_color, -1);
                a6 = context.getInt(C2272f.DefaultTimeBar_scrubber_color, m14048a(i));
                a3 = context.getInt(C2272f.DefaultTimeBar_buffered_color, m14063c(i));
                a = context.getInt(C2272f.DefaultTimeBar_unplayed_color, m14060b(i));
                a2 = context.getInt(C2272f.DefaultTimeBar_ad_marker_color, -1291845888);
                a4 = context.getInt(C2272f.DefaultTimeBar_played_ad_marker_color, m14065d(a2));
                this.f11609e.setColor(i);
                this.f11614j.setColor(a6);
                this.f11610f.setColor(a3);
                this.f11611g.setColor(a);
                this.f11612h.setColor(a2);
                this.f11613i.setColor(a4);
            } finally {
                context.recycle();
            }
        } else {
            this.f11616l = a;
            this.f11617m = a2;
            this.f11618n = a3;
            this.f11619o = a4;
            this.f11620p = a5;
            this.f11621q = a6;
            this.f11609e.setColor(-1);
            this.f11614j.setColor(m14048a(-1));
            this.f11610f.setColor(m14063c(-1));
            this.f11611g.setColor(m14060b(-1));
            this.f11612h.setColor(-1291845888);
            this.f11615k = null;
        }
        this.f11624t = new StringBuilder();
        this.f11625u = new Formatter(this.f11624t, Locale.getDefault());
        this.f11626v = new C22591(this);
        if (this.f11615k != null) {
            this.f11622r = (this.f11615k.getMinimumWidth() + 1) / 2;
        } else {
            this.f11622r = (Math.max(this.f11620p, Math.max(this.f11619o, this.f11621q)) + 1) / 2;
        }
        this.f11599E = -9223372036854775807L;
        this.f11629y = -9223372036854775807L;
        this.f11628x = 20;
        setFocusable(true);
        if (C2314v.f6956a >= 16) {
            m14051a();
        }
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f11609e.setColor(i);
        invalidate(this.f11605a);
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f11614j.setColor(i);
        invalidate(this.f11605a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f11610f.setColor(i);
        invalidate(this.f11605a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f11611g.setColor(i);
        invalidate(this.f11605a);
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.f11612h.setColor(i);
        invalidate(this.f11605a);
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f11613i.setColor(i);
        invalidate(this.f11605a);
    }

    public void addListener(OnScrubListener onScrubListener) {
        this.f11627w.add(onScrubListener);
    }

    public void removeListener(OnScrubListener onScrubListener) {
        this.f11627w.remove(onScrubListener);
    }

    public void setKeyTimeIncrement(long j) {
        C2289a.m8311a(j > 0);
        this.f11628x = -1;
        this.f11629y = j;
    }

    public void setKeyCountIncrement(int i) {
        C2289a.m8311a(i > 0);
        this.f11628x = i;
        this.f11629y = -9223372036854775807L;
    }

    public void setPosition(long j) {
        this.f11600F = j;
        setContentDescription(getProgressText());
        m14064c();
    }

    public void setBufferedPosition(long j) {
        this.f11601G = j;
        m14064c();
    }

    public void setDuration(long j) {
        this.f11599E = j;
        if (this.f11597C && j == -9223372036854775807L) {
            m14055a((boolean) 1);
        }
        m14064c();
    }

    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        boolean z;
        if (i != 0) {
            if (jArr == null || zArr == null) {
                z = false;
                C2289a.m8311a(z);
                this.f11602H = i;
                this.f11603I = jArr;
                this.f11604J = zArr;
                m14064c();
            }
        }
        z = true;
        C2289a.m8311a(z);
        this.f11602H = i;
        this.f11603I = jArr;
        this.f11604J = zArr;
        m14064c();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f11597C && !z) {
            m14055a(true);
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        m14053a(canvas);
        m14062b(canvas);
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (isEnabled()) {
            if (this.f11599E > 0) {
                Point a = m14050a(motionEvent);
                int i = a.x;
                int i2 = a.y;
                switch (motionEvent.getAction()) {
                    case 0:
                        float f = (float) i;
                        if (m14056a(f, (float) i2)) {
                            m14052a(f);
                            m14061b();
                            this.f11598D = getScrubberPosition();
                            m14064c();
                            invalidate();
                            return true;
                        }
                        break;
                    case 1:
                    case 3:
                        if (this.f11597C) {
                            if (motionEvent.getAction() == 3) {
                                z = true;
                            }
                            m14055a(z);
                            return true;
                        }
                        break;
                    case 2:
                        if (this.f11597C != null) {
                            if (i2 < this.f11623s) {
                                m14052a((float) (this.f11630z + ((i - this.f11630z) / 3)));
                            } else {
                                this.f11630z = i;
                                m14052a((float) i);
                            }
                            this.f11598D = getScrubberPosition();
                            motionEvent = this.f11627w.iterator();
                            while (motionEvent.hasNext()) {
                                ((OnScrubListener) motionEvent.next()).onScrubMove(this, this.f11598D);
                            }
                            m14064c();
                            invalidate();
                            return true;
                        }
                        break;
                    default:
                        break;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
        r4 = this;
        r0 = r4.isEnabled();
        if (r0 == 0) goto L_0x0036;
    L_0x0006:
        r0 = r4.getPositionIncrement();
        r2 = 66;
        r3 = 1;
        if (r5 == r2) goto L_0x0027;
    L_0x000f:
        switch(r5) {
            case 21: goto L_0x0013;
            case 22: goto L_0x0014;
            case 23: goto L_0x0027;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x0036;
    L_0x0013:
        r0 = -r0;
    L_0x0014:
        r0 = r4.m14057a(r0);
        if (r0 == 0) goto L_0x0036;
    L_0x001a:
        r5 = r4.f11626v;
        r4.removeCallbacks(r5);
        r5 = r4.f11626v;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4.postDelayed(r5, r0);
        return r3;
    L_0x0027:
        r0 = r4.f11597C;
        if (r0 == 0) goto L_0x0036;
    L_0x002b:
        r5 = r4.f11626v;
        r4.removeCallbacks(r5);
        r5 = r4.f11626v;
        r5.run();
        return r3;
    L_0x0036:
        r5 = super.onKeyDown(r5, r6);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m14066d();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f11615k != null) {
            this.f11615k.jumpToCurrentState();
        }
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == 0) {
            i2 = this.f11617m;
        } else if (mode != 1073741824) {
            i2 = Math.min(this.f11617m, i2);
        }
        setMeasuredDimension(MeasureSpec.getSize(i), i2);
        m14066d();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 = ((i4 - i2) - this.f11617m) / 2;
        i = ((this.f11617m - this.f11616l) / 2) + i4;
        this.f11605a.set(getPaddingLeft(), i4, i3 - getPaddingRight(), this.f11617m + i4);
        this.f11606b.set(this.f11605a.left + this.f11622r, i, this.f11605a.right - this.f11622r, this.f11616l + i);
        m14064c();
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.f11615k != null && m14059a(this.f11615k, i) != 0) {
            invalidate();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(DefaultTimeBar.class.getName());
    }

    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DefaultTimeBar.class.getCanonicalName());
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f11599E > 0) {
            if (C2314v.f6956a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else if (C2314v.f6956a >= 16) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }
    }

    @TargetApi(16)
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle) != null) {
            return true;
        }
        if (this.f11599E <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m14057a(-getPositionIncrement()) != 0) {
                m14055a(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (m14057a(getPositionIncrement()) != 0) {
                m14055a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @TargetApi(16)
    /* renamed from: a */
    private void m14051a() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: b */
    private void m14061b() {
        this.f11597C = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f11627w.iterator();
        while (it.hasNext()) {
            ((OnScrubListener) it.next()).onScrubStart(this, getScrubberPosition());
        }
    }

    /* renamed from: a */
    private void m14055a(boolean z) {
        this.f11597C = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f11627w.iterator();
        while (it.hasNext()) {
            ((OnScrubListener) it.next()).onScrubStop(this, getScrubberPosition(), z);
        }
    }

    /* renamed from: c */
    private void m14064c() {
        this.f11607c.set(this.f11606b);
        this.f11608d.set(this.f11606b);
        long j = this.f11597C ? this.f11598D : this.f11600F;
        if (this.f11599E > 0) {
            this.f11607c.right = Math.min(this.f11606b.left + ((int) ((((long) this.f11606b.width()) * this.f11601G) / this.f11599E)), this.f11606b.right);
            this.f11608d.right = Math.min(this.f11606b.left + ((int) ((((long) this.f11606b.width()) * j) / this.f11599E)), this.f11606b.right);
        } else {
            this.f11607c.right = this.f11606b.left;
            this.f11608d.right = this.f11606b.left;
        }
        invalidate(this.f11605a);
    }

    /* renamed from: a */
    private void m14052a(float f) {
        this.f11608d.right = C2314v.m8456a((int) f, this.f11606b.left, this.f11606b.right);
    }

    /* renamed from: a */
    private Point m14050a(MotionEvent motionEvent) {
        if (this.f11595A == null) {
            this.f11595A = new int[2];
            this.f11596B = new Point();
        }
        getLocationOnScreen(this.f11595A);
        this.f11596B.set(((int) motionEvent.getRawX()) - this.f11595A[0], ((int) motionEvent.getRawY()) - this.f11595A[1]);
        return this.f11596B;
    }

    private long getScrubberPosition() {
        if (this.f11606b.width() > 0) {
            if (this.f11599E != -9223372036854775807L) {
                return (((long) this.f11608d.width()) * this.f11599E) / ((long) this.f11606b.width());
            }
        }
        return 0;
    }

    /* renamed from: a */
    private boolean m14056a(float f, float f2) {
        return this.f11605a.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    private void m14053a(Canvas canvas) {
        int height = this.f11606b.height();
        int centerY = this.f11606b.centerY() - (height / 2);
        height += centerY;
        if (this.f11599E <= 0) {
            canvas.drawRect((float) this.f11606b.left, (float) centerY, (float) this.f11606b.right, (float) height, this.f11611g);
            return;
        }
        int i = this.f11607c.left;
        int i2 = this.f11607c.right;
        int max = Math.max(Math.max(this.f11606b.left, i2), this.f11608d.right);
        if (max < this.f11606b.right) {
            canvas.drawRect((float) max, (float) centerY, (float) this.f11606b.right, (float) height, this.f11611g);
        }
        i = Math.max(i, this.f11608d.right);
        if (i2 > i) {
            canvas.drawRect((float) i, (float) centerY, (float) i2, (float) height, this.f11610f);
        }
        if (this.f11608d.width() > 0) {
            canvas.drawRect((float) this.f11608d.left, (float) centerY, (float) this.f11608d.right, (float) height, this.f11609e);
        }
        i = this.f11618n / 2;
        for (max = 0; max < this.f11602H; max++) {
            int min = this.f11606b.left + Math.min(this.f11606b.width() - this.f11618n, Math.max(0, ((int) ((((long) this.f11606b.width()) * C2314v.m8462a(this.f11603I[max], 0, this.f11599E)) / this.f11599E)) - i));
            canvas.drawRect((float) min, (float) centerY, (float) (min + this.f11618n), (float) height, this.f11604J[max] ? this.f11613i : this.f11612h);
        }
    }

    /* renamed from: b */
    private void m14062b(Canvas canvas) {
        if (this.f11599E > 0) {
            int a = C2314v.m8456a(this.f11608d.right, this.f11608d.left, this.f11606b.right);
            int centerY = this.f11608d.centerY();
            int i;
            if (this.f11615k == null) {
                if (!this.f11597C) {
                    if (!isFocused()) {
                        i = isEnabled() ? this.f11619o : this.f11620p;
                        canvas.drawCircle((float) a, (float) centerY, (float) (i / 2), this.f11614j);
                    }
                }
                i = this.f11621q;
                canvas.drawCircle((float) a, (float) centerY, (float) (i / 2), this.f11614j);
            } else {
                i = this.f11615k.getIntrinsicWidth() / 2;
                int intrinsicHeight = this.f11615k.getIntrinsicHeight() / 2;
                this.f11615k.setBounds(a - i, centerY - intrinsicHeight, a + i, centerY + intrinsicHeight);
                this.f11615k.draw(canvas);
            }
        }
    }

    /* renamed from: d */
    private void m14066d() {
        if (this.f11615k != null && this.f11615k.isStateful() && this.f11615k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private String getProgressText() {
        return C2314v.m8467a(this.f11624t, this.f11625u, this.f11600F);
    }

    private long getPositionIncrement() {
        if (this.f11629y == -9223372036854775807L) {
            return this.f11599E == -9223372036854775807L ? 0 : this.f11599E / ((long) this.f11628x);
        } else {
            return this.f11629y;
        }
    }

    /* renamed from: a */
    private boolean m14057a(long j) {
        if (this.f11599E <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        this.f11598D = C2314v.m8462a(scrubberPosition + j, 0, this.f11599E);
        if (this.f11598D == scrubberPosition) {
            return false;
        }
        if (this.f11597C == null) {
            m14061b();
        }
        j = this.f11627w.iterator();
        while (j.hasNext()) {
            ((OnScrubListener) j.next()).onScrubMove(this, this.f11598D);
        }
        m14064c();
        return 1;
    }

    /* renamed from: a */
    private boolean m14058a(Drawable drawable) {
        return (C2314v.f6956a < 23 || m14059a(drawable, getLayoutDirection()) == null) ? null : true;
    }

    /* renamed from: a */
    private static boolean m14059a(Drawable drawable, int i) {
        return (C2314v.f6956a < 23 || drawable.setLayoutDirection(i) == null) ? null : true;
    }

    /* renamed from: a */
    private static int m14049a(DisplayMetrics displayMetrics, int i) {
        return (int) ((((float) i) * displayMetrics.density) + 1056964608);
    }
}
