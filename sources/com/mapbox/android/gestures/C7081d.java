package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.DimenRes;
import android.support.annotation.UiThread;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000a.p001a.C0001a;

@UiThread
/* renamed from: com.mapbox.android.gestures.d */
public abstract class C7081d<L> extends C5767a<L> {
    /* renamed from: c */
    private final float f25689c;
    /* renamed from: d */
    private float f25690d;
    /* renamed from: e */
    final List<Integer> f25691e = new ArrayList();
    /* renamed from: f */
    final HashMap<C5770e, C5769c> f25692f = new HashMap();
    /* renamed from: g */
    private PointF f25693g = new PointF();
    /* renamed from: h */
    private long f25694h = 0;

    /* renamed from: e */
    protected boolean mo7605e() {
        return false;
    }

    /* renamed from: g */
    protected void mo7376g() {
    }

    /* renamed from: i */
    protected int mo7607i() {
        return 2;
    }

    public C7081d(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.f25689c = (float) ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    /* renamed from: b */
    protected boolean mo6238b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean c = mo7375c(actionMasked);
        if (c) {
            if (this instanceof C7843f) {
                C7843f c7843f = (C7843f) this;
                if (c7843f.m33620p()) {
                    c7843f.mo7379h();
                }
            }
            this.f25691e.clear();
            this.f25692f.clear();
            this.f25694h = 0;
        }
        if (!c || actionMasked == 0) {
            m30643c(motionEvent);
            mo7378d();
        }
        if (c) {
            C0001a.d("Some MotionEvents were not passed to the library.", new Object[0]);
            return false;
        }
        if (actionMasked == 2 && this.f25691e.size() >= mo7607i() && m30655j()) {
            mo7379h();
            if (!mo7608k()) {
                this.f25693g = C5773h.m25379a(motionEvent);
                return mo7605e();
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m30643c(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 5) {
                if (actionMasked == 1 || actionMasked == 6) {
                    this.f25691e.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                    return;
                }
                return;
            }
        }
        this.f25691e.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
    }

    /* renamed from: c */
    private boolean mo7375c(int i) {
        long j = (long) i;
        if (j == this.f25694h) {
            return false;
        }
        while (this.f25694h != 0) {
            if (j == (this.f25694h & 15)) {
                return false;
            }
            this.f25694h >>= 4;
        }
        return true;
    }

    /* renamed from: d */
    private void mo7378d() {
        this.f25694h = 0;
        if (this.f25691e.size() == 0) {
            this.f25694h = 0;
        } else if (this.f25691e.size() >= 1) {
            this.f25694h += 5;
            this.f25694h <<= 4;
            this.f25694h += 2;
            if (this.f25691e.size() == 1) {
                this.f25694h <<= 4;
                this.f25694h++;
            } else if (this.f25691e.size() > 1) {
                this.f25694h <<= 4;
                this.f25694h += 6;
            }
        }
    }

    /* renamed from: j */
    boolean m30655j() {
        return m25367b().getPressure() / m25369c().getPressure() > 0.67f;
    }

    /* renamed from: f */
    private boolean mo7606f() {
        for (C5769c e : this.f25692f.values()) {
            if (e.m25377e() < this.f25690d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    protected boolean mo7608k() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) - this.f25689c;
        float f2 = ((float) displayMetrics.heightPixels) - this.f25689c;
        float f3 = this.f25689c;
        for (Integer intValue : this.f25691e) {
            Object obj;
            int findPointerIndex = m25367b().findPointerIndex(intValue.intValue());
            float a = C5773h.m25378a(m25367b(), findPointerIndex);
            float b = C5773h.m25380b(m25367b(), findPointerIndex);
            if (a >= f3 && b >= f3 && a <= f) {
                if (b <= f2) {
                    obj = null;
                    continue;
                    if (obj != null) {
                        return true;
                    }
                }
            }
            obj = 1;
            continue;
            if (obj != null) {
                return true;
            }
        }
        return mo7606f();
    }

    /* renamed from: a */
    protected boolean mo6242a(int i) {
        return super.mo6242a(i) != 0 && mo7608k() == 0;
    }

    /* renamed from: h */
    private void mo7379h() {
        this.f25692f.clear();
        int i = 0;
        while (i < this.f25691e.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f25691e.size(); i3++) {
                int intValue = ((Integer) this.f25691e.get(i)).intValue();
                int intValue2 = ((Integer) this.f25691e.get(i3)).intValue();
                float x = m25369c().getX(m25369c().findPointerIndex(intValue));
                float y = m25369c().getY(m25369c().findPointerIndex(intValue));
                float x2 = m25369c().getX(m25369c().findPointerIndex(intValue2)) - x;
                float y2 = m25369c().getY(m25369c().findPointerIndex(intValue2)) - y;
                x = m25367b().getX(m25367b().findPointerIndex(intValue));
                y = m25367b().getY(m25367b().findPointerIndex(intValue));
                this.f25692f.put(new C5770e(Integer.valueOf(intValue), Integer.valueOf(intValue2)), new C5769c(x2, y2, m25367b().getX(m25367b().findPointerIndex(intValue2)) - x, m25367b().getY(m25367b().findPointerIndex(intValue2)) - y));
            }
            i = i2;
        }
    }

    /* renamed from: l */
    public int m30657l() {
        return this.f25691e.size();
    }

    /* renamed from: m */
    public PointF m30658m() {
        return this.f25693g;
    }

    /* renamed from: a */
    public void m30648a(float f) {
        this.f25690d = f;
    }

    /* renamed from: b */
    public void m30650b(@DimenRes int i) {
        m30648a(this.a.getResources().getDimension(i));
    }
}
