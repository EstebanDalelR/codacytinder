package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.Consumer;

final /* synthetic */ class Collectors$$Lambda$92 implements Consumer {
    /* renamed from: a */
    private final BiConsumer f54520a;
    /* renamed from: b */
    private final Object f54521b;

    private Collectors$$Lambda$92(BiConsumer biConsumer, Object obj) {
        this.f54520a = biConsumer;
        this.f54521b = obj;
    }

    /* renamed from: a */
    public static Consumer m63959a(BiConsumer biConsumer, Object obj) {
        return new Collectors$$Lambda$92(biConsumer, obj);
    }

    public void accept(Object obj) {
        this.f54520a.accept(this.f54521b, obj);
    }
}
