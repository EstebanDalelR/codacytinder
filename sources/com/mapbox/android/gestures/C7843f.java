package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.facebook.ads.AdError;
import java.util.Set;

@UiThread
/* renamed from: com.mapbox.android.gestures.f */
public abstract class C7843f<L> extends C7081d<L> {
    /* renamed from: c */
    private final Set<Integer> f28329c = mo7378d();
    /* renamed from: d */
    private boolean f28330d;
    /* renamed from: g */
    VelocityTracker f28331g;
    /* renamed from: h */
    float f28332h;
    /* renamed from: i */
    float f28333i;
    /* renamed from: j */
    private boolean f28334j;

    @NonNull
    /* renamed from: d */
    protected abstract Set<Integer> mo7378d();

    public C7843f(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    /* renamed from: b */
    protected boolean mo6238b(MotionEvent motionEvent) {
        if (this.f28334j) {
            this.f28334j = false;
            mo7379h();
        }
        if (this.f28331g != null) {
            this.f28331g.addMovement(m25367b());
        }
        boolean b = super.mo6238b(motionEvent);
        motionEvent = motionEvent.getActionMasked();
        if (motionEvent != null) {
            if (motionEvent != 5) {
                if (motionEvent != 1) {
                    if (motionEvent != 6) {
                        if (motionEvent == 3) {
                            if (this.f28331g != null) {
                                this.f28331g.clear();
                            }
                            if (this.f28330d != null) {
                                mo7379h();
                                return true;
                            }
                        }
                        return b;
                    }
                }
                if (this.e.size() < mo7607i() && this.f28330d != null) {
                    mo7379h();
                    return true;
                }
                return b;
            }
        }
        if (this.f28331g != null) {
            this.f28331g.clear();
        }
        return b;
    }

    /* renamed from: n */
    protected void m33618n() {
        this.f28330d = true;
        if (this.f28331g == null) {
            this.f28331g = VelocityTracker.obtain();
        }
    }

    /* renamed from: h */
    protected void mo7379h() {
        this.f28330d = false;
        if (this.f28331g != null) {
            this.f28331g.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE);
            this.f28332h = this.f28331g.getXVelocity();
            this.f28333i = this.f28331g.getYVelocity();
            this.f28331g.recycle();
            this.f28331g = null;
        }
        mo7376g();
    }

    /* renamed from: o */
    Set<Integer> m33619o() {
        return this.f28329c;
    }

    /* renamed from: p */
    public boolean m33620p() {
        return this.f28330d;
    }

    /* renamed from: a */
    public void mo7377a(boolean z) {
        super.mo7377a(z);
        if (!z) {
            mo7609q();
        }
    }

    /* renamed from: q */
    public void mo7609q() {
        if (m33620p()) {
            this.f28334j = true;
        }
    }
}
