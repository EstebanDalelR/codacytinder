package com.google.android.m4b.maps.bl;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.m4b.maps.bl.C4816i.C4814a;
import com.google.android.m4b.maps.bl.C4816i.C4815b;

/* renamed from: com.google.android.m4b.maps.bl.f */
public final class C6473f implements C4815b {
    /* renamed from: a */
    private C4814a f23996a;
    /* renamed from: b */
    private C4816i f23997b;
    /* renamed from: c */
    private boolean f23998c;

    /* renamed from: a */
    public final void m28392a(Context context, C4814a c4814a) {
        this.f23996a = c4814a;
        this.f23997b = new C4816i(context, this);
    }

    /* renamed from: a */
    public final boolean m28393a(MotionEvent motionEvent) {
        return this.f23997b.m21368a(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo5060a(C4816i c4816i, boolean z) {
        return z ? true : this.f23996a.mo5219a(new C6471c(0, c4816i));
    }

    /* renamed from: b */
    public final boolean mo5062b(C4816i c4816i, boolean z) {
        return z ? true : this.f23996a.mo5219a(new C6471c(1, c4816i));
    }

    /* renamed from: c */
    public final void mo5064c(C4816i c4816i, boolean z) {
        if (z) {
            this.f23996a.mo5219a(new C6471c(3, c4816i));
        } else {
            this.f23996a.mo5219a(new C6471c(2, c4816i));
        }
    }

    /* renamed from: a */
    public final boolean mo5059a(C4816i c4816i) {
        return this.f23996a.mo5220a(new C6472d(0, c4816i));
    }

    /* renamed from: b */
    public final boolean mo5061b(C4816i c4816i) {
        c4816i = this.f23996a.mo5220a(new C6472d(1, c4816i));
        if (c4816i != null) {
            this.f23998c = true;
        }
        return c4816i;
    }

    /* renamed from: c */
    public final void mo5063c(C4816i c4816i) {
        this.f23998c = false;
        this.f23996a.mo5220a(new C6472d(2, c4816i));
    }

    /* renamed from: d */
    public final boolean mo5065d(C4816i c4816i) {
        return this.f23996a.mo5218a(new C6470b(0, c4816i));
    }

    /* renamed from: e */
    public final boolean mo5066e(C4816i c4816i) {
        return this.f23996a.mo5218a(new C6470b(1, c4816i));
    }

    /* renamed from: f */
    public final void mo5067f(C4816i c4816i) {
        this.f23996a.mo5218a(new C6470b(2, c4816i));
    }

    /* renamed from: g */
    public final boolean mo5068g(C4816i c4816i) {
        return this.f23996a.mo5218a(new C7455n(0, c4816i));
    }

    /* renamed from: h */
    public final boolean mo5069h(C4816i c4816i) {
        return this.f23996a.mo5218a(new C7455n(1, c4816i));
    }

    /* renamed from: i */
    public final void mo5070i(C4816i c4816i) {
        this.f23996a.mo5218a(new C7455n(2, c4816i));
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return this.f23996a.onDown(motionEvent);
    }

    public final void onShowPress(MotionEvent motionEvent) {
        this.f23996a.onShowPress(motionEvent);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f23996a.onSingleTapUp(motionEvent);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return (this.f23998c || this.f23996a.onScroll(motionEvent, motionEvent2, f, f2) == null) ? null : true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.f23996a.onLongPress(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f23996a.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.f23996a.onSingleTapConfirmed(motionEvent);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return this.f23996a.onDoubleTap(motionEvent);
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return this.f23996a.onDoubleTapEvent(motionEvent);
    }
}
