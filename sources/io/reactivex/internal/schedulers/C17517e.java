package io.reactivex.internal.schedulers;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.ThreadFactory;

/* renamed from: io.reactivex.internal.schedulers.e */
public final class C17517e extends C15679f {
    /* renamed from: c */
    private static final RxThreadFactory f54128c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    /* renamed from: b */
    final ThreadFactory f54129b;

    public C17517e() {
        this(f54128c);
    }

    public C17517e(ThreadFactory threadFactory) {
        this.f54129b = threadFactory;
    }

    @NonNull
    /* renamed from: a */
    public C17362c mo12872a() {
        return new C18426f(this.f54129b);
    }
}
