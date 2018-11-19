package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import java.util.HashSet;
import java.util.Set;

@UiThread
public class RotateGestureDetector extends C7843f<OnRotateGestureListener> {
    /* renamed from: j */
    private static final Set<Integer> f29077j = new HashSet();
    /* renamed from: c */
    float f29078c;
    /* renamed from: d */
    float f29079d;
    /* renamed from: k */
    private float f29080k;

    public interface OnRotateGestureListener {
        boolean onRotate(RotateGestureDetector rotateGestureDetector, float f, float f2);

        boolean onRotateBegin(RotateGestureDetector rotateGestureDetector);

        void onRotateEnd(RotateGestureDetector rotateGestureDetector, float f, float f2, float f3);
    }

    /* renamed from: com.mapbox.android.gestures.RotateGestureDetector$a */
    public static class C7076a implements OnRotateGestureListener {
        public boolean onRotate(RotateGestureDetector rotateGestureDetector, float f, float f2) {
            return true;
        }

        public boolean onRotateBegin(RotateGestureDetector rotateGestureDetector) {
            return true;
        }

        public void onRotateEnd(RotateGestureDetector rotateGestureDetector, float f, float f2, float f3) {
        }
    }

    static {
        f29077j.add(Integer.valueOf(2));
    }

    public RotateGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @NonNull
    /* renamed from: d */
    protected Set<Integer> mo7378d() {
        return f29077j;
    }

    /* renamed from: e */
    protected boolean mo7605e() {
        super.mo7605e();
        this.f29079d = mo7606f();
        this.f29078c += this.f29079d;
        if (m33620p() && this.f29079d != 0.0f) {
            return ((OnRotateGestureListener) this.b).onRotate(this, this.f29079d, this.f29078c);
        }
        if (!mo6242a(2) || !((OnRotateGestureListener) this.b).onRotateBegin(this)) {
            return false;
        }
        m33618n();
        return true;
    }

    /* renamed from: a */
    protected boolean mo6242a(int i) {
        return Math.abs(this.f29078c) >= this.f29080k && super.mo6242a(i) != 0;
    }

    /* renamed from: h */
    protected void mo7379h() {
        super.mo7379h();
        if (this.f29079d == 0.0f) {
            this.h = 0.0f;
            this.i = 0.0f;
        }
        ((OnRotateGestureListener) this.b).onRotateEnd(this, this.h, this.i, m34477a(this.h, this.i));
    }

    /* renamed from: g */
    protected void mo7376g() {
        super.mo7376g();
        this.f29078c = 0.0f;
    }

    /* renamed from: f */
    float mo7606f() {
        C5769c c5769c = (C5769c) this.f.get(new C5770e((Integer) this.e.get(0), (Integer) this.e.get(1)));
        return (float) Math.toDegrees(Math.atan2((double) c5769c.m25374b(), (double) c5769c.m25373a()) - Math.atan2((double) c5769c.m25376d(), (double) c5769c.m25375c()));
    }

    /* renamed from: a */
    float m34477a(float f, float f2) {
        f = Math.abs((float) (((double) ((m30658m().x * f2) + (m30658m().y * f))) / (Math.pow((double) m30658m().x, 2.0d) + Math.pow((double) m30658m().y, 2.0d))));
        return this.f29079d < 0.0f ? -f : f;
    }

    /* renamed from: b */
    public void m34479b(float f) {
        this.f29080k = f;
    }
}
