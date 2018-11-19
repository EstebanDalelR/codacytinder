package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import java.util.HashSet;
import java.util.Set;

@UiThread
public class ShoveGestureDetector extends C7843f<OnShoveGestureListener> {
    /* renamed from: j */
    private static final Set<Integer> f29081j = new HashSet();
    /* renamed from: c */
    float f29082c;
    /* renamed from: d */
    float f29083d;
    /* renamed from: k */
    private float f29084k;
    /* renamed from: l */
    private float f29085l;

    public interface OnShoveGestureListener {
        boolean onShove(ShoveGestureDetector shoveGestureDetector, float f, float f2);

        boolean onShoveBegin(ShoveGestureDetector shoveGestureDetector);

        void onShoveEnd(ShoveGestureDetector shoveGestureDetector, float f, float f2);
    }

    /* renamed from: com.mapbox.android.gestures.ShoveGestureDetector$a */
    public static class C7077a implements OnShoveGestureListener {
        public boolean onShove(ShoveGestureDetector shoveGestureDetector, float f, float f2) {
            return false;
        }

        public boolean onShoveBegin(ShoveGestureDetector shoveGestureDetector) {
            return true;
        }

        public void onShoveEnd(ShoveGestureDetector shoveGestureDetector, float f, float f2) {
        }
    }

    static {
        f29081j.add(Integer.valueOf(3));
    }

    public ShoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @NonNull
    /* renamed from: d */
    protected Set<Integer> mo7378d() {
        return f29081j;
    }

    /* renamed from: e */
    protected boolean mo7605e() {
        super.mo7605e();
        this.f29083d = m34495r();
        this.f29082c += this.f29083d;
        if (m33620p() && this.f29083d != 0.0f) {
            return ((OnShoveGestureListener) this.b).onShove(this, this.f29083d, this.f29082c);
        }
        if (!mo6242a(3) || !((OnShoveGestureListener) this.b).onShoveBegin(this)) {
            return false;
        }
        m33618n();
        return true;
    }

    /* renamed from: a */
    protected boolean mo6242a(int i) {
        return Math.abs(this.f29082c) >= this.f29085l && super.mo6242a(i) != 0;
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
        ((OnShoveGestureListener) this.b).onShoveEnd(this, this.h, this.i);
    }

    /* renamed from: g */
    protected void mo7376g() {
        super.mo7376g();
        this.f29082c = 0.0f;
    }

    /* renamed from: f */
    boolean mo7606f() {
        C5769c c5769c = (C5769c) this.f.get(new C5770e((Integer) this.e.get(0), (Integer) this.e.get(1)));
        double toDegrees = Math.toDegrees(Math.abs(Math.atan2((double) c5769c.m25376d(), (double) c5769c.m25375c())));
        if (toDegrees <= ((double) this.f29084k) || 180.0d - toDegrees <= ((double) this.f29084k)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    float m34495r() {
        return ((m25367b().getY(m25367b().findPointerIndex(((Integer) this.e.get(0)).intValue())) + m25367b().getY(m25367b().findPointerIndex(((Integer) this.e.get(1)).intValue()))) / 2.0f) - ((m25369c().getY(m25369c().findPointerIndex(((Integer) this.e.get(0)).intValue())) + m25369c().getY(m25369c().findPointerIndex(((Integer) this.e.get(1)).intValue()))) / 2.0f);
    }

    /* renamed from: b */
    public void m34486b(float f) {
        this.f29085l = f;
    }

    /* renamed from: c */
    public void mo7375c(@DimenRes int i) {
        m34486b(this.a.getResources().getDimension(i));
    }

    /* renamed from: c */
    public void m34487c(float f) {
        this.f29084k = f;
    }
}
