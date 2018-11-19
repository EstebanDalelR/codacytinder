package io.reactivex.internal.util;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.reactivex.internal.util.c */
public final class C17520c extends CountDownLatch implements Action, Consumer<Throwable> {
    /* renamed from: a */
    public Throwable f54142a;

    public /* synthetic */ void accept(Object obj) throws Exception {
        m63753a((Throwable) obj);
    }

    public C17520c() {
        super(1);
    }

    /* renamed from: a */
    public void m63753a(Throwable th) {
        this.f54142a = th;
        countDown();
    }

    public void run() {
        countDown();
    }
}
