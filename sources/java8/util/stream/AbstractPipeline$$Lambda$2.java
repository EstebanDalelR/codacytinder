package java8.util.stream;

import java8.util.Spliterator;
import java8.util.function.Supplier;

final /* synthetic */ class AbstractPipeline$$Lambda$2 implements Supplier {
    /* renamed from: a */
    private final Spliterator f54419a;

    private AbstractPipeline$$Lambda$2(Spliterator spliterator) {
        this.f54419a = spliterator;
    }

    /* renamed from: a */
    public static Supplier m63913a(Spliterator spliterator) {
        return new AbstractPipeline$$Lambda$2(spliterator);
    }

    public Object get() {
        return AbstractPipeline.m63920d(this.f54419a);
    }
}
