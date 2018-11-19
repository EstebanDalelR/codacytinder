package com.tinder.match.presenter;

import java.util.List;
import rx.functions.Func1;

/* renamed from: com.tinder.match.presenter.x */
final /* synthetic */ class C13433x implements Func1 {
    /* renamed from: a */
    static final Func1 f42619a = new C13433x();

    private C13433x() {
    }

    public Object call(Object obj) {
        return Boolean.valueOf(((List) obj).isEmpty() ^ 1);
    }
}
