package com.tinder.match.presenter;

import com.tinder.match.viewmodel.C9891i;
import java.util.List;
import rx.functions.Func2;

/* renamed from: com.tinder.match.presenter.u */
final /* synthetic */ class C13432u implements Func2 {
    /* renamed from: a */
    private final C9891i f42618a;

    private C13432u(C9891i c9891i) {
        this.f42618a = c9891i;
    }

    /* renamed from: a */
    static Func2 m51924a(C9891i c9891i) {
        return new C13432u(c9891i);
    }

    public Object call(Object obj, Object obj2) {
        return this.f42618a.m40706a((List) obj, ((Boolean) obj2).booleanValue());
    }
}
