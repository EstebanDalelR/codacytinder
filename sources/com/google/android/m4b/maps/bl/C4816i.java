package com.google.android.m4b.maps.bl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bl.i */
public final class C4816i {
    /* renamed from: A */
    private float f17568A;
    /* renamed from: B */
    private float f17569B;
    /* renamed from: C */
    private long f17570C;
    /* renamed from: D */
    private float f17571D;
    /* renamed from: E */
    private float f17572E;
    /* renamed from: F */
    private float f17573F;
    /* renamed from: G */
    private boolean f17574G;
    /* renamed from: H */
    private boolean f17575H;
    /* renamed from: I */
    private boolean f17576I;
    /* renamed from: J */
    private boolean f17577J;
    /* renamed from: K */
    private C4811g f17578K;
    /* renamed from: a */
    private Context f17579a;
    /* renamed from: b */
    private MotionEvent f17580b;
    /* renamed from: c */
    private MotionEvent f17581c;
    /* renamed from: d */
    private final List<C4809e> f17582d = new ArrayList();
    /* renamed from: e */
    private final List<C4809e> f17583e = new ArrayList();
    /* renamed from: f */
    private final C4809e f17584f;
    /* renamed from: g */
    private final C4809e f17585g;
    /* renamed from: h */
    private final C4809e f17586h;
    /* renamed from: i */
    private final C4809e f17587i;
    /* renamed from: j */
    private final LinkedList<C4812h> f17588j = new LinkedList();
    /* renamed from: k */
    private long f17589k;
    /* renamed from: l */
    private float f17590l;
    /* renamed from: m */
    private float f17591m;
    /* renamed from: n */
    private float f17592n;
    /* renamed from: o */
    private float f17593o;
    /* renamed from: p */
    private float f17594p;
    /* renamed from: q */
    private float f17595q;
    /* renamed from: r */
    private float f17596r;
    /* renamed from: s */
    private float f17597s;
    /* renamed from: t */
    private float f17598t;
    /* renamed from: u */
    private float f17599u;
    /* renamed from: v */
    private float f17600v;
    /* renamed from: w */
    private float f17601w;
    /* renamed from: x */
    private float f17602x;
    /* renamed from: y */
    private float f17603y;
    /* renamed from: z */
    private float f17604z;

    /* renamed from: com.google.android.m4b.maps.bl.i$a */
    public interface C4814a extends OnDoubleTapListener, OnGestureListener {
        /* renamed from: a */
        boolean mo5218a(C4817j c4817j);

        /* renamed from: a */
        boolean mo5219a(C4818l c4818l);

        /* renamed from: a */
        boolean mo5220a(C4819p c4819p);
    }

    /* renamed from: com.google.android.m4b.maps.bl.i$b */
    public interface C4815b extends OnDoubleTapListener, OnGestureListener {
        /* renamed from: a */
        boolean mo5059a(C4816i c4816i);

        /* renamed from: a */
        boolean mo5060a(C4816i c4816i, boolean z);

        /* renamed from: b */
        boolean mo5061b(C4816i c4816i);

        /* renamed from: b */
        boolean mo5062b(C4816i c4816i, boolean z);

        /* renamed from: c */
        void mo5063c(C4816i c4816i);

        /* renamed from: c */
        void mo5064c(C4816i c4816i, boolean z);

        /* renamed from: d */
        boolean mo5065d(C4816i c4816i);

        /* renamed from: e */
        boolean mo5066e(C4816i c4816i);

        /* renamed from: f */
        void mo5067f(C4816i c4816i);

        /* renamed from: g */
        boolean mo5068g(C4816i c4816i);

        /* renamed from: h */
        boolean mo5069h(C4816i c4816i);

        /* renamed from: i */
        void mo5070i(C4816i c4816i);
    }

    public C4816i(Context context, C4815b c4815b) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17579a = context;
        this.f17571D = (float) viewConfiguration.getScaledEdgeSlop();
        List list = this.f17582d;
        C4809e c7457q = new C7457q(c4815b);
        this.f17585g = c7457q;
        list.add(c7457q);
        if (C4725p.m21032i()) {
            list = this.f17582d;
            c7457q = new C6474k(c4815b);
            this.f17586h = c7457q;
            list.add(c7457q);
        } else {
            list = this.f17582d;
            c7457q = new C7456o(c4815b);
            this.f17586h = c7457q;
            list.add(c7457q);
        }
        list = this.f17582d;
        c7457q = new C6475m(c4815b);
        this.f17584f = c7457q;
        list.add(c7457q);
        list = this.f17582d;
        c7457q = new C6477s(c4815b);
        this.f17587i = c7457q;
        list.add(c7457q);
        this.f17578K = new C4811g(context, c4815b, new Handler(Looper.getMainLooper()));
        this.f17578K.m21333a(true);
        this.f17578K.m21332a((OnDoubleTapListener) c4815b);
    }

    /* renamed from: a */
    public final boolean m21368a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = (65280 & action) >> 8;
        int i2 = 0;
        if (!this.f17577J) {
            float f;
            float f2;
            float f3;
            float rawX;
            float rawY;
            float a;
            float b;
            Object obj;
            Object obj2;
            if (!(action == 5 || action == 261)) {
                if (action != 0) {
                    if (action == 2 && this.f17574G) {
                        f = this.f17571D;
                        f2 = this.f17572E;
                        f3 = this.f17573F;
                        rawX = motionEvent.getRawX();
                        rawY = motionEvent.getRawY();
                        a = C4816i.m21360a(motionEvent, motionEvent.getPointerCount() - 1);
                        b = C4816i.m21363b(motionEvent, motionEvent.getPointerCount() - 1);
                        if (rawX >= f && rawY >= f && rawX <= f2) {
                            if (rawY <= f3) {
                                obj = null;
                                if (a >= f && b >= f && a <= f2) {
                                    if (b > f3) {
                                        obj2 = null;
                                        if (obj == null && obj2 != null) {
                                            this.f17590l = -1.0f;
                                            this.f17591m = -1.0f;
                                        } else if (obj == null) {
                                            this.f17590l = motionEvent.getX(motionEvent.getPointerCount() - 1);
                                            this.f17591m = motionEvent.getY(motionEvent.getPointerCount() - 1);
                                        } else if (obj2 == null) {
                                            this.f17590l = motionEvent.getX(0);
                                            this.f17591m = motionEvent.getY(0);
                                        } else {
                                            this.f17574G = false;
                                            this.f17577J = true;
                                        }
                                    }
                                }
                                obj2 = 1;
                                if (obj == null) {
                                }
                                if (obj == null) {
                                    this.f17590l = motionEvent.getX(motionEvent.getPointerCount() - 1);
                                    this.f17591m = motionEvent.getY(motionEvent.getPointerCount() - 1);
                                } else if (obj2 == null) {
                                    this.f17574G = false;
                                    this.f17577J = true;
                                } else {
                                    this.f17590l = motionEvent.getX(0);
                                    this.f17591m = motionEvent.getY(0);
                                }
                            }
                        }
                        obj = 1;
                        if (b > f3) {
                            obj2 = null;
                            if (obj == null) {
                            }
                            if (obj == null) {
                                this.f17590l = motionEvent.getX(motionEvent.getPointerCount() - 1);
                                this.f17591m = motionEvent.getY(motionEvent.getPointerCount() - 1);
                            } else if (obj2 == null) {
                                this.f17590l = motionEvent.getX(0);
                                this.f17591m = motionEvent.getY(0);
                            } else {
                                this.f17574G = false;
                                this.f17577J = true;
                            }
                        } else {
                            obj2 = 1;
                            if (obj == null) {
                            }
                            if (obj == null) {
                                this.f17590l = motionEvent.getX(motionEvent.getPointerCount() - 1);
                                this.f17591m = motionEvent.getY(motionEvent.getPointerCount() - 1);
                            } else if (obj2 == null) {
                                this.f17574G = false;
                                this.f17577J = true;
                            } else {
                                this.f17590l = motionEvent.getX(0);
                                this.f17591m = motionEvent.getY(0);
                            }
                        }
                    } else if ((action == 6 || action == 262 || action == 1) && this.f17574G) {
                        if (i == 0) {
                            i2 = motionEvent.getPointerCount() - 1;
                        }
                        this.f17590l = motionEvent.getX(i2);
                        this.f17591m = motionEvent.getY(i2);
                    }
                }
            }
            DisplayMetrics displayMetrics = this.f17579a.getResources().getDisplayMetrics();
            this.f17572E = ((float) displayMetrics.widthPixels) - this.f17571D;
            this.f17573F = ((float) displayMetrics.heightPixels) - this.f17571D;
            m21366h();
            this.f17580b = MotionEvent.obtain(motionEvent);
            this.f17570C = 0;
            m21364b(motionEvent);
            f = this.f17571D;
            f2 = this.f17572E;
            f3 = this.f17573F;
            rawX = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            a = C4816i.m21360a(motionEvent, motionEvent.getPointerCount() - 1);
            b = C4816i.m21363b(motionEvent, motionEvent.getPointerCount() - 1);
            if (rawX >= f && rawY >= f && rawX <= f2) {
                if (rawY <= f3) {
                    obj = null;
                    if (a >= f && b >= f && a <= f2) {
                        if (b > f3) {
                            obj2 = null;
                            if (obj == null && obj2 != null) {
                                this.f17590l = -1.0f;
                                this.f17591m = -1.0f;
                                this.f17574G = true;
                            } else if (obj == null) {
                                this.f17590l = motionEvent.getX(motionEvent.getPointerCount() - 1);
                                this.f17591m = motionEvent.getY(motionEvent.getPointerCount() - 1);
                                this.f17574G = true;
                            } else if (obj2 == null) {
                                this.f17590l = motionEvent.getX(0);
                                this.f17591m = motionEvent.getY(0);
                                this.f17574G = true;
                            } else {
                                this.f17577J = true;
                            }
                        }
                    }
                    obj2 = 1;
                    if (obj == null) {
                    }
                    if (obj == null) {
                        this.f17590l = motionEvent.getX(motionEvent.getPointerCount() - 1);
                        this.f17591m = motionEvent.getY(motionEvent.getPointerCount() - 1);
                        this.f17574G = true;
                    } else if (obj2 == null) {
                        this.f17577J = true;
                    } else {
                        this.f17590l = motionEvent.getX(0);
                        this.f17591m = motionEvent.getY(0);
                        this.f17574G = true;
                    }
                }
            }
            obj = 1;
            if (b > f3) {
                obj2 = null;
                if (obj == null) {
                }
                if (obj == null) {
                    this.f17590l = motionEvent.getX(motionEvent.getPointerCount() - 1);
                    this.f17591m = motionEvent.getY(motionEvent.getPointerCount() - 1);
                    this.f17574G = true;
                } else if (obj2 == null) {
                    this.f17590l = motionEvent.getX(0);
                    this.f17591m = motionEvent.getY(0);
                    this.f17574G = true;
                } else {
                    this.f17577J = true;
                }
            } else {
                obj2 = 1;
                if (obj == null) {
                }
                if (obj == null) {
                    this.f17590l = motionEvent.getX(motionEvent.getPointerCount() - 1);
                    this.f17591m = motionEvent.getY(motionEvent.getPointerCount() - 1);
                    this.f17574G = true;
                } else if (obj2 == null) {
                    this.f17577J = true;
                } else {
                    this.f17590l = motionEvent.getX(0);
                    this.f17591m = motionEvent.getY(0);
                    this.f17574G = true;
                }
            }
        } else if ((this.f17583e.isEmpty() ^ 1) == 0) {
            m21361a(MotionEvent.obtain(motionEvent), null);
        } else {
            if (!(action == 6 || action == 262)) {
                switch (action) {
                    case 1:
                        break;
                    case 2:
                        m21364b(motionEvent);
                        m21361a(this.f17581c, null);
                        if (this.f17568A / this.f17569B > 0.67f) {
                            for (C4809e c4809e : this.f17583e) {
                                C5571j.m24301b(c4809e.m21317a());
                                i2 |= c4809e.m21325e(this);
                            }
                            if (i2 != 0) {
                                this.f17580b = MotionEvent.obtain(motionEvent);
                                break;
                            }
                        }
                        break;
                    case 3:
                        if (!this.f17574G) {
                            m21365g();
                        }
                        m21366h();
                        break;
                    default:
                        break;
                }
            }
            m21364b(motionEvent);
            if (i == 0) {
                i2 = motionEvent.getPointerCount() - 1;
            }
            this.f17590l = motionEvent.getX(i2);
            this.f17591m = motionEvent.getY(i2);
            if (!this.f17574G) {
                m21365g();
            }
            m21366h();
        }
        this.f17578K.m21334a(motionEvent);
        return true;
    }

    /* renamed from: a */
    private static boolean m21362a(C4809e c4809e) {
        return (c4809e == null || c4809e.m21317a() == null) ? null : true;
    }

    /* renamed from: g */
    private void m21365g() {
        for (C4809e c4809e : this.f17583e) {
            C5571j.m24301b(c4809e.m21317a());
            c4809e.m21321c(this);
        }
    }

    /* renamed from: a */
    private void m21361a(MotionEvent motionEvent, StringBuilder stringBuilder) {
        stringBuilder = motionEvent.getAction();
        if (this.f17588j.isEmpty()) {
            this.f17589k = motionEvent.getEventTime();
        }
        this.f17588j.addLast(new C6469a(motionEvent));
        if (this.f17588j.size() > 20) {
            ((C4812h) this.f17588j.removeFirst()).mo5050e();
        }
        while (true) {
            boolean z = true;
            if ((((C4812h) this.f17588j.getLast()).mo5045a() - ((C4812h) this.f17588j.getFirst()).mo5045a() >= 250 ? true : null) != null && this.f17588j.size() > 3) {
                ((C4812h) this.f17588j.removeFirst()).mo5050e();
            } else if (stringBuilder != 1) {
                if (stringBuilder != 3) {
                    this.f17577J = false;
                } else if (!(stringBuilder == 6 || stringBuilder == 262)) {
                }
                z = false;
            }
        }
        if (stringBuilder != 1) {
            if (stringBuilder != 3) {
                this.f17577J = false;
            }
            z = false;
        }
        if (this.f17577J != null) {
            for (C4809e c4809e : this.f17582d) {
                if (!c4809e.m21317a()) {
                    switch (c4809e.m21316a(this.f17589k, this.f17588j, z, this.f17583e, null)) {
                        case NO:
                            break;
                        case MAYBE:
                            break;
                        case YES:
                            if (c4809e.m21318a(this)) {
                                this.f17583e.add(c4809e);
                                break;
                            }
                            continue;
                        default:
                            continue;
                    }
                }
            }
        }
        if (z) {
            m21365g();
            this.f17577J = false;
        }
    }

    /* renamed from: a */
    private static float m21360a(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX());
    }

    /* renamed from: b */
    private static float m21363b(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY());
    }

    /* renamed from: b */
    private void m21364b(MotionEvent motionEvent) {
        this.f17581c = MotionEvent.obtain(motionEvent);
        this.f17598t = -1.0f;
        this.f17599u = -1.0f;
        this.f17602x = -1.0f;
        this.f17603y = 0.0f;
        this.f17575H = false;
        this.f17576I = false;
        MotionEvent motionEvent2 = this.f17580b;
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float x2 = motionEvent2.getX(motionEvent2.getPointerCount() - 1);
        float y2 = motionEvent2.getY(motionEvent2.getPointerCount() - 1);
        float x3 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        x2 -= x;
        y2 -= y;
        float x4 = motionEvent.getX(motionEvent.getPointerCount() - 1) - x3;
        float y4 = motionEvent.getY(motionEvent.getPointerCount() - 1) - y3;
        this.f17594p = x2;
        this.f17595q = y2;
        this.f17596r = x4;
        this.f17597s = y4;
        this.f17600v = y;
        this.f17601w = y3;
        this.f17590l = x3 + (x4 * 0.5f);
        this.f17591m = y3 + (y4 * 0.5f);
        this.f17592n = x + (x2 * 0.5f);
        this.f17593o = y + (y2 * 0.5f);
        this.f17570C = motionEvent.getEventTime() - motionEvent2.getEventTime();
        this.f17568A = motionEvent.getPressure(0) + motionEvent.getPressure(motionEvent.getPointerCount() - 1);
        this.f17569B = motionEvent2.getPressure(0) + motionEvent2.getPressure(motionEvent2.getPointerCount() - 1);
    }

    /* renamed from: h */
    private void m21366h() {
        this.f17580b = null;
        this.f17581c = null;
        this.f17574G = false;
        this.f17577J = false;
        this.f17583e.clear();
        Iterator it = this.f17588j.iterator();
        while (it.hasNext()) {
            ((C4812h) it.next()).mo5050e();
        }
        this.f17588j.clear();
        for (C4809e c4809e : this.f17582d) {
            if (c4809e.m21317a()) {
                c4809e.m21321c(this);
            }
        }
    }

    /* renamed from: a */
    public final float m21367a() {
        return this.f17590l;
    }

    /* renamed from: b */
    public final float m21369b() {
        return this.f17591m;
    }

    /* renamed from: c */
    public final float m21370c() {
        return this.f17592n;
    }

    /* renamed from: d */
    public final float m21371d() {
        if (!C4816i.m21362a(this.f17584f) || this.f17581c.getPointerCount() != this.f17580b.getPointerCount()) {
            return 1.0f;
        }
        if (this.f17602x == -1.0f) {
            float f;
            float f2;
            if (this.f17598t == -1.0f) {
                f = this.f17596r;
                f2 = this.f17597s;
                this.f17598t = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            }
            f = this.f17598t;
            if (this.f17599u == -1.0f) {
                float f3 = this.f17594p;
                f2 = this.f17595q;
                this.f17599u = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
            }
            this.f17602x = f / this.f17599u;
        }
        return this.f17602x;
    }

    /* renamed from: e */
    public final float m21372e() {
        if (!C4816i.m21362a(this.f17585g)) {
            return 0.0f;
        }
        if (!this.f17575H) {
            this.f17603y = (-(this.f17601w - this.f17600v)) * 0.25f;
            this.f17575H = true;
        }
        return this.f17603y;
    }

    /* renamed from: f */
    public final float m21373f() {
        if (!C4816i.m21362a(this.f17586h) || this.f17581c.getPointerCount() != this.f17580b.getPointerCount()) {
            return 0.0f;
        }
        if (!this.f17576I) {
            this.f17604z = C4809e.m21314a(C4812h.m21335a(this.f17580b.getX(0), this.f17580b.getY(0), this.f17580b.getX(this.f17580b.getPointerCount() - 1), this.f17580b.getY(this.f17580b.getPointerCount() - 1)), C4812h.m21335a(this.f17581c.getX(0), this.f17581c.getY(0), this.f17581c.getX(this.f17581c.getPointerCount() - 1), this.f17581c.getY(this.f17581c.getPointerCount() - 1)));
            this.f17576I = true;
        }
        return this.f17604z;
    }
}
