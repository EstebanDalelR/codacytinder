package com.google.android.m4b.maps.bl;

import android.view.MotionEvent;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.bl.a */
public final class C6469a extends C4812h {
    /* renamed from: a */
    private MotionEvent f23992a;

    public C6469a(MotionEvent motionEvent) {
        C5571j.m24292a((Object) motionEvent);
        this.f23992a = motionEvent;
    }

    /* renamed from: h */
    private void m28376h() {
        C5571j.m24293a(this.f23992a, (Object) "Event has been recycled.");
    }

    /* renamed from: a */
    public final long mo5045a() {
        m28376h();
        return this.f23992a.getEventTime();
    }

    /* renamed from: b */
    public final int mo5047b() {
        m28376h();
        return this.f23992a.getPointerCount();
    }

    /* renamed from: a */
    public final float mo5044a(int i) {
        m28376h();
        return this.f23992a.getX(i);
    }

    /* renamed from: b */
    public final float mo5046b(int i) {
        m28376h();
        return this.f23992a.getY(i);
    }

    /* renamed from: c */
    public final float mo5048c() {
        m28376h();
        return C4725p.m21028e();
    }

    /* renamed from: d */
    public final float mo5049d() {
        m28376h();
        return C4725p.m21029f();
    }

    /* renamed from: e */
    public final void mo5050e() {
        m28376h();
        this.f23992a.recycle();
        this.f23992a = null;
    }
}
