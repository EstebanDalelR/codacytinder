package java8.util.stream;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java8.util.function.Consumer;
import java8.util.stream.DistinctOps.C192011;

final /* synthetic */ class DistinctOps$1$$Lambda$4 implements Consumer {
    /* renamed from: a */
    private final AtomicBoolean f54535a;
    /* renamed from: b */
    private final ConcurrentMap f54536b;

    private DistinctOps$1$$Lambda$4(AtomicBoolean atomicBoolean, ConcurrentMap concurrentMap) {
        this.f54535a = atomicBoolean;
        this.f54536b = concurrentMap;
    }

    /* renamed from: a */
    public static Consumer m63966a(AtomicBoolean atomicBoolean, ConcurrentMap concurrentMap) {
        return new DistinctOps$1$$Lambda$4(atomicBoolean, concurrentMap);
    }

    public void accept(Object obj) {
        C192011.m68252b(this.f54535a, this.f54536b, obj);
    }
}
