package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C0630a implements OnTouchListener {
    /* renamed from: r */
    private static final int f1949r = ViewConfiguration.getTapTimeout();
    /* renamed from: a */
    final C0628a f1950a = new C0628a();
    /* renamed from: b */
    final View f1951b;
    /* renamed from: c */
    boolean f1952c;
    /* renamed from: d */
    boolean f1953d;
    /* renamed from: e */
    boolean f1954e;
    /* renamed from: f */
    private final Interpolator f1955f = new AccelerateInterpolator();
    /* renamed from: g */
    private Runnable f1956g;
    /* renamed from: h */
    private float[] f1957h = new float[]{0.0f, 0.0f};
    /* renamed from: i */
    private float[] f1958i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: j */
    private int f1959j;
    /* renamed from: k */
    private int f1960k;
    /* renamed from: l */
    private float[] f1961l = new float[]{0.0f, 0.0f};
    /* renamed from: m */
    private float[] f1962m = new float[]{0.0f, 0.0f};
    /* renamed from: n */
    private float[] f1963n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: o */
    private boolean f1964o;
    /* renamed from: p */
    private boolean f1965p;
    /* renamed from: q */
    private boolean f1966q;

    /* renamed from: android.support.v4.widget.a$a */
    private static class C0628a {
        /* renamed from: a */
        private int f1937a;
        /* renamed from: b */
        private int f1938b;
        /* renamed from: c */
        private float f1939c;
        /* renamed from: d */
        private float f1940d;
        /* renamed from: e */
        private long f1941e = Long.MIN_VALUE;
        /* renamed from: f */
        private long f1942f = 0;
        /* renamed from: g */
        private int f1943g = 0;
        /* renamed from: h */
        private int f1944h = 0;
        /* renamed from: i */
        private long f1945i = -1;
        /* renamed from: j */
        private float f1946j;
        /* renamed from: k */
        private int f1947k;

        /* renamed from: a */
        private float m2520a(float f) {
            return ((-4.0f * f) * f) + (f * 4.0f);
        }

        C0628a() {
        }

        /* renamed from: a */
        public void m2524a(int i) {
            this.f1937a = i;
        }

        /* renamed from: b */
        public void m2526b(int i) {
            this.f1938b = i;
        }

        /* renamed from: a */
        public void m2522a() {
            this.f1941e = AnimationUtils.currentAnimationTimeMillis();
            this.f1945i = -1;
            this.f1942f = this.f1941e;
            this.f1946j = 0.5f;
            this.f1943g = 0;
            this.f1944h = 0;
        }

        /* renamed from: b */
        public void m2525b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1947k = C0630a.m2536a((int) (currentAnimationTimeMillis - this.f1941e), 0, this.f1938b);
            this.f1946j = m2521a(currentAnimationTimeMillis);
            this.f1945i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public boolean m2527c() {
            return this.f1945i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1945i + ((long) this.f1947k);
        }

        /* renamed from: a */
        private float m2521a(long j) {
            if (j < this.f1941e) {
                return 0.0f;
            }
            if (this.f1945i >= 0) {
                if (j >= this.f1945i) {
                    return (1065353216 - this.f1946j) + (this.f1946j * C0630a.m2533a(((float) (j - this.f1945i)) / ((float) this.f1947k), 0.0f, 1.0f));
                }
            }
            return C0630a.m2533a(((float) (j - this.f1941e)) / ((float) this.f1937a), 0.0f, 1.0f) * 1056964608;
        }

        /* renamed from: d */
        public void m2528d() {
            if (this.f1942f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = m2520a(m2521a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f1942f;
            this.f1942f = currentAnimationTimeMillis;
            float f = ((float) j) * a;
            this.f1943g = (int) (this.f1939c * f);
            this.f1944h = (int) (f * this.f1940d);
        }

        /* renamed from: a */
        public void m2523a(float f, float f2) {
            this.f1939c = f;
            this.f1940d = f2;
        }

        /* renamed from: e */
        public int m2529e() {
            return (int) (this.f1939c / Math.abs(this.f1939c));
        }

        /* renamed from: f */
        public int m2530f() {
            return (int) (this.f1940d / Math.abs(this.f1940d));
        }

        /* renamed from: g */
        public int m2531g() {
            return this.f1943g;
        }

        /* renamed from: h */
        public int m2532h() {
            return this.f1944h;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C0629b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0630a f1948a;

        C0629b(C0630a c0630a) {
            this.f1948a = c0630a;
        }

        public void run() {
            if (this.f1948a.f1954e) {
                if (this.f1948a.f1952c) {
                    this.f1948a.f1952c = false;
                    this.f1948a.f1950a.m2522a();
                }
                C0628a c0628a = this.f1948a.f1950a;
                if (!c0628a.m2527c()) {
                    if (this.f1948a.m2544a()) {
                        if (this.f1948a.f1953d) {
                            this.f1948a.f1953d = false;
                            this.f1948a.m2547b();
                        }
                        c0628a.m2528d();
                        this.f1948a.mo640a(c0628a.m2531g(), c0628a.m2532h());
                        ViewCompat.m2188a(this.f1948a.f1951b, (Runnable) this);
                        return;
                    }
                }
                this.f1948a.f1954e = false;
            }
        }
    }

    /* renamed from: a */
    static float m2533a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m2536a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract void mo640a(int i, int i2);

    /* renamed from: e */
    public abstract boolean mo641e(int i);

    /* renamed from: f */
    public abstract boolean mo642f(int i);

    public C0630a(@NonNull View view) {
        this.f1951b = view;
        view = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((view.density * 1575.0f) + 0.5f);
        view = (int) ((view.density * 315.0f) + 1056964608);
        float f = (float) i;
        m2540a(f, f);
        view = (float) view;
        m2545b(view, view);
        m2541a(1);
        m2552e(Float.MAX_VALUE, Float.MAX_VALUE);
        m2550d(0.2f, 0.2f);
        m2548c(1.0f, 1.0f);
        m2546b(f1949r);
        m2549c(500);
        m2551d(500);
    }

    /* renamed from: a */
    public C0630a m2542a(boolean z) {
        if (this.f1965p && !z) {
            m2538d();
        }
        this.f1965p = z;
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C0630a m2540a(float f, float f2) {
        this.f1963n[0] = f / 1000.0f;
        this.f1963n[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    /* renamed from: b */
    public C0630a m2545b(float f, float f2) {
        this.f1962m[0] = f / 1000.0f;
        this.f1962m[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    /* renamed from: c */
    public C0630a m2548c(float f, float f2) {
        this.f1961l[0] = f / 1000.0f;
        this.f1961l[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C0630a m2541a(int i) {
        this.f1959j = i;
        return this;
    }

    @NonNull
    /* renamed from: d */
    public C0630a m2550d(float f, float f2) {
        this.f1957h[0] = f;
        this.f1957h[1] = f2;
        return this;
    }

    @NonNull
    /* renamed from: e */
    public C0630a m2552e(float f, float f2) {
        this.f1958i[0] = f;
        this.f1958i[1] = f2;
        return this;
    }

    @NonNull
    /* renamed from: b */
    public C0630a m2546b(int i) {
        this.f1960k = i;
        return this;
    }

    @NonNull
    /* renamed from: c */
    public C0630a m2549c(int i) {
        this.f1950a.m2524a(i);
        return this;
    }

    @NonNull
    /* renamed from: d */
    public C0630a m2551d(int i) {
        this.f1950a.m2526b(i);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f1965p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1953d = true;
                this.f1964o = false;
                break;
            case 1:
            case 3:
                m2538d();
                break;
            case 2:
                break;
            default:
                break;
        }
        this.f1950a.m2523a(m2535a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1951b.getWidth()), m2535a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1951b.getHeight()));
        if (this.f1954e == null && m2544a() != null) {
            m2537c();
        }
        if (!(this.f1966q == null || this.f1954e == null)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    boolean m2544a() {
        C0628a c0628a = this.f1950a;
        int f = c0628a.m2530f();
        int e = c0628a.m2529e();
        return (f != 0 && mo642f(f)) || (e != 0 && mo641e(e));
    }

    /* renamed from: c */
    private void m2537c() {
        if (this.f1956g == null) {
            this.f1956g = new C0629b(this);
        }
        this.f1954e = true;
        this.f1952c = true;
        if (this.f1964o || this.f1960k <= 0) {
            this.f1956g.run();
        } else {
            ViewCompat.m2189a(this.f1951b, this.f1956g, (long) this.f1960k);
        }
        this.f1964o = true;
    }

    /* renamed from: d */
    private void m2538d() {
        if (this.f1952c) {
            this.f1954e = false;
        } else {
            this.f1950a.m2525b();
        }
    }

    /* renamed from: a */
    private float m2535a(int i, float f, float f2, float f3) {
        f = m2534a(this.f1957h[i], f2, this.f1958i[i], f);
        if (f == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1961l[i];
        float f5 = this.f1962m[i];
        float f6 = this.f1963n[i];
        f4 *= f3;
        if (f > 0.0f) {
            return C0630a.m2533a(f * f4, f5, f6);
        }
        return -C0630a.m2533a((-f) * f4, f5, f6);
    }

    /* renamed from: a */
    private float m2534a(float f, float f2, float f3, float f4) {
        f = C0630a.m2533a(f * f2, 0.0f, f3);
        f = m2539f(f2 - f4, f) - m2539f(f4, f);
        if (f < 0.0f) {
            f = -this.f1955f.getInterpolation(-f);
        } else if (f <= 0.0f) {
            return 0.0f;
        } else {
            f = this.f1955f.getInterpolation(f);
        }
        return C0630a.m2533a(f, -1.0f, 1.0f);
    }

    /* renamed from: f */
    private float m2539f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f1959j) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    return (this.f1954e == null || this.f1959j != Float.MIN_VALUE) ? 0.0f : 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
            default:
                break;
        }
    }

    /* renamed from: b */
    void m2547b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1951b.onTouchEvent(obtain);
        obtain.recycle();
    }
}
