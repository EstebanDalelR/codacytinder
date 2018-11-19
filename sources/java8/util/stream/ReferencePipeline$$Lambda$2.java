package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.Consumer;

final /* synthetic */ class ReferencePipeline$$Lambda$2 implements Consumer {
    /* renamed from: a */
    private final BiConsumer f54628a;
    /* renamed from: b */
    private final Object f54629b;

    private ReferencePipeline$$Lambda$2(BiConsumer biConsumer, Object obj) {
        this.f54628a = biConsumer;
        this.f54629b = obj;
    }

    /* renamed from: a */
    public static Consumer m64059a(BiConsumer biConsumer, Object obj) {
        return new ReferencePipeline$$Lambda$2(biConsumer, obj);
    }

    public void accept(Object obj) {
        this.f54628a.accept(this.f54629b, obj);
    }
}
