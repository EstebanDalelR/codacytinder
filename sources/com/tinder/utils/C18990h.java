package com.tinder.utils;

import android.app.Activity;
import java.util.List;
import rx.functions.Action1;

/* renamed from: com.tinder.utils.h */
final /* synthetic */ class C18990h implements Action1 {
    /* renamed from: a */
    private final AppLifeCycleTracker f58742a;
    /* renamed from: b */
    private final Activity f58743b;

    C18990h(AppLifeCycleTracker appLifeCycleTracker, Activity activity) {
        this.f58742a = appLifeCycleTracker;
        this.f58743b = activity;
    }

    public void call(Object obj) {
        this.f58742a.a(this.f58743b, (List) obj);
    }
}
