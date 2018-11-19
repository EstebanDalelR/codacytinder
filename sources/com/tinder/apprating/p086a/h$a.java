package com.tinder.apprating.p086a;

import com.tinder.p071a.C3862c;
import com.tinder.utils.AppLifeCycleTracker;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.tinder.apprating.a.h$a */
class h$a implements UncaughtExceptionHandler {
    /* renamed from: a */
    final /* synthetic */ C3919h f29493a;
    /* renamed from: b */
    private UncaughtExceptionHandler f29494b;

    private h$a(C3919h c3919h, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f29493a = c3919h;
        this.f29494b = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        UncaughtExceptionHandler uncaughtExceptionHandler;
        new C3862c().a(System.currentTimeMillis());
        AppLifeCycleTracker.a(null).a(true);
        if (this.f29494b != null) {
            uncaughtExceptionHandler = this.f29494b;
        } else {
            uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
