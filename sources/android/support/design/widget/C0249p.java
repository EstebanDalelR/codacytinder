package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;

/* renamed from: android.support.design.widget.p */
class C0249p {
    /* renamed from: a */
    private final View f898a;
    /* renamed from: b */
    private int f899b;
    /* renamed from: c */
    private int f900c;
    /* renamed from: d */
    private int f901d;
    /* renamed from: e */
    private int f902e;

    public C0249p(View view) {
        this.f898a = view;
    }

    /* renamed from: a */
    public void m919a() {
        this.f899b = this.f898a.getTop();
        this.f900c = this.f898a.getLeft();
        m918d();
    }

    /* renamed from: d */
    private void m918d() {
        ViewCompat.m2202c(this.f898a, this.f901d - (this.f898a.getTop() - this.f899b));
        ViewCompat.m2205d(this.f898a, this.f902e - (this.f898a.getLeft() - this.f900c));
    }

    /* renamed from: a */
    public boolean m920a(int i) {
        if (this.f901d == i) {
            return false;
        }
        this.f901d = i;
        m918d();
        return true;
    }

    /* renamed from: b */
    public boolean m922b(int i) {
        if (this.f902e == i) {
            return false;
        }
        this.f902e = i;
        m918d();
        return true;
    }

    /* renamed from: b */
    public int m921b() {
        return this.f901d;
    }

    /* renamed from: c */
    public int m923c() {
        return this.f899b;
    }
}
