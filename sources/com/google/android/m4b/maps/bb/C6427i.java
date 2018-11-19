package com.google.android.m4b.maps.bb;

import android.view.animation.LinearInterpolator;
import com.google.android.m4b.maps.bo.ae;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.bb.i */
public final class C6427i implements C4750h {
    /* renamed from: a */
    private static final long f23845a = TimeUnit.SECONDS.toMillis(5);
    /* renamed from: b */
    private static final long f23846b = TimeUnit.SECONDS.toMillis(1);
    /* renamed from: c */
    private final C8064k f23847c = new C8064k(new C4746d(0.99f));
    /* renamed from: d */
    private final C7442f f23848d = new C7442f(new C4744b(1.0f));
    /* renamed from: e */
    private final C7443g f23849e = new C7443g(new C4746d(0.99f));
    /* renamed from: f */
    private final C7443g f23850f;

    public C6427i() {
        this.f23847c.setDuration(f23845a);
        this.f23848d.setDuration(f23845a);
        this.f23849e.setDuration(f23845a);
        this.f23850f = new C7443g(new LinearInterpolator());
        this.f23850f.m32042a(0);
        this.f23850f.m32042a(2);
        this.f23850f.setDuration(f23846b);
        this.f23850f.setRepeatCount(-1);
        this.f23850f.start();
    }

    /* renamed from: a */
    public final synchronized boolean mo4907a(ae aeVar) {
        if (!this.f23847c.isInitialized()) {
            return null;
        }
        C5571j.m24292a((Object) aeVar);
        aeVar.m21440a((af) this.f23847c.m32049b(), this.f23848d.m32040b(), this.f23849e.m32044b());
        aeVar.m21437a((float) this.f23850f.m32044b());
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo4908b(ae aeVar) {
        if (!(this.f23847c.isInitialized() && C5569h.m24284a(aeVar.m21436a(), this.f23847c.m32045a()))) {
            this.f23847c.m32053d(aeVar.m21436a());
            this.f23847c.start();
        }
        if (!(this.f23848d.isInitialized() && aeVar.m21442b() == this.f23848d.m32038a())) {
            this.f23848d.m32039a(aeVar.m21442b());
            this.f23848d.start();
        }
        if (!(this.f23849e.isInitialized() && aeVar.m21443c() == this.f23849e.m32041a())) {
            this.f23849e.m32042a(aeVar.m21443c());
            this.f23849e.start();
        }
    }
}
