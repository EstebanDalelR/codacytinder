package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    /* renamed from: a */
    public boolean m58961a(Throwable th) {
        return ExceptionHelper.m58964a(this, th);
    }

    /* renamed from: a */
    public Throwable m58960a() {
        return ExceptionHelper.m58963a((AtomicReference) this);
    }
}
