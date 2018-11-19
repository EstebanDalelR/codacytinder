package com.facebook.ads.internal.p035b;

import android.os.Bundle;
import com.facebook.ads.internal.p047k.ag;

/* renamed from: com.facebook.ads.internal.b.d */
public class C3278d implements ag<Bundle> {
    /* renamed from: a */
    private C1372c f10030a;
    /* renamed from: b */
    private final C1372c f10031b;
    /* renamed from: c */
    private final C1370b f10032c;
    /* renamed from: d */
    private boolean f10033d = false;
    /* renamed from: e */
    private boolean f10034e = false;
    /* renamed from: f */
    private boolean f10035f = false;

    public C3278d(C1370b c1370b) {
        this.f10032c = c1370b;
        this.f10031b = new C1372c(c1370b.f3705b);
        this.f10030a = new C1372c(c1370b.f3705b);
    }

    public C3278d(C1370b c1370b, Bundle bundle) {
        this.f10032c = c1370b;
        this.f10031b = (C1372c) bundle.getSerializable("testStats");
        this.f10030a = (C1372c) bundle.getSerializable("viewableStats");
        this.f10033d = bundle.getBoolean("ended");
        this.f10034e = bundle.getBoolean("passed");
        this.f10035f = bundle.getBoolean("complete");
    }

    /* renamed from: a */
    private void m12639a() {
        this.f10034e = true;
        m12640b();
    }

    /* renamed from: b */
    private void m12640b() {
        this.f10035f = true;
        m12641c();
    }

    /* renamed from: c */
    private void m12641c() {
        this.f10033d = true;
        this.f10032c.mo1727a(this.f10035f, this.f10034e, this.f10034e ? this.f10030a : this.f10031b);
    }

    /* renamed from: a */
    public void m12642a(double d, double d2) {
        if (!this.f10033d) {
            this.f10031b.m4789a(d, d2);
            this.f10030a.m4789a(d, d2);
            d = this.f10030a.m4790b().m4786f();
            if (this.f10032c.f3708e && d2 < this.f10032c.f3705b) {
                this.f10030a = new C1372c(this.f10032c.f3705b);
            }
            if (this.f10032c.f3706c < 0.0d || this.f10031b.m4790b().m4785e() <= this.f10032c.f3706c || d != 0.0d) {
                if (d >= this.f10032c.f3707d) {
                    m12639a();
                }
                return;
            }
            m12640b();
        }
    }

    public Bundle getSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("viewableStats", this.f10030a);
        bundle.putSerializable("testStats", this.f10031b);
        bundle.putBoolean("ended", this.f10033d);
        bundle.putBoolean("passed", this.f10034e);
        bundle.putBoolean("complete", this.f10035f);
        return bundle;
    }
}
