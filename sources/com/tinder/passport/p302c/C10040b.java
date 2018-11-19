package com.tinder.passport.p302c;

import com.tinder.passport.p093d.C3945a;
import java.util.concurrent.Callable;

/* renamed from: com.tinder.passport.c.b */
final /* synthetic */ class C10040b implements Callable {
    /* renamed from: a */
    private final C3945a f32934a;

    private C10040b(C3945a c3945a) {
        this.f32934a = c3945a;
    }

    /* renamed from: a */
    static Callable m41088a(C3945a c3945a) {
        return new C10040b(c3945a);
    }

    public Object call() {
        return Boolean.valueOf(this.f32934a.f());
    }
}
