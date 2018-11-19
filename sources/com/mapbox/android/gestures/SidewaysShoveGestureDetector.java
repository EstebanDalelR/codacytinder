package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import java.util.HashSet;
import java.util.Set;

@UiThread
public class SidewaysShoveGestureDetector extends C7843f<OnSidewaysShoveGestureListener> {
    /* renamed from: j */
    private static final Set<Integer> f29086j = new HashSet();
    /* renamed from: c */
    float f29087c;
    /* renamed from: d */
    float f29088d;
    /* renamed from: k */
    private float f29089k;
    /* renamed from: l */
    private float f29090l;

    public interface OnSidewaysShoveGestureListener {
        boolean onSidewaysShove(SidewaysShoveGestureDetector sidewaysShoveGestureDetector, float f, float f2);

        boolean onSidewaysShoveBegin(SidewaysShoveGestureDetector sidewaysShoveGestureDetector);

        void onSidewaysShoveEnd(SidewaysShoveGestureDetector sidewaysShoveGestureDetector, float f, float f2);
    }

    static {
        f29086j.add(Integer.valueOf(14));
    }

    public SidewaysShoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @NonNull
    /* renamed from: d */
    protected Set<Integer> mo7378d() {
        return f29086j;
    }

    /* renamed from: e */
    protected boolean mo7605e() {
        super.mo7605e();
        this.f29088d = m34506r();
        this.f29087c += this.f29088d;
        if (m33620p() && this.f29088d != 0.0f) {
            return ((OnSidewaysShoveGestureListener) this.b).onSidewaysShove(this, this.f29088d, this.f29087c);
        }
        if (!mo6242a(14) || !((OnSidewaysShoveGestureListener) this.b).onSidewaysShoveBegin(this)) {
            return false;
        }
        m33618n();
        return true;
    }

    /* renamed from: a */
    protected boolean mo6242a(int i) {
        return Math.abs(this.f29087c) >= this.f29090l && super.mo6242a(i) != 0;
    }

    /* renamed from: k */
    protected boolean mo7608k() {
        if (!super.mo7608k()) {
            if (mo7606f()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    protected void mo7379h() {
        super.mo7379h();
        ((OnSidewaysShoveGestureListener) this.b).onSidewaysShoveEnd(this, this.h, this.i);
    }

    /* renamed from: g */
    protected void mo7376g() {
        super.mo7376g();
        this.f29087c = 0.0f;
    }

    /* renamed from: f */
    boolean mo7606f() {
        C5769c c5769c = (C5769c) this.f.get(new C5770e((Integer) this.e.get(0), (Integer) this.e.get(1)));
        if (Math.abs(Math.toDegrees(Math.abs(Math.atan2((double) c5769c.m25376d(), (double) c5769c.m25375c()))) - 90.0d) <= ((double) this.f29089k)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    float m34506r() {
        return ((m25367b().getX(m25367b().findPointerIndex(((Integer) this.e.get(0)).intValue())) + m25367b().getX(m25367b().findPointerIndex(((Integer) this.e.get(1)).intValue()))) / 2.0f) - ((m25369c().getX(m25369c().findPointerIndex(((Integer) this.e.get(0)).intValue())) + m25369c().getX(m25369c().findPointerIndex(((Integer) this.e.get(1)).intValue()))) / 2.0f);
    }

    /* renamed from: b */
    public void m34497b(float f) {
        this.f29090l = f;
    }

    /* renamed from: c */
    public void mo7375c(@DimenRes int i) {
        m34497b(this.a.getResources().getDimension(i));
    }

    /* renamed from: c */
    public void m34498c(float f) {
        this.f29089k = f;
    }
}
