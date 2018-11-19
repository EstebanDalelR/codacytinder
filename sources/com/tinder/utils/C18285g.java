package com.tinder.utils;

import java.util.List;
import rx.functions.Func1;

/* renamed from: com.tinder.utils.g */
final /* synthetic */ class C18285g implements Func1 {
    /* renamed from: a */
    private final AppLifeCycleTracker f56625a;

    C18285g(AppLifeCycleTracker appLifeCycleTracker) {
        this.f56625a = appLifeCycleTracker;
    }

    public Object call(Object obj) {
        return this.f56625a.a((List) obj);
    }
}
