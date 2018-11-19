package android.support.v4.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.n */
public class C0650n {
    /* renamed from: v */
    private static final Interpolator f1988v = new C06471();
    /* renamed from: a */
    private int f1989a;
    /* renamed from: b */
    private int f1990b;
    /* renamed from: c */
    private int f1991c = -1;
    /* renamed from: d */
    private float[] f1992d;
    /* renamed from: e */
    private float[] f1993e;
    /* renamed from: f */
    private float[] f1994f;
    /* renamed from: g */
    private float[] f1995g;
    /* renamed from: h */
    private int[] f1996h;
    /* renamed from: i */
    private int[] f1997i;
    /* renamed from: j */
    private int[] f1998j;
    /* renamed from: k */
    private int f1999k;
    /* renamed from: l */
    private VelocityTracker f2000l;
    /* renamed from: m */
    private float f2001m;
    /* renamed from: n */
    private float f2002n;
    /* renamed from: o */
    private int f2003o;
    /* renamed from: p */
    private int f2004p;
    /* renamed from: q */
    private OverScroller f2005q;
    /* renamed from: r */
    private final C0649a f2006r;
    /* renamed from: s */
    private View f2007s;
    /* renamed from: t */
    private boolean f2008t;
    /* renamed from: u */
    private final ViewGroup f2009u;
    /* renamed from: w */
    private final Runnable f2010w = new C06482(this);

    /* renamed from: android.support.v4.widget.n$1 */
    static class C06471 implements Interpolator {
        public float getInterpolation(float f) {
            f -= 1.0f;
            return ((((f * f) * f) * f) * f) + 1.0f;
        }

        C06471() {
        }
    }

    /* renamed from: android.support.v4.widget.n$2 */
    class C06482 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0650n f1987a;

        C06482(C0650n c0650n) {
            this.f1987a = c0650n;
        }

        public void run() {
            this.f1987a.m2641c(0);
        }
    }

    /* renamed from: android.support.v4.widget.n$a */
    public static abstract class C0649a {
        /* renamed from: a */
        public int mo224a(@NonNull View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo225a(@NonNull View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo226a(int i) {
        }

        /* renamed from: a */
        public void mo600a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo227a(@NonNull View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo228a(@NonNull View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo229a(@NonNull View view, int i);

        /* renamed from: b */
        public int mo255b(@NonNull View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo230b(@NonNull View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo601b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo256b(@NonNull View view, int i) {
        }

        /* renamed from: b */
        public boolean mo602b(int i) {
            return false;
        }

        /* renamed from: c */
        public int m2605c(int i) {
            return i;
        }
    }

    /* renamed from: a */
    public static C0650n m2611a(@NonNull ViewGroup viewGroup, @NonNull C0649a c0649a) {
        return new C0650n(viewGroup.getContext(), viewGroup, c0649a);
    }

    /* renamed from: a */
    public static C0650n m2610a(@NonNull ViewGroup viewGroup, float f, @NonNull C0649a c0649a) {
        viewGroup = C0650n.m2611a(viewGroup, c0649a);
        viewGroup.f1990b = (int) (((float) viewGroup.f1990b) * (1.0f / f));
        return viewGroup;
    }

    private C0650n(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull C0649a c0649a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (c0649a == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f2009u = viewGroup;
            this.f2006r = c0649a;
            viewGroup = ViewConfiguration.get(context);
            this.f2003o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f1990b = viewGroup.getScaledTouchSlop();
            this.f2001m = (float) viewGroup.getScaledMaximumFlingVelocity();
            this.f2002n = (float) viewGroup.getScaledMinimumFlingVelocity();
            this.f2005q = new OverScroller(context, f1988v);
        }
    }

    /* renamed from: a */
    public int m2627a() {
        return this.f1989a;
    }

    /* renamed from: a */
    public void m2628a(int i) {
        this.f2004p = i;
    }

    /* renamed from: b */
    public int m2634b() {
        return this.f2003o;
    }

    /* renamed from: a */
    public void m2629a(@NonNull View view, int i) {
        if (view.getParent() != this.f2009u) {
            i = new StringBuilder();
            i.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            i.append(this.f2009u);
            i.append(")");
            throw new IllegalArgumentException(i.toString());
        }
        this.f2007s = view;
        this.f1991c = i;
        this.f2006r.mo256b(view, i);
        m2641c(1);
    }

    @Nullable
    /* renamed from: c */
    public View m2640c() {
        return this.f2007s;
    }

    /* renamed from: d */
    public int m2643d() {
        return this.f1990b;
    }

    /* renamed from: e */
    public void m2646e() {
        this.f1991c = -1;
        m2624g();
        if (this.f2000l != null) {
            this.f2000l.recycle();
            this.f2000l = null;
        }
    }

    /* renamed from: f */
    public void m2647f() {
        m2646e();
        if (this.f1989a == 2) {
            int currX = this.f2005q.getCurrX();
            int currY = this.f2005q.getCurrY();
            this.f2005q.abortAnimation();
            int currX2 = this.f2005q.getCurrX();
            int currY2 = this.f2005q.getCurrY();
            this.f2006r.mo228a(this.f2007s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m2641c(0);
    }

    /* renamed from: a */
    public boolean m2632a(@NonNull View view, int i, int i2) {
        this.f2007s = view;
        this.f1991c = -1;
        view = m2615a(i, i2, 0, 0);
        if (view == null && this.f1989a == 0 && this.f2007s != 0) {
            this.f2007s = 0;
        }
        return view;
    }

    /* renamed from: a */
    public boolean m2630a(int i, int i2) {
        if (this.f2008t) {
            return m2615a(i, i2, (int) this.f2000l.getXVelocity(this.f1991c), (int) this.f2000l.getYVelocity(this.f1991c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m2615a(int i, int i2, int i3, int i4) {
        int left = this.f2007s.getLeft();
        int top = this.f2007s.getTop();
        i -= left;
        i2 -= top;
        if (i == 0 && i2 == 0) {
            this.f2005q.abortAnimation();
            m2641c(0);
            return false;
        }
        this.f2005q.startScroll(left, top, i, i2, m2609a(this.f2007s, i, i2, i3, i4));
        m2641c(2);
        return true;
    }

    /* renamed from: a */
    private int m2609a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        i3 = m2617b(i3, (int) this.f2002n, (int) this.f2001m);
        i4 = m2617b(i4, (int) this.f2002n, (int) this.f2001m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i3);
        int abs4 = Math.abs(i4);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (i3 != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        f /= f2;
        if (i4 != 0) {
            f3 = (float) abs4;
            f2 = (float) i5;
        } else {
            f3 = (float) abs2;
            f2 = (float) i6;
        }
        f3 /= f2;
        return (int) ((((float) m2608a(i, i3, this.f2006r.mo255b(view))) * f) + (((float) m2608a(i2, i4, this.f2006r.mo224a(view))) * f3));
    }

    /* renamed from: a */
    private int m2608a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f2009u.getWidth();
        float f = (float) (width / 2);
        f += m2606a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f;
        i2 = Math.abs(i2);
        if (i2 > 0) {
            i = Math.round(Math.abs(f / ((float) i2)) * 1148846080) * 4;
        } else {
            i = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1065353216) * 1132462080);
        }
        return Math.min(i, 600);
    }

    /* renamed from: b */
    private int m2617b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private float m2607a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: a */
    private float m2606a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a */
    public boolean m2633a(boolean z) {
        if (this.f1989a == 2) {
            boolean computeScrollOffset = this.f2005q.computeScrollOffset();
            int currX = this.f2005q.getCurrX();
            int currY = this.f2005q.getCurrY();
            int left = currX - this.f2007s.getLeft();
            int top = currY - this.f2007s.getTop();
            if (left != 0) {
                ViewCompat.m2205d(this.f2007s, left);
            }
            if (top != 0) {
                ViewCompat.m2202c(this.f2007s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f2006r.mo228a(this.f2007s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f2005q.getFinalX() && currY == this.f2005q.getFinalY()) {
                this.f2005q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f2009u.post(this.f2010w);
                } else {
                    m2641c(0);
                }
            }
        }
        if (this.f1989a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2612a(float f, float f2) {
        this.f2008t = true;
        this.f2006r.mo227a(this.f2007s, f, f2);
        this.f2008t = false;
        if (this.f1989a == Float.MIN_VALUE) {
            m2641c(0);
        }
    }

    /* renamed from: g */
    private void m2624g() {
        if (this.f1992d != null) {
            Arrays.fill(this.f1992d, 0.0f);
            Arrays.fill(this.f1993e, 0.0f);
            Arrays.fill(this.f1994f, 0.0f);
            Arrays.fill(this.f1995g, 0.0f);
            Arrays.fill(this.f1996h, 0);
            Arrays.fill(this.f1997i, 0);
            Arrays.fill(this.f1998j, 0);
            this.f1999k = 0;
        }
    }

    /* renamed from: e */
    private void m2622e(int i) {
        if (this.f1992d != null) {
            if (m2636b(i)) {
                this.f1992d[i] = 0.0f;
                this.f1993e[i] = 0.0f;
                this.f1994f[i] = 0.0f;
                this.f1995g[i] = 0.0f;
                this.f1996h[i] = 0;
                this.f1997i[i] = 0;
                this.f1998j[i] = 0;
                this.f1999k = ((1 << i) ^ -1) & this.f1999k;
            }
        }
    }

    /* renamed from: f */
    private void m2623f(int i) {
        if (this.f1992d == null || this.f1992d.length <= i) {
            i++;
            Object obj = new float[i];
            Object obj2 = new float[i];
            Object obj3 = new float[i];
            Object obj4 = new float[i];
            Object obj5 = new int[i];
            Object obj6 = new int[i];
            i = new int[i];
            if (this.f1992d != null) {
                System.arraycopy(this.f1992d, 0, obj, 0, this.f1992d.length);
                System.arraycopy(this.f1993e, 0, obj2, 0, this.f1993e.length);
                System.arraycopy(this.f1994f, 0, obj3, 0, this.f1994f.length);
                System.arraycopy(this.f1995g, 0, obj4, 0, this.f1995g.length);
                System.arraycopy(this.f1996h, 0, obj5, 0, this.f1996h.length);
                System.arraycopy(this.f1997i, 0, obj6, 0, this.f1997i.length);
                System.arraycopy(this.f1998j, 0, i, 0, this.f1998j.length);
            }
            this.f1992d = obj;
            this.f1993e = obj2;
            this.f1994f = obj3;
            this.f1995g = obj4;
            this.f1996h = obj5;
            this.f1997i = obj6;
            this.f1998j = i;
        }
    }

    /* renamed from: a */
    private void m2613a(float f, float f2, int i) {
        m2623f(i);
        float[] fArr = this.f1992d;
        this.f1994f[i] = f;
        fArr[i] = f;
        fArr = this.f1993e;
        this.f1995g[i] = f2;
        fArr[i] = f2;
        this.f1996h[i] = m2621e((int) f, (int) f2);
        this.f1999k |= Float.MIN_VALUE << i;
    }

    /* renamed from: c */
    private void m2620c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2625g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1994f[pointerId] = x;
                this.f1995g[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    public boolean m2636b(int i) {
        return ((1 << i) & this.f1999k) != 0;
    }

    /* renamed from: c */
    void m2641c(int i) {
        this.f2009u.removeCallbacks(this.f2010w);
        if (this.f1989a != i) {
            this.f1989a = i;
            this.f2006r.mo226a(i);
            if (this.f1989a == 0) {
                this.f2007s = 0;
            }
        }
    }

    /* renamed from: b */
    boolean m2638b(View view, int i) {
        if (view == this.f2007s && this.f1991c == i) {
            return true;
        }
        if (view == null || !this.f2006r.mo229a(view, i)) {
            return null;
        }
        this.f1991c = i;
        m2629a(view, i);
        return true;
    }

    /* renamed from: a */
    public boolean m2631a(@NonNull MotionEvent motionEvent) {
        boolean z;
        C0650n c0650n = this;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2646e();
        }
        if (c0650n.f2000l == null) {
            c0650n.f2000l = VelocityTracker.obtain();
        }
        c0650n.f2000l.addMovement(motionEvent2);
        int pointerId;
        float x;
        switch (actionMasked) {
            case 0:
                float x2 = motionEvent.getX();
                float y = motionEvent.getY();
                z = false;
                pointerId = motionEvent2.getPointerId(0);
                m2613a(x2, y, pointerId);
                View d = m2644d((int) x2, (int) y);
                if (d == c0650n.f2007s && c0650n.f1989a == 2) {
                    m2638b(d, pointerId);
                }
                actionMasked = c0650n.f1996h[pointerId];
                if ((c0650n.f2004p & actionMasked) != 0) {
                    c0650n.f2006r.mo600a(actionMasked & c0650n.f2004p, pointerId);
                    break;
                }
                break;
            case 1:
            case 3:
                m2646e();
                break;
            case 2:
                if (c0650n.f1992d != null) {
                    if (c0650n.f1993e == null) {
                        break;
                    }
                    actionMasked = motionEvent.getPointerCount();
                    for (actionIndex = 0; actionIndex < actionMasked; actionIndex++) {
                        int pointerId2 = motionEvent2.getPointerId(actionIndex);
                        if (m2625g(pointerId2)) {
                            x = motionEvent2.getX(actionIndex);
                            float y2 = motionEvent2.getY(actionIndex);
                            float f = x - c0650n.f1992d[pointerId2];
                            float f2 = y2 - c0650n.f1993e[pointerId2];
                            View d2 = m2644d((int) x, (int) y2);
                            Object obj = (d2 == null || !m2616a(d2, f, f2)) ? null : 1;
                            if (obj != null) {
                                int left = d2.getLeft();
                                int i = (int) f;
                                i = c0650n.f2006r.mo230b(d2, left + i, i);
                                int top = d2.getTop();
                                int i2 = (int) f2;
                                int a = c0650n.f2006r.mo225a(d2, top + i2, i2);
                                i2 = c0650n.f2006r.mo255b(d2);
                                int a2 = c0650n.f2006r.mo224a(d2);
                                if (i2 == 0 || (i2 > 0 && i == left)) {
                                    if (a2 != 0) {
                                        if (a2 > 0 && a == top) {
                                        }
                                    }
                                    m2620c(motionEvent);
                                    break;
                                }
                            }
                            m2618b(f, f2, pointerId2);
                            if (c0650n.f1989a != 1) {
                                if (obj != null && m2638b(d2, pointerId2)) {
                                }
                            }
                            m2620c(motionEvent);
                        }
                    }
                    m2620c(motionEvent);
                }
                break;
            case 5:
                actionMasked = motionEvent2.getPointerId(actionIndex);
                x = motionEvent2.getX(actionIndex);
                float y3 = motionEvent2.getY(actionIndex);
                m2613a(x, y3, actionMasked);
                if (c0650n.f1989a != 0) {
                    if (c0650n.f1989a == 2) {
                        View d3 = m2644d((int) x, (int) y3);
                        if (d3 == c0650n.f2007s) {
                            m2638b(d3, actionMasked);
                            break;
                        }
                    }
                }
                pointerId = c0650n.f1996h[actionMasked];
                if ((c0650n.f2004p & pointerId) != 0) {
                    c0650n.f2006r.mo600a(pointerId & c0650n.f2004p, actionMasked);
                    break;
                }
                break;
            case 6:
                m2622e(motionEvent2.getPointerId(actionIndex));
                break;
        }
        z = false;
        return c0650n.f1989a == 1 ? true : z;
    }

    /* renamed from: b */
    public void m2635b(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2646e();
        }
        if (this.f2000l == null) {
            this.f2000l = VelocityTracker.obtain();
        }
        this.f2000l.addMovement(motionEvent);
        int i = 0;
        float y;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View d = m2644d((int) x, (int) y);
                m2613a(x, y, pointerId);
                m2638b(d, pointerId);
                actionMasked = this.f1996h[pointerId];
                if ((this.f2004p & actionMasked) != 0) {
                    this.f2006r.mo600a(actionMasked & this.f2004p, pointerId);
                    return;
                }
                return;
            case 1:
                if (this.f1989a == 1) {
                    m2626h();
                }
                m2646e();
                return;
            case 2:
                if (this.f1989a != 1) {
                    actionMasked = motionEvent.getPointerCount();
                    while (i < actionMasked) {
                        actionIndex = motionEvent.getPointerId(i);
                        if (m2625g(actionIndex)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f1992d[actionIndex];
                            float f2 = y2 - this.f1993e[actionIndex];
                            m2618b(f, f2, actionIndex);
                            if (this.f1989a != 1) {
                                View d2 = m2644d((int) x2, (int) y2);
                                if (m2616a(d2, f, f2) && m2638b(d2, actionIndex)) {
                                }
                            }
                            m2620c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    m2620c(motionEvent);
                    return;
                } else if (m2625g(this.f1991c)) {
                    actionMasked = motionEvent.findPointerIndex(this.f1991c);
                    y = motionEvent.getX(actionMasked);
                    actionIndex = (int) (y - this.f1994f[this.f1991c]);
                    actionMasked = (int) (motionEvent.getY(actionMasked) - this.f1995g[this.f1991c]);
                    m2619b(this.f2007s.getLeft() + actionIndex, this.f2007s.getTop() + actionMasked, actionIndex, actionMasked);
                    m2620c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f1989a == 1) {
                    m2612a(0.0f, 0.0f);
                }
                m2646e();
                return;
            case 5:
                actionMasked = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m2613a(x3, y3, actionMasked);
                if (this.f1989a == 0) {
                    m2638b(m2644d((int) x3, (int) y3), actionMasked);
                    motionEvent = this.f1996h[actionMasked];
                    if ((this.f2004p & motionEvent) != 0) {
                        this.f2006r.mo600a(motionEvent & this.f2004p, actionMasked);
                        return;
                    }
                    return;
                } else if (m2642c((int) x3, (int) y3) != null) {
                    m2638b(this.f2007s, actionMasked);
                    return;
                } else {
                    return;
                }
            case 6:
                actionMasked = motionEvent.getPointerId(actionIndex);
                if (this.f1989a == 1 && actionMasked == this.f1991c) {
                    actionIndex = motionEvent.getPointerCount();
                    while (i < actionIndex) {
                        int pointerId2 = motionEvent.getPointerId(i);
                        if (pointerId2 != this.f1991c) {
                            if (m2644d((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.f2007s && m2638b(this.f2007s, pointerId2)) {
                                motionEvent = this.f1991c;
                                if (motionEvent == -1) {
                                    m2626h();
                                }
                            }
                        }
                        i++;
                    }
                    motionEvent = -1;
                    if (motionEvent == -1) {
                        m2626h();
                    }
                }
                m2622e(actionMasked);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m2618b(float f, float f2, int i) {
        int i2 = 1;
        if (!m2614a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m2614a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2614a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2614a(f2, f, i, 8) != null) {
            i2 |= 8;
        }
        if (i2 != 0) {
            f = this.f1997i;
            f[i] = f[i] | i2;
            this.f2006r.mo601b(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m2614a(float f, float f2, int i, int i2) {
        f = Math.abs(f);
        f2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f1996h[i] & i2) != i2 || (this.f2004p & i2) == 0 || (this.f1998j[i] & i2) == i2 || (this.f1997i[i] & i2) == i2)) {
            if (f > ((float) this.f1990b) || f2 > ((float) this.f1990b)) {
                if (f >= f2 * 0.5f || this.f2006r.mo602b(i2) == null) {
                    if ((this.f1997i[i] & i2) == null && f > ((float) this.f1990b)) {
                        z = true;
                    }
                    return z;
                }
                f = this.f1998j;
                f[i] = f[i] | i2;
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2616a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Object obj = this.f2006r.mo255b(view) > 0 ? 1 : null;
        view = this.f2006r.mo224a(view) > null ? true : null;
        if (obj != null && view != null) {
            if ((f * f) + (f2 * f2) > ((float) (this.f1990b * this.f1990b))) {
                z = true;
            }
            return z;
        } else if (obj != null) {
            if (Math.abs(f) > ((float) this.f1990b)) {
                z = true;
            }
            return z;
        } else if (view == null) {
            return false;
        } else {
            if (Math.abs(f2) > ((float) this.f1990b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: d */
    public boolean m2645d(int i) {
        int length = this.f1992d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m2637b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m2637b(int i, int i2) {
        boolean z = false;
        if (!m2636b(i2)) {
            return false;
        }
        Object obj = (i & 1) == 1 ? 1 : null;
        i = (i & 2) == 2 ? 1 : 0;
        float f = this.f1994f[i2] - this.f1992d[i2];
        float f2 = this.f1995g[i2] - this.f1993e[i2];
        if (obj != null && i != 0) {
            if ((f * f) + (f2 * f2) > ((float) (this.f1990b * this.f1990b))) {
                z = true;
            }
            return z;
        } else if (obj != null) {
            if (Math.abs(f) > ((float) this.f1990b)) {
                z = true;
            }
            return z;
        } else if (i == 0) {
            return false;
        } else {
            if (Math.abs(f2) > ((float) this.f1990b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: h */
    private void m2626h() {
        this.f2000l.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.f2001m);
        m2612a(m2607a(this.f2000l.getXVelocity(this.f1991c), this.f2002n, this.f2001m), m2607a(this.f2000l.getYVelocity(this.f1991c), this.f2002n, this.f2001m));
    }

    /* renamed from: b */
    private void m2619b(int i, int i2, int i3, int i4) {
        int left = this.f2007s.getLeft();
        int top = this.f2007s.getTop();
        if (i3 != 0) {
            i = this.f2006r.mo230b(this.f2007s, i, i3);
            ViewCompat.m2205d(this.f2007s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f2006r.mo225a(this.f2007s, i2, i4);
            ViewCompat.m2202c(this.f2007s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f2006r.mo228a(this.f2007s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: c */
    public boolean m2642c(int i, int i2) {
        return m2639b(this.f2007s, i, i2);
    }

    /* renamed from: b */
    public boolean m2639b(@Nullable View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    @Nullable
    /* renamed from: d */
    public View m2644d(int i, int i2) {
        for (int childCount = this.f2009u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2009u.getChildAt(this.f2006r.m2605c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return 0;
    }

    /* renamed from: e */
    private int m2621e(int i, int i2) {
        int i3 = i < this.f2009u.getLeft() + this.f2003o ? 1 : 0;
        if (i2 < this.f2009u.getTop() + this.f2003o) {
            i3 |= 4;
        }
        if (i > this.f2009u.getRight() - this.f2003o) {
            i3 |= 2;
        }
        return i2 > this.f2009u.getBottom() - this.f2003o ? i3 | 8 : i3;
    }

    /* renamed from: g */
    private boolean m2625g(int i) {
        if (m2636b(i)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring pointerId=");
        stringBuilder.append(i);
        stringBuilder.append(" because ACTION_DOWN was not received ");
        stringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
        stringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", stringBuilder.toString());
        return false;
    }
}
