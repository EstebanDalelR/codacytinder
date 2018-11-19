package com.tinder.data.updates;

import io.reactivex.C15679f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/updates/TimestampRecorder;", "", "scheduler", "Lio/reactivex/Scheduler;", "(Lio/reactivex/Scheduler;)V", "lastRecordedTimestamp", "", "getLastRecordedTimestamp", "()J", "timestampValue", "Ljava/util/concurrent/atomic/AtomicLong;", "record", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.o */
public final class C8810o {
    /* renamed from: a */
    private final AtomicLong f30905a = new AtomicLong();
    /* renamed from: b */
    private final C15679f f30906b;

    public C8810o(@NotNull C15679f c15679f) {
        C2668g.b(c15679f, "scheduler");
        this.f30906b = c15679f;
        m37502b();
    }

    /* renamed from: a */
    public final long m37501a() {
        return this.f30905a.get();
    }

    /* renamed from: b */
    public final void m37502b() {
        this.f30905a.set(this.f30906b.a(TimeUnit.MILLISECONDS));
    }
}
