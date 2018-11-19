package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.os.SystemClock;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import com.google.android.m4b.maps.bv.aa.C4913a;

public final class ad implements OnDoubleTapListener, OnGestureListener, C4913a {
    /* renamed from: a */
    private final aa f24278a;
    /* renamed from: b */
    private float f24279b = 0.0f;
    /* renamed from: c */
    private long f24280c;
    /* renamed from: d */
    private final float f24281d;
    /* renamed from: e */
    private final C4966z f24282e;
    /* renamed from: f */
    private final OnGestureListener f24283f;
    /* renamed from: g */
    private final OnDoubleTapListener f24284g;
    /* renamed from: h */
    private final C4925e f24285h;

    public ad(Context context, OnGestureListener onGestureListener, OnDoubleTapListener onDoubleTapListener, C4966z c4966z) {
        this.f24283f = onGestureListener;
        this.f24284g = onDoubleTapListener;
        this.f24285h = new C4925e(context, this);
        this.f24285h.m22076a((OnDoubleTapListener) this);
        this.f24285h.m22077a(true);
        this.f24282e = c4966z;
        this.f24278a = new aa(context, this);
        this.f24281d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final boolean m28864a(MotionEvent motionEvent) {
        return this.f24278a.m22032a(motionEvent) | this.f24285h.m22078a(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo5166a(aa aaVar) {
        this.f24279b += Math.abs(aaVar.m22034c() - aaVar.m22035d());
        return this.f24282e.mo5187a(new C4965y(0, aaVar));
    }

    /* renamed from: b */
    public final boolean mo5167b(aa aaVar) {
        this.f24279b = 0.0f;
        this.f24280c = SystemClock.elapsedRealtime();
        return this.f24282e.mo5187a(new C4965y(1, aaVar));
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return this.f24283f.onDown(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f24283f.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.f24283f.onLongPress(motionEvent);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f24283f.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public final void onShowPress(MotionEvent motionEvent) {
        this.f24283f.onShowPress(motionEvent);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f24284g.onSingleTapConfirmed(motionEvent);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return this.f24284g.onDoubleTap(motionEvent);
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return this.f24284g.onDoubleTapEvent(motionEvent);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.f24284g.onSingleTapConfirmed(motionEvent);
    }

    /* renamed from: c */
    public final void mo5168c(aa aaVar) {
        Object obj = (SystemClock.elapsedRealtime() - this.f24280c >= 300 || this.f24279b > this.f24281d * 22.0f) ? null : 1;
        if (obj != null) {
            this.f24282e.mo5172a();
        } else {
            this.f24282e.mo5187a(new C4965y(2, aaVar));
        }
    }
}
