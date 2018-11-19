package com.tinder.cardstack.swipe;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.MotionEvent;

/* renamed from: com.tinder.cardstack.swipe.e */
public class C8402e {
    @NonNull
    /* renamed from: a */
    private PointF f29828a;
    /* renamed from: b */
    private float f29829b;
    /* renamed from: c */
    private float f29830c;
    @Nullable
    /* renamed from: d */
    private ViewHolder f29831d;
    /* renamed from: e */
    private int f29832e = -1;
    /* renamed from: f */
    private float f29833f;
    /* renamed from: g */
    private float f29834g;
    /* renamed from: h */
    private boolean f29835h;

    public C8402e(@NonNull ViewHolder viewHolder, @NonNull PointF pointF, float f, float f2, int i) {
        this.f29831d = viewHolder;
        this.f29829b = f;
        this.f29830c = f2;
        this.f29832e = i;
        this.f29828a = pointF;
    }

    C8402e(@NonNull ViewHolder viewHolder, @NonNull MotionEvent motionEvent) {
        this.f29831d = viewHolder;
        this.f29829b = motionEvent.getX();
        this.f29830c = motionEvent.getY();
        this.f29832e = motionEvent.getPointerId(null);
        this.f29828a = new PointF(this.f29829b, this.f29830c);
    }

    @NonNull
    /* renamed from: a */
    public ViewHolder m35856a() {
        if (this.f29831d != null) {
            return this.f29831d;
        }
        throw new IllegalStateException("Check implementation: null viewholder");
    }

    @NonNull
    /* renamed from: b */
    public PointF m35860b() {
        return this.f29828a;
    }

    /* renamed from: a */
    void m35858a(float f, float f2) {
        this.f29828a = new PointF(f, f2);
        this.f29829b = f;
        this.f29830c = f2;
    }

    /* renamed from: c */
    float m35862c() {
        return this.f29833f;
    }

    /* renamed from: a */
    void m35857a(float f) {
        this.f29833f = f;
    }

    /* renamed from: d */
    float m35863d() {
        return this.f29834g;
    }

    /* renamed from: b */
    void m35861b(float f) {
        this.f29834g = f;
    }

    /* renamed from: e */
    int m35864e() {
        return this.f29832e;
    }

    /* renamed from: f */
    float m35865f() {
        return this.f29829b;
    }

    /* renamed from: g */
    float m35866g() {
        return this.f29830c;
    }

    /* renamed from: a */
    void m35859a(boolean z) {
        this.f29835h = z;
    }

    /* renamed from: h */
    boolean m35867h() {
        return this.f29835h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[sx=");
        stringBuilder.append(this.f29829b);
        stringBuilder.append("::sy=");
        stringBuilder.append(this.f29830c);
        stringBuilder.append("::dx=");
        stringBuilder.append(this.f29833f);
        stringBuilder.append("::dy=");
        stringBuilder.append(this.f29834g);
        stringBuilder.append("::apid=");
        stringBuilder.append(this.f29832e);
        stringBuilder.append("::vh=");
        stringBuilder.append(this.f29831d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
